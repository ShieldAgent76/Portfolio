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
public class Child2 extends Parent {

    /**
     * child class constructor.
     */
    public Child2() {
        // call the parent class constructor first.
        super();
        System.out.println("I am the child");
    }

    /**
     * child method.
     */
    public void sayHi() {
        System.out.println("Child says Hi");
    }

    /**
     * re-define sayHello().
     * 
     * class method. cannot override a static method cannot override a private method
     *
     */
    @Override
    public void sayHello() { 
        System.out.println("Child overrides Parents' Hello");
    }

    /**
     * re-define the overloaded parent method sayHello(int theRank).
     */
    @Override
    public void sayHello(final int theRank) {
        System.out.println("Child overrides Parents' overloaded Hello: " + theRank);
    }

    /**
     * overloaded sayHello.
     * 
     * @param theName parameter
     */
    public void sayHello(final String theName) {
        System.out.println("Child says overloaded Hello: " + theName);
    }

    /**
     * @main function
     * @param theArgs arguments
     * @throws Exception
     * 
     */
    public static void main(final String[] theArgs) {
        final Child2 child = new Child2();

        // own methods
        child.sayHi();

        // overrided methods
        child.sayHello();
        child.sayHello(3);

        // overloaded methods
        child.sayHello("child");

    }

}
