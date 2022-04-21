/*
 * TCSS 305
 * 
 * Class for string format examples
 */

package exercises;

import java.util.Locale;

/**
 * Demonstrates the use of String format.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public final class StringFormatterExercise {

    /**
     * private constructor for utility class.
     * 
     */
    private StringFormatterExercise() {

    }

    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {

        //Guess the output
        final String str1 = String.format("Value is %.8f", 43.578); // 43.57800000
        System.out.println(str1);

        final String str2 = String.format("%08d", 12); // 00000012
        System.out.println(str2);

        final String str3 = String.format(Locale.GERMAN, "%.4f", 12.3456); // 12,3456
        System.out.println(str3);

    }

}
