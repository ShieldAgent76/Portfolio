/*
 * TCSS 305
 * 
 * Class for arrayList example
 */

package exercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * This Demonstrates the use of HashMap.
 * @author athirai
 * @version 1.0
 *
 */
public final class HashMapExercise {
    
    /**
     * private constructor for utility class.
     * 
     */
    private HashMapExercise() {

    }
    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {

        //1. create a Hashmap with the following key value pairs {("one", 1), ("two", 2), ("three", 3)}
        final Map<String, Integer> numbers = new HashMap<String, Integer>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        
        //2. print all the key value pairs using iterator
        final Set<String> keys = numbers.keySet();
        Iterator<String> itr = keys.iterator();
        
        while (itr.hasNext()) {
            final String key = itr.next();
            System.out.println(key + " + " + numbers.get(key));
        }
        
        //3. replace  ("two", 2) with ("two", 4)
        numbers.put("two", 4);
        
        //4. print all the key value pairs using iterator
        itr = keys.iterator();
        while (itr.hasNext()) {
            final String key = itr.next();
            System.out.println(key + " + " + numbers.get(key));
        }
    }
}
