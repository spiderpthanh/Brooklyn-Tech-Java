public class PasswordGenerator
{
    private char[] characters;
    public PasswordGenerator()
    {
        characters = new char[69];
        for (char ch ='A'; ch <= 'Z'; ch++)
            characters[ch - 'A'] = ch;
        int index = 26;
        for (char ch = 'a'; ch <= 'z'; ch++)
        {
            characters[index] = ch;
            index++;
        }
        for (char ch = '0'; ch <= '9'; ch++)
        {
            characters[index] = ch;
            index++;
        }
        characters[index] = '_';
        index++;
        characters[index] = '-';
        index++;
        characters[index] = '$';
        index++;
        characters[index] = '%';
        index++;
        characters[index] = '#';
        index++;
        characters[index] = '@';
        index++;
        characters[index] = '*';
        index++;
    }
    public char getRandomAlpha()
    {
        return (char)characters[randomInRange(0, 51)];
    }
    public char getRandomAlphaNumeric()
    {
        return (char)characters[randomInRange(0, 61)];
    }
    public char getRandomNumeric()
    {
        return (char)characters[randomInRange(52, 61)];
    }
    public char getRandomSpecialCharacter()
    {
        return (char)characters[randomInRange(62, characters.length - 1)];
    }
    public char getRandomCharacter()
    {
        return (char)characters[randomInRange(0, characters.length - 1)];
    }
    public boolean isUpperCase(char ch)
    {
        return ch >= 'A' && ch <= 'Z';
    }

    public boolean containsUpperCase(String str)
    {
        for (int i = 0; i < str.length(); i++)
        if (isUpperCase(str.charAt(i)))
        {
           return true;
        }

        return false;
    }
    public boolean isLowerCase(char ch)
    {
        return ch >= 'a' && ch <= 'z';
    }
    public boolean containsLowerCase(String str)
    {
        for (int i = 0; i < str.length(); i++)
            if (isLowerCase(str.charAt(i)))
        {
                return true;
        }

        return false;
    }
    public boolean isDigit(char ch)
    {
        return ch >= '0' && ch <= '0';
    }
    public boolean containsDigit(String str)
    {
        for (int i = 0; i < str.length(); i++)
            if (isDigit(str.charAt(i)))
        {
                return true;
        }

        return false;
    }
    public boolean isValid(String pass)
    {
        if (!isUpperCase(pass.charAt(0)) && !isLowerCase(pass.charAt(0)))
        {
            return false;
        }
        if (!containsUpperCase(pass) || !containsLowerCase(pass) || !containsDigit(pass))
        {
            return false;
        }  
        return true;
    }
    public int randomInRange(int high, int low)
    {
        if (low > high)
        {
            int temp = low;
            low = high;
            high = temp;
        }
        return (int)((Math.random() * (high - low + 1)) + low);
    }
    public String generatePassword()
    {
        boolean valid = false;
        String password = "";
        while (valid == false)
        {
            password = "";
            int passwordLength = randomInRange(8, 12);
            password += getRandomAlpha();
            for (int i = 1; i < passwordLength; i++)
            {
                password += getRandomAlphaNumeric();
            }
   
            int position = randomInRange(1, passwordLength - 2);
   
            password = password.substring(0, position) + getRandomSpecialCharacter() +
                       password.substring(position + 1);
           
            valid = isValid(password);
        }  
        return password;
    }
}