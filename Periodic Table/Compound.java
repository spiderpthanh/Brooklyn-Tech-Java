//import java.util.List;
import java.util.ArrayList;

public class Compound
{
  private ArrayList<Component> components;
  private PeriodicTable pt;
 
 
  public Compound(ArrayList<Component> components,PeriodicTable pt )
  {
    this.components = components;
    this.pt=pt;
  }
  public double getMolecularWeight()
  {
    double weight = 0.0;
    for (Component part:components)
    {
      String symbol = part.getSymbol();
     int freq = part.getFrequency();
     Element element = pt.getElement(symbol);
     double eWeight = element.getAtomicWeight();
     double cWeight = eWeight * freq;
     weight += cWeight;
    }
    return weight;
  }
}
  