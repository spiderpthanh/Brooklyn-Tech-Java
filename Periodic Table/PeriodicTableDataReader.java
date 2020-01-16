import java.io.File;
import java.util.Scanner;


public class PeriodicTableDataReader {
  
  
  public static void main(String[] args) throws Exception { 
    String fileName = "Elements.csv";
    File inputFile = new File(fileName);
    if(!inputFile.exists())
      System.out.println(fileName+ " does not exist ");
    else{
      
      Scanner input = new Scanner(inputFile);
      int lineCount =0;
      while(input.hasNextLine())
      {
        input.nextLine();
        lineCount++;
      }
      PeriodicTable pt = new PeriodicTable(lineCount);
      
      input.close();
      input = new Scanner(inputFile);
      
      String currentLine;
      String[] elementData;
      String name;
      String family;
      Element e;
      int atomicNum;
      double weight;
      String symbol;
      boolean metal;
      int mostStableState;
      lineCount =0;
      
      while(input.hasNextLine())
      {
        currentLine = input.nextLine();
        elementData = currentLine.split(",");
        name= elementData[0];
        atomicNum = Integer.parseInt(elementData[1]);
        symbol=elementData[2];
        weight = Double.parseDouble(elementData[3]);
        if(elementData[4].equals(""))
          mostStableState = -999;
        else
          mostStableState=Integer.parseInt(elementData[4]);
        family = elementData[5];
        if(elementData[6].equals("M"))
          metal = true;
        else
          metal = false;
        
        e = new Element(name,atomicNum,symbol,weight,mostStableState,family,metal);
        
        pt.setElement(lineCount ,e);
        lineCount++;
        
      }
      input.close();
      System.out.println(pt);
      
      
      
    }
  }
  
  
  
}
