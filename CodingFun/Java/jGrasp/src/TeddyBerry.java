/*
Martin Lillo
TCSS 143 Lab 7 Recursion
TeddyBear file to run teddy bear game
*/
import java.util.*;

public class TeddyBerry {

    public static void main(String[] args) { // main method is how the bears game is played
      
      Scanner keyboard = new Scanner(System.in);
      
      
      System.out.println("Welcome to the H2ODelirious's Teddy Bear Game!");
      System.out.println();
      System.out.println("Get exactly 42 bears by dividing numbers."); 
      System.out.println();
      System.out.print("Enter number of bears: ");
      int bears = keyboard.nextInt();
      System.out.print("Divided by (Choose between 2 - 5): ");
      int divisible = keyboard.nextInt();
         if (divisible > 5 || divisible < 2) {
            throw new IllegalArgumentException("Error. Invalid number.");
         }
      bears(bears, divisible);
   }

   // method to check if bears is divisible by 2 to 5 and calculates it
   public static void bears(int bears, int divisible) {
      
      Scanner keyboard = new Scanner(System.in);
               
      if (bears == 42) { // winning number, base case
         System.out.println("Congratulations! We have a winner.");
         System.out.println();
         System.out.println("Thanks for playing.");
         System.exit(0);
      }
      else if (bears <= 0) { // throws exception if bears is less than 0
         throw new IllegalArgumentException("Bears cannot be below 0.");
      }
      else if (bears < 42) { // final case if number cannot reach 42
         System.out.println("Too bad...");
         System.out.println("Your number did not reach 42.");
         System.out.println();
         System.out.println("Thanks for playing.");
         System.exit(0);
      }
      else if (bears%divisible == 0 && divisible == 2) { //  check if n is even and return half of bears
         System.out.println("Bears returned: " + (bears/2));
         bears(bears/2, divisible);
      }
      else if (bears%divisible == 0 && (divisible == 3 || divisible == 4)) { // check if n is divisible by 3 or 4 and return last two digits of bears multiplied
          System.out.println("Bears returned: " + ((bears%10) * ((bears%100)/10)));
          bears((bears%10) * ((bears%100)/10), divisible);
      }
      else if (bears%divisible == 0 && divisible == 5) { // check if n is divisible by 5 and return bears - 42
          System.out.println("Bears returned: " + (bears - 42));
          bears((bears - 42), divisible);
      }
      else if (bears > 42) { // this if-else statement will not run if divisible is still possible in the above statements
         System.out.print("Divided by (Choose between 2 - 5): ");
         divisible = keyboard.nextInt();
            if (divisible > 5 || divisible < 2) {
               throw new IllegalArgumentException("Error. Invalid number.");
            }
         bears(bears, divisible); 
      }
   }    
}
         
         