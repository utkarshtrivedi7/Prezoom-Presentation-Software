package prezooom.app.View;
import javax.swing.JTextArea;
import prezooom.app.Controller.panelinfo;

import java.awt.*;
import javax.swing.*;

public class Jtext {
panelinfo pi=panelinfo.instance();
JTextArea jt[];
    public Jtext() {
    }
    
    public JTextArea ta(int i, int j){
    
           jt=new JTextArea[j];
           jt[i]=new JTextArea();
        //   jt.setBounds(50, 50, 150, 150);
        jt[i].setBounds(50, 50, 150, 150);
        
           return jt[i];
    
    
    }
    
}
