package prezooom.app.Controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import prezooom.app.Model.Display;
import prezooom.app.View.MainFrame;

public class StateManager {
	int i=0;

	public StateManager(){
		

	}
	
	public  JPanel add(int st) {
		this.states=st;
        msg [states]= new JPanel(new BorderLayout());
        msg[states].setBackground(Color.white);
        msg[states].setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1) );
        sub = new JLabel("",SwingConstants.CENTER);
        sub.setText("States: " + states);
        sub.setBorder(BorderFactory.createLineBorder(Color.black));
        msg[states].add(sub);
        msg[states].setPreferredSize(new Dimension(140, 100));     
        msg[states].setMaximumSize(new Dimension(140, 100));         
        box.add(msg[states]);
        jsp.setPreferredSize(new Dimension(100, 500)); 		
	    return  msg[states];
	}
	
	
	
	public JPanel delete(int states) {
		JPanel p=msg[states-1];
		return p;
	}
	
	public JPanel addMain(int states,MainFrame mf) {
		
		dp[states]=new Display(mf);
		
		return dp[states];
	}
	
	public static Display dp[]=new Display[1000];
    Box box = new Box(BoxLayout.Y_AXIS);
    JScrollPane jsp = new JScrollPane(box);
    public int states=0;
    public static JPanel msg[] = new JPanel[1000];
    JLabel sub;	
}
