/**
 * 
 */
package cs141.mrlillo;
import java.util.Scanner;

/**
 * @author marti
 * Martin Lillo
 * Section CS 141
 * Grade Calculator
 * 
 * Calculate grade average for a sample course with a score and letter grade
 */
public class GradeAverage 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter five grades (0-100)");
		int grade1 = keyboard.nextInt();
		int grade2 = keyboard.nextInt();
		int grade3 = keyboard.nextInt();
		int grade4 = keyboard.nextInt();
		int grade5 = keyboard.nextInt();
		float average = (float)((grade1 + grade2 + grade3 + grade4 + grade5) / 5);
		System.out.println("Your average is " + average);
		
		if (average <= 100 && average >= 90)
			System.out.println("Your letter grade is A");
		else if (average <= 89 && average >= 80)
			System.out.println("Your letter grade is B");
		else if (average <= 79 && average >= 70)
			System.out.println("Your letter grade is C");
		else if (average <= 69 && average >= 60)
			System.out.println("Your letter grade is D");
		else 
			System.out.println("Your letter grade is F");
	}

}
