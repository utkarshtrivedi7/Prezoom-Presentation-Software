package prezooom.app.Controller;
import prezooom.app.Model.Display;
import prezooom.app.Model.Popup;
import prezooom.app.View.MainFrame;


@SuppressWarnings("unused")
public class Main {

   
   

     public static void main(String [] args)
   
    {
		 //view
    	   MainFrame f=new MainFrame();
    	 //Model
	       Display d=new Display(f);
	       //model
		   Popup p=new Popup(f,d);
		 //controller
		   Controller control=new Controller(f,d);
    //view intialize
            f.setVisible(true);

    }    

    
}
