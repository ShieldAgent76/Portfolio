/*
 * TCSS 305
 * 
 * Class for inheritence example
 */

package staticbindingExample;

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
     * @param theVar parameter for constructor.
     */
    public Parent(final String theVar) {
        myVar = theVar;
        System.out.println("I am the parent's constructor");

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
     * sayHello().
     * 
     * @param theObject parameter for overloaded method.
     */
    public void sayHello(final Parent theObject) {
        System.out.println("Parent says Hello, object passed is: " + theObject.myVar);
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
