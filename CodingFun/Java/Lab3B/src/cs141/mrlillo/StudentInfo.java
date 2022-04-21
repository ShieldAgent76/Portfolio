/**
 * 
 */
package cs141.mrlillo;

/**
 * @author marti
 *
 */
public class StudentInfo {
	
	private int grade1 = (int)((Math.random() * ((100 - 0) + 1)) + 0);
	private int grade2 = (int)((Math.random() * ((100 - 0) + 1)) + 0);
	private int grade3 = (int)((Math.random() * ((100 - 0) + 1)) + 0);
	private double average = ((grade1 + grade2 + grade3)/3);
			
	public StudentInfo(String first, String last, int id) {		 
		System.out.println("Student name: " + first + " " + last);
		System.out.println("Student ID: " + id);
		System.out.println("Student Grades: " + grade1 + " " + grade2 + " " + grade3);
		this.average = average;
		System.out.println("GPA Average: " + average);
		System.out.println("Number of students in system: 1");
	}
}
