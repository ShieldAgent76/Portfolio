/**
 * 
 */
package cs141.mrlillo;
import java.util.ArrayList;

/**
 * @author marti
 *
 */
public class Employee {
	
	private int id = 0;
	private String first = "";
	private String last = "";
	private String gender = "";
	private String job = "";
	private String org = "";
	private String birthday = "";
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	
	private static int countEmployee = 0;
	private static int countGoogle = 0;
	private static int countMicrosoft = 0;
	
	// for id
	public int max = 10000;
	public int min = 1;
	public int range = (max - min) + 1;
	
	Employee (String first, String last, String gender, String job, String org, String birthday) {
		this.first = first;
		this.last = last;
		this.setGender(gender);
		this.setJob(job);
		this.org = org;
		this.birthday = birthday;
		
		setId((int) (Math.random() * range) - min);
		this.id = id;
		
		countEmployee++;
		
		if (this.org.equalsIgnoreCase("Google")) {
			
			setCountGoogle(getCountGoogle() + 1);
		}
		else {
			
			setCountMicrosoft(getCountMicrosoft() + 1);
		}
	}

	public Employee() {
		//the method does nothing, used for initialization
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setOrg(String org) {
		this.org = org;
	}
	
	public String getOrg() {
		return org;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public static int getCountGoogle() {
		return countGoogle;
	}

	public static void setCountGoogle(int countGoogle) {
		Employee.countGoogle = countGoogle;
	}

	public static int getCountMicrosoft() {
		return countMicrosoft;
	}

	public static void setCountMicrosoft(int countMicrosoft) {
		Employee.countMicrosoft = countMicrosoft;
	}

	public static int getCountEmployee() {
		return countEmployee;
	}

	public static void setCountEmployee(int countEmployee) {
		Employee.countEmployee = countEmployee;
	}
	
	public void addEmployee(Employee employee) {

		employees.add(employee);
		System.out.println("Employee added.");
	}
	
	public void removeEmployee(Employee employee) {
		
		boolean remove = true;
		for (int i = 0; i < employees.size(); i++) {
			
			employee = employees.get(i);
			if (first.equalsIgnoreCase(employee.getFirst())) {
				
				employees.remove(i);
				countEmployee--;
				
				if (this.org.equalsIgnoreCase("Google")) {
					
					setCountGoogle(getCountGoogle() - 1);
				}
				else {
					
					setCountMicrosoft(getCountMicrosoft() - 1);
				}
				remove = false;
				System.out.println("Employee Removed");

			} 
			else {
				System.out.println("Error: Employee not found.");
			}
		}
	}
	
	public void printEmployee(Employee employee) {
		
		for (int i = 0; i < employees.size(); i++) {
				
			System.out.println("ID: " + employees.get(i).getId());
			System.out.println("Name: " + employees.get(i).getFirst() + " " + employees.get(i).getLast());
			System.out.println("Gender: " + employees.get(i).getGender());
			System.out.println("Job Title: " + employees.get(i).getJob());
			System.out.println("Organization: " + employees.get(i).getOrg());
			System.out.println("Birthdate: " + employees.get(i).getBirthday());
		}
	}
}
