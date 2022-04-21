/*
   TCSS 143 
   Author:  Raghavi Sakpal
   Description: Student Object 
*/

public class Student {
   // Instance fields
   private String name;             // Variable to store First and last name
   private char gender;             // Variable to store Gender 
   private String city;             // Variable to store city 
   private String state;            // Variable to store state 
   private int act_composite;       // Variable to store act score (combined score of Math, English & Reading)
   private int sat_combined;        // Variable to store sat score (combined Math, Verbal & Reading)
   private double hs_gpa;           // Variable to store high school GPA
   private String email;            // Variable to store email address
   private boolean firstGen;        // Variable to store if a student is first generation or not 
   
   // Constructor 
   public Student(String name, char gender, String city, String state, int act, int sat, double hs, String email, boolean firstGen) {
      this.name = name;
      this.gender = gender;
      this.city = city;
      this.state = state;
      this.act_composite = act;
      this.sat_combined = sat;
      this.hs_gpa = hs;
      this.email = email;
      this.firstGen = firstGen;
   }
   
   // get() methods 
   public int getActScore() {
      return this.act_composite;
   }
   
   public int getSatScore() {
      return this.sat_combined;
   }
   
   public double getHsGpa() {
      return hs_gpa;
   }
   
   public boolean isFirstGen()  {
      return this.firstGen;
   }
   
   // @verride to store toString() method 
   public String toString()   {
      return "Name: " + this.name + "\nGender: " + this.gender + "\nEmail: " + this.email + "\nCity: " + this.city
              + "\nState: " + this.state + "\nACT Score: " + this.act_composite + "\nSAT Score: " + this.sat_combined 
              + "\nHS GPA: " + this.hs_gpa + "\nFirst Gen:" + this.firstGen;
   }
}