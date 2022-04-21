/*
 * TCSS 305
 * 
 * Class for arrayList example
 */

package exercises;

import java.util.ArrayList;

/**
 * This demonstrates the use of ArrayList.
 * @author athirai
 * @version 1.0
 *
 */
public final class ArrayListExercise {
    
    /**
     * private constructor for utility class.
     * 
     */
    private ArrayListExercise() {

    }
    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {
        
        //1. create an Character array list of 26 characters (a-z) and print them
        final ArrayList<Character> alphabet = new ArrayList<Character>();
        
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        
        System.out.println(alphabet);
       
        //2. remove the 25th character (index=25) from the list
        alphabet.remove(25);
        System.out.println(alphabet);
    }

}
