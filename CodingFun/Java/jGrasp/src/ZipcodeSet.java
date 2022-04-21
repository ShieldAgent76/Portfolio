/*
Martin Lillo
TCSS 143 Fall 2020
ZipcodeSet to practice sets
*/
import java.util.*;
import java.io.*;

public class ZipcodeSet {
   
   public static void main(String[] args) {
      
      // make a hashset for zipcodes in the file      
      Set<Integer> zipcodes = new TreeSet<Integer>();
      
      try {
         
         Scanner fileReader = new Scanner(new File("us-500.csv")); // scan file        
         
         /*
         While the file reads the next line
         Seperate the line into a string
         That string will then be put into an array
         The 7th value of the array should be the zipcode
         Add the zipocode into the Integer hashset
         */
         while (fileReader.hasNext()) {
            
            // uncomment line below to test if file is properly red
            //System.out.println(fileReader.nextLine());                      
            String token = fileReader.nextLine();
            String[] stringArray = token.split(",");
            int zipcode = Integer.parseInt(stringArray[7]); 
            zipcodes.add(zipcode);
            //System.out.println(zipcodes.toString()); // uncomment to test if file is properly red
         }
         
         fileReader.close(); // close the scanner
         userMenu(zipcodes); // open menu 
      }
      catch (FileNotFoundException e) {
         
         System.out.println("Error. File not found."); // print error message if file is not found
         System.exit(0); // exit program
      }
   }   
      
   public static void oddSet(Set<Integer> zipcodes) { // if zipcode is odd, add to odd set
      
      Set<Integer> oddZipcode = new TreeSet<Integer>();
      for (int odd : zipcodes) {
         if (odd % 2 != 0) {
             oddZipcode.add(odd);
         }
      }
      minMax(oddZipcode);  
   }
   
   public static void evenSet(Set<Integer> zipcodes) {// if zipcode is even, add to even set
      
      Set<Integer> evenZipcode = new TreeSet<Integer>();
      for (int even : zipcodes) {
         if (even % 2 == 0) {
             evenZipcode.add(even);
         }
      }
      minMax(evenZipcode);  
   }
   
   public static void userMenu(Set<Integer> zipcodes) {
      
      // Provides a user interface to interact with the program
      Scanner keyboard = new Scanner(System.in);
      System.out.println("What do you want to do?");
      System.out.println("A: Print even min and max zipcode");
      System.out.println("B: Print odd min and max zipcode");
      System.out.println("E: Exit program");
      
      do {
			
			char choice = keyboard.next().charAt(0);
			switch (choice) {
			case 'a':
				evenSet(zipcodes);
            userMenu(zipcodes);
				break;
			case 'b':
				oddSet(zipcodes);
            userMenu(zipcodes);
				break;
         case 'e':
            System.out.println("Thank you very much! Have a wonderful day!");
            System.exit(0);
			default:
				System.out.println("Error: Invaid choice");
				userMenu(zipcodes);
				break;
			}
		} while (true);
   }
   
   public static void minMax(Set<Integer> zipcodes) {
      
      // find and print min and max from zipcode set
      int min = Collections.min(zipcodes);
      int max = Collections.max(zipcodes);
      System.out.println(zipcodes);
      System.out.println("Min: " + min);
      System.out.println("Max: " + max);
   }  
}