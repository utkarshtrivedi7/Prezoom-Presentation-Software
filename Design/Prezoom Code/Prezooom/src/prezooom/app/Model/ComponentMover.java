package prezooom.app.Model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class ComponentMover extends MouseAdapter
{
	private Insets dragInsets = new Insets(0, 0, 0, 0);
	private Dimension snapSize = new Dimension(1, 1);
	private Insets edgeInsets = new Insets(0, 0, 0, 0);
	private boolean changeCursor = true;
	private boolean autoLayout = false;

	private Class destinationClass;
	private Component destinationComponent;
	private Component destination;
	private Component source;

	private Point pressed;
	private Point location;

	private Cursor originalCursor;
	private boolean autoscrolls;
	private boolean potentialDrag;


	public ComponentMover()
	{
	}

	
	public ComponentMover(Class destinationClass, Component... components)
	{
		this.destinationClass = destinationClass;
		registerComponent( components );
	}


	public ComponentMover(Component destinationComponent, Component... components)
	{
		this.destinationComponent = destinationComponent;
		registerComponent( components );
	}


	public boolean isAutoLayout()
	{
		return autoLayout;
	}

	
	public void setAutoLayout(boolean autoLayout)
	{
		this.autoLayout = autoLayout;
	}

	public boolean isChangeCursor()
	{
		return changeCursor;
	}


	public void setChangeCursor(boolean changeCursor)
	{
		this.changeCursor = changeCursor;
	}

	/**
	 *  Get the drag insets
	 *
	 *  @return  the drag insets
	 */
	public Insets getDragInsets()
	{
		return dragInsets;
	}


	public void setDragInsets(Insets dragInsets)
	{
		this.dragInsets = dragInsets;
	}


	public Insets getEdgeInsets()
	{
		return edgeInsets;
	}


	public void setEdgeInsets(Insets edgeInsets)
	{
		this.edgeInsets = edgeInsets;
	}


	public void deregisterComponent(Component... components)
	{
		for (Component component : components)
			component.removeMouseListener( this );
	}


	public void registerComponent(Component... components)
	{
		for (Component component : components)
			component.addMouseListener( this );
	}


	public Dimension getSnapSize()
	{
		return snapSize;
	}

	public void setSnapSize(Dimension snapSize)
	{
		if (snapSize.width < 1
		||  snapSize.height < 1)
			throw new IllegalArgumentException("Snap sizes must be greater than 0");

		this.snapSize = snapSize;
	}

	
	@Override
	public void mousePressed(MouseEvent e)
	{
		source = e.getComponent();
		int width  = source.getSize().width  - dragInsets.left - dragInsets.right;
		int height = source.getSize().height - dragInsets.top - dragInsets.bottom;
		Rectangle r = new Rectangle(dragInsets.left, dragInsets.top, width, height);

		if (r.contains(e.getPoint()))
			setupForDragging(e);
	}

	private void setupForDragging(MouseEvent e)
	{
		source.addMouseMotionListener( this );
		potentialDrag = true;

		//  Determine the component that will ultimately be moved

		if (destinationComponent != null)
		{
			destination = destinationComponent;
		}
		else if (destinationClass == null)
		{
			destination = source;
		}
		else  //  forward events to destination component
		{
			destination = SwingUtilities.getAncestorOfClass(destinationClass, source);
		}

		pressed = e.getLocationOnScreen();
		location = destination.getLocation();

		if (changeCursor)
		{
			originalCursor = source.getCursor();
			source.setCursor( Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR) );
		}

		//  Making sure autoscrolls is false will allow for smoother dragging of
		//  individual components

		if (destination instanceof JComponent)
		{
			JComponent jc = (JComponent)destination;
			autoscrolls = jc.getAutoscrolls();
			jc.setAutoscrolls( false );
		}
	}

	/**
	 *  Move the component to its new location. The dragged Point must be in
	 *  the destination coordinates.
	 */
	@Override
	public void mouseDragged(MouseEvent e)
	{
		Point dragged = e.getLocationOnScreen();
		int dragX = getDragDistance(dragged.x, pressed.x, snapSize.width);
		int dragY = getDragDistance(dragged.y, pressed.y, snapSize.height);

		int locationX = location.x + dragX;
		int locationY = location.y + dragY;

		//  Mouse dragged events are not generated for every pixel the mouse
		//  is moved. Adjust the location to make sure we are still on a
		//  snap value.

		while (locationX < edgeInsets.left)
			locationX += snapSize.width;

		while (locationY < edgeInsets.top)
			locationY += snapSize.height;

		Dimension d = getBoundingSize( destination );

		while (locationX + destination.getSize().width + edgeInsets.right > d.width)
			locationX -= snapSize.width;

		while (locationY + destination.getSize().height + edgeInsets.bottom > d.height)
			locationY -= snapSize.height;

		//  Adjustments are finished, move the component

		destination.setLocation(locationX, locationY);
	}

	/*
	 *  Determine how far the mouse has moved from where dragging started
	 *  (Assume drag direction is down and right for positive drag distance)
	 */
	private int getDragDistance(int larger, int smaller, int snapSize)
	{
		int halfway = snapSize / 2;
		int drag = larger - smaller;
		drag += (drag < 0) ? -halfway : halfway;
		drag = (drag / snapSize) * snapSize;

		return drag;
	}

	/*
	 *  Get the bounds of the parent of the dragged component.
	 */
	private Dimension getBoundingSize(Component source)
	{
		if (source instanceof Window)
		{
			GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
			Rectangle bounds = env.getMaximumWindowBounds();
			return new Dimension(bounds.width, bounds.height);
		}
		else
		{
			return source.getParent().getSize();
		}
	}

	/**
	 *  Restore the original state of the Component
	 */
	@Override
	public void mouseReleased(MouseEvent e)
	{
		if (!potentialDrag) return;

		source.removeMouseMotionListener( this );
		potentialDrag = false;

		if (changeCursor)
			source.setCursor( originalCursor );

		if (destination instanceof JComponent)
		{
			((JComponent)destination).setAutoscrolls( autoscrolls );
		}

		//  Layout the components on the parent container

		if (autoLayout)
		{
			if (destination instanceof JComponent)
			{
				((JComponent)destination).revalidate();
			}
			else
			{
				destination.validate();
			}
		}
	}
}