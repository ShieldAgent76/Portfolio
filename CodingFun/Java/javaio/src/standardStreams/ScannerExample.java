/*
 * TCSS 305
 * 
 * File IO example
 */

package standardStreams;


import java.util.Scanner;

/**
 * This demonstrates I/O using Scanner.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public final class ScannerExample {

    /**
     * private constructor for utility class as no object is going to be created outside the
     * class.
     * 
     */
    private ScannerExample() {

    }

    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {

        // Using Scanner for Getting Input from User
        final Scanner in = new Scanner(System.in);

        System.out.println("Enter a line:");
        final String line = in.nextLine();
        System.out.println("You entered string " + line);
        
        System.out.println("Enter a Integer:");
        final int intValue = in.nextInt();
        System.out.println("You entered integer " + intValue);
  
        System.out.println("Enter a Float:");
       final float floatValue = in.nextFloat();
        System.out.println("You entered float " + floatValue);
        
        

    }

}
