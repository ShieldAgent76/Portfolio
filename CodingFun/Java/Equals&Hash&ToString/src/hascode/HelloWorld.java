
package hascode;

import java.util.Objects;

/**
 * 
 * 
 * @author athirai
 * @version 1.0
 *
 */
public class HelloWorld {

    /**
     * var1.
     */
    private double myVar1;
    /**
     * var2.
     */
    private double myVar2;

    /**
     * getter for myVar.
     * @return double value.
     */
    double getMyVar1() {
        return myVar1;
    }
    
    /**
     * 
     * @param theVar1
     * @param theVar2
     */
    public void setMyVar1(final double theVar1, final double theVar2) {
        this.myVar1 = theVar1;
        this.myVar2 = theVar2;
    }


    /**
     * Returns a String containing the variables : Helloworld (2, 3). The coordinates are
     * formatted to show 2 decimal places.
     * 
     * {@inheritDoc}
     */
    @Override
    public String toString() {

        final String format2places = "%.2f";
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName()); // the class name without the package name
        sb.append(" (");
        sb.append(String.format(format2places, myVar1));
        sb.append(", ");
        sb.append(String.format(format2places, myVar2));
        sb.append(')');

        return sb.toString();
    }

    /**
     * This method compares the myVar1, myVar2 to determine the equality of HelloWorld objects.
     * All 2 fields must be equal for 2 HelloWorld objects to be considered equal.
     * 
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object theOtherHelloWorld) {

        if (this == theOtherHelloWorld) { // reflexive
            return true;
        }

        if (theOtherHelloWorld == null) { // null
            return false;
        }

        if (getClass() != theOtherHelloWorld.getClass()) { // same class
            return false;
        }

        // return myVar1 == ((HelloWorld)theOtherHelloWorld).myVar1
        // && myVar2 == ((HelloWorld)theOtherHelloWorld).myVar2;

        return Double.compare(myVar1, ((HelloWorld) theOtherHelloWorld).myVar1) == 0
               && Double.compare(myVar2, ((HelloWorld) theOtherHelloWorld).myVar2) == 0;

        // return Math.abs(myVar1 - ((HelloWorld)theOtherHelloWorld).myVar1) < 0.0001 &&
        // Math.abs(myVar2 - ((HelloWorld)theOtherHelloWorld).myVar2) < 0.0001
    }

    @Override
    public int hashCode() {
        return Objects.hash(myVar1, myVar2);
    }

    public static void main(final String[] theArgs) {

        HelloWorld h1 = new HelloWorld();

        h1.setMyVar1(2.254, 3.45);

        HelloWorld h2 = new HelloWorld();

        h2.setMyVar1(2.254, 3.45);

        System.out.println(h1.equals(h2));
        System.out.println(h1.hashCode() + " " + h2.hashCode());
        System.out.println(h1 == h2);

    }

}
