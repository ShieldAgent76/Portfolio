
/**
 * Write a description of class Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array
{
    public static void main(String[] args)
    {
        int[] data = {0, 35, 8, 24, 23};
        
        int sum = 0;
        for (int i = 0; i < data.length; i++)
            sum += data[i];
        
        double average = ((double) sum) / data.length;
        
        System.out.print(average);
    }
}
