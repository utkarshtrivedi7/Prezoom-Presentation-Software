package prezooom.app.Model;


import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape{

  public int x;			
  public int y;			
  public int height;	       
  public int width;	     
  public boolean filled = false;  	
  public Color color = Color.blue;		
  public Shape(int x, int y){
    this.x = x;
    this.y = y;
  }

  public Shape(int x, int y, int width, int height){

    if (width < 0){
      this.x = x + width;
      this.width = -width;
    }
    else{
      this.x = x;
      this.width = width;
    }

    if (height < 0){
      this.y = y + height;
      this.height = -height;
    }
    else{
      this.y = y;
      this.height = height;
    }
  }


  public boolean contains(int x, int y){
    return (x >= this.x) && (x <= this.x + width) && (y >= this.y) && (y <= this.y + height);
  }


  public Color color(){
    return color;
  }


  public void setColor(Color c){
    color = c;
  }

  public void translate(int deltaX, int deltaY){
    x += deltaX;
    y += deltaY;
    
    
  }


  public void setFilled(boolean fill){
    filled = fill;
  }


  public boolean filled(){
    return filled;
  }

  public abstract void scale(double d);
  public abstract double perimeter();
  public abstract void draw(Graphics g);
  public abstract double area();
}
