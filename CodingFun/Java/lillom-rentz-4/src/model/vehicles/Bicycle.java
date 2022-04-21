/**
 * 
 */
package model.vehicles;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author Martin Lillo
 * @version TCSS 305 Winter 2021 UW Tacoma (UWT)
 */
public class Bicycle extends AbstractVehicle {
    
    /**
     * Base fare for bicycle based on default base fare from AbstractVehicle class.
     */
    public static final BigDecimal CYCLE_FARE = BASE_FARE;
    
    /**
     * Bicycle fare for road bikes.
     */
    public static final BigDecimal ROAD_FARE = CYCLE_FARE;
    
    /**
     * Bicycle fare for mountain bikes.
     */
    public static final BigDecimal MOUNTAIN_FARE = CYCLE_FARE.multiply(new BigDecimal("0.01"));
    
    /**
     * Bicycle fare for cruiser bikes.
     */
    public static final BigDecimal CRUISER_FARE = CYCLE_FARE.multiply(new BigDecimal("0.02"));
    
    /**
     * Bicycle fare for hybrid bikes.
     */
    public static final BigDecimal HYBRID_FARE = CYCLE_FARE.multiply(new BigDecimal("0.04"));
    
    /**
     * Bicycle types.
     */
    private BikeType myBikeType;
    
    /**
     * Bicycle Constructor.
     * @param theName
     * @param theVIN
     * @param theRentalStatus
     * @param theBikeType
     */
    public Bicycle(final String theName, final String theVIN, final boolean theRentalStatus, final BikeType theBikeType) {
        super(theName, theVIN, theRentalStatus);
        this.myBikeType = theBikeType;
    }
    
    // getter methods for Bicycle
    
    /**
     * Returns bike type.
     * @return myBikeType
     */
    public BikeType getMyBikeType() {
        return myBikeType;
    }
    
    // Overridden methods
    
    /**
     * Returns bicycle string output. Overrides AbstractVehicle toString method.
     * @return string output
     */
    @Override
    public String toString() {
        return "Bicycle (ID:" + getMyVehicleID() + ", Name:" + getMyName() + ", VIN:"
                + getMyVIN() + ", Rental Status:" + isMyRentalStatus() + ", Bike Type:"
                + myBikeType + ")";
    }
    
    /**
     * Override equals method.
     * @param theOtherBike
     * @return boolean result
     */
    @Override
    public boolean equals(final Object theOtherBike) {
        boolean result = false;
        
        if (!(theOtherBike instanceof Bicycle)) {
            result = false;
        } else {
            final Bicycle otherBike = (Bicycle) theOtherBike;
            result = super.equals(theOtherBike) && myBikeType == otherBike.myBikeType;
        }
        return result;
    }
    
    /**
     * Override hashCode method.
     * @return int hash code
     */
    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(myBikeType);
    }
    
    /**
     * Override calculateRentalAmount method.
     * @return rentAmount
     */
    @Override
    public BigDecimal calculateRentalAmount() {
        BigDecimal rentAmount = CYCLE_FARE;
        
        switch (myBikeType) {
            case Road:
                rentAmount = rentAmount.add(CYCLE_FARE);
                break;
            case Mountain:
                rentAmount = rentAmount.add(MOUNTAIN_FARE);
                break;
            case Cruiser:
                rentAmount = rentAmount.add(CRUISER_FARE);
                break;
            case Hybrid:
                rentAmount = rentAmount.add(HYBRID_FARE);
                break;
            default:
                break;
        }
        return rentAmount;
    }
    
    /**
     * Types of bicycle.
     */
    public enum BikeType {
        /**
         * All possible types of bikes to rent.
         */
        Road, Mountain, Cruiser, Hybrid
    }
}
