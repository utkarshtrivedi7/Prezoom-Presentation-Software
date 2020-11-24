package prezooom.app.Model;


import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape{

  public int x;			/* X coordinate of the upper left corner of bounding box contains OurShape */
  public int y;			/* Y coordinate of the upper left corner of bounding box contains OurShape */
  public int height;	       /* Height of the bounding box */
  public int width;	      /* Width of the bounding box */
  public boolean filled = false;  		/* If shape is filled or not */
  public Color color = Color.blue;		/* Color of shape */

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

/**
 * Return true if shape contains x and y.
 * @param x x coordinate
 * @param y y coordinate
 */
  public boolean contains(int x, int y){
    return (x >= this.x) && (x <= this.x + width) && (y >= this.y) && (y <= this.y + height);
  }

/**
 * Return color of OurShape
 * @return Color of OurShape
 */
  public Color color(){
    return color;
  }

/**
 * Change shape's color
 * @param c color
 */
  public void setColor(Color c){
    color = c;
  }

/**
 * Move shape to new x,y coordinates
 * @param deltaX Increment of origin x
 * @param deltaY Increment of origin y
 */
  public void translate(int deltaX, int deltaY){
    x += deltaX;
    y += deltaY;
    
    
  }

/**
 * Filled or not the shape
 * @param fill Filled or not
 */
  public void setFilled(boolean fill){
    filled = fill;
  }

/**
 * Return true if OurShape is filled
 * @return True if OurShape is filled, false otherwise
 */
  public boolean filled(){
    return filled;
  }

/* Abstract methods */
  public abstract void scale(double d);
  public abstract double perimeter();
  public abstract void draw(Graphics g);
  public abstract double area();
}
