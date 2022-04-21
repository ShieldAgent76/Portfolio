/**
 * Test case for Car.
 */
package model.vehicles;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Martin Lillo
 * @version TCSS 305 Winter 2021 
 */
public class CarTest {
    
    /**
     * Car object 1.
     */
    private Car myCar1;
    
    /**
     * Car object 2.
     */
    private Car myCar2;
    
    /**
     * Set up constructor.
     */
    @Before
    public void setUp() {
        myCar1 = new Car("Name", "V100", true, true, true, true);
        myCar2 = new Car("Name2", "V101", false, false, false, false);
    }
    
    /**
     * Test method for {@link model.vehicles.Car#hashCode()}.
     */
    @Test
    public void testHashCode() {
        assertEquals("hashCode Failed", myCar1.hashCode(), myCar1.hashCode());
    }

    /**
     * Test method for {@link model.vehicles.Car#calculateRentalAmount()}.
     */
    @Test
    public void testCalculateRentalAmount() {
        assertEquals("calculate amount failed", myCar1.calculateRentalAmount(), myCar1.calculateRentalAmount());
    }

    /**
     * Test method for {@link model.vehicles.Car#toString()}.
     */
    @Test
    public void testToString() {
        assertEquals("toString Failed", myCar1.toString(), myCar1.toString());
    }

    /**
     * Test method for {@link model.vehicles.Car#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObject() {
        final Car sameCar = new Car("Name", "V100", true, true, true, true);
        assertEquals("Equals Failed", myCar1, myCar1);
        assertNotEquals("Equals Failed", myCar1, myCar2);
        
        // should return false becuase of different id
        assertNotEquals("Equals Failed", myCar1, sameCar);
        
        // should return false if object is null
        assertNotEquals("Equals Failed", myCar1, null);
        
        // should return false if objects are in different classes
        assertNotEquals("Equals Failed", myCar1, new ArrayList<Integer>());
    }

    /**
     * Test method for {@link model.vehicles.Car#Car(java.lang.String, java.lang.String, boolean, boolean, boolean)}.
     */
    @Test
    public void testCar() {
        assertEquals("Constructor Failed", "Name", myCar1.getMyName());
        assertEquals("Constructor Failed", "V100", myCar1.getMyVIN());
        assertEquals("Constructor Failed", true, myCar1.isMyRentalStatus());
        assertEquals("Constructor Failed", true, myCar1.isMyLuxury());
        assertEquals("Constructor Failed", true, myCar1.isMyNavigation());
        assertEquals("Constructor Failed", true, myCar1.isMyAssistance());
    }

    /**
     * Test method for {@link model.vehicles.Car#isMyLuxury()}.
     */
    @Test
    public void testIsMyLuxury() {
        assertEquals("Constructor Failed", true, myCar1.isMyLuxury());
    }

    /**
     * Test method for {@link model.vehicles.Car#isMyNavigation()}.
     */
    @Test
    public void testIsMyNavigation() {
        assertEquals("Constructor Failed", true, myCar1.isMyNavigation());
    }

    /**
     * Test method for {@link model.vehicles.Car#isMyAssistance()}.
     */
    @Test
    public void testIsMyAssistance() {
        assertEquals("Constructor Failed", true, myCar1.isMyAssistance());
    }

}
