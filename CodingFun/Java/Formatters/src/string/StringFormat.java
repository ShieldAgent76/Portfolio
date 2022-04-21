/*
 * TCSS 305
 * 
 * Class for string format examples
 */

package string;

import java.util.Locale;

/**
 * Demonstrates the use of String format.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public final class StringFormat {

    /**
     * private constructor for utility class.
     * 
     */
    private StringFormat() {

    }

    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {
        final String str1 = "TCSS305";

        // Concatenation of two strings
        final String str2 = String.format("Course is %s", str1);
        System.out.println(str2);

        // Output is given upto 6 decimal places
        final String str3 = String.format("Value is %.6f", 5.1245);
        System.out.println(str3);

        // Length of the integer is 15
        final String str4 = String.format("Value is %15d", 245);
        System.out.println(str4);

        // Length of the integer is 15
        final String str5 = String.format("Value is %015d", 245);
        System.out.println(str5);

        // Length is 15, no of decimal points is 8
        final String str6 = String.format(Locale.UK, "My answer is %015.8f", 2.455556);
        System.out.println(str6);

        // Length is 15, no of decimal points is 6
        final String str7 = String.format(Locale.GERMAN, "My answer is %15.6f", 2.455556);
        System.out.println(str7);

    }

}
