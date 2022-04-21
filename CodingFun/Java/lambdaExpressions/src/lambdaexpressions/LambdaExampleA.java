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
public final class LambdaExampleA {

    /**
     * private constructor for utility classes.
     */
    private LambdaExampleA() {

    }

    /**
     * Main method.
     * 
     * @param theArgs arguments.
     */
    public static void main(final String[] theArgs) {

        final FunctionalInterface f1 = (n) -> (n * n);

        System.out.println(f1.calculate(6));

        final FunctionalInterface f2 = (n) -> (n + n);

        System.out.println(f2.calculate(6));
    }

}
