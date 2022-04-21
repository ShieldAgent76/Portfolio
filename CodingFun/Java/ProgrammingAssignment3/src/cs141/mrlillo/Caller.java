/**
 * 
 */
package cs141.mrlillo;
import java.util.Scanner;

/**
 * @author marti
 * Name: Martin Lillo
 * Section: CS& 141
 * Program Name: Programming Assignment 3 (Recording employees 2.0)
 * 
 * Description: Upgraded version of Programming Assignment 2
 *
 */
public class Caller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		char choice;
		Employee employee = new Employee();
		
		menu();
		
		do {
			
			choice = keyboard.next().toLowerCase().charAt(0);
			switch (choice) {
			case 'a':
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
				employee = new Employee(first, last, gender, job, org, birthday);
				employee.addEmployee(employee);
				menu();
				break;
			case 'r':
				System.out.print("Enter employee first name: ");
				first = keyboard.next();
				employee.removeEmployee(employee);
				menu();
				break;
			case 'c':
				System.out.println("To change employee info, remove the old one and add the new one.");
				menu();
				break;
			case 'n':
				System.out.println("Total Employees: " + Employee.getCountEmployee());
				System.out.println("Microsoft Employees: " + Employee.getCountMicrosoft());
				System.out.println("Google Employees: " + Employee.getCountGoogle());
				menu();
				break;
			case 'p':
				employee.printEmployee(employee);
				menu();
				break;
			case 'e':
				System.out.println("Thank you. Come again!");
				System.exit(0);
				break;
			default:
				System.out.println("Error: Invaid choice");
				menu();
				break;
			}
		} while (true);
	}
	
	public static void menu() {
		System.out.println("***********************");
		System.out.println("What do you want to do?");
		System.out.println("a: Add an employee");
		System.out.println("r: Remove an employee");
		System.out.println("c: Change an employee's info");
		System.out.println("n: Check number of employees");
		System.out.println("p: Check last added employee");
		System.out.println("e: Exit program");
	}
}
