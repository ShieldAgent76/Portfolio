/*
 * TCSS 305
 * 
 * Class for inheritence example
 */

package inheritenceExample;

/**
 * Represents the parent class.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public abstract class AbstractParent { // abstract class cannot be instantiated

    /**
     * instance field.
     */
    private String myVar;

    /**
     * constructor.
     */
    public AbstractParent() {
        System.out.println("I am the parent constructor");
        myVar = "";
    }

    /**
     * class method.
     */
    public void sayHello() {
        System.out.println("Parent says Hello");
    }

    /**
     * abstract class method.
     * 
     * @param theString parameter for abstract method.
     */
    public abstract void sayAbstractHello(String theString);

    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {
        System.out.println("abstract class");
        // cannot instantiate an abstract class
        //final AbstractParent p1 = new AbstractParent();

    }

}
