/**
 * 
 */
package cs141.mrlillo;
import java.util.Scanner;

/**
 * @author marti
 *  Ask the user for 10 positive integers or if they want to quit early, they can enter a negative number.
 *  Return to the user the number of the positive integers, their total, and their average as a decimal number (floating point).
 */
public class Worksheet7 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter 10 integers");
		System.out.println("If you want to give up which I won't blame you, enter a negative.");
		int sum = 0;
		for (int i = 0; i < 10; i++)
		{
			int userInput = keyboard.nextInt();
			System.out.println(userInput);
			sum += userInput;
			
			if (userInput < 0)
			{
				System.out.println("Total: " + sum);
				float average = (float)sum / (i + 1);
				System.out.println("Average: " + average);
			}
		}
		
		System.out.println("Total: " + sum);
		float average = (float)sum / 10;
		System.out.println("Average: " + average);
	}

}
