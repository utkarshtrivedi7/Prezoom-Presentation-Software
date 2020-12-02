package prezooom.app.Model;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;



import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import prezooom.app.Controller.Controller;
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
	int ind=0;
	int textb=0;
	int slides=0;
	MainFrame minidraw;
	Controller ctrl;
	int current;
	JPanel p=new JPanel();
    Display disp[]=new Display[1000];
	public boolean toSave = false; 
	public boolean textbox=false;
	String text=null;
	public Filter(Display d,Controller ct,MainFrame f) {
		
		this.display=d;
		this.ctrl=ct;
		this.minidraw=f;
		
	}

	
	
	
	@SuppressWarnings({ "deprecation", "unchecked", "rawtypes" })
	public void loadFile(){
	    JFileChooser chooser = new JFileChooser("..");
	    chooser.setDialogTitle("Load");
	    chooser.setApproveButtonText("Load");
	    disp[ind]=new Display(minidraw);    
	   
	    if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
	    	Shape shapeTmp = null   ;
	    ctrl.mainframe.clear();	    
	    try {
	      BufferedReader buff = new BufferedReader(new FileReader(chooser.getSelectedFile().getPath())); 
	     
	      for(String line = buff.readLine(); line != null; line = buff.readLine()) {
	    	  
	        StringTokenizer t = new StringTokenizer(line, " ");
	        Vector tmp = new Vector();
	        
	        while(t.hasMoreTokens()) {        
	          tmp.add(t.nextToken());          
	        }
	        
	        if((new Integer((String)tmp.elementAt(0))).intValue()>ind) {
	        	  System.out.println("inside if:"+(new Integer((String)tmp.elementAt(0))));
	        	  disp[ind].shapes.add(shapeTmp);
	        	  ind++;
		          disp[ind]=new Display(minidraw);
	        	
	        }
	        slides=(new Integer((String)tmp.elementAt(1)).intValue());
	        System.out.println("states:"+slides);
	        int l=(new Integer((String)tmp.elementAt(0)).intValue());
         
	        
	       
	        switch((new Integer((String)tmp.elementAt(2))).intValue()) {
	       
	          /* Circle */
	          case CIRCLE :
	            shapeTmp = new Circle(new Integer((String)tmp.elementAt(3)).intValue(),
	                                     new Integer((String)tmp.elementAt(4)).intValue(),
	                                     new Integer((String)tmp.elementAt(5)).intValue());
	            break;

	          /* Ellipse */
	          case ELLIPSE :
	            shapeTmp = new Ellipse(new Integer((String)tmp.elementAt(3)).intValue(),
	                                      new Integer((String)tmp.elementAt(4)).intValue(),
	                                      new Integer((String)tmp.elementAt(5)).intValue(),
	                                      new Integer((String)tmp.elementAt(6)).intValue());
	            break;

	          /* Square */
	          case SQUARE :
	            shapeTmp = new Square(new Integer((String)tmp.elementAt(3)).intValue(),
	                                     new Integer((String)tmp.elementAt(4)).intValue(),
	                                     new Integer((String)tmp.elementAt(5)).intValue());
	            break;

	          /* Rectangle */
	          case RECTANGLE :
	        	 
	        	 
	            shapeTmp = new Rectangle(new Integer((String)tmp.elementAt(3)).intValue(),
	                                        new Integer((String)tmp.elementAt(4)).intValue(),
	                                        new Integer((String)tmp.elementAt(5)).intValue(),
	                                        new Integer((String)tmp.elementAt(6)).intValue());
	            break;

	          default :
	            //JOptionPane.showMessageDialog(null,"Contains of file is erroned", "Error during read from file", JOptionPane.ERROR_MESSAGE);
	            ;
	        }
	        shapeTmp.setColor(new Color(new Integer((String)tmp.elementAt(7)).intValue(),
	                                    new Integer((String)tmp.elementAt(8)).intValue(),
	                                    new Integer((String)tmp.elementAt(9)).intValue()));                  
	        shapeTmp.setFilled((new Boolean((String)tmp.elementAt(10))).booleanValue()); 

	        disp[ind].shapes.add(shapeTmp);
       
	      }
	      
	  
	      buff.close();	
	      if(ind==0) {minidraw.addDisplay(0, disp[0]);}
	      for(int i=0;i<slides;i++) {    	
        	  minidraw.addDisplay(i,disp[i]);     
	      }
	    }
	    
	    catch(IOException e){
	      JOptionPane.showMessageDialog(minidraw, e.getMessage());    
	      ;
	    }
                             
	}
	  }


	  public void saveFile(int states){

	    JFileChooser chooser = new JFileChooser("..");
	    chooser.setDialogTitle("Save");
	    chooser.setApproveButtonText("Save");
	 
	    if(chooser.showOpenDialog(minidraw) == JFileChooser.APPROVE_OPTION) {
	    	
	    try {
	   		
		    BufferedWriter buff = new BufferedWriter(new FileWriter(chooser.getSelectedFile().getPath()));
		    for(int k=0;k<=states;k++) {	      
		      display=ctrl.getDispl(k);	      
		      for(int i = 0; i < display.shapes.size(); i++) {                  /* Cover the shapes vector */
		       Shape tmpShape = (Shape)display.shapes.elementAt(i);
		       String strType = new String();	        
		        /* Determinate sort of shape */
		        if(tmpShape instanceof Line)
		        	strType="4";
		        if(tmpShape instanceof Rectangle)
		          strType = "3";
		        if(tmpShape instanceof Square)
		          strType = "2";
		        if(tmpShape instanceof Ellipse)
		          strType = "1";
		        if(tmpShape instanceof Circle)
		          strType = "0";
	           if(display.textbox) {
	        	   text=display.getText();
	        	   if(text!=null) {
	        		   textbox=true;
	        	   }
           }	        
	        String strShape = new String(k+" "+states+" "+strType+ " " + tmpShape.x + " " + tmpShape.y + " " + tmpShape.width + " " + 
							  tmpShape.height + " " + tmpShape.color.getRed() + " " + tmpShape.color.getGreen() + " " +
	                          tmpShape.color.getBlue() + " " + tmpShape.filled);
	        
	        buff.write(strShape,0,strShape.length());
	        buff.newLine(); 
	      }
	      }
     
	      buff.close();                     							
	    }
	    
	    
	    catch(IOException e){
	      JOptionPane.showMessageDialog(minidraw, e.getMessage());  
	      
	    }
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
