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
public class InterfaceInstanceExample implements MyInterface {
    /**
     * implementing abstract method.
     */
    @Override
    public void sayHello() throws Exception {
        System.out.println("say hello from InterfaceInstanceExample");

    }

    /**
     * class method.
     */
    public void sayByeMemberMethod() {
        System.out.println("say Bye from InterfaceInstanceExample");
    }

    /**
     * @main function
     * @param theArgs arguments
     * @exception Exception
     */
    public static void main(final String[] theArgs) throws Exception {

        final MyInterface interfaceReference = new InterfaceInstanceExample(); // implicit
                                                                               // casting,
        // upcasting

        interfaceReference.sayHello();

        interfaceReference.sayHelloDefault();

        // interface instance cannot access the class methods directly, downcast
        ((InterfaceInstanceExample) interfaceReference).sayByeMemberMethod();

        // can call any method of the object class
        System.out.println(interfaceReference.equals(new InterfaceInstanceExample()));

        System.out.println(interfaceReference.hashCode());

        System.out.println(interfaceReference.toString());

        System.out.println(interfaceReference instanceof MyInterface);

        System.out.println(interfaceReference instanceof YourInterface);

    }

}
