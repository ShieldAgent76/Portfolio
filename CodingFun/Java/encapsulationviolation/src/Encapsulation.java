
/**
 * encapulation violation example.
 */

import java.awt.Point;


/**
 * 
 *@author athirai
 *@version 1.0
 */
public final class Encapsulation { //class cannot be extended unnecessarily.
    /**
     * final variables cannot be changed.
     * Point is mutable.
     */
    private final Point myPoint;
    
    /**
     * final variables. String is immutable, but string array is mutable.
     */
    private final String[] myStrings;
    
    /**
     * Character is immutable.
     */
    private final Character myCharacter;

    /**
     * constructor.
     * @param thePoint opint object.
     * @param theStrings string array.
     * @param theCharacter character object.
     */
    public Encapsulation(final Point thePoint, final String[] theStrings,
                         final Character theCharacter) {
        myPoint = (Point) thePoint.clone(); // – stores a mutable reference – store a defensive
                                            // copy instead - myPoint = thePoint.clone()
        myStrings = theStrings.clone(); // – stores a mutable reference – store a defensive
                                        // copy instead - myStrings = theStrings.clone()
        myCharacter = theCharacter;
    }
    
//    public void setPoint(final Point thePoint) {
//        myPoint = (Point) thePoint.clone(); 
//    }

    /**
     * getter for point.
     * @return Point object.
     */
    public Point getPoint() {
        return (Point) myPoint.clone(); // – returns a mutable reference – return a defensive
                                        // copy instead - return myPoint.clone()
    }
    
    /**
     * getter for string array.
     * @return string array.
     */
    public String[] getStrings() {
        return myStrings.clone(); //// – stores a mutable reference – store a defensive copy
                                  //// instead - myStrings = theStrings.clone()
    }
    
    /**
     * getter for character. 
     * @return character object.
     */
    public Character getCharacter() {
        return myCharacter;
    }

}
