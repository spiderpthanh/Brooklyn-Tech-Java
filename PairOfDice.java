public class PairOfDice 
{
  private Die die1;
  private Die die2;
    
  public PairOfDice() 
  { 
    die1 = new Die(); 
    die2 = new Die();
  }
  public PairOfDice(int size) 
  { 
    die1 = new Die(size); 
    die2 = new Die(size);
  }
  public PairOfDice (int size1, int size2)
  {
    die1 = new Die(size1);
    die2 = new Die(size2);
  }
  public int getDie1Size()
  {
    
    return die1.getNumberOfSides();
    
  }
  public int getDie2Size()
  {
    return die2.getNumberOfSides();
  }
  public int roll()
  {
    return die1.roll() + die2.roll();
  }
  
}
