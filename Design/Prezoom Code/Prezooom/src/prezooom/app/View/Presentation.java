package prezooom.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import prezooom.app.Controller.Controller;




public class Presentation extends JFrame  {

	private static final long serialVersionUID = 1L;
    Controller ct;
    MainFrame f;
	private JPanel mpanel;
	public JPanel panel;
	public JButton btn1, btn2;
	final JPanel copy[]=new JPanel[30];
	MainFrame t;
	int index=0;
	int previous=0;
	int next=0;
	JPanel check=new JPanel();
	JPanel start=new JPanel();
	 
	public Presentation(MainFrame f,Controller ct) {
		this.ct=ct;
		this.f=f;
		initComponents();
		
	}

	private void initComponents() {

	   
	     this. setSize(900,900);
	     this. setBackground(Color.white);
	     this. getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));    
	      Border red = BorderFactory.createLineBorder(Color.white);
	      mpanel = new JPanel();
	      panel = new JPanel(); 
	      panel.setPreferredSize(new Dimension(1150, 700));
	      panel.setLayout(new BorderLayout());
	    
	      check.setBackground(Color.red);
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
	      
	      btn2.addMouseListener(new MouseAdapter() {
	    	  public void mouseClicked(MouseEvent e) {
	     previous=index-1;
	     check=ct.getPanel(index);
	     panel.removeAll();
	     panel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	     panel.add(check);
	     panel.repaint();
	     panel.validate();
	     index++;
	     if(index>ct.total_slides()) {
	    	 index=ct.total_slides();
	     }
	    	    	    
	      }});
	      btn1.addMouseListener(new MouseAdapter() {
	    	  public void mouseClicked(MouseEvent e) {	 
	     index=previous+1;
	     check=ct.getPanel(previous);
	     panel.removeAll();
	     panel.add(check);
	     panel.repaint();
	     panel.validate();
	     previous--;
	     if(previous<=0) {
	    	 previous=0;	         	 
	     }
	      }});	  		      
	}
	
public void add(JPanel p) {		
    panel.add(p);   
    index++;
    
	
	}	
}
