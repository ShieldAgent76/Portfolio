/*
 * This class has unresolved issues which should be reported by Eclipse and plugin tools.
 * This class can be used to verify that Eclipse and plugin tools are correctly identifying issues.
 * 
 * Checkstyle should report over 40 warnings.
 * SpotBugs should report 4 warnings
 * PMD should report 11 warnings
 */

/**
 *  A class with many warnings.
 */
public class many_warnings {
    
    int a = 100;
    
    static int NUM = 42;

    /**
     * @param args
     */
    public static void main(String[] args) { 
        System.out.println("Hello World!");
        
        many_warnings m = new many_warnings();
        m.complexMethod();
    }
    
    private int complexMethod()
    {
        int x = 0;
        int a = 0;
        final int b = 1;
        final int c = 2;
        final int y = 0;
        
        if (a > x || b>c || c > a) {
            if (a > x) {
                x++;
            } else if (a == c && b == c) {
                --x;
                return x > b? x:b;
            }
        } else if (a < x || b < 0) {
            a += 2;
        } else if (a == x) {
            a -= 2;
        } else {
            a = 0;
        }
        
        int i = 1;
        while (i > 0) {
            NUM++;
            System.out.println("How many times will this print?");
        }
        
        return x;
    }
    
    private void unusedMethod() {
        System.out.println("This will never print");
    }
    
    public String toString()
    {
        return null;
    }
    
    public boolean equals(Object o) {
        return true;
    }

}
