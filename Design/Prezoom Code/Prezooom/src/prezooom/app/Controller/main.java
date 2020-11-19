package prezooom.app.Controller;
import java.awt.Color;
import prezooom.app.View.MainFrame;
import prezooom.app.*;


public class main {
    private fontsize font=fontsize.create();
    
    public static void main(String [] args)
    {
    
    new MainFrame().setVisible(true);

    }    
    
    public void setfont(String fn){
    
        font.setfont(fn);
        
    }

    public String getfont(){
    
      return font.getfont();
    }
    
        public void setsize(int fn){
    
        font.setsize(fn);
        
    }

    public int getsize(){
    
      return font.getsize();
    }
    
    
        public void setcolor(Color c){
    
           font.setcolor(c);
    
    }  
    public Color getcolor(){
    
    
         return font.getcolor();
    }
    
    
}
