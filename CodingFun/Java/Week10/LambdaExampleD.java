
package exercisesLambdaexpressions;

import lambdaexpressions.StringInterface;

/**
 * 
 * 
 * @author athirai
 *
 *         Create a lambda expression to print the ascii value of the characters in a string
 *         using the StringInterface
 *
 */

public final class LambdaExampleD {

    /**
     * private constructor for utility classes.
     */
    private LambdaExampleD() {

    }

    /**
     * Main method.
     * 
     * @param theArgs arguments.
     */
    public static void main(final String[] theArgs) {

        final StringInterface s1 = (String str) -> {
           
            String asciiString = "";
            
            for (int i = 0; i <= str.length() - 1; i++) {
                asciiString += (int) str.charAt(i) + " ";
            }
            
            return asciiString;
        };
       
        final String statement = s1.stringprocessing("UW Huskies");
        System.out.print(statement);
    }

}

