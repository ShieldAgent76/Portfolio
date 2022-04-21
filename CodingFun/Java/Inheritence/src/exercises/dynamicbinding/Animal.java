/*
 * TCSS 305
 * 
 * Class for inheritence example
 */

package exercises.dynamicbinding;

/**
 * Represents the parent class.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public class Animal {


    /**
     * class field name of animal.
     */
    private String myName;

    /**
     * Parameterized constructor.
     * 
     * @param theName parameter name
     */
    public Animal(final String theName) {
        this.myName = theName;
    }

    /**
     * getter for myName.
     * 
     * @return myName
     */
    public String getMyName() {
        return myName;
    }

    /**
     * Setter for myName.
     * 
     * @param theName parameter.
     */
    public void setMyName(final String theName) {
        this.myName = theName;
    }



    /**
     * walk.
     * 
     * @param theAnimal parameter e.
     */
    public void walk(final Animal theAnimal) {
        System.out.println("Animal Walking: " + theAnimal.getMyName());
    }


}
