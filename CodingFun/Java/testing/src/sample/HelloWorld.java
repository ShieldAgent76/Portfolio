/*
 * TCSS 305
 * 
 * Test Class example
 */

package sample;

/**
 * This demonstrates HelloWorld class which will be tested using JUnit.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public class HelloWorld {

    /**
     * myVar1 instance field.
     */
    private int myVar1;

    /**
     * paramterized Constructor.
     * 
     * @param theVar1 parameter for constructor.
     */
    public HelloWorld(final int theVar1) {

        this.myVar1 = theVar1;
    }

    /**
     * getter for myVar1.
     * 
     * @return myVar1
     */
    public int getMyVar1() {
        return myVar1;
    }

    /**
     * setter for myVar1.
     * 
     * @param theVar1 paramater
     */
    public void setMyVar1(final int theVar1) {
        this.myVar1 = theVar1;
    }

}
