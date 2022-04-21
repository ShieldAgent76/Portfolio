/*
   TCSS 143
   Author: Raghavi Sakpal
   Description: Sorting Demo
*/

import java.util.*;

public class SortingDemo   {
   public static void main(String[] args) {
      // Declare Array to store Strings 
      String[] strArr = {"Foxtrot", "alpha", "echo", "golf", "bravo", "hotel", "Charlie", "DELTA"}; 
      
      // Declare a list 
      List<String> strList = new ArrayList<String>();
      
      // Loop through the array and add it to list 
      for(String word: strArr)   {
         strList.add(word);
      }
      // ------------------- Sorting using Natural Order ---------------//
      // Display the Original Array
      System.out.println("Origianl Array:" + Arrays.toString(strArr));
      // Sort the Array in Natural Order & Display the Sorted Array
      Arrays.sort(strArr);
      System.out.println("Array sorted in natural order: \n" + Arrays.toString(strArr));
      
      // Display the Original List
      System.out.println("\nOriginal List:" + strList);
      // Sort the List in Natural Order & Display the Sorted List
      Collections.sort(strList);
      System.out.println("List sorted in natural order: \n" + strList);
      
      // ------------------- Sorting using Comparator ---------------//
      // Sort the Array in Descending Order & Display the Sorted Array
      Arrays.sort(strArr, new DescendingComparator());
      System.out.println("\nArray sorted in descending order: \n" + Arrays.toString(strArr));
      
      // Sort the Array in Descending Order ignoring case & Display the Sorted Array
      Arrays.sort(strArr, new DescendingComparatorIgnoreCase());
      System.out.println("\nArray sorted in descending order Ignoring Case: \n" + Arrays.toString(strArr));
      
      // Sort the List in Descending Order & Display the Sorted List
      Collections.sort(strList, new DescendingComparator());
      System.out.println("\nList sorted in descending order: \n" + strList);

      // Sort the List in Descending Order ignoring case & Display the Sorted List
      Collections.sort(strList, new DescendingComparatorIgnoreCase());
      System.out.println("\nList sorted in descending order Ignoring Case: \n" + strList);

   }
   
}

class DescendingComparator implements Comparator<String> {
   public int compare(String s1, String s2)  {
      return s2.compareTo(s1);
   }
   
}

class DescendingComparatorIgnoreCase implements Comparator<String> {
   public int compare(String s1, String s2)  {
      return s2.compareToIgnoreCase(s1);
   }
   
}