
package exercisesGenerics;

/**
 * 
 * 
 * @author athirai
 * 
 *         create a Generic class which can work with 2 Data Types <T, K>. It contains 1
 *         parameterized constructor, It has 2 class fields, one of type T and another of type
 *         K It has 2 getter functions each for the field associate with the generic type
 * 
 * 
 * @version 1.0
 */
public class GenericClassExample<T,K> {
    
    /**
     * Generic field.
     */
    private T myType;
    
    /**
     * Generic field 2.
     */
    private K myTypeK;
    
    /**
     * Constructor.
     * @param theT
     * @param theK
     */
    public GenericClassExample(final T theT, final K theK) {
        this.myType = theT;
        this.myTypeK = theK;
    }
    
    /**
     * Getter method.
     * @return myType
     */
    public T getElement() {
        return myType;
    }
    
    /**
     * Getter method for K type.
     * @return myTypeK
     */
    public K getElementK() {
        return myTypeK;
    }
}