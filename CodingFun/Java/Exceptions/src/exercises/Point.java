/*
 * TCSS 305
 * 
 * Class for exception example
 */

package exercises;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * This demonstrates the use of exceptions.
 * 
 * @author Martin Lillo
 * @version 1.0
 *
 */
public final class Point { // utility class are final because they cannot be extended.

    /**
     * private constructor for utility class as no object is going to be created outside the
     * class.
     * 
     */
    private Point() {

    }

    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {

        // 1. create a HashMap with key as string type and value as integer type
        final Map<String, Integer> numbers = new HashMap<String, Integer>();
        
        // 2. add 2 key value pairs <"one",1>, <"two",2>
        numbers.put("one", 1);
        numbers.put("two", 2);
        
        // 3. iterate over key value pairs during which you need to remove each element from the map
        final Set<String> keys = numbers.keySet();
        final Iterator<String> itr = keys.iterator();
        
        // 4. concurrent modification exception will be thrown, you need to handle it using a try catch block
        try {
            while (itr.hasNext()) {
                final String key = itr.next();
                System.out.println(key + " + " + numbers.get(key) + " is removed.");
                numbers.remove(key);
            }
        } catch (final ConcurrentModificationException e) {
            System.out.println("Error: " + e);
        }
    }
}
