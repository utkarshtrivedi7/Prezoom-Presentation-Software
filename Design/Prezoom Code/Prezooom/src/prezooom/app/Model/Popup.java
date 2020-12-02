package prezooom.app.Model;

import prezooom.app.Controller.Controller;
import prezooom.app.View.MainFrame;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Popup extends JPopupMenu implements ActionListener{

  /**
	 * 
	 */
private static final long serialVersionUID = 1L;
@SuppressWarnings("unused")
  private MainFrame minidraw;
  private Display display;
  public JCheckBoxMenuItem itemBlack;
  public JCheckBoxMenuItem itemBlue;
  public JCheckBoxMenuItem itemRed;
  public JCheckBoxMenuItem itemGreen;
  public JCheckBoxMenuItem itemOther;
  public JCheckBoxMenuItem itemFill;


  public Popup(MainFrame minidraw, Display display){
    this.minidraw = minidraw;
    this.display = display;

 

    add(new JSeparator());
    
    /* Details */
    JMenuItem itemDetails = new JMenuItem("Details");
    itemDetails.addActionListener(this);
    add(itemDetails);

    add(new JSeparator());
    
    /* Arrange */
    JMenu menuArrange = new JMenu("Arrange");

    /* Arrange -> Bring to front */
    JMenuItem itemBtoF = new JMenuItem("Bring to front");
    itemBtoF.addActionListener(this);
    menuArrange.add(itemBtoF);

    /* Arrange -> Bring forward */
    JMenuItem itemBF = new JMenuItem("Bring forward");
    itemBF.addActionListener(this);
    menuArrange.add(itemBF);
    
    /* Arrange -> Send backward */
    JMenuItem itemSB = new JMenuItem("Send backward");
    itemSB.addActionListener(this);
    menuArrange.add(itemSB);
    
    /* Arrange -> Send to back */
    JMenuItem itemStoB = new JMenuItem("Send to back");
    itemStoB.addActionListener(this);
    menuArrange.add(itemStoB);
    add(menuArrange);
    
    /* Color */
    JMenu menuColor = new JMenu("Color");
    ButtonGroup btnGroup = new ButtonGroup();
    
    /* Color -> Black */
    itemBlack = new JCheckBoxMenuItem("Black");
    itemBlack.addActionListener(this);
    btnGroup.add(itemBlack);
    menuColor.add(itemBlack);
    
    /* Color -> Blue */
    itemBlue = new JCheckBoxMenuItem("Blue");
    itemBlue.addActionListener(this);
    btnGroup.add(itemBlue);
    menuColor.add(itemBlue);
    
    /* Color -> Red */
    itemRed = new JCheckBoxMenuItem("Red");
    itemRed.addActionListener(this);
    btnGroup.add(itemRed);
    menuColor.add(itemRed);
    
    /* Color -> Green */
    itemGreen = new JCheckBoxMenuItem("Green");
    itemGreen.addActionListener(this);
    btnGroup.add(itemGreen);
    menuColor.add(itemGreen);
    
    /* Color -> Other */
    itemOther = new JCheckBoxMenuItem("Other");
    itemOther.addActionListener(this);
    btnGroup.add(itemOther);
    menuColor.add(itemOther);
    add(menuColor);

    add(new JSeparator());
    
    /* Delete */
    JMenuItem itemDelete = new JMenuItem("Delete");
    itemDelete.addActionListener(this);
    add(itemDelete);

    /* Fill */
    itemFill = new JCheckBoxMenuItem("Fill");
    itemFill.addActionListener(this);
    add(itemFill);
  }

  @SuppressWarnings("unchecked")
public void actionPerformed(ActionEvent event) {
   Shape tmp = (Shape)display.shapes.elementAt(display.shapeUnderCursor);

    /* Details */
    if(event.getActionCommand().equals("Details")){
      JOptionPane.showMessageDialog(this, "X : " + tmp.x + "\nY : " + tmp.y + "\nWidth : " + tmp.width +
                                    "\nHeight : " + tmp.height + "\nColor RGB : " + tmp.color.getRed() + ":" +
                                    tmp.color.getGreen() + ":" + tmp.color.getBlue() +
                                    "\nFilled : " + tmp.filled + "\nPerimeter : " + tmp.perimeter() +
                                    " Pixels\nArea : " + tmp.area() + " Pixels", "Shape's informations",
                                    JOptionPane.INFORMATION_MESSAGE);
      return;
    }

    if(event.getActionCommand().equals("animate")){
    
     
    }
    /* Arrange -> Bring to front */
    if(event.getActionCommand().equals("Bring to front")){
      display.shapes.add(tmp);
      display.shapes.removeElementAt(display.shapeUnderCursor);
    }

    /* Arrange -> Bring forward */
    if(event.getActionCommand().equals("Bring forward") && (display.shapeUnderCursor < display.shapes.size() - 1)){
      display.shapes.insertElementAt(tmp, display.shapeUnderCursor + 2);
      display.shapes.removeElementAt(display.shapeUnderCursor);
    }

    /* Arrange -> Send backward */
    if(event.getActionCommand().equals("Send backward") && (display.shapeUnderCursor > 0)) {
      display.shapes.insertElementAt(tmp, display.shapeUnderCursor - 1);
      display.shapes.removeElementAt(display.shapeUnderCursor + 1);
    }

    /* Arrange -> Send to back */
    if(event.getActionCommand().equals("Send to back")) {
      display.shapes.insertElementAt(tmp, 0);
      display.shapes.removeElementAt(display.shapeUnderCursor + 1);
    }

    /* Color -> Black */
    if(event.getActionCommand().equals("Black"))
      tmp.setColor(Color.black);

    /* Color -> Blue */
    if(event.getActionCommand().equals("Blue"))
      tmp.setColor(Color.blue);

    /* Color -> Red */
    if(event.getActionCommand().equals("Red"))
      tmp.setColor(Color.red);

    /* Color -> Green */
    if(event.getActionCommand().equals("Green"))
      tmp.setColor(Color.green);


    /* Color -> Other */
    if(event.getActionCommand().equals("Other")){
      JColorChooser chooser = new JColorChooser();
      @SuppressWarnings("static-access")
	Color retColor = chooser.showDialog(display, "Choose a color for OurShape", tmp.color());
      if (retColor == null)
        return;
      else
        tmp.setColor(retColor);
    }

    /* Color -> Delete */
    if(event.getActionCommand().equals("Delete")){
      display.shapes.removeElementAt(display.shapeUnderCursor);
      display.shapeUnderCursor = Controller.NOSHAPE;
    }

    /* Color -> Fill */
    if(event.getActionCommand().equals("Fill"))
      tmp.setFilled(itemFill.isSelected());

   // minidraw.toSave = true;
    display.repaint();                    
  }
}
