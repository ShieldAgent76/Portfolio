/**
 * 
 */
package cs141.mrlillo;
import java.util.Scanner;

/**
 * @author marti
 *
 */
public class Worksheet9 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String word1 = keyboard.next();
		System.out.println("Enter Another String: ");
		String word2 = keyboard.next();
		System.out.println(word1 + " " + word2);
		
		if (word2.equalsIgnoreCase(word1))
		{
			System.out.println("Oh wow. Your two strings are equal.");
		}
		
		System.out.println("Uppercasing strings...");
		String upper1 = word1.toUpperCase();
		System.out.println(upper1);
		String upper2 = word2.toUpperCase();
		System.out.println(upper2);
		
		System.out.println("Replacing all d with e...");
		System.out.println(word1.replace('d', 'e'));
		System.out.println(word2.replace('d', 'e'));
		
		String end = "ing";
		if (word1.toLowerCase().contains(end.toLowerCase()) || word2.toLowerCase().contains(end.toLowerCase()))
		{
			System.out.println("One or more of your words contained ing. ");
		}
	}

}
