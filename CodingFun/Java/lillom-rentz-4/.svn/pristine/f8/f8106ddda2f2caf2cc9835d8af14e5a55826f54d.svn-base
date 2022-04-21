/**
 * User class
 * Winter 2021
 * 
 * This class creates an user account for Rents with their name, password, and VIP status
 */

package model;

import java.util.Objects;

/**
 * Represents a single user for registration or sign-in. User is an immutable object.
 * 
 * Constructors and methods of this class throw NullPointerException if required parameters are
 * null.
 * 
 * @author lillom (Martin Lillo)
 * @version Fall 2019
 */
public final class User {
    
    /**
     * String that says that user name cannot be empty.
     */
    private static final String EMPTY_NAME = "Username cannot be empty";
    
    /**
     * String that says that password cannot be empty.
     */
    private static final String EMPTY_PASSWORD = "Password cannot be empty";
    
    /**
     * User fields.
     * myName for user name.
     */
    private final String myName;
    
    /**
     * myPassword for security of user's account.
     */
    private final String myPassword;
    
    /**
     * myVIPStatus to see if user is in VIP.
     */
    private final boolean myVIPStatus;
    

    /**
     * User constructor 1.
     * @param theName
     * @param thePassword
     */
    public User(final String theName, final String thePassword) {
        
        // set object variables, throw if parameters are null
        this.myName = Objects.requireNonNull(theName);
        this.myPassword = Objects.requireNonNull(thePassword);
        this.myVIPStatus = false;
        
        // throw exception if name or password are null
        if (myName == null) {
            throw new IllegalArgumentException(EMPTY_NAME);
        }
        
        if (myPassword == null) {
            throw new IllegalArgumentException(EMPTY_PASSWORD);
        }
    }
    
    /**
     * User constructor 2.
     * @param theName
     * @param thePassword
     * @param theVIPStatus
     */
    public User(final String theName, final String thePassword, final boolean theVIPStatus) {
        
        // set object variables, throw if parameters are null
        this.myName = Objects.requireNonNull(theName);
        this.myPassword = Objects.requireNonNull(thePassword);
        this.myVIPStatus = Objects.requireNonNull(theVIPStatus);
        
        // throw exception if name or password are null
        if (myName == null) {
            throw new IllegalArgumentException(EMPTY_NAME);
        }
        
        if (myPassword == null) {
            throw new IllegalArgumentException(EMPTY_PASSWORD);
        }
    }
    
    /**
     * Getter for VIP status.
     * @return myVIPStatus
     */
    public boolean isMyVIPStatus() {
        return myVIPStatus;
    }
    
    /**
     * Getter for name.
     * @return myName
     */
    public String getMyName() {
        return myName;
    }
    
    /**
     * Getter for password.
     * @return myPassword
     */
    public String getMyPassword() {
        return myPassword;
    }
    
    /**
     * toString method to print out user info.
     * @return sb.toString()
     */
    public String toString() {
        
        final StringBuilder sb = new StringBuilder(); 
        final String comma = ", ";
        
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.getMyName());
        sb.append(comma);
        sb.append(this.getMyPassword());
        sb.append(comma);
        sb.append(this.isMyVIPStatus());
        sb.append(")");
        
        return sb.toString();
    }
    
    /**
     * Equals method is two user objects are the same.
     * @param theOtherObject
     * @return result
     */
    public boolean equals(final Object theOtherObject) {
        
        boolean result = false;
        
        if (this == theOtherObject) {
            result = true;
        } else if (theOtherObject == null) {
            result = false;
        } else if (this.getClass() != theOtherObject.getClass()) {
            result = false;
        } else {
            final User other =  (User) theOtherObject;
            result = Objects.equals(myName, other.myName) && Objects.equals(myPassword, other.myPassword) && Objects.equals(myVIPStatus, other.myVIPStatus);
        }
        
        return result;
    }
    
    /**
     * Hash code method.
     * @return int hashcode
     */
    public int hashCode() {
        return Objects.hash(myName, myPassword, myVIPStatus);
    }
}
