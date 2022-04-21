/*
 * TCSS 305
 * 
 * Class for arrayList example
 */

package collections;

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
public final class HashMapExample {
    
    /**
     * private constructor for utility class.
     * 
     */
    private HashMapExample() {

    }
    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {

        final Map<String, Integer> m = new HashMap<String, Integer>();
        m.put("Newton", 1642);
        m.put("Darwin", 1809);

        System.out.println(m);
        System.out.println(m.get("Newton"));
        System.out.println(m.get("Issac"));

        System.out.println(m.containsKey("Darwin"));
        System.out.println(m.containsValue(1890999));
//
        m.remove("Newton");
        System.out.println(m);
//
        final Set<String> keys = m.keySet();
        Iterator<String> itr = keys.iterator();
//
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println(key + "-->" + m.get(key));

        }
        System.out.println("Use of iterator for the second time");
       itr = keys.iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println(key + "-->" + m.get(key));

        }

    }

}
