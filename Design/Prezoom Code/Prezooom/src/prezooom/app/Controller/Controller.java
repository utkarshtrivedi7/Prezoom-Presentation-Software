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
import prezooom.app.Model.Filter;
import prezooom.app.Model.Popup;
import prezooom.app.View.MainFrame;

@SuppressWarnings("unused")
public class Controller {
	public final static int NOSHAPE = -1;
	public final static int CIRCLE = 0;
	public final static int ELLIPSE = 1;
	public final static int SQUARE = 2;
	public final static int RECTANGLE = 3;
	public final static String DEFAULT_WIDTH = "100";
	public final static String DEFAULT_HEIGHT = "50";
	public int DEFAULT_SHAPE = ELLIPSE;
	public final static Color DEFAULT_COLOR = Color.blue;
	public final static boolean DEFAULT_FILLED = false;


	private MainFrame mainframe;

	private Display display;

	public StateManager manager=new StateManager();
	private Filter filter;
	private Popup popup;
	public static Display dp[]=new Display[1000];

    Box box = new Box(BoxLayout.Y_AXIS);
    JScrollPane jsp = new JScrollPane(box);
    public int states=0;
    JPanel msg[] = new JPanel[1000];
    JLabel sub;

	public Controller(MainFrame f, Display d) {

		this.mainframe = f;
		this.display = d;
		manager=new StateManager();
		

	}

	public  JPanel getAdd(int st) {
	
	return  manager.add(st);
	}
	
	public JPanel getDelete(int sts) {
		
		return manager.delete(sts);
	}
	
	public JPanel getMain(int st) {
		
		
		return manager.addMain(st, mainframe);
		
	}
	

}
