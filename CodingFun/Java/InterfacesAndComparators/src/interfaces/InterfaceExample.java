/*
 * TCSS 305
 * 
 * Class for interface example
 */

package interfaces;

/**
 * 
 * @author athirai
 * @version 1.0
 *
 */
public class InterfaceExample implements MyInterface, YourInterface {

    /**
     * Implementing the abstract method from MyInterface.
     */
    @Override
    public void sayHello() throws Exception {
        System.out.println("hello from InterfaceExample");

    }

    /**
     * Implementing the abstract method from YourInterface.
     */
    @Override
    public void sayHi() {
        System.out.println("hi from InterfaceExample");

    }

    /**
     * @main function
     * @param theArgs arguments
     * @throws Exception throws exception
     * 
     */
    public static void main(final String[] theArgs) throws Exception {

        final InterfaceExample example = new InterfaceExample();

        example.sayHello();

        System.out.println(MyInterface.MY_HELLO);

        // MyInterface.myHello = "Hi";

        MyInterface.sayHelloStatic();

        example.sayHelloDefault();

    }

}
