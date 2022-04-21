/*
 * TCSS 305
 * 
 * Class for inheritence example
 */

package exercises.dynamicbinding;

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
     * overided walk.
     * 
     * @param theAnimal parameter e.
     */
    @Override
    public void walk(final Animal theAnimal) {
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
        cat.walk(animal); // Cat Walking: Animal
        cat.walk(cat); // Cat Walking: Cat
        catAsAnimal.walk(animal); // Cat Walking: Animal
        catAsAnimal.walk(cat); // Cat Walking: Cat
        ((Cat)catAsAnimal).walk(cat); // Cat Walking: Cat
        
    }

}
