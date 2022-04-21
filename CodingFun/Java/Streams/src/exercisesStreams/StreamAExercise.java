/*
 * streams.
 */

package exercisesStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * 
 * @author athirai
 * @version 1.0. Stream creation.
 *
 */

public class StreamAExercise {

    /**
     * return a stream from a list of strings, if the list is empty, return an empty stream
     * 
     * @param strList
     * @return stream
     */
    public Stream<String> createStream1(final List<String> strList) {
       final Stream<String> stringStream = strList.stream();
       return stringStream;
    }

    /**
     * create a stream of 10 contiguous odd numbers starting from 101 and print them
     * 
     */

    public void createStream2() {
        Stream.iterate(101, x -> x + 1).limit(10).forEach(System.out::println);
    }

    /**
     * 
     * using iterate print the following series upto 20 elements 0 1 1 2 3 5 .....
     * 
     * 
     */

    public void series() {
        Stream.iterate(new int[] {0,1}, x -> new int[] {x[1], (x[1] + x[0])}).limit(20)
                        .forEach(x -> System.out.println(x[0]));
    }

    /**
     * Main method.
     * 
     * @param theArgs arguments.
     */
    public static void main(final String[] theArgs) {
        final StreamAExercise s = new StreamAExercise();
        s.createStream1(new ArrayList<String>());
        s.series();
        s.createStream2();
    }
}
