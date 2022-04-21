/*
 * This is an exercise on constructors.
 */

package exercises;

/**
 * 
 * This class Point demonstrates the use of different types of constructors.
 * 
 * @author Martin Lillo
 * @version 1.0
 * 
 * 
 *          Create a point class with the relevant attributes
 */
public class Point {
    
    /**
     * default x.
     */

    private static final float DEFAULT_X = 0;
    
    /**
     * default y.
     */

    private static final float DEFAULT_Y = 0;

    // 1. create 2 private float attributes myX, myY, with appropriate access labels
    private float myX;
    private float myY;

    // 2. create getters and setters for myX, myY
    public float getMyX() {
        return myX;
    }

    public void setMyX(final float myX) {
        this.myX = myX;
    }

    public float getMyY() {
        return myY;
    }

    public void setMyY(final float myY) {
        this.myY = myY;
    }

    // 3. create a main method and assign values for x and y
    public static void main(final String[] theArgs) {
        
        // sample point object
        final Point p = new Point();
        System.out.println(p.getMyX());
        System.out.println(p.getMyY());
        
        // three point objects
        final Point p1 = new Point();
        System.out.println(p1.getMyX());
        System.out.println(p1.getMyY());
        
        final Point p2 = new Point(10, 20);
        System.out.println(p2.getMyX());
        System.out.println(p2.getMyY());
        
        final Point p3 = new Point(p2);
        System.out.println(p3.getMyX());
        System.out.println(p3.getMyY());
    }
    
    // 4. create a parameter-less constructor
    public Point() {
        myX = DEFAULT_X;
        myY = DEFAULT_Y;
    }

    // 5. create a parameterized constructor
    public Point(final float theX, final float theY) {
        this.myX = theX;
        this.myY = theY;
    }

    // 6. create a copy constructor
    public Point(final Point theObj) {
        this.myX = theObj.getMyX();
        this.myY = theObj.getMyY();
    }
}
