/*
 * TCSS 305
 * 
 * Class for arrayList example
 */

package collections;

import java.util.ArrayList;

/**
 * This demonstrates the use of ArrayList.
 * @author athirai
 * @version 1.0
 *
 */
public final class ArrayListExample {
    
    /**
     * private constructor for utility class.
     * 
     */
    private ArrayListExample() {

    }
    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {

        final int maxelements = 10;
        final ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < maxelements; i++) {
            list.add(i);
        }

        System.out.println(list);
        
        //removes the element at index 4 in the list 
        list.remove(4);

        System.out.println(list);

        System.out.println(list.get(0));

    }

}
