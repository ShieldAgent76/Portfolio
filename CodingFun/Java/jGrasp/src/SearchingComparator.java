/*
   TCSS 143
   Author: Raghavi Sakpal
   Description: Searching Demo using Comparator
*/

import java.util.*;

public class SearchingComparator  {
   public static void main(String[] args) {
      // Declare Array to store Strings 
      String[] strArr = {"Foxtrot", "alpha", "echo", "golf", "bravo", "hotel", "Charlie", "DELTA"}; 
      
      // Declare a list 
      List<String> strList = new ArrayList<String>();
      
      // Loop through the array and add it to list 
      for(String word: strArr)   {
         strList.add(word);
      }
      
      // ----------- Searching using Comparator -------------- //
      
      // Step 1: Sort the Array in Descending Order & Display the Sorted Array
      Arrays.sort(strArr, new DescendingComparator());
      System.out.println("\nArray sorted in descending order: \n" + Arrays.toString(strArr));
            
      // Step 2: Perform Binary Search on a Sorted Array 
      System.out.println("Element alpha found at index: " + Arrays.binarySearch(strArr,"alpha",new DescendingComparator()));
      System.out.println("Element delta found at index: " + Arrays.binarySearch(strArr,"delta",new DescendingComparator()));
      
      
      // Step 1: Sort the List in Descending Order & Display the Sorted List
      Collections.sort(strList, new DescendingComparator());
      System.out.println("\nList sorted in descending order: \n" + strList);
            
      // Step 2: Perform Binary Search on a Sorted List 
      System.out.println("Element Alpha found at index: " + Collections.binarySearch(strList,"Alpha",new DescendingComparator()));
      System.out.println("Element DELTA found at index: " + Collections.binarySearch(strList,"DELTA",new DescendingComparator()));

   }
}

class DescendingComparator implements Comparator<String> {
   public int compare(String s1, String s2)  {
      return s2.compareTo(s1);
   }
   
}
