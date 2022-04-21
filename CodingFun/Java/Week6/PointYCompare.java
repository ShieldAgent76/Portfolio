package exercises;

import java.util.Comparator;

/**
 * Point class implementing Comparator.
 * 
 * @author marti
 * @version 1.0
 */
public class PointYCompare implements Comparator<Point> {
    
    /**
     * Overriding the compare method to compare y coordinates.
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
