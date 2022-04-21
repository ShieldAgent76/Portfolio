/*
 * TCSS 305
 * 
 * Class for numberformat, big decimal examples
 */

package bigdecimal;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Demonstrates the use of Number format.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public final class NumberFormatExample {

    /**
     * private constructor for utility class.
     * 
     */
    private NumberFormatExample() {

    }

    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {

        final double number1 = 123456.789;

        NumberFormat nf = NumberFormat.getInstance(Locale.US);

        System.out.println(nf.format(number1)); // output of format is a String

        nf = NumberFormat.getInstance(Locale.FRENCH);
        System.out.println(nf.format(number1));

        nf = NumberFormat.getInstance(Locale.ITALY);
        System.out.println(nf.format(number1));

        nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf.format(number1));

        nf = NumberFormat.getCurrencyInstance(Locale.FRENCH);
        System.out.println(nf.format(number1));

    }
}
