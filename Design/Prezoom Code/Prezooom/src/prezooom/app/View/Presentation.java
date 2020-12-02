package prezooom.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import prezooom.app.Controller.Controller;
import prezooom.app.Model.Display;
import prezooom.app.Model.JPanelSlider;

public class Presentation extends JFrame implements WindowListener {
    JPanelSlider jp=new JPanelSlider();
	private static final long serialVersionUID = 1L;
    Controller ct;
    MainFrame f;
	private JPanel mpanel;
	public JPanel panel;
	public JButton btn1, btn2;
	MainFrame t;
	public int total_state,entered=0;
	int previous=-1;
	int next=1;

	 
	public Presentation(MainFrame f,Controller ct) {
		this.ct=ct;
		this.f=f;
		initComponents();
		
	}

	private void initComponents() {

	   
	     this. setSize(900,900);
	     this. setBackground(Color.white);
	     this.setForeground(Color.white);
	     this. getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));    
	      Border red = BorderFactory.createLineBorder(Color.white);
	      mpanel = new JPanel();
	      panel = new JPanel(); 
	      panel.setPreferredSize(new Dimension(1150, 700));
	      panel.setLayout(new BorderLayout());	    
          panel.setBackground(Color.white);
	      JPanel button_panel = new JPanel();
	      btn1 = new JButton("Previous");
	      btn2 = new JButton("Next");     
	     button_panel.add(btn1);
	      button_panel.add(btn2);	     
	      button_panel.setAlignmentX(Component.LEFT_ALIGNMENT);
	      button_panel.setPreferredSize(new Dimension(1150, 50));
	      button_panel.setBorder(red); 
	      //panel.add(check);
	      mpanel.setBackground(Color.white); 
	      mpanel.add(panel);
	      mpanel.add(button_panel);
	      this.getContentPane().add(mpanel);
	      this.setSize(1200, 800);
	      //this.setResizable(false);
	      this.setVisible(true);
	      
	      
	      
	      
//------------------- NEXT Button --------------------------------------------
	      
	  btn2.addMouseListener(new MouseAdapter() {
	   	  public void mouseClicked(MouseEvent e) {
             if(next<total_state) {
           	  if(entered==0) {
           		//panel.remove(dis[0]);
						/*
						 * panel.add(jp); jp.add(dis[0]);
						 */
           		  entered++;            	
           	  }            	  
	   		  jp.nextPanel(20, dis[next], jp.right);
	   		  next++;
	   		  previous++;
             }
    	     }});      
//-------------------- PREVIOUS BUTTON	-----------------------------------------
	      
	btn1.addMouseListener(new MouseAdapter() {
	    	  public void mouseClicked(MouseEvent e) {	 
	    		  if(previous>-1) {
	    			  jp.nextPanel(30, dis[previous], jp.left);
	    			  previous--;
	    			  next--;  			 
	    		  }	    		  
	      }});	  		      
	}
	
public void add(JPanel p) {		
    panel.add(jp);  
    jp.add(p);
    index++;
	}

public void duplicate() {
	total_state=ct.total_slides();
	
	do {
		 dis[j]=new Display(f);
		orig=ct.duplicate(ct.current_Vector(j));		
       for(int i=0;i<orig.size();i++) {
    	   dis[j].shapes.add(orig.elementAt(i));  
    	   dis[j].selectedShape=5;
      }   
       jp.add(dis[j]);
       j++;
	}while(j<total_state);	
	//panel.add(dis[0]);
	panel.add(jp);
	jp.getCurrentComponent(dis[0]);
}

@Override
public void windowActivated(WindowEvent arg0) {
	
}

@Override
public void windowClosed(WindowEvent arg0) {
	panel.removeAll();
	jp.removeAll();
}

@Override
public void windowClosing(WindowEvent arg0) {
	panel.removeAll();
	jp.removeAll();
}

@Override
public void windowDeactivated(WindowEvent arg0) {	
}

@Override
public void windowDeiconified(WindowEvent arg0) {
}

@Override
public void windowIconified(WindowEvent arg0) {	
}

@Override
public void windowOpened(WindowEvent arg0) {
	
}	
public Display dis[]=new Display[1000];
Vector orig=new Vector();
Vector cpy=new Vector();
public int j=0;
public int index=0;
}
