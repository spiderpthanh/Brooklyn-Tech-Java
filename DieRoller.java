/**
 * Auto Generated Java Class.
 */
public class DieRoller {
  
  
  public static void main(String[] args) { 
    
    /*int[] theRolls = new int[40];*/
    int[] frequency = new int[7];
    int numberOfRolls = 1000;
    int rollsSoFar = 0;
    double percentage = 0;
    while (rollsSoFar < numberOfRolls) {
      frequency [roll()]++;
      rollsSoFar++;
    }
    for (int i = 1; i < frequency.length; i++) {
      percentage = (frequency[i] / (double)numberOfRolls * 100.0); 
      System.out.println("Frequency[" + i + "]=" + frequency[i] + " " + percentage + "%");
    }
    /*for (int i = 0; i < theRolls.length; i++) {
     theRolls[i] = roll(); */
    System.out.println(frequency);
    }
    
    /*for (int i = 1; i < theRolls.length; i++) {
      System.out.println("roll[" + i + "] = " + theRolls[i]);
    }
    
  }*/
  
  public static int roll() {
   
    int random = (int)(Math.random() * 6 + 1);
    return random;
    
  }
}
  
