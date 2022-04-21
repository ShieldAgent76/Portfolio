/*
 * TCSS 305
 * 
 * Class for exception example
 */

package exceptions;

import java.awt.Point;

/**
 * This demonstrates the use of exceptions.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public final class PointMain { // utility class are final because they cannot be extended.

    /**
     * private constructor for utility class as no object is going to be created outside the
     * class.
     * 
     */
    private PointMain() {

    }

    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {

        try {
            final Point[] pointList = new Point[10];
            
            System.out.println(pointList[10]);

        } catch (final ArrayIndexOutOfBoundsException | NullPointerException e) {
            //System.out.println(e);
            //System.out.println(e.getMessage());
             e.printStackTrace();
        } catch (final IllegalArgumentException e) {
            System.out.println(e);
        } finally {

            System.out.println("Finally block executed");
            // always executed after try block exits whether or not catch block is executed
            // put clean up code here
            // for unexpected exceptions and accidentally use a return or clean up statement
        }

    }

}
