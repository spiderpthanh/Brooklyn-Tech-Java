import java.util.Scanner;

public class GuessingGame {
  
  
  public static void main(String[] args) 
  { 
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the Guessing Game!" + "\n");
    System.out.println("1. Beginner Level (numbers between 1 and 10)");
    System.out.println("2. Intermediate Level (numbers between 1 and 100)");
    System.out.println("3. Advanced Level (numbers between 1 and 1000)");
    System.out.println("4. Expert Level (numbers between 1 and 10000)" + "\n");
    System.out.println("Type the number corresponding to the level you want to  play:");
    int level = input.nextInt();
     if (level >= 1 && level <= 4)
     {
       System.out.print("You have chosen level " + level);
     }
  }
  
  
  
}