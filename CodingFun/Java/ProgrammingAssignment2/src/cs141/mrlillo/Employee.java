/**
 * 
 */
package cs141.mrlillo;

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
	
	private static int countEmployee;
	private static int countGoogle;
	private static int countMicrosoft;
	
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
		
		
		System.out.println("***********************************");
		System.out.println("ID: " + id);
		System.out.println("Name: " + first + " " + last);
		System.out.println("Gender: " + gender);
		System.out.println("Job Title: " + job);
		System.out.println("Organization " + org);
		System.out.println("Birthdate: " + birthday);
		System.out.println("------------------------------------");
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

	
	//to update employee info and print employee numbers, use getter and setters

}
