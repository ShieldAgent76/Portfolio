package cs141.eelradie;

import java.util.Random;
import java.util.Scanner;

public class StudentInformation {
	private String firstName = "";
	private String lastName = "";
	private int id = 0;
	private int grade1 = 0; 
	private int grade2 = 0; 
	private int grade3 = 0; 
	private double gpa = 0;
	Scanner scanner = null;
	public static int stdCount = 0;
	
	public StudentInformation(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.setId(id);
		
		Random random = new Random();
		this.setGrade1(random.nextInt(100));
		this.setGrade2(random.nextInt(100));
		this.setGrade3(random.nextInt(100));
		stdCount++;
	}
	public StudentInformation(String firstName, String lastName, int id, int grade1, int grade2, int grade3) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.setId(id);
		this.setGrade1(grade1);
		this.setGrade2(grade2);
		this.setGrade3(grade3);
		stdCount++;
		}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		while(id<0) {
			System.out.println("Error: Invalid ID. Try again.");
			System.out.println("Enter a new ID: ");
			scanner = new Scanner(System.in);
			id = scanner.nextInt();
		}
		this.id = id;
	}
	public int getGrade1() {
		return grade1;
	}
	public void setGrade1(int grade1) {
		if(grade1 < 0) {
			this.grade1 = 0;
		}else if (grade1 > 100) {
			this.grade1 = 100;
		}else {
			this.grade1 = grade1;			
		}

	}
	public int getGrade2() {
		return grade2;
	}
	public void setGrade2(int grade2) {
		if(grade2 < 0) {
			this.grade2 = 0;
		}else if (grade2 > 100) {
			this.grade2 = 100;
		}else {
			this.grade2 = grade2;			
		}
	}
	public int getGrade3() {
		return grade3;
	}
	public void setGrade3(int grade3) {
		if(grade3 < 0) {
			this.grade3 = 0;
		}else if (grade3 > 100) {
			this.grade3 = 100;
		}else {
			this.grade3 = grade3;			
		}
	}
	public double getGPA() {
		CalculateGPA();
		return gpa;
	}
	public void CalculateGPA() {
		 
		this.gpa = (this.grade1 + this.grade2 + this.grade3) / 3.0;
	}
	
	public static int getStdCount() {
		return stdCount;
	}
	public void print() {
		System.out.println("Student name: " + this.firstName + " " + this.lastName);
		System.out.println("Student ID: " + this.id);
		System.out.println("Student grades: "+ this.grade1 + ", " + this.grade2 + ", " + this.grade3 );
		System.out.format("Student GPA: %.2f%n", this.getGPA());
	}
	

	
	
}
