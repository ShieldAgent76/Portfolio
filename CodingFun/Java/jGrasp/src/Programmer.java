/*
Martin Lillo
TCSS 143
Employee Inheritance Lab 4
*/
public class Programmer extends Employee {
   
   //constructor
   public Programmer(String name, int averageNumOfCode) {
      super(name, averageNumOfCode);
   }
   
   public int work() {
      
      int min = 50;
      int max = 150;
      // return percentage of average lines of code
      return (int)((Math.random() * (max - min)) + min);
   }
   
   public String toString() {
      
      return "Programmer: " + super.toString();
   }
} 