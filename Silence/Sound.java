import java.util.ArrayList;

public class Sound {

  private int[] samples;
  
  public int limitAmplitude(int limit)
  {
    int numAltered = 0;
    for (int i = 0; i < samples.length; i++)
    {
     if (samples[i] > limit)
     {
       samples[i] = limit;
       numAltered++;
     }
     if (samples[i] < -limit)
     {
       samples[i] = -limit;
       numAltered++;
     }
    }
    return numAltered;
  }
  
  public void trimSilenceFromBeginning()
  {
    int leadingZeroes = 0;
    int i = 0;
    while (samples[i] == 0)
    {
      leadingZeroes++;
      i++;
    }
    int[] temp = new int[samples.length - leadingZeroes];
    for (i = 0; i < temp.length; i++)
    {
      temp[i] = samples[i + leadingZeroes];
    }
    samples = temp;
  }
  
  public void trimSilenceFromEnd()
  {
    int endingZeroes = 0;
    int i = samples.length;
    while (samples[i] == 0)
    {
      endingZeroes++;
      i--;
    }
    int[] temp = new int[samples.length - endingZeroes];
    for (i = 0; i < temp.length; i++)
    {
      temp[i] = samples[i];
    }
    samples = temp;
  }
  
  public String toString()
  {
    String output = "";
    for (int i = 0; i < samples.length; i++)
    {
      output += ", ";
    }
    return output;
  }
  
  public int getCountOfConsecutiveDuplicates()
  {
   int count = 0; 
   for (int i = 1; i < samples.length; i++)
   {
     if (samples[i] == samples[i - 1])
           count++;
   }
   return count;
  }
  
  public int getHighestValue()
  {
    int highest = samples[0];
    
    for (int num : samples)
    {
      if (num > highest)
      {
        highest = num;
      }
    }
    return highest;
  }  
  
  public int getLowestValue()
  {
    int lowest = samples[0];
    
    for (int num : samples)
    {
      if (Math.abs(num) < Math.abs(lowest))
      {
        lowest = num;
      }
    }
    return lowest;
  }
  
  public int getHighestAmplitude()
  {
    int highest = samples[0];
    for (int i = 0; i < samples.length; i++)
    {
      if (Math.abs(samples[i]) > Math.abs(highest))
      {
        highest = samples[i];
      }   
    }
    return highest;
  }
  
  public int countNumberOfMatches(int value)
  {
    int count = 0;
    for (int num : samples)
    {
      if (num == value)
      {
        count++;
      }
    }
    return count;
  }
  
  public int getPositionOfSmallestValue()
  {
    int position = 0;
    for (int i = 0; i < samples.length; i++)
    {
      if (samples[i] == getLowestValue())
      {
        position = i;
      }
    }
     return position;
  }
  
  public int[] getPositionOfSmallestValues()
  {
    int smallest = getLowestValue();
    int count;
    int posIndex = 0;
    count = countNumberOfMatches(smallest);
    int[] positions = new int[count];
    
    for (int i = 0; i < samples.length; i++)
    {
      if (samples[i] == smallest)
      {
        positions[posIndex] = i;
        posIndex++;
      }
    }
    return positions;
  }
  
  public boolean contains(int value)
  {
    for (int num : samples)
    {
      if (value == num)
      {
        return true;
      }
    }
    return false;
  }
  
  public ArrayList<Integer> getPositionsOfSmallestValues2()
  {
    int smallest = getLowestValue();
    ArrayList<Integer> indexList = new ArrayList<Integer>();
    
    for (int i = 0; i < samples.length; i++)
      indexList.add(i);
    
    return indexList;
  }
}
