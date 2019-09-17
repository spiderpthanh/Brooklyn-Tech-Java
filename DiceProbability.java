public class DiceProbability 
{
    private int[] outcomes;
    private PairOfDice ourDice;
    private int numberOfRolls;
    public static final int DEFAULT_ROLLS = 50;
  public DiceProbability()
  { 
    numberOfRolls = DEFAULT_ROLLS;
    outcomes = new int[13];
    ourDice = new PairOfDice();
    //roll();
    //printOutcomes();
    
  }
  public DiceProbability(int numRolls)
  { 
    numberOfRolls = numRolls;
    outcomes = new int[13];
    ourDice = new PairOfDice();
    //roll();
    //printOutcomes();
    
  }
  public void roll()
  {
    int rollSoFar = 0;
    while(rollSoFar < numberOfRolls)
    {
      outcomes[ourDice.roll()]++;
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
