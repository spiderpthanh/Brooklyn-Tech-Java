import java.util.ArrayList;

public class Names {
  
  private ArrayList<String> names;
  
  public Names()
  {
    names = new ArrayList<String>();
    names.add("yamom");
    names.add("gotcheeks");
    names.add("fordays");
  }
  
 public ArrayList<String> namesWithFirstLetter(String letter)
 {
   if (letter.length() != 1)
     return null;
   ArrayList<String> theNames = new ArrayList<String>();
   
   for (String name : names)
     if names.substring(0, 1).equals(letter)
 }
  
  public String toString()
  {
    return names.toString();
  }
  
}
