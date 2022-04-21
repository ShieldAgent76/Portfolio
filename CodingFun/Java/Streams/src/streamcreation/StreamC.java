/*
 * streams.
 */
package streamcreation;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * 
 * @author athirai
 * @version 1.0. Stream operations.
 *
 */
public class StreamC {
    /**
     * list.
     */
    List<String> stringList = Arrays.asList("Hi", "bye", "see you", "save");
    
    /**
     * skip.
     */
    public void skipOperation() {
        stringList.stream().skip(1).forEach(System.out::println);
    }
    
    /**
     * match.
     */
    public void match() {
        boolean allMatch = stringList.stream().allMatch(str -> str.startsWith("s"));

        boolean anyMatch = stringList.stream().anyMatch(str -> str.startsWith("s"));

        System.out.println(allMatch + " " + anyMatch);

    }
    /**
     * Main method.
     * 
     * @param theArgs arguments.
     */
    public static void main(final String[] theArgs) {

        final StreamC stream = new StreamC();
        stream.skipOperation();
        stream.match();
    }

}
