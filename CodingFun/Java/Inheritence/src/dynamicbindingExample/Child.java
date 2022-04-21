/*
 * TCSS 305
 * 
 * Class for inheritence example
 */

package dynamicbindingExample;



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
     * re-define sayHello().
     * 
     * class method. cannot override a static method cannot override a private method
     *@param theParent parameter
     */
    @Override
    public void sayHello(final Parent theParent) {
        System.out.println("Child says Hello, object passed is: "+theParent.getMyVar());
    }

 
    /**
     * @main function
     * @param theArgs arguments
     * @throws Exception
     * 
     */
    public static void main(final String[] theArgs) {

        final Parent parent = new Parent("parent");
        final Child child = new Child("child");
        final Parent childAsParent = new Child("child As Parent");
        
        //Parents sayhello is called
//        parent.sayHello(parent);
//        
//        //childs sayhello is called
//        child.sayHello(parent);
//        
//        //childs sayhello is called. For overrided methods, binding is resolved using object information
//        childAsParent.sayHello(parent);
        
        Parent.printDivider();
        
       parent.sayHello(child);
        child.sayHello(child);
        childAsParent.sayHello(child);
        
        Parent.printDivider();
        
       parent.sayHello(childAsParent);
        child.sayHello(childAsParent);
        childAsParent.sayHello(childAsParent);

    }

}
