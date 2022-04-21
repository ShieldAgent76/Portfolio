/*
 * lambda expressions.
 */

package lambdaexpressions;

/**
 * 
 * 
 * @author athirai
 * @version 1.0.
 *
 */
public final class LambdaExampleE {

    /**
     * private constructor for utility classes.
     */
    private LambdaExampleE() {

    }

    /**
     * Main method.
     * 
     * @param theArgs arguments.
     */
    public static void main(final String[] theArgs) {

        final GenericInterface<Integer> g1 = i -> System.out.println(i * i);

        final GenericInterface<String> g2 = (String s) -> System.out.println(s);

        g1.compute(4);
        g2.compute("bye");
    }

}
