public class DiceProbability 
{
    private PairOfDice dice;
    private int numberOfRolls;
    private int[] outcomes; 
    public static final int DEFAULT_ROLLS = 50;
    
  public DiceProbability()
  { 
    numberOfRolls = DEFAULT_ROLLS;
    outcomes = new int[13];
    dice = new PairOfDice();
    //roll();
    //printOutcomes();
    
  }
  public DiceProbability(int numRolls)
  { 
    dice = new PairOfDice();
    numberOfRolls = numRolls;
    outcomes = new int[13];
    //roll();
    //printOutcomes();
    
  }
  
  public DiceProbability(PairOfDice theDice)
  {
    dice = theDice;
    int a = dice.getDie1Size();
    int b = dice.getDie2Size();
    outcomes = new int[a + b + 1];
    numberOfRolls = DEFAULT_ROLLS;
  }
  
  public DiceProbability(int numRolls, PairOfDice theDice)
  {
    dice = theDice;
    int a = dice.getDie1Size();
    int b = dice.getDie2Size();
    outcomes = new int[a + b + 1];
    numberOfRolls = numRolls;
  }
  
  public void roll()
  {
    int rollSoFar = 0;
    while(rollSoFar < numberOfRolls)
    {
      outcomes[dice.roll()]++;
      rollSoFar++;
    }
  }
  public void printOutcomes()
  {
    for(int i = 2; i < outcomes.length; i++)
    {
      System.out.println("rolls of " + i + " = " + outcomes[i]);
    }
    System.out.println();
  }
}
