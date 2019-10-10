import java.util.Scanner;

public class GuessingGame {
  
    public static int randNum;
    
  public static void main(String[] args) 
  {   
    menu();
    guessing();
  }
  
  public static void menu()
  {
    
    Scanner inputLevel = new Scanner(System.in);
    System.out.println("Welcome to the Guessing Game!" + "\n");
    System.out.println("1. Beginner Level (numbers between 1 and 10)");
    System.out.println("2. Intermediate Level (numbers between 1 and 100)");
    System.out.println("3. Advanced Level (numbers between 1 and 1000)");
    System.out.println("4. Expert Level (numbers between 1 and 10000)" + "\n");
    System.out.println("Type the number corresponding to the level you want to  play:");
    int level = inputLevel.nextInt();
     if (level == 1)
     { 
       System.out.println("You have chosen level 1.");
       System.out.println("Guess a number between 1 and 10.");
       int randNum = (int)(Math.random() * Math.pow(10, level)) + 1;
     } else if (level == 2)
     {
       System.out.println("You have chosen level 2.");
       System.out.println("Guess a number between 1 and 100.");
     } else if (level == 3)
     {
       System.out.println("You have chosen level 3.");
       System.out.println("Guess a number between 1 and 1000.");
     } else if (level == 4)
     {
       System.out.println("You have chosen level 4.");
       System.out.println("Guess a number between 1 and 10000.");
     } else 
     {
       System.out.println("ERROR: Choose a number between 1-4, it's not that hard...");
     }
  }  
 
  public static void guessing()
  {
    Scanner inputGuess = new Scanner(System.in);
    int guess = inputGuess.nextInt();
    while (gues)
  }
  
}
