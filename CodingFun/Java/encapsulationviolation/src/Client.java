/*
 * client class.
 */

import java.awt.Point;

/**
 * client class.
 * 
 * @author athirai
 * @version 1.0
 */
public final class Client {

    /**
     * private constructor.
     */
    private Client() {

    }

    /**
     * main function.
     * 
     * @param theArgs arguments.
     */
    public static void main(final String[] theArgs) {

        final String[] s = { "two", "three" };
        final Encapsulation e = new Encapsulation(new Point(2, 3), s, 'c');

        e.getPoint().setLocation(4, 5); // Can change the value of Point, 
        System.out.println(e.getPoint());

    }

}
