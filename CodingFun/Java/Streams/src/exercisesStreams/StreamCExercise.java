/*
 * streams.
 */
package exercisesStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * 
 * @author athirai
 * @version 1.0. Stream creation.
 *
 */
public class StreamCExercise {

    /**
     * check if any of the last 10 numbers in the integer list are divisible by 7.
     * 
     * @param intList
     * @return boolean
     */
    public boolean checkDivisibility(final List<Integer> intList) {
        return intList.stream().skip(intList.size() - 10).anyMatch(num -> num % 7 == 0);
    }

    /**
     * print all the numbers from one to ten which end with e.
     * 
     */

    public void printNumbers() {
        final List<String> oneToTen = new ArrayList<String>();
        oneToTen.add("One");
        oneToTen.add("Two");
        oneToTen.add("Three");
        oneToTen.add("Four");
        oneToTen.add("Five");
        oneToTen.add("Six");
        oneToTen.add("Seven");
        oneToTen.add("Eight");
        oneToTen.add("Nine");
        oneToTen.add("Ten");
        
        oneToTen.stream().filter(str -> str.endsWith("e")).forEach(System.out::println);
    }

    public static void main(final String[] theArgs) {
        final StreamCExercise sC = new StreamCExercise();
        final List<Integer> numList = new ArrayList<>();
        for (int x = 0; x < 50; x++) {
            numList.add(x);
        }
        System.out.println(sC.checkDivisibility(numList));
        sC.printNumbers();
    }

}
