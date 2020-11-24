package prezooom.app.Model;

import java.awt.Graphics;

public class animate {

    public void draw(Graphics g)  {
        
        int a=100,b=100,c=10,d=10;
        
        for(int i=0;i<15;i++)
        {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){}
            
            g.drawRect(a, b, c, d);
            a-=5;
            b-=5;
            c+=10;
            d+=10;
        }
   
  }
	
}
