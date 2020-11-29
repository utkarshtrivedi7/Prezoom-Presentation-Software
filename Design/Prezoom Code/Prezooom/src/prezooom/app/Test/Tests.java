package prezooom.app.Test;


import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;
import java.awt.Font;

import org.junit.jupiter.api.Test;

import com.sun.net.httpserver.Filter;

import prezooom.app.Controller.Controller;
//import jdk.internal.org.jline.terminal.Size;
import prezooom.app.Model.Display;
import prezooom.app.Model.Popup;
import prezooom.app.View.MainFrame;

class ControllerTest {

	@Test
	void test() {
		 MainFrame f=new MainFrame();
	       Display d=new Display(f);
		   Popup p=new Popup(f,d);
		   Controller control=new Controller(f,d);
		   control.ft.getcolor();
		   assertEquals(Color.black, control.ft.getcolor());
		
	}
	@Test
	void test1() {
		 MainFrame f=new MainFrame();
	       Display d=new Display(f);
		   Popup p=new Popup(f,d);
		   Controller control=new Controller(f,d);
		   control.ft.setcolor(Color.red);
		   assertEquals(Color.red, control.ft.getcolor());
		
	}
	@Test
	void test2() {
		 MainFrame f=new MainFrame();
	       Display d=new Display(f);
		   Popup p=new Popup(f,d);
		   Controller control=new Controller(f,d);
		   control.ft.getfont();
		   assertEquals("Agency FB", control.ft.getfont());
		
	}
	@Test
	void test3() {
		 MainFrame f=new MainFrame();
	       Display d=new Display(f);
		   Popup p=new Popup(f,d);
		   Controller control=new Controller(f,d);
		   control.ft.setfont("Arial");
		   assertEquals("Arial", control.ft.getfont());
		
	}
	@Test
	void test4() {
		 MainFrame f=new MainFrame();
	       Display d=new Display(f);
		   Popup p=new Popup(f,d);
		   Controller control=new Controller(f,d);
		   control.ft.getsize();
		   assertEquals(20, 20);
		
	}
	@Test
	void test5() {
		 MainFrame f=new MainFrame();
	       Display d=new Display(f);
		   Popup p=new Popup(f,d);
		   Controller control=new Controller(f,d);
		   control.ft.setsize(20);
		   assertEquals(20, 20);
		
	}
	@Test
	void test6() {
		 MainFrame f=new MainFrame();
	       Display d=new Display(f);
		   Popup p=new Popup(f,d);
		   Controller control=new Controller(f,d);
		  
		   
		  
	}
	
	
	


}
