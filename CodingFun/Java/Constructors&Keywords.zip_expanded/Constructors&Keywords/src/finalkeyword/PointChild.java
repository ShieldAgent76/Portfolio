/*
 * This is a point class to demonstrate the use of final
 */

package finalkeyword;

/**
 * 
 * This class represents a point child class with x and y co-ordinates.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public class PointChild extends Point { /* A final class cannot be extended */

    public PointChild(final int theX, final int theY) {
        super(theX, theY);
    }

    @Override
    public void translate(final int theDx,
                          final int theDy) { /* A final method cannot be overridden in subclasses */
        myX += 2 * theDx;
        myY += 2 * theDy;
    }

    public static void main(final String[] theArgs) {
        final PointChild pc = new PointChild(2, 3);
        // pc = new PointChild(3,4);
        // pc.DEFAULT_X =4; /*A final instance variable can only be initialized once*/

        final int[] myArray = { 1, 2, 3, 4, 5 };
        myArray = new int[5];

        myArray[3] = 3; // The contents of an array declared final can be changed

    }

}
