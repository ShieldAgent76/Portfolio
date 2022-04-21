/*
   TCSS 143 
   Author: Raghavi Sakpal
   Demo on Recursion 
*/
import java.util.*;
public class RecursionDemo1 {
   public static void main(String[] args) {
      // Test 1: Print sum of n numbers 
      System.out.println("Summation of 5 = " + sum(5));
      System.out.println("Summation of 8 = " + sum(8));
      
      // Test 2: Print binary representation of numbers 
      printBinary(12);
      System.out.println();
      printBinary(7);
      System.out.println();
      printBinary(-12);
      System.out.println();
      
      // Test 3: Check if string is palindrome
      System.out.println("abba: " + isPalindrome("abba"));
      System.out.println("byebye: " + isPalindrome("byebye"));
      System.out.println("step on no pets: " + isPalindrome("step on no pets"));
      
      // Test 4: Check if a charcater array is a palindrome 
      char[] a1 = {'a'};
      char[] a2 = {'a','b','a'};
      char[] a3 = {'a','b','a','b'};
      System.out.println(Arrays.toString(a1) + ":" + isPalindromeArr(a1)); 
      System.out.println(Arrays.toString(a2) + ":" + isPalindromeArr(a2)); 
      System.out.println(Arrays.toString(a3) + ":" + isPalindromeArr(a3)); 

   }
   
   /*
      Method: Recursive method for summation of n
      Example: if n = 5, we want to return 1 + 2 + 3 + 4 + 5 
      Parameter: int n (n>=0)
      Return: int
   */
   public static int sum(int n) {  // n = 0 return 0, n = 1 return 1
      if(n == 0 || n == 1)       // Base Case
         return n;
      else {                     // Recursive Case: n = 2 -> 1 + 2 
          return sum(n-1) + n;         // n = 3: sum(n-1) // 3 + 3 = 6       
                                       // n = 2: sum(n-1) // 1 + 2 = 3
      }
    }                                   // n = 1: return 1
   
   /*
      Method: A recursive method that accepts an integer and prints that number's representation in binary (base 2).
      Example: printBinary(7)  prints 111
      Example: printBinary(12) prints 1100
      Example: printBinary(42) prints 101010
      Parameter: int n (n can be postive or negative)
      Return: void
   */
   public static void printBinary(int n)  {
      // if n = 2:
      // 2/2 = 1, 2%2 = 0
      // 1/2 = 0, 1%2 = 1
      if(n < 0)   {
         System.out.print("-");
         printBinary(n * -1);
      }
      else if(n == 0 || n == 1)          // Base Case 
         System.out.print(n);
      else {                        // Recursive Case 
         printBinary(n/2);          // n = 3: printBinary(3/2) print 3%2
         System.out.print(n % 2);   // n = 1: print 1
      }
       
   }
   
   /*
      Method: A recursive method that accepts a String and returns true if it reads the same forwards as backwards.
      Example: 
               isPalindrome("madam")	         true
               isPalindrome("step on no pets")	true
               isPalindrome("Java")	            false
      Parameter: String 
      Return: boolean
   */
   public static boolean isPalindrome(String str)  {
      // str = a return true
      if(str.length() <= 1)      // Base Case 
         return true;
      else  {                    // Recursive Case 
         // str = aba
         if(str.charAt(0) != str.charAt(str.length()-1)) // a == a
            return false;
         return isPalindrome(str.substring(1,str.length()-1));
      }
   }
   
   /* Solution 1: Use of Public-Private Pair 
      Method: A recursive method that accepts a char array and returns if it is a palindrome or not 
      Example:
               {a}         true
               {a,b,a}     true
               {a,b,a,b}   true
      Parameter: char[] arr
      Return: boolean 
   
   public static boolean isPalindromeArr(char[] arr)  {
      // Check the length of the Array 
      if(arr.length == 1)  
         return true;
      else 
         return isPalindromeArr(arr,0,arr.length-1);
   }
   
   private static boolean isPalindromeArr(char[] arr, int low, int high)   {
      if(low < high) {  // Base & Recursive Case 
         if(arr[low] != arr[high])
            return false;
         return isPalindromeArr(arr,low+1,high-1);
      }
      return true;
   }*/
   
   /* Solution 2
      Method: A recursive method that accepts a char array and returns if it is a palindrome or not 
      Example:
               {a}         true
               {a,b,a}     true
               {a,b,a,b}   true
      Parameter: char[] arr
      Return: boolean 
   */
   public static boolean isPalindromeArr(char[] arr)  {
      // Base Case 
      if(arr.length <= 1)  {
         return true;
      }
      else {         // Recursive Case 
         if(arr[0] != arr[arr.length-1])
            return false;
         char[] newArr = Arrays.copyOfRange(arr,1,arr.length-1);
         return isPalindromeArr(newArr); 
      }
   }


  
}