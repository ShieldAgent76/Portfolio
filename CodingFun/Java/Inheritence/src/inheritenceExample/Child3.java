/*
 * TCSS 305
 * 
 * Class for inheritence example
 */

package inheritenceExample;

/**
 * Represents the child class.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public class Child3 extends AbstractParent {

    /**
     * child class constructor.
     */
    public Child3() {
        // call the parent class constructor first.
        super();
        System.out.println("I am the child");
    }

    /**
     * re-define sayHello().
     */
    @Override
    public void sayHello() { // abstract method should not have function body
        System.out.println("Child calls Parents' Hello");
    }

    /**
     * implement abstract um-implemented method sayAbstractHello(String theString).
     */
    @Override
    public void sayAbstractHello(final String theString) {
        System.out.println("Child implements Parents' Asbtract Hello");

    }

    /**
     * @main function
     * @param theArgs arguments
     * @throws Exception
     * 
     */
    public static void main(final String[] theArgs) {
        final Child3 child = new Child3();

        child.sayHello();
        child.sayAbstractHello("child");

    }

}
