
package prezooom.app.Controller;

public class panelinfo {
    String text="";
    int panel_num=0;
    public static panelinfo inst;
    
    public static panelinfo instance(){
    
    if(inst==null)
       inst=new panelinfo();
      return inst;
    }
    
    public void addpanel(){
    
       panel_num=panel_num+1;
    }
    
    public int total_p(){
      return panel_num;
    
    }
    
    public void settext(String t){
    this.text=t;
    
    }
    
    public String text(){
    
    return text;
    }
    
}
