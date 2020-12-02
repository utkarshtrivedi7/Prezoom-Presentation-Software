package prezooom.app.Model;
import prezooom.app.Controller.Controller;
import prezooom.app.Controller.fontsize;
import prezooom.app.View.MainFrame;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.Border;


@SuppressWarnings("serial")
public class Display extends JPanel implements MouseListener, MouseMotionListener{

    public MainFrame minidraw;  
    public Controller control;
	public final  int NOSHAPE = -1;
	public final  int CIRCLE = 0;
	public final  int ELLIPSE = 1;
	public final  int SQUARE = 2;
	public final  int RECTANGLE = 3;
	public final  int LINE = 4;
	public final  int noShape = 6;
	public final int textBox=5;
	public final static String DEFAULT_WIDTH = "100";
	public final static String DEFAULT_HEIGHT = "50";
	
	public final static Color DEFAULT_COLOR = Color.blue;
	public final static boolean DEFAULT_FILLED = false;
    String fontName;
    int fontSize;
    Color color;
    String text=null;
    public boolean textbox=false;
    private double zoomFactor = 1;
    private double prevZoomFactor = 1;
    private boolean zoomer;
    private double xOffset = 0;
    private double yOffset = 0;
    
    
	JTextArea jt=new JTextArea("Write");
	

  fontsize font;
  @SuppressWarnings("rawtypes")
  public Vector shapes,shapes2;   
 
  public Color colorSelected;                                      
  public static int value=0;
  public int selectedShape;                                         
  private Popup popup;
  public boolean filledShape;                                       
  public int shapeUnderCursor;                                  
  public boolean resizeX, resizeY;                                  
  private boolean dragModeRun;
  private int originX, originY;                                     

  @SuppressWarnings("rawtypes")
  
public Display(MainFrame minidraw){
     super(true);                                                /* Set double buffered */
    
	this.minidraw = minidraw;
    addMouseListener(this);
    addMouseMotionListener(this);
    setBackground(Color.white);
    setCursor(new Cursor(Cursor.HAND_CURSOR));  
    colorSelected = DEFAULT_COLOR;                    
    filledShape = DEFAULT_FILLED;                     
    shapeUnderCursor = NOSHAPE;                       
    control=new Controller(minidraw,this);
    font=fontsize.create();
    xOffset=this.getWidth();
    yOffset=this.getHeight();
   
    popup = new Popup(minidraw, this);
    shapes = new Vector(); 
    shapes2=new Vector();
    dragModeRun = false;    
    
  }


  
public void setShape(int shpe) {
	if(shpe==-1)
	this.selectedShape=NOSHAPE;
	if(shpe==0)
		this.selectedShape=CIRCLE;
	if(shpe==1)
		this.selectedShape=ELLIPSE;
	if(shpe==2)
		this.selectedShape=SQUARE;
	if(shpe==3)
		this.selectedShape=RECTANGLE;
	if(shpe==4) 
		this.selectedShape=LINE;
if(shpe==5) {
       addTextbox();
}
	if(shpe==6) {
		this.selectedShape=noShape;
		this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
		

	
	
      jt.addMouseListener(new MouseAdapter(){
          @Override
          public void mouseClicked(MouseEvent e){
            fontName=font.getfont();
            fontSize=font.getsize();
            color=font.getcolor();
            Font f=new Font(fontName,Font.PLAIN,fontSize);
            jt.setFont(f);
            jt.setForeground(color);          
          }
          public void mouseExited(MouseEvent e) {
        	  text=jt.getText();
        	  System.out.println(text);
          }
      });
      
      
this.addMouseWheelListener(new MouseAdapter() {
  		public void mouseWheelMoved(MouseWheelEvent e) {
  			System.out.println("enterd mouse wheel");
  		    zoomer = true;
  		    //Zoom in
  		    if (e.getWheelRotation() < 0) {
  		        zoomFactor *= 1.1;
  		        
  		        repaint();
  		    }
  		    //Zoom out
  		    if (e.getWheelRotation() > 0) {
  		        zoomFactor /= 1.1;
  		        repaint();
  		    }
  		}
  	});
      
	
}

@SuppressWarnings("unchecked")
public void undo() {
	shapes2.addElement(shapes.elementAt(shapes.size()-1));
	shapes.removeElementAt(shapes.size()-1);
	this.repaint();	
}
@SuppressWarnings("unchecked")
public void redo() {
	shapes.addElement(shapes2.elementAt(shapes2.size()-1));
	shapes2.removeElementAt(shapes2.size()-1);
	this.repaint();	
}
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < shapes.size(); i++)
    
      ((Shape)shapes.elementAt(i)).draw(g);
	   }

  public void clear(){
    shapes.clear();
    this.remove(jt);
    repaint();
  }

  public String getText() {
	return text;
}


  
  public void mousePressed(MouseEvent e){
    originX = e.getX();
    originY = e.getY();
    
  }



  @SuppressWarnings( "unchecked" )
public void mouseReleased(MouseEvent e){
    int x = e.getX();
    int y = e.getY();


    if (((originX - x) == 0) && ((originY - y) == 0)){
      int height=0, width=0;


      if ((e.getButton() == MouseEvent.BUTTON1) && (selectedShape != NOSHAPE)){

        try{
        //  width = new Integer(minidraw.tools.tfWidth.getText()).intValue();
        }
        catch(NumberFormatException except){
          JOptionPane.showMessageDialog(null,"Please enter valid number in width textarea","Value of width incorrect",JOptionPane.ERROR_MESSAGE);
          return;
        }

        try{
         // height = new Integer(minidraw.tools.tfHeight.getText()).intValue();
        }
        catch(NumberFormatException except){
          JOptionPane.showMessageDialog(null,"Please enter valid number in height textarea","Value of height incorrect",JOptionPane.ERROR_MESSAGE);
          return;
        }


    Shape ret ; 
    switch(selectedShape){
         
          case CIRCLE :
            ret = new Circle(x - width / 2, y - width / 2, width);
            break;

          /* Draw an Ellipse */
          case ELLIPSE :
            ret = new Ellipse(x - width / 2, y - height / 2, width, height);
            break;

          /* Draw a Square */
          case SQUARE :
            ret = new Square(x - width / 2, y - width / 2, width);
            break;

          /* Draw a Rectangle */
         case RECTANGLE :
          ret = new Rectangle(x - width / 2, y - height / 2, width, height);
            break;
	
		 case LINE: 
			 ret=new Line(e.getX()/2 , e.getY()/2 , width, height); 
			 break;
		 
		 case noShape:
			 ret=new noShape(0,0);
			 break;
	
         	  

          default:
            //JOptionPane.showMessageDialog(null,"Left Mouse Clicked","Unknow Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ret.setFilled(filledShape);                                       /* Filled or not */
        ret.setColor(colorSelected);                                      /* Apply color */
        shapes.add(ret);                                                  /* Add to vector */
        repaint();                                                        /* Refresh */
        return;
      }
      
      //button 1 end

 
      if(e.getButton() == MouseEvent.BUTTON3){

        int i = shapes.size();
        shapeUnderCursor = NOSHAPE;                              

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
    
 //release button end
  
    else{
      dragModeRun = false;
    }
  }



  @SuppressWarnings("unchecked")
public void mouseDragged(MouseEvent e){
    int x = e.getX();
    int y = e.getY();


    if ((selectedShape == NOSHAPE) && (shapeUnderCursor == NOSHAPE))
      return;

 
    if (selectedShape == NOSHAPE){
      Shape tmp = (Shape)shapes.elementAt(shapeUnderCursor);

    
      if(resizeX || resizeY){

       
        if(resizeX){
          if ((tmp instanceof Square) || (tmp instanceof Circle))   /* The shape under the cursor is a square or a circle */
            tmp.width = tmp.height = Math.abs(x - tmp.x);
          else
            tmp.width = Math.abs(x - tmp.x);
        }

       
        if(resizeY){
          if ((tmp instanceof Square) || (tmp instanceof Circle) || (tmp instanceof Line))
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

   
   
      switch(selectedShape){

        /* Draw a Circle */
        case CIRCLE :
          ret = new Circle(originX,originY,1);
          break;

        /* Draw an Ellipse */
        case ELLIPSE :
          ret = new Ellipse(originX,originY,1,1);
          break;

        /* Draw a Square */
        case SQUARE :
          ret = new Square(originX,originY,1);
          break;

        /* Draw a Rectangle */
        case RECTANGLE :
          ret = new Rectangle(originX,originY,1,1);
          break;
        case LINE:
        	ret=new Line(originX,originY,1,1);
        	break;

        default:
         // JOptionPane.showMessageDialog(null, "Mouse Dragged ok", "Unknow Error", JOptionPane.ERROR_MESSAGE);
          return;
      }
      ret.setFilled(filledShape);
      ret.setColor(colorSelected);
      shapes.add(ret);
      shapeUnderCursor = shapes.size()-1;
    }
    else{ 
    	
      Shape currentShape = (Shape)shapes.elementAt(shapeUnderCursor);
      //System.out.println(currentShape+"current shape");
     
      if((currentShape instanceof Circle)||(currentShape instanceof Square ) || (currentShape instanceof Line)){

        if(Math.abs(x - originX) > Math.abs(y - originY))
          currentShape.width = currentShape.height = Math.abs(x - originX);
        else
          currentShape.width = currentShape.height = Math.abs(y - originY);
      }
     
      else{
        currentShape.width = Math.abs(x - originX);
        currentShape.height = Math.abs(y - originY);
      }
    }

    repaint();
                    
  }


  public void mouseMoved(MouseEvent e){
    int x = e.getX();
    int y = e.getY();

    if (popup.isVisible() || (selectedShape != NOSHAPE))
      return;

    int i = shapes.size();
    shapeUnderCursor = NOSHAPE;                               /* No shape are selected */

    while(--i >= 0){
      if(((Shape)shapes.elementAt(i)).contains(x, y)){
        shapeUnderCursor = i;
        Shape shape = (Shape)shapes.elementAt(i);

        if((shape.x + shape.width) - x <= 5){
          resizeX = true;
          setCursor(Cursor.getPredefinedCursor(Cursor.W_RESIZE_CURSOR));
        }
        else
          resizeX = false;

        if((shape.y + shape.height) - y <= 5){
          resizeY = true;
          setCursor(Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR));
        }
        else
          resizeY = false;

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
  public void paint(Graphics g) {
	    super.paint(g);
	    Graphics2D g2 = (Graphics2D) g;
	    if (zoomer) {

	        AffineTransform at = new AffineTransform();

	        double xRel = MouseInfo.getPointerInfo().getLocation().getX() - getLocationOnScreen().getX();
	        double yRel = MouseInfo.getPointerInfo().getLocation().getY() - getLocationOnScreen().getY();

	        double zoomDiv = zoomFactor / prevZoomFactor;

	        xOffset = (zoomDiv) * (xOffset) + (1 - zoomDiv) * xRel;
	        yOffset = (zoomDiv) * (yOffset) + (1 - zoomDiv) * yRel;

	        at.translate(xOffset/2, yOffset/2);
	        at.scale(zoomFactor, zoomFactor);
	        prevZoomFactor = zoomFactor;
	        g2.transform(at);
	       // g2.drawOval(xOffset, yOffset, 30, 40);
	    
	        
	        this.revalidate();
	        this.repaint();
	        zoomer = false;
	    }
	}

  public void addTextbox() {
	  ComponentResizer cr = new ComponentResizer();
	  Border border = BorderFactory.createLineBorder(Color.BLACK);
	  jt.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
	  jt.setOpaque(false);
	  ComponentMover cm = new ComponentMover();
 	  cm.registerComponent(jt);
 	  cr.registerComponent(jt);
 	  cm.setDragInsets(cr.getDragInsets());  
 	  textbox=true;
 	  this.add(jt);
 	  this.validate();
  }
  
  
  public void addAttr(String text,String fontn, int sze,Color clr) {
	  Font f=new Font(fontn,Font.PLAIN,sze);
	  control.ft.setfont(fontn);
	  control.ft.setsize(sze);
	  control.ft.setcolor(clr);
	  jt.setText(text);
	  jt.setForeground(clr);	  
  }

  public Vector getVector() {
return this.shapes;
  }
  public void setVector(Vector v) {
	  for(int i=0;i<v.size()-1;i++){
		  this.shapes.add(v.elementAt(i));
		  this.repaint();
	  }
  }
  
@Override
public void mouseClicked(MouseEvent arg0) {	
}
public void mouseEntered(MouseEvent arg0) {	
}
public void mouseExited(MouseEvent arg0) {
}

}
