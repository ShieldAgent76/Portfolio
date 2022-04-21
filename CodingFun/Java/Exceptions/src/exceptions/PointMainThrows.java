/*
 * TCSS 305
 * 
 * Class for throws example
 */

package exceptions;

import java.awt.Point;
import java.util.Objects;

/**
 * This demonstrates the use of exceptions and throws.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public class PointMainThrows {
    /**
     * Point object.
     * 
     */
    private Point myPoint;

    /**
     * copy constructor for utility class.
     * 
     * @param theOtherObject copy contents of other object
     * 
     */
    public PointMainThrows(final PointMainThrows theOtherObject) {
        // implicitly throw an exception
        this.myPoint = Objects.requireNonNull(theOtherObject).myPoint;
    }

    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {

        try {
             //explicitly throw an exception
            // throw new NullPointerException();

            //final PointMainThrows pt = new PointMainThrows(null);

             throw new PointException(2,3);

        } catch (final ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Calling class" + e);
            // System.out.println(e.getMessage());
            // e.printStackTrace();
        } catch (final IllegalArgumentException e) {
            System.out.println(e);
        } 
           catch (final PointException e) {
            System.out.println(e);
        } 
        
        finally {

            System.out.println("Finally block executed");
            // always executed after try block exits whether or not catch block is executed
            // put clean up code here
            // for unexpected exceptions and accidentally use a return or clean up statement
        }

    }

}
