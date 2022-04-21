/*
 * functional interface.
 */

package lambdaexpressions;

/**
 * 
 * @author athirai
 * @version 1.0
 * @param <T>
 */

public interface GenericInterface<T> {
    /**
     * abstract action.
     * 
     * @param theObj parameter.
     */
    void compute(T theObj);
}
