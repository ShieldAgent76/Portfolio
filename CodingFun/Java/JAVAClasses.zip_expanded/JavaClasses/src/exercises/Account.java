/*
 * This is an exercise on class design
 */
package exercises;

/**
 * Class exercise: Create a Class that reflects a bank account
 * It should not have any warnings or errors.
 * 
 * @author Martin Lillo
 * @version 1.0
 * 
 *
 */
public class Account {

    // Account fields
    private double myCheckings;
    private double mySavings;
    
    // Account constructor
    public Account(final double theCheckings, final double theSavings) {
        this.myCheckings = theCheckings;
        this.mySavings = theSavings;
    }
    
    // getters and setters for bank account
    public double getMyCheckings() {
        return myCheckings;
    }
    
    public void setMyCheckings(final double theCheckings) {
        this.myCheckings = theCheckings;
    }
    
    public double getMySavings() {
        return mySavings;
    }
    
    public void setMySavings(final double theSavings) {
        this.mySavings = theSavings;
    }
    
    // toString method to print info
    public String toString() {
        return "Checkings: " + getMyCheckings() + "\nSavings: " + getMySavings();
    }
}
