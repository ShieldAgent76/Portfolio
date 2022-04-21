/**
 * 
 */
package cs141.mrlillo;
import java.util.Scanner;

/**
 * @author marti
 * Martin Lillo
 * Section CS 141
 * Birthday Wizard
 * 
 * Calculate what year will they be in based on their birth year and their entered age. 
 */
public class BirthdayWizard 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Type in your first name");
		String name = keyboard.next();
		System.out.println("Hello " + name);
		System.out.println("Welcome to the birthday wizard!");
		System.out.println("Let's get some information in first.");
		
		System.out.println("What year were you born in?");
		int year = keyboard.nextInt();
		System.out.println("Choose an age");
		int age = keyboard.nextInt();
		int yearAdd = year + age;
		System.out.println("You will turn " + age + " in the year " + yearAdd);
	}

}
