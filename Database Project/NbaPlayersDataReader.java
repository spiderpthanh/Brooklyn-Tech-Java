import java.io.File;
import java.util.Scanner;
public class NbaPlayersDataReader 
{
  
  
  public static void main(String[] args) throws Exception { 
    String fileName = "NBADataReader.csv";
    File inputFile = new File(fileName);
    if(!inputFile.exists())
      System.out.println(fileName + " does not exist ");
    else
    {
      Scanner input = new Scanner(inputFile);
      int lineCount = 0;
      while(input.hasNextLine())
      {
        input.nextLine();
        lineCount++;
      }
      NbaPlayers nba = new NbaPlayers(line count);
      input.close();
      input = new Scanner(inputFile);
      
      String firstName;
      String lastName;
      int jerseyNumber;
      String teamLocation;
      String position;
      int salary
      boolean injured;
      
    }
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
