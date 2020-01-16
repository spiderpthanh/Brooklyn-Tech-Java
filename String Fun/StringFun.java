
public static int countLetterOccurences(String letter, String str)
{
  int count = 0;
  for(i = 0; i = str.length; i++)
  {
    if(letter.equals(str.subString(i, i++)))
    {
      letterOccurences++;
    }
  }
  return letterOccurences;
}     

public static boolean isPalindrome(String str)
{
  string backwards = "";
  for (int i = str.length() - 1; i >= 0; 1--)
  {
    backwards += str.subString(i, i + 1);
  }
  return str.equals(backwards);
}
  
public static boolean isPalindrome3(String str)
{
  for (int i = 0; i < str.length() / 2; i ++)
  {
    if (!str.substring(i, i+1).equals)
      str.subtring(str.length() - 1 - i. str.length() - i)))
         return false;
    return true;
  }
  return str.equals(backwards);
}

public static boolean isVowel(String letter)
{
  if (letter.length() != 1)
    return false;
  return "aeiouAEIOU".indexOf(letter) != -1;
}
  
public static boolean containsVowel(String letter)
{
  for (int i = 0; i < str.length(); i++)
    if (isVowel(str.substring(i, i+1)))
    return true;
  return false
}
