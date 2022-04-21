/*
   Author: Martin Lillo
   TO Do: Answer the folowing questions
   
      Test Input 							Exceptions
   java ExceptionDemo 100 4			___no exceptions_______________
   java ExceptionDemo 100 0			___ArithmeticException_______________
   java ExceptionDemo 100 four		___NumberFormatException_______________
   java ExceptionDemo 100 			   ___IndexOutOfBoundsException_______________
*/
public class ExceptionDemo {

    public static void main (String[] args) {
        System.out.println(divideArray(args));
    }

    private static int divideArray(String[] array) {
        try {
           String s1 = array[0];
           String s2 = array[1];  
           return divideStrings(s1, s2);
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Error. Index is out of bounds.");
        }
        return 0;    
    }

    private static int divideStrings(String s1, String s2) {
        try {
           int i1 = Integer.parseInt(s1);
           int i2 = Integer.parseInt(s2);
           return divideInts(i1, i2);
        }
        catch (NumberFormatException ex) {
            System.out.println("Error. Must be an integer");
        }
        return 0;
    }

    private static int divideInts(int i1, int i2) {
        if (i2 == 0) {
            throw new ArithmeticException("Error. Cannot divide by zero");
        }
        else {
            return i1 / i2;
        }
    }
}