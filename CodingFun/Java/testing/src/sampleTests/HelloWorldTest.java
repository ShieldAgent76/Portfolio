/*
 * Test class for HelloWorld
 */

package sampleTests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import sample.HelloWorld;

/**
 * 
 * Sample Test Class.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public class HelloWorldTest {

    /**
     * Class object to be tested.
     */
    private HelloWorld myHello;

    /**
     * This function with @Before annotation is called before every testcase is executed.
     */
    @Before
    public void setUp() {
        myHello = new HelloWorld(3);

    }

    /**
     * This function with @Test annotation is a test case. This is a test method for
     * {@link HelloWorld#HelloWorld(int)}
     * 
     */
    @Test
    public void testHelloWorld() {
        assertNotNull("The object is null", myHello);

        assertEquals("Paramterized constructor failed", 3, myHello.getMyVar1());

        // assertTrue("Paramterized constructor failed", myHello.getMyVar1() == 3);

    }

    /**
     * This function with @Test annotation is a test case. This is a test method for
     * {@link HelloWorld#getMyVar1()}
     */
    @Test
    public void testGetVar1() {
        assertEquals("GetVar1 Failed", 3, myHello.getMyVar1()); // assert equals method, checks
                                                                // if the 2nd and the 3rd
                                                                // argument are equal. The
                                                                // first argument is the
                                                                // message printed when the
                                                                // assert fails. The fourth
                                                                // (optional) argument is
                                                                // tolerance

        // assertEquals("GetVar1 Failed", 3, myHello.getMyVar1(), 0);

        // assertEquals("GetVar1 Failed", 4, myHello.getMyVar1(), 1);

        assertNotEquals("GetVar1 Failed", 5, myHello.getMyVar1());

    }

    /**
     * This function with @Test annotation is a test case. This is a test method for
     * {@link HelloWorld#setMyVar1(int)}
     */
    @Test
    public void testSetVar1() {
        myHello.setMyVar1(3);

        assertEquals("SetVar1 Failed", 3, myHello.getMyVar1()); // assert equals method, checks
                                                                // if the 2nd and the 3rd
                                                                // argument are equal. The
                                                                // first argument is the
                                                                // message printed when the
                                                                // assert fails. The fourth
                                                                // (optional) argument is
                                                                // tolerance

        myHello.setMyVar1(4);
        assertEquals("SetVar1 Failed", 4, myHello.getMyVar1());

        assertEquals("GetVar1 Failed", 4, myHello.getMyVar1(), 0);

    }

    @Test(expected = NullPointerException.class)
    public void testNullObject() {
        HelloWorld h = null;
        h.getMyVar1();

    }
}
