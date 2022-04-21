/*
 * TCSS 305
 * 
 * Class for inheritence example
 */

package dynamicbindingExample;

/**
 * Represents the parent class.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public class Parent { // abstract class cannot be instantiated

    /**
     * instance field.
     */
    private String myVar;


    /**
     * constructor.
     * 
     * @param theString parameter for constructor
     */
    public Parent(final String theString) {
        System.out.println("I am the parent's overloaded constructor");
        myVar = theString;
    }

    /**
     * getter for myVar.
     * 
     * @return myVar
     */
    public String getMyVar() {
        return myVar;
    }

    /**
     * setter for myVar.
     * 
     * @param theVar parameter for setter.
     */
    public void setMyVar(final String theVar) {
        this.myVar = theVar;
    }
    /**
     * class method. cannot override a static method cannot override a private method
     * @param theParent parameter
     */
    public void sayHello(final Parent theParent) {
        System.out.println("Parent says Hello, object passed is: "+theParent.getMyVar());
    }


    /**
     * formatting.
     */
    public static void printDivider() {
        System.out.println();
        System.out.println("******************************");
        System.out.println();
    }


}
