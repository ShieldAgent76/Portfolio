/*
 * TCSS 305
 * 
 * Interface example
 */

package interfaces;

/**
 * Interface.
 * 
 * @author athirai
 * @version 1.0
 */
public interface MyInterface {

    /**
     * final static field.
     */
    static final String MY_HELLO = "Hello"; // should initialize this, //myHello is a
                                            // public, static and final field
    // can be accessed using the object of the class that implements MyInterface, a warning is
    // thrown

    /**
     * abstract method.
     * 
     * @throws Exception exception.
     */
    void sayHello() throws Exception; // abstract method

    /**
     * static method.
     */
    static void sayHelloStatic() { // cannot override this, not inherited and can be
                                   // accessed only using Interface name
        System.out.println("hello static");
    }

    /**
     * default method.
     */
    default void sayHelloDefault() { // cannot override this
        System.out.println("hello default");
    }
}
