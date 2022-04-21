/*
 * java generics.
 */

package generics;

/**
 * 
 * 
 * @author athirai
 * @version 1.0
 * @param <T> generic class example
 * 
 */
public class GenericClass<T> {
    /**
     * generic field of type T.
     */
    private T myElement;

    /**
     * constructor.
     * 
     * @param theObj parameter.
     */
    public GenericClass(final T theObj) {
        this.myElement = theObj;
    }

    /**
     * getter.
     * 
     * @return T.
     */
    public T getElement() {
        return myElement;
    }

    /**
     * main function.
     * 
     * @param theArgs arguments.
     */
    public static void main(final String[] theArgs) {
        final GenericClass<String> obj1 = new GenericClass<String>("Hello");

        final GenericClass<Integer> obj2 = new GenericClass<Integer>(40);

        System.out.println(obj1.getElement() + " " + obj2.getElement());

    }

}
