import java.util.Scanner;

/**
 * Martin Lillo
 */
public class HW_Loops
{
    public static void main(String[] args) // main method to execute the master plan
    {
        boolean valid = false;
        int maxLength = 10;
        while (!valid)
        {
            System.out.println("Please type a DNA type up to 10 characters: ");
            Scanner keyboard = new Scanner(System.in);
            String DNA = keyboard.next();
            valid = checkValid(DNA, maxLength);
            System.out.println("Please type another DNA type up to 8 characters: ");
            String DNA2 = keyboard.next();
            valid = checkValid(DNA2, maxLength);
        } 
    }
    
    public static boolean checkValid(String DNA, int maxLength) // checking string length method
    {
        if (maxLength >= DNA.length())
        {
            boolean valid = false;
            for (int i = 0; i < DNA.length(); i++)
            {
                char letter = DNA.charAt(i);
                if (letter == 'A' || letter == 'T' || letter == 'C' || letter == 'G')
                {
                    valid = true;
                }
                
                else
                {
                    System.out.println("Error. The letters are not valid.");
                    valid = false;
                    return valid;
                }
            }
            return valid;
        }
        
        else
        {
            System.out.println("Error, The String is too long.");
            return false;
        }
    }
    
    public static int countC(String DNA) // counting C method
    {
        int counter = 0;
        for (int i = 0; i < DNA.length(); i++)
        {
            char letter = DNA.charAt(i);
            if (letter == 'C')
            {
                counter++; 
            }
        }
        System.out.println("C count: " + counter);
        return counter;
    }
   
    public static int countG(String DNA) // counting G method
    {
        int counter = 0;
        for (int i = 0; i < DNA.length(); i++)
        {
            char letter = DNA.charAt(i);
            if (letter == 'G')
            {
                counter++; 
            }
        }
        return counter;
    }
    
    public static int countT(String DNA) // counting G method
    {
        int counter = 0;
        for (int i = 0; i < DNA.length(); i++)
        {
            char letter = DNA.charAt(i);
            if (letter == 'T')
            {
                counter++; 
            }
        }
        return counter;
    }
    
    public static int countA(String DNA) // counting G method
    {
        int counter = 0;
        for (int i = 0; i < DNA.length(); i++)
        {
            char letter = DNA.charAt(i);
            if (letter == 'A')
            {
                counter++; 
            }
        }
        return counter;
    }
    
    public static int ratioTest(String DNA) // calculate ratio method
    {
        int countC = countC(DNA);
        int countG = countG(DNA);
        int length = DNA.length();
        
        return (countC + countG) / length;
    }
    
    public static String compliment(String DNA) // compliment method
    {
        String compliment = DNA;
        for (int i = 0; i < DNA.length(); i++)
        {
            char letter = DNA.charAt(i); 
            if (letter == 'A')
            {
                compliment += 'T';
            }
            
            else if (letter == 'T')
            {
                compliment += 'A';
            }
            
            else if (letter == 'C')
            {
                compliment += 'G';
            }
            
            else if (letter == 'G')
            {
                compliment += 'C';
            }
        }
        return compliment;
    }
    
    public static int alignment(String DNA, String DNA2) // alignment method
    {
        int countLetterA1 = countA(DNA);
        int countLetterA2 = countA(DNA2);
        
        int countLetterT1 = countT(DNA);
        int countLetterT2 = countT(DNA2);
        
        int countLetterC1 = countC(DNA);
        int countLetterC2 = countC(DNA2);
        
        int countLetterG1 = countG(DNA);
        int countLetterG2 = countG(DNA2);
        
        if (countA(DNA) == countA(DNA2))
        {
            int countA = countA(DNA);
        }
        
        if (countT(DNA) == countT(DNA2))
        {
            int countT = countT(DNA);
        }
        
        if (countC(DNA) == countC(DNA2))
        {
            int countC = countC(DNA);
        }
        
        if (countG(DNA) == countG(DNA2))
        {
            int countG = countG(DNA);
        }
        
        return Math.max(countA(DNA), countT(DNA), countC(DNA), countG(DNA));
    }
}
