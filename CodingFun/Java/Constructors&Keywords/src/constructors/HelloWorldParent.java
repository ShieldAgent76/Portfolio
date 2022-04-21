/*
 * This is an example of a constructor
 */

package constructors;

/**
 * 
 * 
 * @author athirai
 * @version 1.0 This class shows different types of constructors.
 *
 */
public class HelloWorldParent {
    
    /**
     * protected variable.
     */
    protected int myVar1;

    /*
     * Default constructor: no constructor is explicitly defined. In the default constructor
     * all variables are initialized to default values 
     * Parameterless constructor: constructor with no parameters 
     * Parameterized constructor:constructor with parameters to initialize values of the fields 
     * Copy constructor: constructor with Object of the same class as parameter. The values of the object will be copied to the fields
     * 
     */

    // Parameterless Constructor
    public HelloWorldParent() { // A class can have more than 1 public constructor.
        myVar1 = 2;
    }

    // Parameterized Constructor
    public HelloWorldParent(final int theVar1) {
        this.myVar1 = theVar1;
    }

    // Copy Constructor
    // A class can have a private constructor. This cannot be called outside the
    // class. Utiliy classes which need not be initialized use private constructors
    private HelloWorldParent(final HelloWorldParent theObj) {
        this.myVar1 = theObj.getMyVar1();
    }

    public int getMyVar1() {
        return myVar1;
    }

    public void setMyVar1(final int theVar1) {
        this.myVar1 = theVar1;
    }

    public static void main(final String[] theArgs) {

        final HelloWorldParent h = new HelloWorldParent();

        System.out.println(h.myVar1);

        final HelloWorldParent hparameterized = new HelloWorldParent(3);

        System.out.println(hparameterized.myVar1);

        final HelloWorldParent hcopy = new HelloWorldParent(hparameterized);

        System.out.println(hcopy.myVar1);

    }
}
