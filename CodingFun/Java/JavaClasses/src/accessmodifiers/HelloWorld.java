/*
 * This is an example on access modifier
 */

package accessmodifiers;

/**
 * 
 * This class demonstrates the use of private, public, protected and default modifiers.
 * 
 * @author athirai
 * @version 1.0
 * 
 *
 */
// cannot make this top class private
public class HelloWorld {
    
    
    /**
     * this field is default/package and can be accessed within the package.
     */
    int myVar4;
    
    /**
     * this public field can be accessed anywhere outside the class.
     */
    public int myVar2;
    
    /**
     * this protected field can be accessed only within the same package or subclass in different package.
     */
    protected int myVar3;
    
    /**
     *  this private field can be accessed only within the class.
     */
    private int myVar1;
    
   

    private int getMyVar1() {
        return myVar1;
    }

    
    private void setMyVar1(final int theVar1) {
        this.myVar1 = theVar1;
    }

   

    public int getMyVar2() {
        return myVar2;
    }

    public void setMyVar2(final int theVar2) {
        this.myVar2 = theVar2;
    }

   

    protected int getMyVar3() {
        return myVar3;
    }

    protected void setMyVar3(final int theVar3) {
        this.myVar3 = theVar3;
    }

    
    int getMyVar4() {
        return myVar4;
    }

    void setMyVar4(final int theVar4) {
        this.myVar4 = theVar4;
    }

    public static void main(final String[] theArgs) {

        final HelloWorld h = new HelloWorld();

        System.out.println(h.myVar1);
        System.out.println(h.myVar2);
        System.out.println(h.myVar3);
        System.out.println(h.myVar4);

        System.out.println(h.getMyVar1() + " " + h.getMyVar2() + " " + h.getMyVar3() + " "
                           + h.getMyVar4());

        h.setMyVar1(1);
        h.setMyVar2(2);
        h.setMyVar3(3);
        h.setMyVar4(4);

        System.out.println(h.myVar1 + " " + h.myVar2 + " " + h.myVar3 + h.myVar4);

    }

}
