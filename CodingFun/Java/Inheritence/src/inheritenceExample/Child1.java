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
public class Child1 extends Parent {

    /**
     * child class constructor.
     */
    public Child1() {
        // call the parent class constructor first.
        // super("hi");
        super(); //super is called by default only if the parent class has a parmaterless constrauctor
        System.out.println("I am the child");
    }

    /**
     * child method.
     */
    public void sayHi() {
        System.out.println("Child says Hi");
    }

    /**
     * @main function
     * @param theArgs arguments
     * @throws Exception
     * 
     */
    public static void main(final String[] theArgs) {
        final Child1 child = new Child1();

        System.out.println(child instanceof Parent);
        System.out.println(child instanceof Child1);
        System.out.println(new Parent() instanceof Child1);
       System.out.println(null instanceof Child1);

        printDivider();

        // child can call its methods
        child.sayHi();

        // child inherits the members of the parent class
        child.sayHello();
        child.sayHello(3);
        child.printDivider();

        // child can access only protected/public members of the class
        // child can access package members of the class if the parent and child
        // belongs to the same package
        //System.out.println(child.myVar);

        // child does not inherit the constructor
        //child.Parent();

    }

}
