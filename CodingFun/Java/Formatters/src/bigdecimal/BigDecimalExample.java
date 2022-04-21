/*
 * TCSS 305
 * 
 * Class for numberformat, big decimal examples
 */

package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Demonstrates the use of BigDecimal.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public final class BigDecimalExample {

    /**
     * private constructor for utility class.
     * 
     */
    private BigDecimalExample() {

    }

    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {

        final double d1 = 0.06;
        final double d2 = 0.07;
        System.out.println("Double subtraction " + (d2 - d1));

        // define big decimals instead
        final BigDecimal bd1 = new BigDecimal("0.06");
        final BigDecimal bd2 = new BigDecimal("0.07");
        System.out.println("BigDecimalSubtraction " + bd2.subtract(bd1));

        // convert double to bigdecimal
        System.out.println("Sub " + BigDecimal.valueOf(d2).subtract(BigDecimal.valueOf(d1)));

        // convert bigdecimal to double
        System.out.println(bd1.doubleValue() + " " + bd2.doubleValue());

        // define big decimals instead
        final BigDecimal bd3 = new BigDecimal("451797892.0966634421");
        final BigDecimal bd4 = new BigDecimal("977654320.124759789");

        System.out.println("Addition " + bd3.add(bd4));
        System.out.println("Subtraction " + bd3.subtract(bd4));
        System.out.println("Multiplication " + bd3.multiply(bd4));

        // https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html

        System.out.println("SetScale  " + bd3.setScale(3, RoundingMode.CEILING));
        System.out.println("SetScale " + bd3.setScale(3, RoundingMode.FLOOR));

        System.out.println("Division " + bd4.divide(new BigDecimal(2)));
        System.out.println("Pwer " + bd3.pow(2));
        System.out.println("Negate " + bd2.negate());

        System.out.println("Comapre " + bd3.compareTo(bd2));
        System.out.println("Equals " + bd3.equals(bd2));
        //
    }

}
