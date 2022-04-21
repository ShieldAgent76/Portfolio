/**
 * 
 */
package model;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import model.vehicles.AbstractVehicle;
import model.vehicles.Bicycle;
import model.vehicles.Car;
import model.vehicles.MotorBike;

/**
 * @author Martin Lillo
 * @version TCSS 305 Winter 2021 
 */
public class RentalManager {
    
    /**
     * Map for vehicles available.
     */
    private Map<Integer, AbstractVehicle> myVehicleList = new HashMap<>();
    
    /**
     * Map for bills for renting vehicles.
     */
    private Map<Integer, Bill> myBills;
    
    /**
     * Registration Object.
     */
    private Registration myRegistration;
    
    /**
     * Thank you message.
     */
    private final String myThankMessage = "Thank you for using the Rentz services!" + "\nHave a nice day.";
    
    /**
     * Vehicles available message.
     */
    private final String myVehiclesAvailable = "Vehicles available:";
    
    /**
     * Stars.
     */
    private final String myStars = "***********************";
    
    /**
     * Default/Starting Bill ID.
     */
    private int myNextBillID = 1;
    
    /**
     * RentalManager Constructor.
     * Initialize values for myRegistration
     * Initialize myVehicleList by calling generateInventory method
     * @param theRegistration
     */
    public RentalManager(final Registration theRegistration) {
        this.myRegistration = Objects.requireNonNull(theRegistration);
        generateInventory();
        myBills = new HashMap<>();
    }
    
    /**
     * generateInventory method.
     * @return Map<myVehicleID, Vehicle> myVehicleList
     */
    public Map<Integer, AbstractVehicle> generateInventory() {
        // vehicles in list
        final Car honda = new Car("Honda", "V100", true, false, false, false);
        final Car jeep = new Car("Jeep", "V101", false, false, true, false);
        final Car mercedesBenz = new Car("Mercedes Benz", "V102", false, true, true, true);
        final MotorBike harleyDavid = new MotorBike("Harley-Davidson", "B100", true, true);
        final MotorBike suzuki = new MotorBike("Suzuki", "B101", false, true);
        final Bicycle mountaineer = new Bicycle("Mountaineer", "C100", false, Bicycle.BikeType.Mountain);
        final Bicycle cycle = new Bicycle("Cycle", "C101", true, Bicycle.BikeType.Cruiser);
        final Bicycle starter = new Bicycle("Starter", "C102", true, Bicycle.BikeType.Hybrid);
        
        myVehicleList.put(honda.getMyVehicleID(), honda);
        myVehicleList.put(jeep.getMyVehicleID(), jeep);
        myVehicleList.put(mercedesBenz.getMyVehicleID(), mercedesBenz);
        myVehicleList.put(harleyDavid.getMyVehicleID(), harleyDavid);
        myVehicleList.put(suzuki.getMyVehicleID(), suzuki);
        myVehicleList.put(mountaineer.getMyVehicleID(), mountaineer);
        myVehicleList.put(cycle.getMyVehicleID(), cycle);
        myVehicleList.put(starter.getMyVehicleID(), starter);
        return myVehicleList;
    }
    
    /**
     * Get myVehicleList.
     * @return myVehicleList
     */
    public Map<Integer, AbstractVehicle> getMyVehicleList() {
        return myVehicleList;
    }
    
    /**
     * Get Registration object.
     * @return myRwgistration
     */
    public Registration getMyRegistration() {
        return myRegistration;
    }
    
    /**
     * User menu for rentz system.
     */
    public void printOptions() {
        boolean userContinue = true;
        
        while (userContinue) {
            final String choices = "Enter (1. Rent 2. Drop-off 3. Exit "
                            + "\n4. Vehicles by VIN" + "\n5. Vehicles by Rental Amount): ";
            System.out.print(choices);
            final int numInput = Registration.INPUT.nextInt();
            System.out.println("You entered option " + numInput);
            System.out.println();

            switch (numInput) {
                case 1:
                    printRent();
                    break;
                case 2:
                    printDrop();
                    break;
                case 3:
                    System.out.println(myThankMessage);
                    userContinue = false;
                    break;
                case 4:
                    printVehiclesVIN();
                    break;
                case 5:
                    printVehiclesRentalAmount();
                    break;
                default:
                    System.out.println("That is not a valid option.");
            }

            if (userContinue) {
                System.out.print("Do you want to continue? (true/false) ");

                final boolean answer = Registration.INPUT.nextBoolean();
                if (!answer) {
                    System.out.println(myThankMessage);
                    userContinue = false;
                }
            }
        }
    }
    
    /**
     * Method to rent vehicles.
     * @param theVehicleID
     * @param theUserName
     * @param theNumDays
     * @param theBillID
     * @return result
     */
    public boolean rent(final int theVehicleID, final String theUserName, final int theNumDays, final int theBillID) {
        boolean result = false;
        
        Objects.requireNonNull(theVehicleID);
        Objects.requireNonNull(theUserName);
        Objects.requireNonNull(theNumDays);
        Objects.requireNonNull(theBillID);
        
        if (theNumDays <= 0) {
            throw new IllegalArgumentException("Invalid number of days");
        }
        
        if (isRentable(theVehicleID) && myRegistration.getMyUserList().containsKey(theUserName)) {
            myVehicleList.get(theVehicleID);
            final Bill bill = new Bill(theBillID, myRegistration.getMyUserList().get(theUserName), myVehicleList.get(theVehicleID), theNumDays);
            myBills.put(bill.getMyBillID(), bill);
            System.out.println();
            printBill(System.out, theUserName, theVehicleID, bill);
            result = true;
        }
        return result;
    }
    
    /**
     * Method to drop off vehicle.
     * @param theVehicleID
     * @return result
     */
    public boolean drop(final int theVehicleID) {
        boolean result = false;
        
        final AbstractVehicle vehicle = myVehicleList.get(theVehicleID);
        if (vehicle == null) {
            System.out.println("Vehicle does not exist");
            result = false;
        } else if (vehicle.isMyRentalStatus()) {
            System.out.println("Vehicle is checked out already");
            result = false;
        } else {
            vehicle.setMyRentalStatus(true);
            result = true;
        }
        return result;
    }
    
    /**
     * Method to print out rental amount.
     */
    private void printRent() {

        int vehicleID;
        String userName;
        int numDays;

        System.out.println(myStars + myStars);

        System.out.println(myVehiclesAvailable);
        for (AbstractVehicle vehicle : myVehicleList.values()) {
            System.out.println(vehicle);
        }

        boolean foundVehicle = false;
        do {
            System.out.println(myStars);
            System.out.println(" Enter Rental Details");
            System.out.println(myStars);

            System.out.print("Enter Vehicle ID: ");
            vehicleID = Registration.INPUT.nextInt();

            System.out.print("Enter Username: ");
            userName = Registration.INPUT.next();

            System.out.print("Enter Number of Days to Rent: ");
            numDays = Registration.INPUT.nextInt();

            if (!isRentable(vehicleID)) {
                System.out.println("Vehicle not rentable");
            } else if (!myRegistration.getMyUserList().containsKey(userName)) {
                System.out.println("User does not exists, enter different user name:");
            } else {
                foundVehicle = true;
            }
        }
        while (!foundVehicle);

        if (rent(myNextBillID++, userName, vehicleID, numDays)) {
            System.out.println("Rent Successful");
            System.out.println(myStars);
        }
    }
    
    /**
     * Method that prints the bill.
     * @param theOutput
     * @param theUserName
     * @param theVehicleID
     * @param theBill
     */
    private void printBill(final PrintStream theOutput, final String theUserName, final int theVehicleID, final Bill theBill) {

        theOutput.println(myStars);
        theOutput.println(" Rental Bill Summary");
        theOutput.println(myStars);
        theOutput.println("User Name: " + theUserName);
        theOutput.println("----Vehicle Information----");
        theOutput.println("VehicleName " + myVehicleList.get(theVehicleID).getMyName());
        theOutput.println("VehicleID " + theVehicleID);
        theOutput.println("VehicleType "
                          + myVehicleList.get(theVehicleID).getClass().getSimpleName());

        theOutput.println("VIN " + myVehicleList.get(theVehicleID).getMyVIN());

        theBill.computeAndPrintAmount(theOutput);
    }

    private void printDrop() {

        System.out.println(myStars);
        System.out.println("Enter Drop-off Details");
        System.out.println(myStars);

        boolean droppedVehicle = false;
        while (!droppedVehicle) {
            System.out.print("Enter Drop-off Vehicle ID:");
            final int dropOffID = Registration.INPUT.nextInt();
            if (drop(dropOffID)) {
                droppedVehicle = true;
                System.out.println("Drop-off Successful");
            }
        }
        System.out.println(myStars);
    }
        
    /**
     * Private method to print all vehicles sorted by VIN.
     */
    private void printVehiclesVIN() {
        System.out.println(myVehiclesAvailable);
        final List<AbstractVehicle> sortedVehicles = new ArrayList<>(myVehicleList.values());
        sortedVehicles.sort(Comparator.comparing(AbstractVehicle::getMyVIN));
        for (AbstractVehicle vehicle : sortedVehicles) {
            final String vehicleInfo = vehicle.toString();
            System.out.println(vehicleInfo);
        }
    }
    
    /**
     * Private method to print all vehicles sorted by rental amount.
     */
    
    private void printVehiclesRentalAmount() {
        System.out.println(myVehiclesAvailable);
        final List<AbstractVehicle> sortedVehicles = new ArrayList<>(myVehicleList.values());
        sortedVehicles.sort(Comparator.comparing(AbstractVehicle::calculateRentalAmount));
        for (AbstractVehicle vehicle : sortedVehicles) {
            final String vehicleInfo = vehicle.toString() + " - $" + vehicle.calculateRentalAmount() + " per day";
            System.out.println(vehicleInfo);
        }
    }
    
    /**
     * Method to check if vehicle is part on inventory.
     * @param theVehicleID
     * @return true if rental status is true
     */
    public boolean isRentable(final int theVehicleID) {
        final AbstractVehicle vehicle = myVehicleList.get(theVehicleID);
        return vehicle != null && vehicle.isMyRentalStatus();
    }
    
    /**
     * Method to clear vehicle and bill list.
     */
    public void clearLists() {
        myVehicleList.clear();
        myBills.clear();
    }
}
