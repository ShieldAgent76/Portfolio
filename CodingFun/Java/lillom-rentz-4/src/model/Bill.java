/**
 * This is the Bill class.
 */
package model;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import model.vehicles.AbstractVehicle;

/**
 * @author marti
 * @version TCSS 305 Winter 2021
 */
public class Bill {
    
    /**
     * Amount based on US currency format.
     */
    public static final NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US); 
    
    /**
     * Bill number.
     */
    private final int myBillID;
    
    /**
     * User object.
     */
    private final User myPrimaryUser;
    
    /**
     * Vehicle object.
     */
    private final AbstractVehicle myVehicle;
    
    /**
     * Integer value where vehicle is rented for a certain amount of days.
     */
    private final int myNumDays;
    
    /**
     * Bill amount.
     */
    private BigDecimal myBillAmount;
    
    /**
     * Bill Constructor.
     * @param theBillID
     * @param thePrimaryUser
     * @param theVehicle
     * @param theNumDays
     */
    public Bill(final int theBillID, final User thePrimaryUser, final AbstractVehicle theVehicle, final int theNumDays) {
        this.myBillID = theBillID;
        this.myPrimaryUser = thePrimaryUser;
        this.myVehicle = theVehicle;
        this.myNumDays = theNumDays;
        myBillAmount = new BigDecimal(0);
    }
    
    /**
     * Method that computes and prints bill amount.
     * @param theOutput
     */
    public void computeAndPrintAmount(final PrintStream theOutput) {
        
        theOutput.println("----Cost Information----");
        theOutput.println("RentalPerDay:");

        final BigDecimal calculateRent = myVehicle.calculateRentalAmount();
        theOutput.println("Cost per Day: " + US.format(calculateRent));
        theOutput.println("No.of Rental days: " + myNumDays);

        final BigDecimal numOfDays = new BigDecimal(myNumDays);

        final BigDecimal totalAmountBefore = calculateRent.multiply(numOfDays);
        theOutput.println("Total Amount: " + US.format(totalAmountBefore));

        final BigDecimal onePercentRate = new BigDecimal("0.01");

        final BigDecimal insurance = totalAmountBefore.multiply(onePercentRate);
        theOutput.println("Insurance: " + US.format(insurance));

        BigDecimal vipStatus = new BigDecimal("0.00");

        if (myPrimaryUser.isMyVIPStatus()) {

            vipStatus = totalAmountBefore.multiply(onePercentRate);
            theOutput.println("VIPDiscount: -" + US.format(vipStatus));

        } else {
            theOutput.println("VIPDiscount: " + US.format(vipStatus));

        }

        final BigDecimal tax = totalAmountBefore.multiply(new BigDecimal("0.1"));
        theOutput.println("Tax: " + US.format(tax));

        myBillAmount = totalAmountBefore.add(insurance).subtract(vipStatus).add(tax);

        theOutput.println("Total Rent: " + US.format(myBillAmount));
    }
    
    /**
     * returns bill id.
     * @return myBillID
     */
    public int getMyBillID() {
        return myBillID;
    }
}
