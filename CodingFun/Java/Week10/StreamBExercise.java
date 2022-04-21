/*
 * streams.
 */
package exercisesStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * 
 * @author athirai
 * @version 1.0. Stream creation.
 *
 */

public class StreamBExercise {

    /**
     * 
     * create a stream map operation to convert a list of numbers to their squares. The return
     * value must be a list
     */
    public List<Integer> mapOperation(List<Integer> intList) {
        final List<Integer> intStream = intList.stream().map(i -> i * i).collect(Collectors.toList());
        return intStream;
    }



    /**
     * 
     * create a stream filter operation to remove the even numbers from a given list of numbers
     * 
     */

    public void filterOPeration(List<Integer> intList) {
        intList.stream().filter(i -> i % 2 > 0).forEach(System.out::println);
    }

    /**
     * 
     * create a stream pipeline to count the number of distinct odd numbers after squaring the
     * numbers in a given list
     * 
     * 
     */

    public int pipeline(List<Integer> intList) {
        final List<Integer> intStream = intList.stream().map(i -> i * i).collect(Collectors.toList());
        
        int oddNum = 0;
        
        for (int i = 0; i < intStream.size(); i++) {
            if (intStream.get(i) % 2 == 0) {
                oddNum += intStream.get(i);
            }
        }
        
        return oddNum;
    }

    /**
     * 
     * create a stream reduce operation to find the maximum number in a list
     * 
     * 
     */
    public void reduce(List<Integer> intList) {
        final Optional<Integer> maxNum = intList.stream().reduce((int1, int2) -> int1 > int2 ? int1 : int2);
        maxNum.ifPresent(System.out::println);
    }
    
    /**
     * Main method.
     * 
     * @param theArgs arguments.
     */
    public static void main(final String[] theArgs) {
       final List<Integer> tempList = new ArrayList<Integer>();
        tempList.add(1);
        tempList.add(2);
        tempList.add(3);

        final StreamBExercise str = new StreamBExercise();

        System.out.println(str.mapOperation(tempList));
        str.filterOPeration(tempList);
        System.out.println(str.pipeline(tempList));
        str.reduce(tempList);
    }
}
