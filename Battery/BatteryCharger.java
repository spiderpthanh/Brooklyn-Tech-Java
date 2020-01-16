public class BatteryCharger
{
/** rateTable has 24 entries representing the charging costs for hours 0 through 23. */
  public int[] rateTable;
  public BatteryCharger(int[] table)
  {
   rateTable = table;
  }

  /** Determines the total cost to charge the battery starting at the beginning of startHour.
 * @param startHour the hour at which the charge period begins
 * Precondition: 0 &#8804; startHour &#8804; 23
 * @param chargeTime the number of hours the battery needs to be charged
 * Precondition: chargeTime &#62; 0
 * @return the total cost to charge the battery
 */
 public int getChargingCost(int startHour, int chargeTime)
  {
   int total = 0;
   int currentHour = startHour;
   for (int i = 0; i < chargeTime; i++)
   {  
   total += rateTable[currentHour % 24];
   currentHour++;
  }
   return total;
  }
   /** Determines start time to charge the battery at the lowest cost for the given charge time.
 * @param chargeTime the number of hours the battery needs to be charged
 * Precondition: chargeTime &#62; 0
 * @return an optimal start time, with 0 &#8804; returned value &#8804; 23
 */
  public int getChargeStartTime(int chargeTime)
  {
   int minCost = getChargingCost(0, chargeTime);
   for (int i = 1; i < rateTable.length ; i++)
   {
     if(getChargingCost(i, chargeTime) < minCost)
     minCost = getChargingCost(i, chargeTime);
    }
   return minCost;                                                      
  }

   // There may be instance variables, constructors, and methods that are not shown  
}