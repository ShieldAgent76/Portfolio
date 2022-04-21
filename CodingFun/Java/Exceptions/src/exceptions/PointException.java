/*
 * TCSS 305
 * 
 * Class for user exception example
 */

package exceptions;

/**
 * This demonstrates user-defined exceptions.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public class PointException extends Exception {
    /**
     * x co-ordinate.
     */
    private final double myX;

    /**
     * y co-ordinate.
     */
    private final double myY;

    /**
     * 
     * paramterized constructor.
     * 
     * @param theX x-coordinate.
     * @param theY y-coordinate.
     */

    public PointException(final double theX, final double theY) {
        this.myX = theX;
        this.myY = theY;
    }

    @Override
    public String toString() {
        final String message = "PointExceeded Exception" + myX + myY;
        return message;
    }

}
