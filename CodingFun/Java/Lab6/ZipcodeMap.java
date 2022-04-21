/*
Martin Lillo
TCSS 143 Fall 2020
ZipcodeMap to practice maps
*/
import java.util.*;
import java.io.*;

public class ZipcodeMap {

   public static void main(String[] args) {
      
      Map<String, String[]> phone = new TreeMap<String, String[]>();
      Map<String, String[]> state = new TreeMap<String, String[]>();
      
      try {
         
         Scanner fileReader = new Scanner(new File("us-500.csv")); // scan file        
         
         /*
         While the file reads the next line
         Seperate the line into a string
         That string will then be put into an array
         Phone number should be in index 8
         Get phone number and put it into map
         */
         while (fileReader.hasNext()) {
            
            // uncomment line below to test if file is properly red
            //System.out.println(fileReader.nextLine());                      
            String token = fileReader.nextLine();
            String[] stringArray = token.split(",");
            phone.put(stringArray[8], stringArray);
            state.put(stringArray[6], stringArray);
         }
         
         fileReader.close(); // close the scanner
         
         searchKey(phone);
         dulplicateValues(state);
      }
      catch (FileNotFoundException e) {
         
         System.out.println("Error. File not found."); // print error message if file is not found
         System.exit(0); // exit program
      }

   }
   
   public static void searchKey(Map<String, String[]> phone) {
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter phone number: ");
      String key = keyboard.next();
      String[] phoneArray = phone.get(key); // whenever phone number is inputed, it will look in the map to find the values associated with it 
      
      String first = phoneArray[0];
      String last = phoneArray[1];
      String company = phoneArray[2];
      String address = phoneArray[3];
      String city = phoneArray[4];
      String county = phoneArray[5];
      String state = phoneArray[6];
      String zipcode = phoneArray[7];
      String phoneNumber = phoneArray[8];
      String email = phoneArray[9];
      
      for (int i = 0; i < phoneArray.length; i++) {
         System.out.println(phoneArray[i]); // print info
      }                
   }

   public static void dulplicateValues(Map<String, String[]> state) {
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter state: ");
      String key = keyboard.next();
      String[] stateArray = state.get(key);
      
      String first = stateArray[0];
      String last = stateArray[1];
      System.out.println(state.get(key)[0]);   
   }
   
}   