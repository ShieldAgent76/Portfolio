/*
 * lambda expressions.
 */

package lambdaexpressions;

/**
 * 
 * 
 * @author athirai
 * @version 1.0. Simple Lambda Example.
 *
 */
public final class LambdaExampleC {

    /**
     * private constructor for utility classes.
     */
    private LambdaExampleC() {

    }

    /**
     * Main method.
     * 
     * @param theArgs arguments.
     */
    public static void main(final String[] theArgs) {

        StringInterface s1 = (String str) -> { // note argument for lambda expression can
                                               // include data type

            String reverseString = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reverseString = reverseString + str.charAt(i);

            }

            return reverseString;
        };

        String reversed = s1.stringprocessing("CSS305");

        System.out.println(reversed);

    }

}
