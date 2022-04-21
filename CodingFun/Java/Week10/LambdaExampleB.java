
package exercisesLambdaexpressions;

import lambdaexpressions.FunctionalInterface;

/**
 * 
 * 
 * @author athirai
 * 
 *         create individual lambda expressions for +, -, /, * using the functional interface
 *
 */
public final class LambdaExampleB {

    /**
     * private constructor for utility classes.
     */
    private LambdaExampleB() {

    }
    
    /**
     * Main method.
     * 
     * @param theArgs arguments.
     */
    public static void main(final String[] theArgs) {
    
        final FunctionalInterface add = n -> n + n;
        System.out.println(add.calculate(5));
        
        final FunctionalInterface subtract = n -> n - n;
        System.out.println(subtract.calculate(5));
        
        final FunctionalInterface multiply = n -> n * n;
        System.out.println(multiply.calculate(5));
        
        final FunctionalInterface divide = n -> n / n;
        System.out.println(divide.calculate(5));
    }
}