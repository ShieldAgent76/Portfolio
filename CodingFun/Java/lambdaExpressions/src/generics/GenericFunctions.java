/*
 * generics example.
 */

package generics;

/**
 * 
 * 
 * @author athirai
 * @version 1.0 Generic Functions
 * 
 *          The generic method should print the square of the number if the element is of type
 *          Integer; 10 mins
 */
public class GenericFunctions {

    /**
     * generic function.
     * 
     * @param <T> type T.
     * @param theObj parameter.
     */
    public <T> void genericMethod(final T theObj) {
        System.out.println(theObj.getClass().getName());

    }

    /**
     * main function.
     * 
     * @param theArgs arguments.
     */
    public static void main(final String[] theArgs) {

        final GenericFunctions f = new GenericFunctions();

        f.genericMethod(15);
        f.genericMethod("Hi");
    }
}
