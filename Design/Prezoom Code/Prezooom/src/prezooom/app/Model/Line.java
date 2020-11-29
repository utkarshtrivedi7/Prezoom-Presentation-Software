/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prezooom.app.Model;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Line extends Shape{

  public Line(int x, int y, int width, int height){
    super(x, y, width, height);
  }

@Override
public void scale(double factor) {
    width *= factor;
    height *= factor;
	
}

@Override
public double perimeter() {
	
	return 0;
}

@Override
public void draw(Graphics g) {
	


	  g.drawLine(x, y, height, width);
	 
	
	
}

public void paint(Graphics g){
	   
		  Graphics2D g1 = (Graphics2D) g;
		  g1.setStroke(new BasicStroke(10,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
		  g1.drawLine(x, y, height, width);
	}

@Override
public double area() {
	// TODO Auto-generated method stub
	return 0;
}
}
