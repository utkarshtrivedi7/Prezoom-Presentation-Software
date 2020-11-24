package prezooom.app.Model;
import prezooom.app.View.MainFrame;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;


@SuppressWarnings("serial")
public class Display extends JPanel implements MouseListener, MouseMotionListener{

  public MainFrame minidraw;  

                                       
  private Popup popup;

                                    /* Reference of MiniDraw_Popup's object */
//to store the shapes
  @SuppressWarnings("rawtypes")
public Vector shapes;                                             /* Where shape will be saved */

  public Color colorSelected;                                       /* Indicate the color selected in Menu->Color */
  
  public static int value=0;
  public int selectedShape;                                         /* Indicate shape selected in MiniDraw_Tools */
  
  public boolean filledShape;                                       /* Indicate if shape will be filled or not */

  public int shapeUnderCursor;                                      /* Where shape under cursor are in Vector shapes */
  
  public boolean resizeX, resizeY;                                  /* Indicate if a shape will be resize on X, Y axe */
  
  private boolean dragModeRun;
  
  private int originX, originY;                                     /* Origin coordinates for drag mode */


  @SuppressWarnings("rawtypes")
  
public Display(MainFrame minidraw){
     super(true);                                                /* Set double buffered */
    
	this.minidraw = minidraw;
    addMouseListener(this);
    addMouseMotionListener(this);
    setBackground(Color.white);
    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));  
    colorSelected = MainFrame.DEFAULT_COLOR;                    
    filledShape = MainFrame.DEFAULT_FILLED;                     
    shapeUnderCursor = MainFrame.NOSHAPE;                       
    
 
    popup = new Popup(minidraw, this);
    shapes = new Vector();                                      
    dragModeRun = false;                                        
  }


/**
 * Repaint Display with all the shapes
 */
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < shapes.size(); i++)
    
      ((Shape)shapes.elementAt(i)).draw(g);
	   }


/**
 * Clear all shapes
 */
  public void clear(){
    shapes.clear();
    repaint();
  }


/**
 * Get origin coordinates for shape
 */
  public void mousePressed(MouseEvent e){
    originX = e.getX();
    originY = e.getY();
    
  }


/**
 * When button is released
 */
  @SuppressWarnings( "unchecked" )
public void mouseReleased(MouseEvent e){
    int x = e.getX();
    int y = e.getY();

   /*
    * User didn't move the cursor :
    * Left click for draw shape with textarea
    * Right click for popup
    */
    if (((originX - x) == 0) && ((originY - y) == 0)){
      int height=0, width=0;


      if ((e.getButton() == MouseEvent.BUTTON1) && (selectedShape != MainFrame.NOSHAPE)){

        /* Try to get width value in corresponding textarea => Exit method if width value is incorect */
        try{
        //  width = new Integer(minidraw.tools.tfWidth.getText()).intValue();
        }
        catch(NumberFormatException except){
          JOptionPane.showMessageDialog(minidraw,"Please enter valid number in width textarea","Value of width incorrect",JOptionPane.ERROR_MESSAGE);
          return;
        }

        /* Try to get height value in corresponding textarea => Exit method if height value is incorect */
        try{
         // height = new Integer(minidraw.tools.tfHeight.getText()).intValue();
        }
        catch(NumberFormatException except){
          JOptionPane.showMessageDialog(minidraw,"Please enter valid number in height textarea","Value of height incorrect",JOptionPane.ERROR_MESSAGE);
          return;
        }

        /* Create the shape */
        Shape ret;
        
//selected  shape is integer
        
        
        switch(selectedShape){
          /* Draw a Circle */
          case MainFrame.CIRCLE :
            ret = new Circle(x - width / 2, y - width / 2, width);
            break;

          /* Draw an Ellipse */
          case MainFrame.ELLIPSE :
            ret = new Ellipse(x - width / 2, y - height / 2, width, height);
            break;

          /* Draw a Square */
          case MainFrame.SQUARE :
            ret = new Square(x - width / 2, y - width / 2, width);
            break;

          /* Draw a Rectangle */
          case MainFrame.RECTANGLE :
            ret = new Rectangle(x - width / 2, y - height / 2, width, height);
            break;
            
          case MainFrame.LINE:
        	  ret=new Line(x - width / 2, y - height / 2, width, height);
        	  break;

          default:
            JOptionPane.showMessageDialog(null,"Left Mouse Clicked","Unknow Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ret.setFilled(filledShape);                                       /* Filled or not */
        ret.setColor(colorSelected);                                      /* Apply color */
        shapes.add(ret);                                                  /* Add to vector */
      //  minidraw.toSave = true;                                           /* Need to save */
        repaint();                                                        /* Refresh */
        return;
      }

     /*
      * Right click :
      * If right button is pressed / released, show popup
      * after initialize it
      */
      if(e.getButton() == MouseEvent.BUTTON3){

        int i = shapes.size();
        shapeUnderCursor = MainFrame.NOSHAPE;                              /* No shape are selected */

        /* If there are a shape under the cursor, show the popup */
        while(--i >= 0){
          if(((Shape)shapes.elementAt(i)).contains(x, y)){
            shapeUnderCursor = i;

            /* Initialize popup */
            if(((Shape)shapes.elementAt(i)).filled())
              popup.itemFill.setSelected(true);
            else
              popup.itemFill.setSelected(false);

            popup.itemOther.setSelected(true);

            if(((Shape)shapes.elementAt(i)).color() == Color.black)
              popup.itemBlack.setSelected(true);

            if(((Shape)shapes.elementAt(i)).color() == Color.blue)
              popup.itemBlue.setSelected(true);

            if(((Shape)shapes.elementAt(i)).color() == Color.red)
              popup.itemRed.setSelected(true);

            if(((Shape)shapes.elementAt(i)).color() == Color.green)
              popup.itemGreen.setSelected(true);

            popup.show(this, x, y);                   /* Show popup */
            return;                                   /* Exit method if no shape are under the cursor */
          }
        }
      }
    }
   /*
    * User move the cursor : released of draged mode
    */
    else{
      dragModeRun = false;
    }
  }


/**
 * mouseDragged
 */
  @SuppressWarnings("unchecked")
public void mouseDragged(MouseEvent e){
    int x = e.getX();
    int y = e.getY();

    /* Arrow are selected and no shape are under the cursor : exit */
    if ((selectedShape == MainFrame.NOSHAPE) && (shapeUnderCursor == MainFrame.NOSHAPE))
      return;

    /* Arrow are selected and a shape are under the cursor :
       Resize or move shape under the cursor */
    if (selectedShape == MainFrame.NOSHAPE){
      Shape tmp = (Shape)shapes.elementAt(shapeUnderCursor);

      /* Resize shape */
      if(resizeX || resizeY){

        /* Resize on X axe */
        if(resizeX){
          if ((tmp instanceof Square) || (tmp instanceof Circle))   /* The shape under the cursor is a square or a circle */
            tmp.width = tmp.height = Math.abs(x - tmp.x);
          else
            tmp.width = Math.abs(x - tmp.x);
        }

        /* Resize on Y axe */
        if(resizeY){
          if ((tmp instanceof Square) || (tmp instanceof Circle))
            tmp.height = tmp.width = Math.abs(y - tmp.y);
          else
            tmp.height = Math.abs(y - tmp.y);
        }
      }
      /* Move shape */
      else{
        tmp.x = x - tmp.width / 2;
        tmp.y = y - tmp.height / 2;
      }
             
      repaint();
      return;
    }

    /* A shape are selected : drag */
    if (dragModeRun == false){ /* Start of drag */
      dragModeRun = true;

      Shape ret;
      
   System.out.println(selectedShape+"  shapes");
   
   
      switch(selectedShape){

        /* Draw a Circle */
        case MainFrame.CIRCLE :
          ret = new Circle(originX,originY,1);
          break;

        /* Draw an Ellipse */
        case MainFrame.ELLIPSE :
          ret = new Ellipse(originX,originY,1,1);
          break;

        /* Draw a Square */
        case MainFrame.SQUARE :
          ret = new Square(originX,originY,1);
          break;

        /* Draw a Rectangle */
        case MainFrame.RECTANGLE :
          ret = new Rectangle(originX,originY,1,1);
          break;

        default:
          JOptionPane.showMessageDialog(minidraw, "Mouse Dragged", "Unknow Error", JOptionPane.ERROR_MESSAGE);
          return;
      }
      ret.setFilled(filledShape);
      ret.setColor(colorSelected);
      shapes.add(ret);
      shapeUnderCursor = shapes.size()-1;
    }
    else{ 
    	/* Next drag */
      Shape currentShape = (Shape)shapes.elementAt(shapeUnderCursor);

      /* Case for circle or square */
      if((currentShape instanceof Circle)||(currentShape instanceof Square)){

        /* Change differents size with biggest distance between origin */
        if(Math.abs(x - originX) > Math.abs(y - originY))
          currentShape.width = currentShape.height = Math.abs(x - originX);
        else
          currentShape.width = currentShape.height = Math.abs(y - originY);
      }
      /* Case for Ellipse or Rectangle */
      else{
        currentShape.width = Math.abs(x - originX);
        currentShape.height = Math.abs(y - originY);
      }
    }
   // minidraw.toSave = true;
    repaint();
                     /* Refresh Statebar */
  }

/**
 * Change cursor if it near a shape and popup isn't activate
 */
  public void mouseMoved(MouseEvent e){
    int x = e.getX();
    int y = e.getY();

  // minidraw.statebar.refresh(x,y);

    /* If popup is activate or a shape are selected : exit method */
    if (popup.isVisible() || (selectedShape != MainFrame.NOSHAPE))
      return;

    int i = shapes.size();
    shapeUnderCursor = MainFrame.NOSHAPE;                               /* No shape are selected */

    /* Check if there are a shape under the cursor */
    while(--i >= 0){
      if(((Shape)shapes.elementAt(i)).contains(x, y)){
        shapeUnderCursor = i;
        Shape shape = (Shape)shapes.elementAt(i);

        /* Resize on X-Axis at right of the shape */
        if((shape.x + shape.width) - x <= 5){
          resizeX = true;
          setCursor(Cursor.getPredefinedCursor(Cursor.W_RESIZE_CURSOR));
        }
        else
          resizeX = false;

        /* Resize on Y-axis at bottom of the shape */
        if((shape.y + shape.height) - y <= 5){
          resizeY = true;
          setCursor(Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR));
        }
        else
          resizeY = false;

        /* Resize at the bottom right corner of shape */
        if(resizeX && resizeY)
          setCursor(Cursor.getPredefinedCursor(Cursor.NW_RESIZE_CURSOR));

        /* Don't resize on X and Y */
        if(!resizeX && !resizeY)
          setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        return;
      }
    }
    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
  }


  public void mouseExited(MouseEvent e){
  //  minidraw.statebar.refresh(0,0);
  }

  public void mouseEntered(MouseEvent e){}
  public void mouseClicked(MouseEvent e){}
}
