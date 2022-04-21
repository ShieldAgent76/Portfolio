/*
 * This is an example on 'static' keyword
 */

package statickeyword;

/**
 * 
 * This class Point demonstrates the use of 'static' members which are common across all
 * objects of the class.
 * 
 * @author athirai
 * @version 1.0
 * 
 * 
 *
 */
public class Point {

    
    /**
     * default x.
     */
    protected static final int DEFAULT_X = 0;
    
    /**
     * default y.
     */
    protected static final int DEFAULT_Y = 0;
    
    /**
     * x co-ordinates.
     */
    protected int myX;
    
    /**
     * y co-ordinate.
     */
    protected int myY;
   

    public Point(final int theX, final  int theY) {
        myX = theX;
        myY = theY;
    }

    private Point(final int theX, final int theY, final boolean theDefault) {
        if (!theDefault) {
            myX = theX;
            myY = theY;
        }
        myX = DEFAULT_X;
        myY = DEFAULT_Y;
    }

    public Point() {

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
        System.out.println(DEFAULT_X); // static fields can be accessed from an instance method
    }

    public static void translateTwice(final int theDx, final int theDy) {
        myX += theDx; // Instance fields cannot be accessed from a static method
        myY += theDy;
        System.out.println(DEFAULT_X); // static fields can be accessed from an static method
    }

    public static void main(final String[] theArgs) {

        final Point p1 = new Point(2, 3);
        final Point p2 = new Point(3, 4);

        System.out.println(p1.DEFAULT_X + " " + p1.DEFAULT_Y); // A static final field is
                                                               // shared by all objects created
                                                               // from a class
        System.out.println(p2.DEFAULT_X + " " + p2.DEFAULT_Y);
        System.out.println(Point.DEFAULT_X + " " + Point.DEFAULT_Y);

        Point.DEFAULT_X = 5; // A static final field cannot be changed by any object
        // created from a class

    }

}
