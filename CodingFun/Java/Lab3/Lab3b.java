
/**
 * Write a description of class Lab3b here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab3b
{
    public static void main( String[] args ) {
    boolean bool1 = 5 < 15;
    System.out.println(bool1); // true
    
    int n = 4;
    boolean bool2 = (n % 2 == 0);
    System.out.println(bool2); // true
    
    boolean bool3 = ! (bool2);
    System.out.println(bool3); // false
    
    boolean bool4 = (10 <= 100/10);
    System.out.println(bool4); // true
    
    int a = 3;
    int b = 5;
    boolean bool5 = a < b;
    System.out.println(bool5); // true
  }
}
