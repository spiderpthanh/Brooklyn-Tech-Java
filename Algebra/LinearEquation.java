public class LinearEquation {
  private double a, b, c;
 
  public LinearEquation(double a, double b, double c) {
  if (a == 0 && b == 0)
  {
     a = -1;
     b = 1;
  }
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public LinearEquation(LinearEquation other)
  {
    this.a = other.a;
    this.b = other.b;
    this.c = other.c;
  }
  public boolean equals(LinearEquation other)
  {
    double thisBRatio = this.b / this.a;
    double otherBRatio = other.b / other.a;
    double thisCRatio = this.c / this.a;
    double otherCRatio = other.c / other.a;
    if (thisBRatio != otherBRatio)
    return false;
   
    if ( thisCRatio != otherCRatio)
    return false;
   
    return true;
  }
  public boolean slopeDefined()
  {
    return b!=0;
  }
 
  public boolean hasYIntercept()
  {
    return !slopeDefined();
  }
 
  public boolean hasXIntercept()
  {
    return a!=0;
  }
  public double xIntercept()
  {
    return -c/a;
  }
   public double yIntercept()
  {
     return -c/b;
  }
 
  public double slope()
  {
    return -a/b;
  }

  public boolean isIncreasing()
  {
    return 0 < -a/b;
  }

  public boolean isDecreasing()
  {
     return 0 > -a/b;
  }

  public boolean isHorizontal()
  {
    return a == 0;
  }
  public boolean isVertical()
  {
    return !slopeDefined();
  }
 
  public boolean isAFunction()
  {
    return slopeDefined();
  }
  public Coords pointOfIntersection(LinearEquation other)
  {
    double d = other.a;  
    double e = other.b;
    double f = other.c;
    if( this.slope() == other.slope())
      return null;
    if ( this.isHorizontal() && other.isHorizontal())
      return null;
    if ( this.isVertical() && other.isVertical())
      return null;
    if ( this.isHorizontal() && other.isVertical())
      return new Coords(this.xIntercept(), other.yIntercept());
    if (other.isVertical() && this.isVertical())
      return new Coords(other.xIntercept(), this.yIntercept());
    double x = (b*f-c*e)/(a*e-b*d);
    double y = (-a*x -c) / b;
    return new Coords(x,y);
   }
  public String toString()
  {
    
  }
}
