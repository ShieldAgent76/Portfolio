/**
 * 
 */
package exercisestest;

import static org.junit.Assert.*;

import exercises.Point;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;



/**
 * @author Martin Lillo
 * @version 1.0
 */
public class PointTest {

    /**
     * Double value called tolerance to fill in double values.
     */
    public static final double TOLERANCE = 0.00000001;
    
    /**
     * Class objects to be tested.
     * First point object to test default constructor
     */
    private Point myPoint1;
    
    /**
     * Second point object to test parameterized constructor.
     */
    private Point myPoint2;
    
    /**
     * before test method to initialize objects.
     */
    @Before
    public void setUp() {
        myPoint1 = new Point();
        myPoint2 = new Point(1, 2);
    }
    
    /**
     * Test method for {@link exercises.Point#hashCode()}.
     */
    @Test
    public void testHashCode() {   
        assertEquals("Hash Code Failed", myPoint2.hashCode(), myPoint2.hashCode());
    }

    /**
     * Test method for {@link exercises.Point#Point(double, double)}.
     */
    @Test
    public void testPointDoubleDouble() {
        assertNotNull("Null Object", myPoint2);
        assertEquals("Parameterized Constructor Failed", 1, myPoint2.getX(), TOLERANCE);
        assertEquals("Parameterized Constructor Failed", 2, myPoint2.getY(), TOLERANCE);
    }

    /**
     * Test method for {@link exercises.Point#Point()}.
     */
    @Test
    public void testPoint() {
        assertNotNull("Null Object", myPoint1);
        assertEquals("Default values not equal", 0, myPoint1.getX(), TOLERANCE);
        assertEquals("Default values not equal", 0, myPoint1.getY(), TOLERANCE);
    }

    /**
     * Test method for {@link exercises.Point#Point(exercises.Point)}.
     */
    @Test
    public void testPointPoint() {
        final Point p = new Point(myPoint2);
        assertNotNull("Copy Constructor Failed", p);
        assertEquals("Copy Constructor Failed", p.getX(), myPoint2.getX(), TOLERANCE);
        assertEquals("Copy Constructor Failed", p.getY(), myPoint2.getY(), TOLERANCE);
    }
    
    /**
     * Test method for {@link exercises.Point#Point(exercises.Point)}.
     */
    @Test(expected = IllegalArgumentException.class) 
    public void testIllegalPointXArgument() {
        myPoint2 = new Point(-1, 2);
    }
    
    /**
     * Test method for {@link exercises.Point#Point(exercises.Point)}.
     */
    @Test(expected = IllegalArgumentException.class) 
    public void testIllegalPointYArgument() {
        myPoint2 = new Point(1, -2);
    }

    /**
     * Test method for {@link exercises.Point#getX()}.
     */
    @Test
    public void testGetX() {
        assertEquals("GetX Failed", 1, myPoint2.getX(), TOLERANCE);
        assertNotEquals("GetX Failed", 5, myPoint2.getX(), TOLERANCE);
    }

    /**
     * Test method for {@link exercises.Point#getY()}.
     */
    @Test
    public void testGetY() {
        assertEquals("GetY Failed", 2, myPoint2.getY(), TOLERANCE);
        assertNotEquals("GetY Failed", 4, myPoint2.getY(), TOLERANCE);
    }

    /**
     * Test method for {@link exercises.Point#getRho()}.
     */
    @Test
    public void testGetRho() {
        assertEquals("GetRho Failed", Math.sqrt(Math.pow(myPoint2.getX(), 2) + Math.pow(myPoint2.getY(), 2)), myPoint2.getRho(), TOLERANCE);
        assertNotEquals("GetRho Failed", 5, myPoint2.getRho(), TOLERANCE);
    }

    /**
     * Test method for {@link exercises.Point#getThetaInRadians()}.
     */
    @Test
    public void testGetThetaInRadians() {
        assertEquals("GetTheta Failed", Math.atan2(myPoint2.getY(), myPoint2.getX()), myPoint2.getThetaInRadians(), TOLERANCE);
        assertNotEquals("GetThetaRad Failed", 5, myPoint2.getThetaInRadians(), TOLERANCE);
    }

    /**
     * Test method for {@link exercises.Point#getThetaInDegrees()}.
     */
    @Test
    public void testGetThetaInDegrees() {
        assertEquals("GetThetaDeg Failed", Math.atan2(myPoint2.getY(), myPoint2.getX()) * Point.HALF_CIRCLE / Math.PI, myPoint2.getThetaInDegrees(), TOLERANCE);
        assertNotEquals("GetThetaDeg Failed", 5, myPoint2.getThetaInDegrees(), TOLERANCE);
    }

    /**
     * Test method for {@link exercises.Point#calculateDistance(exercises.Point)}.
     */
    @Test
    public void testCalculateDistancePositive() {
        assertEquals("Calculate Distance Failed", 5, myPoint1.calculateDistance(new Point(5, 0)), TOLERANCE);
    }
    
    /**
     * Test method for {@link exercises.Point#calculateDistance(exercises.Point)}.
     */
    @Test
    public void testCalculateDistanceOrigin() {
        assertEquals("Calculate Distance Failed", 0, myPoint1.calculateDistance(new Point(0, 0)), TOLERANCE);
    }
    
    /**
     * Test method for {@link exercises.Point#calculateDistance(exercises.Point)}.
     */
    @Test(expected = NullPointerException.class)
    public void testCalculateDistanceNull() {
        myPoint1.calculateDistance(null);
    }

    /**
     * Test method for {@link exercises.Point#setLocation(double, double)}.
     */
    @Test
    public void testSetLocation() {
        myPoint1.setLocation(20, 18);
        assertEquals("Set Location Failed", 20, myPoint1.getX(), TOLERANCE);
        assertEquals("Set Location Failed", 18, myPoint1.getY(), TOLERANCE);
    }

    /**
     * Test method for {@link exercises.Point#translate(double, double)}.
     */
    @Test
    public void testTranslate() {
        myPoint1.translate(20, 5);
        assertEquals("Translate Failed", 20, myPoint1.getX(), TOLERANCE);
        assertEquals("Translate Failed", 5, myPoint1.getY(), TOLERANCE);
    }

    /**
     * Test method for {@link exercises.Point#toString()}.
     */
    @Test
    public void testToString() {
        assertEquals("toString Failed", "Point (1.00, 2.00)", myPoint2.toString());
    }

    /**
     * Test method for {@link exercises.Point#equals(java.lang.Object)}.
     * Test positive if the two objects are equal
     */
    @Test
    public void testEqualsObjectPositive() {
        final Point point3 = new Point(myPoint2);
        assertEquals("Equals Failed", point3, myPoint2);
        assertEquals("Equals Failed", myPoint2, myPoint2);
    }
    
    /**
     * Test method for {@link exercises.Point#equals(java.lang.Object)}.
     * Test negative if the two objects are not
     */
    @Test
    public void testEqualsObjectNegative() {
        assertNotEquals("Equals Failed", myPoint2, myPoint1);
        assertNotEquals("Equals Failed", myPoint2, null);
        assertNotEquals("Equals Failed", myPoint2, new ArrayList());
    }

}
