/*
   TCSS 143
   Author:  Raghavi Sakpal
   Description: Map & Objects 
*/
import java.util.*;
import java.io.*;

public class MapDemo3 {
   public static void main(String[] args) throws FileNotFoundException {
      // Scanner to read from a CSV file 
      Scanner ip = new Scanner(new File("students.csv"));
      
      // Declare a Map to hold ID and student Info 
      Map<Integer,Student> studentDB = new HashMap<Integer,Student>();
   
      // Loop till the end of the file 
      ip.nextLine();          // Discard the first line 
      for(int i = 0; i < 9; i++) {
         String line = ip.nextLine();
         String[] stData = line.split(",");
         
         // Create an instance of Student object 
         String name = stData[1]+stData[2];
         char gender = stData[5].charAt(0);
         String city = stData[18];
         String state = stData[19];
         int actScore = 0;
         if(!stData[9].equals(""))
            actScore = Integer.parseInt(stData[9]);
         int satScore = 0;
         if(!stData[13].equals(""))
            satScore = Integer.parseInt(stData[13]);
         double gpa = Double.parseDouble(stData[17]);
         String email = stData[21];
         boolean firstGen = Boolean.parseBoolean(stData[25]);
         Student s = new Student(name, gender, city, state, actScore, satScore, gpa, email, firstGen);
         
         // Add ID and student object to Map 
         studentDB.put(Integer.parseInt(stData[0]),s);
      }
      
      // Display the student database   
      System.out.println(studentDB);
     
      // Display students who are first generation
      System.out.println("\n--------STUDENT RECORDS OF FIRST GENERATION STUDENTS-------");
      displayFirstGen(studentDB); 
      
      // Display student record based on ID 
      displayStudentRecord(studentDB); 
      
      // Display students who are amditted to UWT
      System.out.println("\n--------STUDENT WHO ARE ADMITTED-------");
      admitStudent(studentDB);
   }
   
   /*
      Method: To display first generation student 
      Parameter: Map<Integer,Student>
      Return: None
   */
   public static void displayFirstGen(Map<Integer,Student> studentDB)   {
      // Loop throug the map
      for(int id: studentDB.keySet())  {
         // Return value based on key = id 
         Student s = studentDB.get(id);
         // Check if student is first gen 
         if(s.isFirstGen())   {
            System.out.println("Student ID: " + id);
            System.out.println(s);
            System.out.println();
         }
      }
   }
   
   /*
      Method: To display stduent record based on ID  
      Parameter: Map<Integer,Student>
      Return: None
   */
   public static void displayStudentRecord(Map<Integer,Student> studentDB)   {
      Scanner console = new Scanner(System.in);
      
      System.out.println("\nEnter the student ID to search from: ");
      int id = console.nextInt();
      
      if(studentDB.containsKey(id)) {
         System.out.println("Student records for Student ID = " + id + "\n" + studentDB.get(id));
      }
      else 
         System.out.println("Student ID not found in our records !");
   }
   
   /*
      Method: Student Admittance based on act, sat and gpa scores
      Parameter: Map<Integer,Student>
      Return: None
   */
   public static void admitStudent(Map<Integer,Student> studentDB)   {
      // Loop throug the map
      for(int id: studentDB.keySet())  {
         // Return value based on key = id 
         Student s = studentDB.get(id);
         
         // A student is admitted if act score > 0 or sat score > 0 and gpa > 2.5
         if((s.getActScore() > 0 || s.getSatScore() > 0) && s.getHsGpa() > 2.5) {
            System.out.println("Student ID: " + id);
            System.out.println(s);
            System.out.println();
         }
      }
   }
}
   
   
