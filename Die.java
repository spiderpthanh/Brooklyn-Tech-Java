public class Die 
{
  private int numberOfSides;
  public static final int DEFAULT_SIDES = 6;
  
  public static final int MIN_SIDES = 2;
  public static final int MAX_SIDES = 1000;
  

  public Die() 
  { 
    numberOfSides = DEFAULT_SIDES;
  }
  
  public Die (int size)
  {
    numberOfSides = size;
  }
  
  public int roll()
  {
    return (int)(Math.random()* (numberOfSides)) + 1;
  }
 
    public int roll(int roll)
  {
    return (int)(Math.random() * numberOfSides) + 1;
  }
    
    public int getNumberOfSides()
    {
      return numberOfSides;
    }
  
}
