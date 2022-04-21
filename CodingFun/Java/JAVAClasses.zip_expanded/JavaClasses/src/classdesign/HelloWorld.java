/*
 * This is an example on class design
 */

package classdesign;

/**
 * This class shows how to add fields and members.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public class HelloWorld {
    
    /**
     * private variable.
     */
    private int myVar1;

    public int getMyVar1() {
        return myVar1;
    }

    public void setMyVar1(final int theVar1) {
        this.myVar1 = theVar1;
    }

    public static void main(final String[] theArgs) {

        final HelloWorld h = new HelloWorld();

        System.out.println(h.getMyVar1());

        h.setMyVar1(2);

    }

}
