public class Test 
{
  
  
 public static void main(String[] args) 
  { 
   DiceProbability prob1 = new DiceProbability();
   prob1.roll();
   prob1.printOutcomes();
   
   DiceProbability prob2 = new DiceProbability();
   prob2.roll();
   prob2.printOutcomes();
   
   DiceProbability prob3 = new DiceProbability(1000);
   prob3.roll();
   prob3.printOutcomes();
   
   // Die die1 = new Die();
   // System.out.println(die1.roll());
    //PairOfDice dice = new PairOfDice();
    //System.out.println(dice.roll());
  }

}
