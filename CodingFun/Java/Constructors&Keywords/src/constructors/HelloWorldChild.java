/*
 * This is an example of a constructor
 */

package constructors;

/**
 * 
 * 
 * @author athirai
 * @version 1.0
 *
 *          This class shows how child class should call the parent class constructor
 */
public class HelloWorldChild extends HelloWorldParent {

    final char myChildVar = 'a';

    public HelloWorldChild() {
        super(2); // call the constructor of super class
    }

    public void printValues() {
        System.out.println(myChildVar + " " + myVar1);
    }

    // @Override
    // public HelloWorldParent() { //A class cannot inherit constructors from a parent class.
    //
    // }
    //

}
