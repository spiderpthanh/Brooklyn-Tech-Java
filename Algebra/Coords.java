public class Coords 
{
  //instance variables 
  private double x;
  private double y;
   
  
  public Coords(double x, double y)
  {
    this.x = x;
    this.y = y;
  }
    
    public Coords (double value)
  {
    x = value;
    y = value;
  }
    
    public Coords ()
  {
    x = 0;
    y = 0;
  }
    
    public Coords (Coords other)
  {
    this.x = other.x;
    this.y = other.y;
  }
  
  public String toString()
  {
    return "(" + x + ", " + y + ")";
  }
    
  public boolean equals(Coords other)
  {
    return this.x == other.x && this.y == other.y;
  }
    
  public void reflectOnXAxis()
  {
    y = -y;
  }
    
  public void reflectOnYAxis()
  {
    x = -x;
  }
    
  public void reflectOnOrigin()
  {
    y = -y;
    x = -x;
  }
    
  public void translate(double horizontalShift, double verticalShift)
  {
    y += verticalShift;
    x += horizontalShift;
  }
    
  public void dilate(double dilationFactor)
  {
    x *= dilationFactor;
    y *= dilationFactor;
  }
    
  public void setX(double value)
  {
    x = value;
  }
  public void setY(double value)
  {
      y = value;
  }
  public double getX()
  {
    return x;
  }
  public double getY()
  {
    return y;
  }
  public double distanceFromOrigin()
  {
    return(distanceFrom(new Coords()));
  }
  public double distanceFrom(Coords other)
  {
    return(Math.sqrt((Math.pow(this.x-other.x, 2) + Math.pow(this.y-other.y, 2))));
  }
  public double slope(Coords other)
  {
    return((other.y-this.y)/(other.x-this.x));
  }
}

