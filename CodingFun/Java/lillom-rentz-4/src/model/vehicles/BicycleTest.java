/**
 * Test case for Bicycle.
 */
package model.vehicles;

import static org.junit.Assert.*;

import java.util.ArrayList;
import model.vehicles.Bicycle.BikeType;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Martin Lillo
 * @version TCSS 305 Winter 2021 
 */
public class BicycleTest {
    
    
    /**
     * Bicycle test object 1.
     */
    private Bicycle myBike1;
    
    /**
     * Bicycle test object 2.
     */
    private Bicycle myBike2;
    
    /**
     * Bicycle test object 3.
     */
    private Bicycle myBike3;
    
    /**
     * Bicycle test object 4.
     */
    private Bicycle myBike4;
    
    /**
     * Set up constructor.
     */
    @Before
    public void setUp() {
        myBike1 = new Bicycle("Name", "C100", true, BikeType.Road);
        myBike2 = new Bicycle("Name2", "C101", false, BikeType.Mountain);
        myBike3 = new Bicycle("Name3", "C103", true, BikeType.Cruiser);
        myBike4 = new Bicycle("Name4", "C104", false, BikeType.Hybrid);
    }
    
    /**
     * Test method for {@link model.vehicles.Bicycle#hashCode()}.
     */
    @Test
    public void testHashCode() {
        assertEquals("hashCode Failed", myBike1.hashCode(), myBike1.hashCode());
        assertNotEquals("hashCode Failed", myBike1.hashCode(), myBike2.hashCode());
    }

    /**
     * Test method for {@link model.vehicles.Bicycle#calculateRentalAmount()}.
     */
    @Test
    public void testCalculateRentalAmount() {
        assertEquals("calculate amount failed", myBike1.calculateRentalAmount(), myBike1.calculateRentalAmount());
        assertEquals("calculate amount failed", myBike2.calculateRentalAmount(), myBike2.calculateRentalAmount());
        assertEquals("calculate amount failed", myBike3.calculateRentalAmount(), myBike3.calculateRentalAmount());
        assertEquals("calculate amount failed", myBike4.calculateRentalAmount(), myBike4.calculateRentalAmount());
    }

    /**
     * Test method for {@link model.vehicles.Bicycle#toString()}.
     */
    @Test
    public void testToString() {
        assertEquals("toString Failed", myBike1.toString(), myBike1.toString());
    }

    /**
     * Test method for {@link model.vehicles.Bicycle#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObject() {
        final Bicycle sameBike = new Bicycle("Name", "C100", true, BikeType.Road);
        assertEquals("Equals Failed", myBike1, myBike1);
        assertNotEquals("Equals Failed", myBike1, myBike2);
        
        // should return false becuase of different id
        assertNotEquals("Equals Failed", myBike1, sameBike);
        
        // should return false if object is null
        assertNotEquals("Equals Failed", myBike1, null);
        
        // should return false if objects are in different classes
        assertNotEquals("Equals Failed", myBike1, new ArrayList<Integer>());
    }

    /**
     * Test method for {@link model.vehicles.Bicycle#Bicycle(java.lang.String, java.lang.String, model.vehicles.Bicycle.BikeType)}.
     */
    @Test
    public void testBicycle() {
        assertEquals("Constructor Failed", "Name", myBike1.getMyName());
        assertEquals("Constructor Failed", "C100", myBike1.getMyVIN());
        assertEquals("Constructor Failed", true, myBike1.isMyRentalStatus());
        assertEquals("Constructor Failed", BikeType.Road, myBike1.getMyBikeType());
    }

    /**
     * Test method for {@link model.vehicles.Bicycle#getMyBikeType()}.
     */
    @Test
    public void testGetMyBikeType() {
        assertEquals("Get Bike Type Failed", BikeType.Road, myBike1.getMyBikeType());
    }

}
