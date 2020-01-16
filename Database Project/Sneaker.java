
public class Sneaker 
{
 // instance variables
  private String name;
  private int price;
  private String designer;
  private String company;
  private int yearReleased;
  private String primaryMaterial;
  private String sport;
  private boolean hiTop;
  
 //constuctor
  public Sneaker(String name, int price, String designer, String company, int yearRel, String primMat, String sport, boolean hiTop)
  {
   this.name = name;
   price = retailPrice;
   this.designer = designer;
   yearReleased = yearRel;
   primaryMaterial = primMat;
   this.sport = sport;
   this.hiTop = hiTop;
  }
  
 //accessors
  public String getName()   { return name; }
  public int getPrice() { return price; }
  public String getDesigner()  { return designer; }
  public String getCompany() { return company; }
  public int getYearReleased() { return yearReleased; }
  public String getPrimaryMaterial()  { return primaryMaterial; }
  public String getSport()  { return sport; }
  public boolean hiTop()  { return hiTop; }
 }
/* public String toString()
 {
  
 }
*/
}
