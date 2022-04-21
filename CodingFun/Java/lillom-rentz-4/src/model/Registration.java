
/*
 * This file is the registration class for the Vehicle Rental System.
 * 
 * TCSS 305 - Rentz
 */

/**
 * Registration Class
 * Winter 2021
 * 
 * This class puts users new and returning into the system to check out their cars
 */
package model;

import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;
import utility.FileLoader;

/**
 * Represents User Sign-in Object.
 * 
 * Methods of this class throw NullPointerException if required parameters are null.
 * 
 * @author Athirai
 * @version Fall 2019
 */

public class Registration {

    /**
     * Scanner object for user input.
     */
    public static final Scanner INPUT = new Scanner(System.in);
    
    /**
     * User Storage File.
     */
    public static final String USERFILE_NAME = "./resources/registeredusers.txt";

    /**
     * The registered user list for sign in.
     */
    private final Map<String, User> myUserList;

    /**
     * Constructs a sign in/registration system.
     * 
     * 
     */
    public Registration() {
        myUserList = FileLoader.readItemsFromFile(USERFILE_NAME);
    }

    /**
     * getter for myUserList.
     * 
     * @return myUserList
     */
    public Map<String, User> getMyUserList() {
        return myUserList;
    }

    /**
     * display sign-in or registration options.
     * @return result of logging in
     */
    public boolean printSignin() {

        // ------------Fill in--------------------//
        boolean result = false;
        final String printUsername = "Enter Username: ";
        final String printPassword = "Enter Password: ";
        final String passwordRequirements = "Password Requirements";
        final String newPassword = "Enter new password: ";
        
        System.out.print("Enter 1 or 2 (1. Register 2. Login): ");
        final int choice = INPUT.nextInt();
        System.out.println("You have entered option " + choice);
        System.out.println();
        
        if (choice == 1) {
            System.out.println("New User Registration");
            System.out.print("Enter new username: ");
            String username = INPUT.next();
            
            while (myUserList.containsKey(username)) {
                System.out.print("User already exists. Enter new username: ");
                username = INPUT.next();
            }
            
            System.out.println(passwordRequirements);
            System.out.println("Needs to be at 8 characters long");
            System.out.println("Needs at least one lowercase and uppercase letter");
            System.out.println("Needs to have one number");
            System.out.println("Cannot be username");
            System.out.print(newPassword);
            String password = INPUT.next();
            
            boolean validPassword = validPassword(password, username);
            while (!validPassword) {
                System.out.print("Password does not meet requirements. Enter new password: ");
                password = INPUT.next();
                validPassword = validPassword(password, username);
            }
            
            System.out.print("VIP? (true/false): ");
            final boolean vipCheck = INPUT.nextBoolean();
            final boolean vipStatus;
            if (vipCheck) {
                vipStatus = true;
            } else {
                vipStatus = false;
            }
            
            final User newUser = new User(username, password, vipStatus);
            
            if (register(newUser)) {
                System.out.println("You are now registered");
            }
        } else if (choice == 2) {
            System.out.println("Returning User");
            System.out.println("--------------");
            System.out.print(printUsername);
            String username = INPUT.next();
            
            System.out.print(printPassword);
            String password = INPUT.next();
            
            while (!login(username, password)) {
                System.out.println();
                System.out.println("User not found or does not exist");
                
                System.out.print(printUsername);
                username = INPUT.next();
                
                System.out.print(printPassword);
                password = INPUT.next();
            }
            System.out.println("You have are now logged in");
            result = true;
        }
        return result;
    }
    
    /**
     * Verify if password meets requirements.
     * 
     * @param thePassword password required
     * @param theUsername checks if password is equals to username
     * @return valid password
     */
    private boolean validPassword(final String thePassword, final String theUsername) {
        boolean isValid = false;
        final int minLength = 8;
        
        if (thePassword.length() >= minLength
            && Pattern.compile(".*[a-z].*").matcher(thePassword).find()
            && Pattern.compile(".*[0-9].*").matcher(thePassword).find()
            && Pattern.compile(".*[A-Z].*").matcher(thePassword).find()
            && !(thePassword.contains(theUsername))) {
            
            isValid = true;
        }
        return isValid;
    }

    /**
     * Verify Sign-in procedure.
     * 
     * @param theUsername username for sign-in
     * @param thePassword password for signin
     * @return sign-in success
     */
    public boolean login(final String theUsername, final String thePassword) {

        // ------------Fill in--------------------//
        Objects.requireNonNull(theUsername);
        Objects.requireNonNull(thePassword);
        
        if (theUsername.isEmpty() || thePassword.isEmpty()) {
            throw new IllegalArgumentException("Username or password cannto be empty");
        }
        
        final User userAccount = myUserList.get(theUsername);
        
        return userAccount != null && userAccount.getMyPassword().equals(thePassword);
    }

    /**
     * Adds a user to the registered user list.
     * 
     * @param theUser an order to add to this shopping cart
     * @return true/false returns if registration is successful
     */
    public boolean register(final User theUser) {

        // ------------Fill in--------------------//
        myUserList.put(theUser.getMyName(), theUser);
        FileLoader.writeUserToFile(USERFILE_NAME, theUser);
        return true;

    }

    /**
     * Empties the user list.
     */
    public void clear() {

        // ------------Fill in--------------------//
        myUserList.clear();
    }

    @Override
    /**
     * String representation of the object
     * 
     */
    public String toString() {

        // ------------Fill in--------------------//
        return "Registered User List: " + myUserList.toString();
    }

}
