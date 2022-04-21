/*
 * This is an example on access modifier
 */

package accessmodifiers;

/**
 * 
 * This class demonstrates the use of private, public, protected and default modifiers.
 * 
 * @author athirai
 * @version 1.0
 * 
 *
 */
public class HelloWorldSupport {

    public static void main(final String[] thArgs) {

        final HelloWorld h = new HelloWorld();

        /*
         * the field myVar1 is private and not visible outside the class the methods
         * getMyVar1(), setMyVar1() are private
         */
        System.out.println(h.myVar1);

        System.out.println(h.getMyVar1());

        h.setMyVar1(1);

        /*
         * the field myVar2 is public the methods getMyVar2(), setMyVar2() are public
         */

        System.out.println(h.myVar2);

        System.out.println(h.getMyVar2());

        h.setMyVar2(2);

        /*
         * the field myVar3 is protected and is visible only within the same package or
         * subclass in different package the methods getMyVar3(), setMyVar3() are private
         */

        System.out.println(h.myVar3);

        System.out.println(h.getMyVar3());

        h.setMyVar3(3);

        /*
         * the field myVar4 is visible only within the same package the methods getMyVar4(),
         * setMyVar4() are private
         */

        System.out.println(h.myVar4);

        System.out.println(h.getMyVar4());

        h.setMyVar4(4);

    }

}
