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

package exercise;

import java.util.Objects;

/**
 * Represents a 2-dimensional point on a plane.
 * 
 * @author Alan Fowler acfowler@uw.edu
 * @version Spring 2015
 */
public final class Point implements Cloneable {

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
        myX = theX;
        myY = theY;
    }

    /**
     * Constructs a point at the origin (0, 0).
     */
    public Point() {
        myX = DEFAULT_X;
        myY = DEFAULT_Y;
    }

    public Point(final Point theP) {
        myX = Objects.requireNonNull(theP).myX;
        myY = Objects.requireNonNull(theP).myY;
    }

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

    // overridden methods from class Object

    // Q1. Override the toString() method. Use String Builder to print "Point (x, y)" The x, y
    // value should be formatted to 3 decimal places
    public String toString() {
        
        final String format3places = "%.3f";
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" (");
        sb.append(String.format(format3places, myX));
        sb.append(", ");
        sb.append(String.format(format3places, myY));
        sb.append(')');

        return sb.toString();
    }

    // Q2. Override the Equals() method.
    public boolean equals(final Object theOtherPoint) {
        
        boolean result = true;
        
        if (this == theOtherPoint) {
            result = true;
        } else if (theOtherPoint == null) {
            result = false;
        } else if (this.getClass() != theOtherPoint.getClass()) {
            result = false;
        } else {
            final Point other = (Point) theOtherPoint;
            result = Double.compare(this.myX, other.myX) == 0 && Double.compare(this.myY, other.myY) == 0;
        }
        
        return result;
    }

    // Q3. Override the hashCode() method.
    public int hashCode() {
        return Objects.hash(myX, myY);
    }

    public static void main(final String[] theArgs) {
        final Point p = new Point(2, 3);
        System.out.println(p);
        final Point p1 = new Point(1, 2);
        final Point p2 = new Point(1, 2);

        System.out.println(p1 == p2); // The statement objectA == objectB compares the memory
        // addresses of objectA and objectB
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(null)); // Calling objectA.equals(null) will not cause
        // an exception to be thrown.

        System.out.print(p1.hashCode() + " " + p2.hashCode() + " ");
        System.out.println(p1.hashCode() == p2.hashCode()); //If objectA.equals(objectB) is
        // true then
        // //objectA .hashCode() == objectB .hashCode()must also be true.

    }

}
