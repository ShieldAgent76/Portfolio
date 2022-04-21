/*
 * TCSS 305
 * 
 * Interface example
 */

package interfaces;

/**
 * Class which implements Interface.
 * 
 * @author athirai
 * @version 1.0
 */
public class MyInterfaceExample implements MyInterface, YourInterface {

    /**
     * Implementing the abstract method.
     */
    @Override
    public void sayHello() throws Exception {
        System.out.println("Say Hello");

    }

    /**
     * Main method.
     * 
     * @param theArgs arguments to main.
     * @throws Exception exception is thrown.
     */
    public static void main(final String[] theArgs) throws Exception {

        final MyInterfaceExample example = new MyInterfaceExample();
        example.sayHello();
        example.sayHelloDefault();
        MyInterface.sayHelloStatic();

    }

    /**
     * methods from YourInterface.
     */
    @Override
    public void sayHi() {
        System.out.println("Hi");

    }

}
