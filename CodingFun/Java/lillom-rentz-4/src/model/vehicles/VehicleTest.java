/**
 * Test case for AbstractVehicle.
 */
package model.vehicles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Martin Lillo
 * @version TCSS 305 Winter 2021 
 */
public class VehicleTest {
    
    /**
     * Vehicle test object 1.
     */
    private AbstractVehicle myVehicle1;
    
    /**
     * Vehicle test object 2.
     */
    private AbstractVehicle myVehicle2;
    
    /**
     * Set up constructor.
     */
    @Before
    public void setUp() {
        myVehicle1 = new VehicleTestObject("Name", "V100", true);
        myVehicle2 = new VehicleTestObject("Name2", "V101", false);
    }
    /**
     * Test method for {@link model.vehicles.AbstractVehicle#hashCode()}.
     */
    @Test
    public void testHashCode() {
        assertEquals("hashCode() Failed", myVehicle1.hashCode(), myVehicle1.hashCode());
        assertNotEquals("hashCode() Failed", myVehicle1.hashCode(), myVehicle2.hashCode());
    }

    /**
     * Test method for {@link model.vehicles.AbstractVehicle#calculateRentalAmount()}.
     */
    @Test
    public void testCalculateRentalAmount() {
        final BigDecimal rent = myVehicle1.calculateRentalAmount();
        assertEquals("calculate amount failed", myVehicle1.calculateRentalAmount(), rent);
    }
    
    /**
     * Test method for {@link model.vehicles.AbstractVehicle#AbstractVehicle(java.lang.String, java.lang.String, java.lang.boolean)}.
     */
    public void testAbstractVehicle() {
        assertEquals("Constructor Failed", "Name", myVehicle1.getMyName());
        assertEquals("Constructor Failed", "V100", myVehicle1.getMyVIN());
        assertEquals("Constructor Failed", true, myVehicle1.isMyRentalStatus());
    }

    /**
     * Test method for {@link model.vehicles.AbstractVehicle#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObject() {
        final AbstractVehicle sameVehicle = new VehicleTestObject("Name", "V100", true);
        assertEquals("Equals Failed", myVehicle1, myVehicle1);
        assertNotEquals("Equals Failed", myVehicle1, myVehicle2);
        
        // should return false becuase of different id
        assertNotEquals("Equals Failed", myVehicle1, sameVehicle);
        
        // should return false if object is null
        assertNotEquals("Equals Failed", myVehicle1, null);
        
        // should return false if objects are in different classes
        assertNotEquals("Equals Failed", myVehicle1, new ArrayList<Integer>());
    }

    /**
     * Test method for {@link model.vehicles.AbstractVehicle#getMyVehicleID()}.
     */
    @Test
    public void testGetMyVehicleID() {
        assertEquals("Get ID Failed", myVehicle1.getMyVehicleID(), myVehicle1.getMyVehicleID());
    }

    /**
     * Test method for {@link model.vehicles.AbstractVehicle#getMyName()}.
     */
    @Test
    public void testGetMyName() {
        assertEquals("Get Name Failed", "Name", myVehicle1.getMyName());
    }

    /**
     * Test method for {@link model.vehicles.AbstractVehicle#getMyVIN()}.
     */
    @Test
    public void testGetMyVIN() {
        assertEquals("Get VIN", "V100", myVehicle1.getMyVIN());
    }

    /**
     * Test method for {@link model.vehicles.AbstractVehicle#isMyRentalStatus()}.
     */
    @Test
    public void testIsMyRentalStatus() {
        assertEquals(" Is Rental Status Failed", true, myVehicle1.isMyRentalStatus());
    }
    
    /**
     * Vehicle test class to initialize vehicle test object.
     * @author Martin Lillo
     * @version vehicle test class
     */
    private static class VehicleTestObject extends AbstractVehicle {
        
        /**
         * vehicleTest Constructor.
         * @param theName
         * @param theVIN
         * @param theRentalStatus
         */
        VehicleTestObject(final String theName, final String theVIN, final boolean theRentalStatus) {
            super(theName, theVIN, theRentalStatus);
        }
        
        /**
         * Override calculateRentalAmount method.
         */
        @Override
        public BigDecimal calculateRentalAmount() {
            return new BigDecimal(49);
        }
        
        /**
         * Override toString method.
         */
        @Override
        public String toString() {
            return "This is a test string";
        }
    }
}


