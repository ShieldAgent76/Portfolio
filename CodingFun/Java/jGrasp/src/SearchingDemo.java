/*
   TCSS 143
   Author: Raghavi Sakpal
   Description: Searching Demo
*/

import java.util.*;

public class SearchingDemo   {
   public static void main(String[] args) {
      // Declare Array to store Strings 
      String[] strArr = {"Foxtrot", "alpha", "echo", "golf", "bravo", "hotel", "Charlie", "DELTA"}; 
      
      // Declare a list 
      List<String> strList = new ArrayList<String>();
      
      // Loop through the array and add it to list 
      for(String word: strArr)   {
         strList.add(word);
      }
      
      // Step 1: Sort the Array in Natural Order & Display the Sorted Array
      Arrays.sort(strArr);
      System.out.println("Sorted Array: \n" + Arrays.toString(strArr));
      
      // Step 2: Perform Binary Search on a Sorted Array 
      System.out.println("Element alpha found at index: " + Arrays.binarySearch(strArr,"alpha"));
      System.out.println("Element delta found at index: " + Arrays.binarySearch(strArr,"delta"));
      
      
      // Step 1: Sort the List in Natural Order & Display the Sorted List
      Collections.sort(strList);
      System.out.println("\nSorted List: \n" + strList);
      
      // Step 2: Perform Binary Search on a Sorted List 
      System.out.println("Element Alpha found at index: " + Collections.binarySearch(strList,"Alpha"));
      System.out.println("Element DELTA found at index: " + Collections.binarySearch(strList,"DELTA"));

   }
}