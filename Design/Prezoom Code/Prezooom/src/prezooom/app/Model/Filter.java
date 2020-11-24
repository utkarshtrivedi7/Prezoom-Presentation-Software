package prezooom.app.Model;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;



import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import prezooom.app.View.MainFrame;

public class Filter extends WindowAdapter {

	final static int NOSHAPE = -1;
	final static int CIRCLE = 0;
	final static int ELLIPSE = 1;
	final static int SQUARE = 2;
	final static int RECTANGLE = 3;
	final static String DEFAULT_WIDTH = "100";
	final static String DEFAULT_HEIGHT = "50";
	final static int DEFAULT_SHAPE = CIRCLE;
	final static Color DEFAULT_COLOR = Color.blue;
	final static boolean DEFAULT_FILLED = false;

	public Display display;

	MainFrame minidraw;

	public boolean toSave = false; 


	public Filter(Display d,MainFrame mini) {
        this.minidraw=mini;
		this.display=d;
		

	}

	public void windowClosing1(WindowEvent e) {
		System.out.println("exit click");
		// System.exit(0);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public void loadFile(){
	    JFileChooser chooser = new JFileChooser("..");
	    chooser.setDialogTitle("Load");
	    chooser.setApproveButtonText("Load");
	    

	    if(chooser.showOpenDialog(minidraw) != JFileChooser.APPROVE_OPTION)
	     ;


	    try {
	      BufferedReader buff = new BufferedReader(new FileReader(chooser.getSelectedFile().getPath()));  /* Read file and put it into buffer */

	      for(String line = buff.readLine(); line != null; line = buff.readLine()) {                      /* Read the buffer line by line */
	        StringTokenizer t = new StringTokenizer(line, " ");
	        Vector tmp = new Vector();

	        while(t.hasMoreTokens()) {             /* Get all parameters from current line */
	          tmp.add(t.nextToken());

	          
	        }
	        Shape shapeTmp = null;

	        switch((new Integer((String)tmp.elementAt(0))).intValue()) {
	          /* Circle */
	          case CIRCLE :
	            shapeTmp = new Circle(new Integer((String)tmp.elementAt(1)).intValue(),
	                                     new Integer((String)tmp.elementAt(2)).intValue(),
	                                     new Integer((String)tmp.elementAt(3)).intValue());
	            break;

	          /* Ellipse */
	          case ELLIPSE :
	            shapeTmp = new Ellipse(new Integer((String)tmp.elementAt(1)).intValue(),
	                                      new Integer((String)tmp.elementAt(2)).intValue(),
	                                      new Integer((String)tmp.elementAt(3)).intValue(),
	                                      new Integer((String)tmp.elementAt(4)).intValue());
	            break;

	          /* Square */
	          case SQUARE :
	            shapeTmp = new Square(new Integer((String)tmp.elementAt(1)).intValue(),
	                                     new Integer((String)tmp.elementAt(2)).intValue(),
	                                     new Integer((String)tmp.elementAt(3)).intValue());
	            break;

	          /* Rectangle */
	          case RECTANGLE :
	        	 
	        	 
	            shapeTmp = new Rectangle(new Integer((String)tmp.elementAt(1)).intValue(),
	                                        new Integer((String)tmp.elementAt(2)).intValue(),
	                                        new Integer((String)tmp.elementAt(3)).intValue(),
	                                        new Integer((String)tmp.elementAt(4)).intValue());
	            break;

	          default :
	            JOptionPane.showMessageDialog(minidraw,"Contains of file is erroned", "Error during read from file", JOptionPane.ERROR_MESSAGE);
	            ;
	        }
	        shapeTmp.setColor(new Color(new Integer((String)tmp.elementAt(5)).intValue(),
	                                    new Integer((String)tmp.elementAt(6)).intValue(),
	                                    new Integer((String)tmp.elementAt(7)).intValue()));                   /* Color's parameters */
	        shapeTmp.setFilled((new Boolean((String)tmp.elementAt(8))).booleanValue());                       /* Filled parameter */
	        display.shapes.add(shapeTmp);                                                                     /* Add to shapes vector */
	      }
	        
	      display.repaint();                
	      minidraw.addshape(display);
	      buff.close();						         
	    }
	    
	    catch(IOException e){
	      JOptionPane.showMessageDialog(minidraw, e.getMessage());    /* Show errors */
	      ;
	    }
	    //setTitle("Draw - " + chooser.getSelectedFile().getName());                                  /* Change title of the application */
	    ;
	  }


	  public void saveFile(){

	    JFileChooser chooser = new JFileChooser("..");
	    chooser.setDialogTitle("Save");
	    chooser.setApproveButtonText("Save");
	    
	 
	    if(chooser.showOpenDialog(minidraw) != JFileChooser.APPROVE_OPTION)
	    	;

	    try {
	      BufferedWriter buff = new BufferedWriter(new FileWriter(chooser.getSelectedFile().getPath()));		/* Create a new buffer to write on it */

	      for(int i = 0; i < display.shapes.size(); i++) {                  /* Cover the shapes vector */
	       Shape tmpShape = (Shape)display.shapes.elementAt(i);
	        String strType = new String();

	        /* Determinate sort of shape */
	        if(tmpShape instanceof Rectangle)
	          strType = "3";
	        if(tmpShape instanceof Square)
	          strType = "2";
	        if(tmpShape instanceof Ellipse)
	          strType = "1";
	        if(tmpShape instanceof Circle)
	          strType = "0";


	      
	        String strShape = new String(strType + " " + tmpShape.x + " " + tmpShape.y + " " + tmpShape.width + " " + 
							  tmpShape.height + " " + tmpShape.color.getRed() + " " + tmpShape.color.getGreen() + " " +
	                          tmpShape.color.getBlue() + " " + tmpShape.filled);
	       
	        buff.write(strShape, 0, strShape.length());
	        buff.newLine();                     					/* Create new line */
	      }
	      buff.close();                     							/* Close buffer */
	    }
	    
	    
	    catch(IOException e){
	      JOptionPane.showMessageDialog(minidraw, e.getMessage());  
	      
	    }
	  
	  }

	public void windowClosing(WindowEvent e) {
		if (toSave) {
			int ans = JOptionPane.showConfirmDialog(minidraw, "Save your design ?", "Warning",
					JOptionPane.YES_NO_CANCEL_OPTION);

			if (ans == JOptionPane.CANCEL_OPTION)
				return;

			if (ans == JOptionPane.YES_OPTION)
				;

		}
		System.exit(0);
	}

	public void windowOpened(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}
}
