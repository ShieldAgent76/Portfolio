import java.util.Scanner;

/**
 * Write a description of class Counter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Counter
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
        int align;
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
       
    public static int align(String DNA, String DNA2)
    {
        System.out.println(DNA);
        System.out.println(DNA2);
        int counter = 0;
        for (int i = 0; i < DNA.length(); i++)
        {
            char letter = DNA.charAt(i);
            char letter2 = DNA2.charAt(i);
            if (DNA.charAt(i) == DNA2.charAt(i))
            {
                if (letter == letter2)
                {
                    return counter = counter + 1;
                }
                
                else
                {
                    return counter;
                }
            }
        }
        System.out.println(counter);
        return counter;
    }
}
