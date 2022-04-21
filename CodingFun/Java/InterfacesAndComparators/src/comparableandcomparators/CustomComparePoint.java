/*
 * comparator example
 */

package comparableandcomparators;

import java.util.Comparator;

/**
 * Class implementing Comparator.
 * 
 * @author athirai
 * @version 1.0
 */
public class CustomComparePoint implements Comparator<Point> {

    /**
     * implementing the abstract method.
     */
    @Override
    public int compare(final Point thePoint1, final Point thePoint2) {
        if (thePoint1.equals(thePoint2)) {
            return 0;
        } else if (thePoint1.getY() > thePoint2.getY()) {
            return 1;
        } else {
            return -1;
        }
    }

}
