
/**
 * Martin Lillo
 */
public class Lab4d 
{
  public static void main(String[] args) 
  {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for(int character = 0; character <= 25; character++) 
    {
      System.out.print(alphabet.charAt(character));
    }
    
    System.out.println();
    for(int character = 25; character >= 0; character--) 
    {
      System.out.print(alphabet.charAt(character));
    }
    
    System.out.println();
    for(int character = 0; character <= 12; character++) 
    {
      System.out.print(alphabet.charAt(character));
    }
    
    System.out.println();
    for(int character = 25; character >= 13; character--) 
    {
      System.out.print(alphabet.charAt(character));
    }
  }
  
  public static boolean palindrome(String input)
  {
      String alphabet = "ABCBA";
      input.length();
      for (int i = 0 ; i < (input.length() / 2) ; i++)
      {
          int backIndex = (input.length() - 1) - i;
          if(input.charAt(i) != input.charAt(backIndex))
          {
              return false;
          }
      }
      return true;
  }
} 
 

