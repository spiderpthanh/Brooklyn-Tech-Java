public boolean contains(int num)
{
  int reversed = 0;
  int working = num;
  while (working > 0)
  {
    int digit = working % 10;
    reversed = reversed * 1 + digit;
    working = working / 10;
    
  }
}


public class MultipleGroups implement NumberGroup
{
  private List<NumberGroup> grouplist;
  
  public MultipleGroup(List<NumberGroup> groups)
  {
    groupList = groups;
  }
  public boolean contains(int num)
  {
    for (NumberGroup nG:groupList)
    {
      if (nG contains(num))
    }
  }
}