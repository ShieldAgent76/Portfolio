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
public class Parent { // abstract class cannot be instantiated

    /**
     * instance field.
     */
    private String myVar;

    /**
     * constructor.
     */
    public Parent() {
        System.out.println("I am the parent constructor");
        myVar = "";
    }

    /**
     * overloaded constructor.
     * 
     * @param theString parameter for constructor
     */
    public Parent(final String theString) {
        System.out.println("I am the parent's overloaded constructor");
        myVar = theString;
    }

    /**
     * class method. cannot override a static method cannot override a private method
     */
    public void sayHello() {
        System.out.println("Parent says Hello");
    }

    /**
     * overloaded method sayHello().
     * 
     * @param theRank parameter for overloaded method.
     */
    public void sayHello(final int theRank) {
        System.out.println("Parent says overloaded Hello: " + theRank);
    }

    /**
     * formatting.
     */
    public static void printDivider() {
        System.out.println();
        System.out.println("******************************");
        System.out.println();
    }

    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {
        final Parent p1 = new Parent();
        p1.sayHello();

        // overloaded methods
        final Parent p2 = new Parent("Overloaded Constructor");
        p2.sayHello(2);
    }

}
