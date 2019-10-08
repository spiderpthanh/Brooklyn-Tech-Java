import java.util.Scanner;

public class ScannerPractice {
  
  
  public static void main(String[] args) 
  { 
    //java.util.Scanner input = new java.util.Scanner(System.in);
    Scanner input = new Scanner(System.in);
      
      System.out.print("What's your name?");
      String name = input.nextLine();
      System.out.println("Hi " + name + ".");
      
      System.out.print("How old are you?");
      int age = input.nextInt();
      System.out.print("On your next birthday, you will be " + (age + 1) + ".");
  }
  
  /* ADD YOUR CODE HERE */
  
}
