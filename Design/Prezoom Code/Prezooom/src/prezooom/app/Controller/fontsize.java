
package prezooom.app.Controller;

import java.awt.Color;



public class fontsize {
    
    private String font="Agency FB";
    private int size=10;
    private Color color=Color.black;
    private static fontsize inst;
    private fontsize(){
    
        System.out.println("font is:"+font);
        System.out.println("font size is:"+size);
        System.out.println("color is:"+color);
    
    }
    
    public static fontsize create(){
           if(inst==null){
           
               inst=new fontsize();
           
           
           }
    return inst;
    
    }
    
    
    public void setfont(String font){
    
                this.font=font;
    }
    
    public void setsize(int size){
    
    
          this.size=size;
    }
    
    
    public String getfont(){
    
    return font;
    
    }
    
    
    public int getsize(){
    
      return size;
    
    }
    
    
    public void setcolor(Color c){
    
           this.color=c;

        System.out.println("color in contructor:"+color);
           
    
    }  
    public Color getcolor(){
    
    
         return this.color;
    }
    
    
}
