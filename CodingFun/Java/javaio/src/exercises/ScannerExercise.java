/*
 * TCSS 305
 * 
 * File IO example
 */

package exercises;

import java.util.Scanner;

/**
 * This demonstrates I/O using Scanner.
 * 
 * @author Martin Lillo
 * @version 1.0
 *
 */
public final class ScannerExercise {

    /**
     * private constructor for utility class as no object is going to be created outside the
     * class.
     * 
     */
    private ScannerExercise() {

    }

    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {

        // Using Scanner for Getting 2 integer inputs from user
        // Add the 2 integers 
        // print the added result to the console
        
        final Scanner userInput = new Scanner(System.in);
        final String entered = "You've entered: ";
        
        System.out.print("Enter an integer: ");
        final int first = userInput.nextInt();
        System.out.println(entered + first);
        System.out.print("Enter another integer: ");
        final int second = userInput.nextInt();
        System.out.println(entered + second);
        final int sum = first + second;
        System.out.println("The sum is: " + sum);

    }

}
