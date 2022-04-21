/*
Martin Lillo
TCSS 143
Employee Inheritance Lab 4
*/
public class Project {
   
   // basic fields for project class
   int linesOfCode;
   int duration;
   int daysWorkedSoFar;
   Employee[] employees;
   
   // constructor
   public Project(int linesOfCode, int duration, int maxEmployees) {
      
      this.linesOfCode = linesOfCode;
      this.duration = duration;
      this.employees = new Employee[maxEmployees];
   }
   
   // method to add employees
   public void addEmployee(Employee employee) {
      
      for (int i = 0; i < employees.length; i++) { // check to see if the employees array contains nothing
      
         if (employees[i] == null) { 
            
            employees[i] = employee;
            break;
         }
      }
   }
   
   // do project emthod
   public int doProject() {
      
      daysWorkedSoFar++; // increment days
      int linesWritten = 0;
      int linesTested = 0;
      for (int i = 0; i < employees.length; i++) {
         
         if (employees[i] instanceof Programmer) {
            
            linesWritten += employees[i].getAverageNumOfCode(); // get employer average code written
         }
         
         if (employees[i] instanceof Tester) {
            
            linesWritten += employees[i].getAverageNumOfCode(); // get employer code written
         }   
      }
      return 0; // return nothing since it is 0 and requires an int value
   }
   
   public String toString() { // print string
   
      String report =  "Duration: " + duration + "\nDays Required: " + daysWorkedSoFar + "\n";
      
      for (int i = 0; i < employees.length; i++) {
         
         report += employees[i].toString();
         report += "\n";
      }
      return report;
   }
   
   public static void main(String[] args) { // driver/client method
      
      Project game = new Project(105, 35, 3);

      Employee programmer1 = new Programmer("Thomas", 15);
      game.addEmployee(programmer1);
      Employee programmer2 = new Programmer("Steve", 30);
      game.addEmployee(programmer2);
      
      Employee testSubject1 = new Tester("Jimmy", 45);
      game.addEmployee(testSubject1);
      
      System.out.print(game.toString());
     
   }  
}