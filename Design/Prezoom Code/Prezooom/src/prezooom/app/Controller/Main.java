package prezooom.app.Controller;
import prezooom.app.Model.Display;
import prezooom.app.Model.Popup;
import prezooom.app.View.MainFrame;


@SuppressWarnings("unused")
public class Main {

   
   

     public static void main(String [] args)
   
    {
		 
    	   MainFrame f=new MainFrame();
	       Display d=new Display(f);
		   Popup p=new Popup(f,d);
		   Controller control=new Controller(f,d);
    
            f.setVisible(true);

    }    

    
}
