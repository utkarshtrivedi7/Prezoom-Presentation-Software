package prezooom.app.Controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.util.Vector;

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
import prezooom.app.View.Presentation;

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
	JPanel Display;

    Presentation pres;
	public MainFrame mainframe;
	private Display display;
	public StateManager manager=new StateManager();
	private Filter filter;
	private Popup popup;
    public int states=0;
    public  fontsize ft;

   
	public Controller(MainFrame f, Display d) {
       Display=new JPanel();
		this.mainframe = f;
		this.display = d;
		manager=new StateManager();
		filter=new Filter(display,this,mainframe);
        this.ft=fontsize.create();		

	}

	public Controller(Presentation pt) {	
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
public JPanel getPanel(int index)
{
	if(index<=mainframe.getState()) {
	
    }
	else {
		this.Display=mainframe.getPanel(index);
		
	         Display.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	return Display;
	
	}

public int total_slides() {	

	return mainframe.state();
}


public Display getDispl(int ind) {
	return mainframe.getDisplay(ind);
}

public void present() {
	pres=new Presentation(mainframe,this);
	pres.duplicate();	
}

public void clear() {
	mainframe.clear();
}

public Vector duplicate(Vector orig) {
	Vector copy=(Vector)orig.clone();
	return copy;
	
}
public Vector current_Vector(int ind) {
	
	return mainframe.vector(ind);
}

}
