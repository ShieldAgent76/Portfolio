/*
Martin Lillo
TCSS 143
Employee Inheritance Lab 4
*/
public class Tester extends Employee {
   
   //constructor
   public Tester(String name, int averageNumOfCode) {
      super(name, averageNumOfCode);
   }
   
   public int work() {
      
      int min = 75;
      int max = 125;
      // return percentage of average lines of code
      return (int)((Math.random() * (max - min)) + min);
   }
   
   public String toString() {
      
      return "Tester: " + super.toString();
   }
} 