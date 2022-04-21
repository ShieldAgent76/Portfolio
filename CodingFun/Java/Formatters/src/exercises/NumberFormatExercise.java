/*
 * TCSS 305
 * 
 * Class for numberformat, big decimal examples
 */

package exercises;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Demonstrates the use of Number format.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public final class NumberFormatExercise {

    /**
     * private constructor for utility class.
     * 
     */
    private NumberFormatExercise() {

    }

    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {

        final double number1 = 56890.34589;

        // 1. Print the above number in US format
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        System.out.println(nf.format(number1));

        // 2. Print the above number in Chinese format
        nf = NumberFormat.getInstance(Locale.CHINESE);
        System.out.println(nf.format(number1));

        // 3. Print the above number in US dollars
        nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf.format(number1));

    }
}
