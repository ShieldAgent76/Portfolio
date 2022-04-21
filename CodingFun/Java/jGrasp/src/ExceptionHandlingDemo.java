/*
   TCSS 143 
   Author: Raghavi Sakpal 
   Demo of Exception Handling 
*/
import java.util.*;
import java.io.*;

public class ExceptionHandlingDemo {
   public static void main(String[] args) {
      Scanner ip = new Scanner(System.in);
      
      // Make a Call to Demo methods
      demo1();             // Demo 1: Try & Catch  
      //demo2(ip);           // Demo 2: Try & Multiple Catch 
      //demo3(ip);           // Demo 3: Try, Catch & Finally 
     
      //demo4();             // Demo 4: Checked Exceptions 
      //Demo5 d = new Demo5(0); // Demo 5: Objects & Exception
      //Demo6 d = new Demo6(2);// Demo 6: Extending exception class
   }
   
   // Demo1: Simple Try & Catch 
   public static void demo1()   {
      try { // statements, some of which might throw an exception
         int x = 4/0;
      }
      catch (ArithmeticException exp)  {     // may be omitted if there is a finally block
         // statements to handle SomeExceptionType exceptions
         System.out.println("Cannot divide by 0");
      }
      System.out.println("Done with Demo 1 !");
   }
   
   // Demo2: Try and multiple catch 
   public static void demo2(Scanner ip)   {
      int[] arr = {4,5,6,1};
      int val, index;
      
      try { // statements, some of which might throw an exception
         System.out.println("Enter an integer value:");
         val = ip.nextInt();
         System.out.println("Enter the index where value needs to be placed:");
         index = ip.nextInt();
         arr[index] = val;
         
      }
      catch (InputMismatchException exp)  {     // may be omitted if there is a finally block
         // statements to handle SomeExceptionType exceptions
         System.out.println("You have to enter an integer value");
      }
      catch (ArrayIndexOutOfBoundsException exp)   {
         //statements to handle SomeExceptionType exceptions
         System.out.println("Index is out of bounds. Need to be in range of 0 to " + (arr.length-1));
      }
      catch (Exception exp)   {     // Don't know which excpetion will be thrown
         //statements to handle SomeExceptionType exceptions
         System.out.println("Some exception was thrown !");
      }
      System.out.println(Arrays.toString(arr) + "\nDone with Demo 2 !");
   }
   
   // Demo3: Try, Catch & Finally
   public static void demo3(Scanner ip)   {
      int    num=0, div=0 ;

      try { // statements, some of which might throw an exception
         System.out.print("Enter the numerator: ");
         num = ip.nextInt();
         System.out.print("Enter the divisor  : ");
         div = ip.nextInt();
         System.out.println( num + " / " + div + " is " + (num/div) + " rem " + (num%div) );
      } 
      catch (ArithmeticException ex ) { // may be omitted if there is a finally block
         System.out.println("You can't divide " + num + " by " + div);
         //System.out.println( num + " / " + div + " is " + (num/div) + " rem " + (num%div) );
      } 
      finally  { // There can only be one finally block.
         // statements which will execute no matter how the try block was exited.
         System.out.println("If something went wrong, you entered bad data." );
      }
   }
   
   // Demo4: Checked Exceptions 
   public static void demo4() throws FileNotFoundException{
      Scanner fp = new Scanner(new File("sample.txt"));
      
      // Rest of your logic     
   }
}

// Demo 5: Objects & Exception
class Demo5 {
   int x = 3;
   
   // Constructor 
   public Demo5(int y)  {
      if(y == 0)
         throw new IllegalArgumentException("Parameter cannot be 0");
      this.x = x / y;
   }
}

// Demo 6: Extending exception class 
class Demo6 extends Exception {
   int x = 3;
   
   // Constructor 
   public Demo6(int y)  {
      super();
      this.x = x / y;
   }
}