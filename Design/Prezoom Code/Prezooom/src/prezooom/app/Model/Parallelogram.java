package prezooom.app.Model;


import java.awt.Graphics;


public class Parallelogram extends Shape{

  private double angle;


  public Parallelogram(int x, int y, int width, int height, double angle){

    super(x, y, width, height);

    if((this.angle = Math.abs(angle)) > 180)        /* If angle isn't between 0 and 180° */
      this.angle -= (angle%180) * 180;              /* Transform angle to be between 0 and 180° */

    this.angle *= Math.PI/180;                      /* Convert degrees to radius */

    if(this.angle <= Math.PI/2){
      super.width = width + (int)(height * Math.cos(this.angle));
      super.height = (int)(height * Math.sin(this.angle));
    }
    else{
      super.x = x - (int)(height * Math.cos(Math.PI - this.angle));
      super.width = width + (int)(height * Math.cos(Math.PI - this.angle));
      super.height = (int)(height * Math.sin(Math.PI - this.angle));
    }
  }

/**
 * Draw to Graphic g the OurParallelogram
 */
  public void draw(Graphics g){
    int xPoints[] = new int[4];
    int yPoints[] = new int[4];

    if(angle <= Math.PI/2){
      xPoints[0] = x;
      xPoints[1] = x + width - (int)(height * Math.cos(angle));
      xPoints[2] = x + width;
      xPoints[3] = x + (int)(height * Math.cos(angle));
    }
    else{
      xPoints[0] = x + (int)(height * Math.cos(Math.PI - angle));
      xPoints[1] = x + width;
      xPoints[2] = x + width - (int)(height * Math.cos(Math.PI - angle));
      xPoints[3] = x;
    }

    yPoints[0] = y;
    yPoints[1] = y;
    yPoints[2] = y + height;
    yPoints[3] = y + height;

    g.setColor(color);

    if(filled())
      g.fillPolygon(xPoints, yPoints, 4);
    else
      g.drawPolygon(xPoints, yPoints, 4);
  }

/**
 * Compute perimeter of OurParallelogram
 * @return Value of perimeter
 */
  public double perimeter(){
    if(angle == 0)
      return (double)(width + height);

    if(angle <= Math.PI/2)
      return 2*((double)width - (double)height/Math.tan(angle)) + 2*((double)height/Math.sin(angle));
    else
      return 2*((double)width - (double)height/Math.tan(Math.PI - angle)) + 2*((double)height/Math.sin(Math.PI - angle));
  }

/**
 * Compute area of OurParallelogram
 * @return Value of area
 */
  public double area(){
    if(angle == 0)
      return 0;

    if(angle <= Math.PI/2)
      return ((double)width - (double)height/Math.tan(angle)) * ((double)height/Math.sin(angle));
    else
      return ((double)width - (double)height/Math.tan(Math.PI - angle))*((double)height/Math.sin(Math.PI - angle));
  }

/**
 * Scale OurParallelogram
 * @param factor Factor of scale
 */
  public void scale(double factor){
    width *= factor;
    height *= factor;
  }
}
