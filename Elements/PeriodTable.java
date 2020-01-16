public class PeriodTable {
 
  private Element[] table;
 
  public PeriodicTable(int numOfElements) {
    table = new Element[numOfElements];
    /* YOUR CONSTRUCTOR CODE HERE*/
  }
  public void setElement(int i , Element e)
  {
    table[i] = e;
  }
 
  public Element getElement(String symbol)
  {
    for (Element e : table)
    if(e.getSymbol().equals(symbol))
      return e;
    return null;
  }
  public String toString()
  {
    String output = "";
    for (Element e : table)
      output += e.toString() + "\n";
    return output;
  }
   
 
  public static void main(String[] args) {
   
  }
 
}