package prezooom.app.Model;

import java.awt.Graphics;


public class Ellipse extends Shape{

  public Ellipse(int x, int y, int width, int height){
    super(x, y, width, height);
  }


  public void draw(Graphics g){
    g.setColor(color);
    if(filled())
      g.fillOval(x, y, width, height);                    
    else
      g.drawOval(x, y, width, height);                    /* Unfilled OurEllipse */
  }


  public double perimeter(){
    return (Math.PI * (double)(height + width)) / 2;
  }


  public double area(){
    return Math.PI * Math.pow((height + width) / 4, 2);
  }

  public void scale(double factor){
    width *= factor;
    height *= factor;
  }
}
