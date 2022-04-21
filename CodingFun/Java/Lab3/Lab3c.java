import java.util.Scanner;

/**
 * Write a description of class Lab3c here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab3c
{
    public static void main(String[] args) 
    {
    Scanner myInput = new Scanner(System.in);
    System.out.println("Enter a digit: ");
    int input = myInput.nextInt();

    if(input % 2 == 0) 
    {
      System.out.println("Even");
    }

    else if(input % 2 != 0) 
    {
      System.out.println("Odd");
    }
  }
}
