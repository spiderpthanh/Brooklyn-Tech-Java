public class BatteryTest{
 
 public static void main(String[] args)
 {
   int[] table = {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 80, 60};
   BatteryCharger bc1 = new BatteryCharger(table);
   for(int start = 0; start < 24; start++)
   {
     System.out.println("Start at " + start + " " + bc1.getChargingCost(start, 3));
   }
 }
 
 
 
 
}