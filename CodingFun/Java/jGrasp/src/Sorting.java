/*
TCSS 143
Author: Martin Lillo
Lab 8 Sorting.java
*/
import java.util.*;

public class Sorting {
   
   public static void main(String[] args) {
      int listSize = 30; // define list size
      int magnitude = 500;
      Random rand = new Random(12345);
      
      // Declare an array list based on the list size
      ArrayList<Integer> numbers = new ArrayList<Integer>(listSize);
      
      // Loop and fill the list with random values based on magnitude
      for (int i = 0; i < listSize; i++) {
         numbers.add(rand.nextInt() % magnitude);
      }
      
      //Method call to sort numbers based on natural ordering
      Collections.sort(numbers);
      
      // Print Sorted numbers
      for (Integer num : numbers) {
         System.out.print(num + " ");
      }
      System.out.println();
      
      
      // method to sort numbers backwards
      Collections.sort(numbers, new BackwardOrdering());
      
      // for loop to print numbers in reverse
      for (Integer numReverse : numbers) {
         System.out.print(numReverse + " ");
      }
      System.out.println();
      
      // method to sort numbers alternately
      Collections.sort(numbers, new AlternatingOrdering());
      
      // for loop to print alternating numbers
      for (Integer numAlt : numbers) {
         System.out.print(numAlt + " ");
      }
   }
}

class BackwardOrdering implements Comparator<Integer> {
   
   public int compare(Integer int1, Integer int2) {
      return int2.compareTo(int1); // method to check if int2 is greater or less than int1
   }
}

class AlternatingOrdering implements Comparator<Integer> {

   public int compare(Integer int1, Integer int2) {
      
      if (int1 < 0 || int2 < 0) {
         return int1.compareTo(int2); // if int 1 or 2 are less than 0, print normally
      }
      else {
         return int2.compareTo(int1); // else print in reverse
      }
   }
}