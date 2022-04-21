/*
Martin Lillo
TCSS 143
Employee Inheritance Lab 4
*/
public abstract class Employee { // basic info of employee
   
   // instance fields
   private String name; // name of employee
   private int id; // id number
   private int averageNumOfCode; // average number of lines of code
   
   // constructor
   public Employee(String name, int averageNumOfCode) {
      
      // constructor fields
      this.name = name;
      this.averageNumOfCode = averageNumOfCode;
   }
   
   // abstract method
   public abstract int work();
   
   // getter methods 
   public String getName() {
      return this.name;
   }
   
   public int getId() {
      return id = (int)((Math.random() * 23) + 1);
   }
   
   public int getAverageNumOfCode() {
      return this.averageNumOfCode;
   } 
   
   // toString method
   public String toString() {
      
      return "Name: " + getName() + "\nID: " + getId() + "\nAverage Number Of Lines Of Code: " + getAverageNumOfCode();
   }
}   