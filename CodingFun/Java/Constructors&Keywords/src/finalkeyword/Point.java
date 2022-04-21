/*
 * This is a point class to demonstrate the use of final
 */

package finalkeyword;

/**
 * 
 * This class represents a point with x and y co-ordinates.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public class Point {
    
    
    /**
     * x co-ordinates.
     */
    protected int myX;
    
    /**
     * y co-ordinate.
     */
    protected int myY;
    /**
     * default x.
     */
    protected final int myDEFAULTX = 0;
    
    /**
     * default y.
     */
    protected final int myDEFAULTY = 0;
    
   
    
   

    public Point(final int theX, final int theY) {
        myX = theX;
        myY = theY;

    }

    public int getMyX() {
        return myX;
    }

    public void setMyX(final int theX) {
        this.myX = theX;
    }

    public int getMyY() {
        return myY;
    }

    public void setMyY(final int theY) {
        this.myY = theY;
    }

    public void translate(final int theDx, final int theDy) {
        myX += theDx;
        myY += theDy;
    }

    public static void main(final String[] theArgs) {

        final Point p = new Point(1, 2);

        // p.myDEFAULTX=2; //Final fields cannot be changed
        // p.myDEFAULTY=3;
    }

}
