/**
 * 
 */
package cs141.mrlillo;
import java.util.Scanner;

/**
 * @author marti
 *
 */
public class Caller {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int salary = 0;
		int numberOfHoursPerDay = 0;
		String name = "";
		
		System.out.print("Enter salary: ");
		salary = keyboard.nextInt();
		System.out.print("Enter hours worked: ");
		numberOfHoursPerDay = keyboard.nextInt();
		Employee employee = new Employee("John Krasinski");
		addSal(salary);
		addWork(salary, numberOfHoursPerDay);
		getInfo(numberOfHoursPerDay, salary);
	}
	
	
	//trying to get the salary as a parameter but it is not adding up, same thing with the hours worked
	public static void addSal(int salary) {
		
		if (salary < 500) {
			
			salary += 10;
		}
	}
	
	public static void addWork(int salary, int numberOfHoursPerDay) {
		
		if (numberOfHoursPerDay > 6) {
			
			salary += 5;
		}
	}
	
	public static void getInfo(int numberOfHoursPerDay, int salary) {
		
		System.out.println("Hours worked: " + numberOfHoursPerDay);
		System.out.println("Salary: " + salary);
	}
}
