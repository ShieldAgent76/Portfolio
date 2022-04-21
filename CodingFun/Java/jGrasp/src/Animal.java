/*
TCSS 143
Martin Lillo
10-27-2020
Animal file for Lab 5 
*/
public class Animal {
	
	private String name;
	private int topSpeed;	
   //TO DO: Add a constructor that takes in a String for the name and an int for the topSpeed
	//       use only the set methods, initialize the instance variables
   
   // constructor
   public Animal(String name, int topSpeed) {
      
      this.name = name;
      this.topSpeed = topSpeed;
   }
	
	//TO DO: Add get and set methods for the instance variables.
   //       For the set method associated with topSpeed make sure the values are between 0 and 70
   //       Throw an exception if it is not within these values.
   
   // getter and setter methods
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public int getTopSpeed() {
      return topSpeed;
   }
   
   public void setTopSpeed(int topSpeed) {
   
      if(topSpeed > 70 || topSpeed < 0) {
         throw new IllegalArgumentException("Error. Top speed cannot be be below 0 or above 70");
      }
       
      this.topSpeed = topSpeed;
   }
	
	//TO DO: Add an equals(Object other) method that returns True if the two Animal objects have 
	//       top speeds that are within 2 mph of each other
   
   public boolean equals(Object other) {
      
      Animal otherAnimal = (Animal)other;
      boolean within = false;
      
      if (topSpeed - otherAnimal.topSpeed <= 2 && topSpeed - otherAnimal.topSpeed >= -2) {
         return true;
      }
      else if (otherAnimal.topSpeed - topSpeed <= 2 && otherAnimal.topSpeed - topSpeed >= -2) {
         return true;
      }     
      return within;
      
   }  
	
	//TO DO: Add a toString() method. Formatting of the returned String should follow this example:
	//       Name: elephant     
   //       Top Speed: 25
   
   public String toString() {   
      return "Name: " + getName() + "\nTop Speed: " + getTopSpeed();
   }
	
}
