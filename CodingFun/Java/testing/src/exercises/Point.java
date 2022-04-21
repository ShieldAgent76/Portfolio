/*
 * TCSS 305
 * 
 * A mutable 2D Point class to demonstrate some class design considerations.
 * 
 * 
 * NOTE: This class contains many methods for working with Point objects. The reason I added so
 * many methods is to provide a large code example; however, in general, it is better to keep
 * the design of classes as clean and small as possible. (So, this class is probably larger and
 * more complex than necessary). It is still possible to add even more functionality. For
 * instance, this class provides getters for Rho and Theta (polar coordinates), but we could
 * also add a constructor and setters to work with polar coordinates.
 * 
 * 
 * This example implements Cloneable, therefore no copy constructor.
 * 
 * See Java Practices: http://www.javapractices.com/topic/TopicAction.do?Id=71
 */

package exercises;

import java.util.Objects;

/**
 * Represents a 2-dimensional point on a plane.
 * 
 * @author Alan Fowler acfowler@uw.edu
 * @version Spring 2015
 */
public final class Point {

    // constants (static final fields)

    /** A default value for the x coordinate. */
    public static final double DEFAULT_X = 0;

    /** A default value for the y coordinate. */
    public static final double DEFAULT_Y = 0;

    /** A value to convert to degrees. */
    public static final double HALF_CIRCLE = 180;

    // instance fields

    /** The x coordinate. */
    private double myX;

    /** The y coordinate. */
    private double myY;

    // constructors

    /**
     * Constructs a Point using the provided x and y coordinates.
     * 
     * @param theX The x coordinate to assign to this point.
     * @param theY The y coordinate to assign to this point.
     */
    public Point(final double theX, final double theY) {
        if (theX < 0 | theY < 0) {
            throw new IllegalArgumentException();
        }
        myX = theX;
        myY = theY;

        // OR if the setters are 'final'
        // setLocation(theX, theY);

        /*
         * NOTE: non-final methods should NOT be called from within a constructor because a
         * sub-class could override the method and provide an implementation which could assign
         * invalid values to fields or otherwise violate encapsulation.
         */
    }

    /**
     * Constructs a point at the origin (0, 0).
     */
    public Point() {
        // call the overloaded constructor
        this(DEFAULT_X, DEFAULT_Y);

    }

    /**
     * Copy Constructor.
     * 
     * @param theOtherPoint other point
     */
    public Point(final Point theOtherPoint) {
        this(Objects.requireNonNull(theOtherPoint).myX,
             Objects.requireNonNull(theOtherPoint).myY);
    }

    // queries (sometimes called 'accessors'; sometimes called 'getters')

    /**
     * What is the x coordinate?
     * 
     * @return the x coordinate
     */
    public double getX() {
        return myX;
    }

    /**
     * What is the y coordinate?
     * 
     * @return the y coordinate
     */
    public double getY() {
        return myY;
    }

    /**
     * What is the distance from the (0, 0) origin (Rho)?
     * 
     * Polar coordinates consist of an angle (Theta) and a distance (Rho).
     * 
     * @return the distance (Rho)
     */
    public double getRho() {
        return Math.sqrt(Math.pow(myX, 2) + Math.pow(myY, 2));
    }

    /**
     * What is the angle (Theta)?
     * 
     * Polar coordinates consist of an angle (Theta) and a distance (Rho).
     * 
     * @return the angle (Theta) in radian measure
     */
    public double getThetaInRadians() {
        return Math.atan2(myY, myX);
    }

    /**
     * What is the angle (Theta)?
     * 
     * Polar coordinates consist of an angle (Theta) and a distance (Rho).
     * 
     * @return the angle (Theta) in degrees
     */
    public double getThetaInDegrees() {
        return Math.atan2(myY, myX) * HALF_CIRCLE / Math.PI;
    }

    /**
     * What is the distance to the specified point?
     * 
     * precondition: theOtherPoint is not null
     * 
     * @param theOtherPoint The other point.
     * @return the distance from the current point to the specified point
     * @throws NullPointerException if theOtherPoint is null
     */
    public double calculateDistance(final Point theOtherPoint) {
        final double dx = myX - Objects.requireNonNull(theOtherPoint).myX;
        final double dy = myY - Objects.requireNonNull(theOtherPoint).myY;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // commands (sometimes called 'mutators'; sometimes called 'setters')

    /**
     * Set the x and y coordinates to the specified values!
     * 
     * @param theX the new x value to set
     * @param theY the new y value to set
     */
    public void setLocation(final double theX, final double theY) {
        myX = theX;
        myY = theY;
    }

    /**
     * Translate by the specified values!
     * 
     * Translates this point, at location (x,y), by theX along the x axis and theY along the y
     * axis so that it now represents the point (x + theX, y + theY).
     * 
     * @param theX The distance to translate along the x axis.
     * @param theY The distance to translate along the y axis.
     */
    public void translate(final double theX, final double theY) {
        myX += theX;
        myY += theY;
    }

    /**
     * Returns a String containing the coordinate pair with a label : Point (1.23, 5.67). The
     * coordinates are formatted to show 2 decimal places.
     * 
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        // A format string for decimal numbers.
        final String format2places = "%.2f"; // used to display 2 decimal places

        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName()); // the class name without the package name
        sb.append(" (");
        sb.append(String.format(format2places, myX)); // display 2 decimal places
        sb.append(", ");
        sb.append(String.format(format2places, myY)); // display 2 decimal places
        sb.append(')'); // use single quotes '' to indicate a char
                        // use double quotes "" to indicate a String
        return sb.toString();

        /*
         * In modern VMs this compiles to the same byte code as return "(" +
         * String.format(FORMAT, myX) + ", " + String.format(FORMAT, myY) + ")"; because modern
         * compilers can optimize string concatenations which occur on a single line of code.
         */
    }

    /**
     * Returns true if the parameter is a Point with identical coordinates as the current
     * Point; false otherwise.
     * 
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object theOther) {
        // return true if we are comparing identical objects (same memory address)
        if (this == theOther) {
            return true;
        }

        // return false if the parameter is null
        if (theOther == null) {
            return false;
        }

        // return false if the parameter is not a Point
        if (getClass() != theOther.getClass()) {
            return false;
        }

        // now we know theOther is a Point, so cast it
        final Point otherPoint = (Point) theOther;

        // now compare fields for equality.
        // remember to compare double values using one of the techniques shown
        // in the first equals() example above.
        return Double.compare(myX, otherPoint.myX) == 0
               && Double.compare(myY, otherPoint.myY) == 0;

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        /*
         * Use the hashCode() method in class String to create a hash code. This will not
         * violate the general contract for hashCode because equals() and toString() use the
         * same fields.
         */
        // return toString().hashCode();

        /*
         * Alternatively, in Java 7 or later you can use the new Objects.hash() method:
         */
        return Objects.hash(myX, myY); // hash the same fields that .equals() uses.
    }

}
