public class PeriodicTable {
  private Element[] table;
  
  public PeriodicTable(int numberOfElements) { 
    table = new Element[numberOfElements];
  }
  public void setElement(int i, Element e){
    table[i] = e;
  }
  //gets element
  public Element getElement(String symbol){
    for(Element e : table)
      if(e.getSymbol().equals(symbol))
      return e;
    return null;
  }
  
  public void sortName()
  {
    for(int j = 0; j < table.length - 1; j++)
    {
      int smallPosition = j;
      for(int k = j; k < table.length; k++)
        if (table[smallPosition].getName().compareTo(table[k].getName()) > 0 )
        smallPosition = k;
      Element temp = table[j];
      table[j] = table[smallPosition];
      table[smallPosition] = temp;
    }
  }
  public void sortSymbol()
  {
    for(int j = 0; j < table.length - 1; j++)
    {
      int smallPosition = j;
      for(int k = j; k < table.length; k++)
        if (table[smallPosition].getSymbol().compareTo(table[k].getSymbol()) > 0 )
        smallPosition = k;
      Element temp = table[j];
      table[j] = table[smallPosition];
      table[smallPosition] = temp;
    }
  }
  public void sortAtomNum()
  {
    for(int j = 0; j < table.length - 1; j++)
    {
      int smallPosition = j;
      for(int k = j; k < table.length; k++)
        if (table[smallPosition].getAtomicNumber() > table[k].getAtomicNumber())
        smallPosition = k;
      Element temp = table[j];
      table[j] = table[smallPosition];
      table[smallPosition] = temp;
    }
  }
  public void sortAtomWeight()
  {
    for(int j = 0; j < table.length - 1; j++)
    {
      int smallPosition = j;
      for(int k = j; k < table.length; k++)
        if (table[smallPosition].getAtomicWeight() > table[k].getAtomicWeight())
        smallPosition = k;
      Element temp = table[j];
      table[j] = table[smallPosition];
      table[smallPosition] = temp;
    }
  }
  
  
  
  public String toString()
  {
    String output = "";
    for (Element e : table)
      output += e.toString() + "\n";
    
    return output;
  }
}
