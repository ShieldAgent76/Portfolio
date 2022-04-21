/*
 * TCSS 305
 * 
 * Class for inheritence example
 */

package staticbindingExample;

/**
 * Represents the child class.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public class Child extends Parent {

    /**
     * child class constructor.
     * 
     * @param theName parameter for constructor
     */
    public Child(final String theName) {
        // call the parent class constructor first.
        super(theName);
        System.out.println("I am the child Constructor");
    }

    /**
     * overloaded parent method sayHello. This is an overloaded method 
     * 
     * @param theObject parameter.
     */
    public void sayHello(final Child theObject) {
        System.out.println("Child says Hello, object passed is " + theObject.getMyVar());
    }

    /**
     * @main function
     * @param theArgs arguments
     * @throws Exception
     * 
     */
    public static void main(final String[] theArgs) {

        // parents methods are accessible
        final Parent parent = new Parent("parent");

        // child's and parents methods are directly accessible
        final Child child = new Child("child");

        // parents methods are accessible because Type information is used
        final Parent childAsParent = new Child("child As Parent");

        // final Child2 parentAsChild = new Parent();

        // parent class sayhello
//        parent.sayHello(parent);
//        parent.sayHello(child);
//        parent.sayHello(childAsParent);
//
//        // parent class sayhello inherited by child
//        child.sayHello(parent);
//       child.sayHello(childAsParent);
//
//        // child class sayhello 
//        child.sayHello(child);
        
//
//        // parents methods is called because the type of ChildAsParent is Parent
        childAsParent.sayHello(parent);
        childAsParent.sayHello(child);
        childAsParent.sayHello(childAsParent);
//
//        // to access the child's methods, I can cast it to type Child2
//
//        ((Child) childAsParent).sayHello(child);

    }

}
