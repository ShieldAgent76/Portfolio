/**
 * Test case for MotorBike.
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
public class MotorBikeTest {
    
    /**
     * Motor bike object 1.
     */
    private MotorBike myMotorbike1;
    
    /**
     * Motor bike object 2.
     */
    private MotorBike myMotorbike2;
    
    /**
     * Set up constructor.
     */
    @Before
    public void setUp() {
        myMotorbike1 = new MotorBike("Name", "B100", true, true);
        myMotorbike2 = new MotorBike("Name2", "B101", false, false);
    }
    
    /**
     * Test method for {@link model.vehicles.MotorBike#hashCode()}.
     */
    @Test
    public void testHashCode() {
        assertEquals("hashCode Failed", myMotorbike1.hashCode(), myMotorbike1.hashCode());
    }

    /**
     * Test method for {@link model.vehicles.MotorBike#calculateRentalAmount()}.
     */
    @Test
    public void testCalculateRentalAmount() {
        assertEquals("calculate amount failed", myMotorbike1.calculateRentalAmount(), myMotorbike1.calculateRentalAmount());
    }

    /**
     * Test method for {@link model.vehicles.MotorBike#toString()}.
     */
    @Test
    public void testToString() {
        assertEquals("toString Failed", myMotorbike1.toString(), myMotorbike1.toString());
    }

    /**
     * Test method for {@link model.vehicles.MotorBike#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObject() {
        final MotorBike sameMotorbike = new MotorBike("Name", "B100", true, true);
        assertEquals("Equals Failed", myMotorbike1, myMotorbike1);
        assertNotEquals("Equals Failed", myMotorbike1, myMotorbike2);
        
        // should return false becuase of different id
        assertNotEquals("Equals Failed", myMotorbike1, sameMotorbike);
        
        // should return false if object is null
        assertNotEquals("Equals Failed", myMotorbike1, null);
        
        // should return false if objects are in different classes
        assertNotEquals("Equals Failed", myMotorbike1, new ArrayList<Integer>());
    }

    /**
     * Test method for {@link model.vehicles.MotorBike#MotorBike(java.lang.String, java.lang.String, boolean)}.
     */
    @Test
    public void testMotorBike() {
        assertEquals("Constructor Failed", "Name", myMotorbike1.getMyName());
        assertEquals("Constructor Failed", "B100", myMotorbike1.getMyVIN());
        assertEquals("Constructor Failed", true, myMotorbike1.isMyRentalStatus());
        assertEquals("Constructor Failed", true, myMotorbike1.isMyTouringStatus());
    }

    /**
     * Test method for {@link model.vehicles.MotorBike#isMyTouringStatus()}.
     */
    @Test
    public void testIsMyTouringStatus() {
        assertEquals("Constructor Failed", true, myMotorbike1.isMyTouringStatus());
    }

}
