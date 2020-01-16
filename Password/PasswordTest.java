
public class PasswordTest {
  
  
  public static void main(String[] args) 
  { 
    for (int i = 0; i < 1000; i++)
    {
      PasswordGenerator bbb = new PasswordGenerator();
      System.out.println(bbb.generatePassword());
    }
  }
 
  
}
