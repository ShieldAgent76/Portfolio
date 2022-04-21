/*
 * TCSS 305
 * 
 * Class for inheritence example
 */

package exercises.inheritence;

import inheritenceExample.Child3;

/**
 * Represents the child class.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public class Cat extends AbstractAnimal {

    // Q1. extend the AbstractAnimal class
    // Q2. create a parameterized constructor with theName, it should call superclass
    // paramterized constructor
    public Cat(final String theName) {
        super(theName);
    }
   
    // Q3. In the main method create an object of cat and call the overloaded walking method
    // with parameter "slow"
    public static void main(final String[] theArgs) {
        final Cat cat1 = new Cat("Morgana");
        cat1.walk("slow");
        cat1.talk();
    }
    // Q4. Add un-implemented abstract method from parent and print "meow".
    public void talk() {
        System.out.println("meow");
    }
   
    // Q5. call the talk method from main function
    
}
