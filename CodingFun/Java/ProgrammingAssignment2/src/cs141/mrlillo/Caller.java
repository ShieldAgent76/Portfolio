/**
 * 
 */
package cs141.mrlillo;
import java.util.Scanner;

/**
 * @author marti
 * Name: Martin Lillo
 * Section: CS& 141
 * Program Name: Programming Assignment 2 (Recording employees)
 * 
 * Description: Program gets employee info from user input and prints it out that is readable.
 *
 */
public class Caller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			
			System.out.print("Enter employee first name: ");
			String first = keyboard.next();
			System.out.print("Enter employee last name: ");
			String last = keyboard.next();
			System.out.print("Enter employee gender: ");
			String gender = keyboard.next();
			System.out.print("Enter employee job title: ");
			String job = keyboard.next();
			System.out.print("Enter employee organization (Google or Microsoft): ");
			String org = keyboard.next();
			System.out.print("Enter employee birthday (mm/dd/yyyy): ");
			String birthday = keyboard.next();
				
			Employee employee = new Employee(first, last, gender, job, org, birthday);
			System.out.println("Total Employees: " + Employee.getCountEmployee());
			System.out.println("Microsoft Employees: " + Employee.getCountMicrosoft());
			System.out.println("Google Employees: " + Employee.getCountGoogle());
			System.out.println("***********************************");
		}
	}

}
