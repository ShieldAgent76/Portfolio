/*
 * TCSS 305
 * 
 * Class for inheritence example
 */

package exercises.staticbinding;

/**
 * Represents the child class.
 * 
 * @author athirai
 * @version 1.0
 *
 */
public class Cat extends Animal {

  

    /**
     * parameterized constructor.
     * 
     * @param theName parameter representing animal name.
     */
    public Cat(final String theName) {
        super(theName);
    }


    
    /**
     * overloaded walk.
     * 
     * @param theAnimal parameter e.
     */
    public void walk(final Cat theAnimal) {
        System.out.println("Cat Walking: " + theAnimal.getMyName());
    }


    /**
     * @main function
     * @param theArgs arguments
     * 
     */
    public static void main(final String[] theArgs) {
        
        final Animal animal = new Animal("Animal");
        final Cat cat = new Cat("Cat");
        final Animal catAsAnimal = new Cat("CatAsAnimal");
        
        //what will be the output for:
        animal.walk(animal); // Animal Walking: Animal
        animal.walk(cat); // Animal Walking: Cat
        cat.walk(animal); // Animal Walking: Animal
        cat.walk(cat); // Cat Walking: Cat
        catAsAnimal.walk(animal); // Animal Walking: Animal
        catAsAnimal.walk(cat); // Animal Walking: Cat 
        ((Cat)catAsAnimal).walk(cat); // Cat Walking: Cat
        
    }

}
