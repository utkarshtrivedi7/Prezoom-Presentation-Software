package prezooom.app.Model;


import java.awt.BorderLayout;
import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import prezooom.app.Controller.panelinfo;

public class addpanel {

int i=0;
panelinfo pi;
public static addpanel ins;

public static addpanel instant(){

      if(ins==null)
          ins=new addpanel();
          

      return ins;

}
    
    

public void add(JPanel p){
          
    
    
        
         
            panelinfo pi;
            JPanel mainList;     
            p.setLayout(new BorderLayout());
          
            mainList = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.weightx = 1;
            gbc.weighty = 1;
            mainList.add(new JPanel(), gbc);

            p.add(new JScrollPane(mainList));
            pi=panelinfo.instance();
           
            int i=pi.total_p();
            
  
            JPanel j[] = new JPanel[1000];
            j[i]=new JPanel();
                    
            JPanel panel = new JPanel();
            panel.add(j[i]);
            // j[i].setText("Label"+i);
                 int y= 3;  
            panel.setBorder(new MatteBorder(3, y, 3, 3, Color.GRAY));
            y++;
            GridBagConstraints gb = new GridBagConstraints();
            gb.gridwidth = GridBagConstraints.REMAINDER;
            gb.weightx = 1;
            gb.fill = GridBagConstraints.HORIZONTAL;
            mainList.add(panel, gb, 0);

            pi.addpanel();
            i++;
            p.validate();
            p.repaint();
                
          

    
        }

  
    }
