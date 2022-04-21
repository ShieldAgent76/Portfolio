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
public class MotorBike extends AbstractVehicle {
    
    /**
     * Base fare for motor bike based on base fare from AbstractVehicle.
     */
    public static final BigDecimal BIKE_FARE = BASE_FARE.multiply(new BigDecimal(2));
    
    /**
     * Touring fee. 
     */
    public static final BigDecimal TOURING_FEE = new BigDecimal(5);
    
    /**
     * Boolean field to check if motor bike is touring.
     */
    private final boolean myTouringStatus;
    
    /**
     * MotorBike Constructor.
     * @param theName
     * @param theVIN
     * @param theRentalStatus
     * @param theTouringStatus
     */
    public MotorBike(final String theName, final String theVIN, final boolean theRentalStatus, final boolean theTouringStatus) {
        super(theName, theVIN, theRentalStatus);
        this.myTouringStatus = theTouringStatus;
    }
    
    // getter methods for MotorBike
    
    /**
     * Get touring status.
     * @return myTouringStatus
     */
    public boolean isMyTouringStatus() {
        return myTouringStatus;
    }
    
    // all getter methods for MotorBike
    
    /**
     * Override calculateRentalAmount method.
     */
    @Override
    public BigDecimal calculateRentalAmount() {
        BigDecimal rentalAmount = BIKE_FARE;
        
        if (myTouringStatus) {
            rentalAmount = rentalAmount.add(TOURING_FEE);
        }
        return rentalAmount;
    }
    
    // Overridden methods
    
    /**
     * Override toString method.
     * @return string output
     */
    @Override
    public String toString() {
        return "Motorbike (ID:" + getMyVehicleID() + ", Name:" + getMyName() + ", VIN:"
               + getMyVIN() + ", Rental Status:" + isMyRentalStatus() + ", Touring?:"
               + myTouringStatus + ")";
    }
    
    /**
     * Override equals method.
     * @return result
     */
    @Override
    public boolean equals(final Object theOtherMotorBike) {
        boolean result = false;
        
        if (!(theOtherMotorBike instanceof MotorBike)) {
            result = false;
        } else {
            final MotorBike otherMotorbike = (MotorBike) theOtherMotorBike;
            result = super.equals(otherMotorbike) && myTouringStatus == otherMotorbike.myTouringStatus; 
        }
        return result;
    }
    
    /**
     * Override hash code method.
     * @return int hash code
     */
    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(myTouringStatus);
    }
}
