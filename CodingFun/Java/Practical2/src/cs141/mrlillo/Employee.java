/**
 * 
 */
package cs141.mrlillo;

/**
 * @author marti
 *
 */
public class Employee {
	
	private String name = "";
	private int numberOfHoursPerDay = 0;
	private int salary = 0;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumberOfHoursPerDay() {
		return numberOfHoursPerDay;
	}
	
	public void setNumberOfHoursPerDay(int numberOfHoursPerDay) {
		this.numberOfHoursPerDay = numberOfHoursPerDay;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee(String name) {
		this.name = name;
	}
}
