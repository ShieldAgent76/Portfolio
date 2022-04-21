/**
 * 
 */
package cs141.mrlillo;
import java.util.Scanner;

/**
 * @author marti
 *
 */
public class Lab3B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter student first name");
		String first = keyboard.next();
		System.out.println("Enter student last name");
		String last = keyboard.next();
		System.out.println("Enter student ID");
		int id = keyboard.nextInt();
		if (id < 0) {
			System.out.println("Error. ID unknown number.");
			System.exit(id);
		}
		
		StudentInfo student = new StudentInfo(first, last, id);
	}

}
