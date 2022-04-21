/*
 * streams.
 */

package streamcreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * 
 * 
 * @author athirai
 * @version 1.0. Stream creation.
 *
 */
public final class StreamA {

    /**
     * creating empty stream.
     */
    public void createEmptyStream() {
        // Generic Stream Stream<T>
        final Stream<String> streamEmpty = Stream.empty();
    }
    
    
    /**
     * creating a stream from an array.
     */
    public void createStreamFromArray() {

        final String[] str = { "hi", "bye" };

        Stream<String> strStream = Arrays.stream(str);

        strStream = Stream.of("hi", "bye");

    }
    
    /**
     * creating a stream from list.
     */
    public void createStreamFromList() {
        final List<Integer> numList = new ArrayList<Integer>();
        numList.add(1);
        numList.add(5);
        numList.add(22);

        final Stream<Integer> integerStream = numList.stream();
    }
    
    /**
     * using builder.
     */
    public void createStreamFromBuilder() {

        final Stream<String> streambuilder = Stream.<String> builder().add("hi").add("bye").build();
    }
    
    
    /**
     * using generate.
     */
    public void createStreamFromGenerate() {

        final Random rnd = new Random();
        
        //generate 5 random integers.
        Stream.generate(rnd::nextInt).limit(5).forEach(System.out::println);
    }

    /**
     * using iterate.
     */
    public void createStreamFromInterate() {
        Stream.iterate(30, x -> x + 2).limit(3).forEach(System.out::println);
    }

    /**
     * Main method.
     * 
     * @param theArgs arguments.
     */
    public static void main(final String[] theArgs) {

        final StreamA s = new StreamA();
        s.createStreamFromList();
        s.createStreamFromArray();
        s.createStreamFromGenerate();
        s.createStreamFromInterate();
    }
}
