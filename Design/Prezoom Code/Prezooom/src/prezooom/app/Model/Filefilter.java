package prezooom.app.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import prezooom.app.Controller.panelinfo;

public class Filefilter {
    
    panelinfo pi=panelinfo.instance();
    private String filename = null; 
    
    //Open file method
  public void loadFile() {
    JFileChooser fc = new JFileChooser();
    String name = null;
    if (fc.showOpenDialog(null) != JFileChooser.CANCEL_OPTION)
      name = fc.getSelectedFile().getAbsolutePath();
    else
      return;  // user cancelled
    try {
      Scanner in = new Scanner(new File(name));  // might fail
      filename = name;
      while (in.hasNext())
        pi.settext(in.nextLine() + "\n");
      in.close();
    }
    catch (FileNotFoundException e) {
      JOptionPane.showMessageDialog(null, "File not found: " + name,
        "Error", JOptionPane.ERROR_MESSAGE);
    }
  }

    //Save file method
    public void saveFile(String name) {
    if (name == null) {  // get filename from user
      JFileChooser fc = new JFileChooser();
      if (fc.showSaveDialog(null) != JFileChooser.CANCEL_OPTION)
        name = fc.getSelectedFile().getAbsolutePath();
    }
    if (name != null) {  // else user cancelled
      try {
        Formatter out = new Formatter(new File(name));  // might fail
        filename = name;
        out.format("%s", pi.text());
        
        out.close();
        JOptionPane.showMessageDialog(null, "Saved to " + filename,
          "Save File", JOptionPane.PLAIN_MESSAGE);
      }
      catch (FileNotFoundException e) {
        JOptionPane.showMessageDialog(null, "Cannot write to file: " + name,
          "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
  
}
