/*
Martin Lillo
TCSS 143
HandleExceptionDemo Class
*/
import java.util.*;

public class HandleExceptionDemo {

   public static void main(String[] args) {
      
      Scanner scanner =  new Scanner(System.in);
      boolean continueInput = true;
      
      do {
         try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            
            // Display result
            System.out.println("The number entered is: " + number);
            
            continueInput = false;
         }
         catch (InputMismatchException ex) {
            System.out.println("Try Again. (Incorrect input: an integer is required)");
            scanner.nextLine();
         }
      } while (continueInput);
   }
} 
          