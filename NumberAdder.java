/**
 * Auto Generated Java Class.
 */
public class NumberAdder {
  
  public static void main(String[] args) {  
    double x = 6;
    double y = 9;
    int[] values = {3, 9, 5, 7};
    System.out.println(getTotal(x, y));
    System.out.println(getTotal(values));
  }
  
  public static int getTotal(int num1, int num2) {
    return num1 + num2;
  }
  
  public static double getTotal(double num1, double num2) {
    return num1 + num2;
  }
  
  public static int getTotal(int[] values) {
  
   int total = 0;
   for (int i = 0; i < values.length; i++)
     total = total + values[i];
   return total;
  }
  
  public static double getTotal(double[] values) {
  
   double total = 0;
   for (int i = 0; i < values.length; i++)
     total = total + values[i];
   return total;
  }
  
  
}