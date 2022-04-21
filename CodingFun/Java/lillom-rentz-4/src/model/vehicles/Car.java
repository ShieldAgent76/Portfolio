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
public class Car extends AbstractVehicle {
    
    /**
     * Base fare for car based on AbstractVehicle base fare.
     */
    public static final BigDecimal CAR_FARE = BASE_FARE.multiply(new BigDecimal(3));
    
    /**
     * Charge for luxury cars.
     */
    public static final BigDecimal LUXURY_CHARGE = new BigDecimal(10);
    
    /**
     * Charge for navigation.
     */
    public static final BigDecimal NAVIGATION_CHARGE = new BigDecimal(1);
    
    /**
     * Charge for Driving Assistance.
     */
    public static final BigDecimal DRIVING_ASSISTANCE_CHARGE = new BigDecimal(2);
    
    /**
     * Boolean field to check if car is luxury.
     */
    private final boolean myLuxury;
    
    /**
     * Boolean field to check if car has navigation.
     */
    private final boolean myNavigation;
    
    /**
     * Boolean field to check if car has driving assistance.
     */
    private final boolean myAssistance;
    
    /**
     * Car Constructor.
     * @param theName
     * @param theVIN
     * @param theRentalStatus
     * @param theLuxury
     * @param theNavigation
     * @param theAssistance
     */
    public Car(final String theName, final String theVIN, final boolean theRentalStatus, 
               final boolean theLuxury, final boolean theNavigation, final boolean theAssistance) {
        super(theName, theVIN, theRentalStatus);
        this.myLuxury = theLuxury;
        this.myNavigation = theNavigation;
        this.myAssistance = theAssistance;
    }

    // getter methods for Car class
    
    /**
     * Get luxury status.
     * @return the myLuxury
     */
    public boolean isMyLuxury() {
        return myLuxury;
    }

    /**
     * Get navigation status.
     * @return the myNavigation
     */
    public boolean isMyNavigation() {
        return myNavigation;
    }

    /**
     * Get driving assistance status. 
     * @return the myAssistance
     */
    public boolean isMyAssistance() {
        return myAssistance;
    }
    
    // Overridden methods
    
    /**
     * Override calculateRentalAmount method.
     * @return rentAmount
     */
    @Override
    public BigDecimal calculateRentalAmount() {
        BigDecimal rentAmount = CAR_FARE;
        
        if (myLuxury) {
            rentAmount = rentAmount.add(LUXURY_CHARGE);
        } 
        if (myNavigation) {
            rentAmount = rentAmount.add(NAVIGATION_CHARGE);
        }
        if (myAssistance) {
            rentAmount = rentAmount.add(DRIVING_ASSISTANCE_CHARGE);
        }
        return rentAmount;
    }
    
    /**
     * Override toString method.
     * @return string output
     */
    @Override
    public String toString() {
        return "Car (ID:" + getMyVehicleID() + ", Name:" + getMyName() + ", VIN:" + getMyVIN()
                + ", Rental Status:" + isMyRentalStatus() + ", Luxury:" + myLuxury
                + ", Navigation:" + myNavigation + ", Driving Assistance:" + myAssistance
                + ")";
    }
    
    /**
     * Override equals method.
     * @return result
     */
    @Override
    public boolean equals(final Object theOtherCar) {
        boolean result = false;
        
        if (!(theOtherCar instanceof Car)) {
            result = false;
        } else {
            final Car otherCar = (Car) theOtherCar;
            result = super.equals(otherCar) && myLuxury == otherCar.myLuxury
                     && myNavigation == otherCar.myNavigation
                     && myAssistance == otherCar.myAssistance;
        }
        return result;
    }
    
    /**
     * Override hash code method.
     * @return int hash code
     */
    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(myLuxury, myNavigation, myAssistance);
    }
}
