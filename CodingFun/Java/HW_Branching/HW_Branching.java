import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Author: Martin Lillo
 */
public class HW_Branching {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the sales for Store 1:");
        double store1 = input.nextDouble();

        System.out.println("Enter the sales for Store 2:");
        double store2 = input.nextDouble();

        System.out.println("Enter the sales for Store 3:");
        double store3 = input.nextDouble();

        System.out.println("Enter the sales threshold:");
        double threshold = input.nextDouble();

        whichDidGreat(store1, store2, store3, threshold);
    }
    
    public static void whichDidGreat(double store1, double store2, double store3, double threshold)
    {
        DecimalFormat df = new DecimalFormat("###.##");

        double average = 0;

        String result = "\n";

        if (store1 > threshold && store2 > threshold && store3 > threshold) 
        {
            result += "Store 1, 2, and 3 did great!";
            average = (store1+store2+store3)/3;
        }
        else if(store1 > threshold && store2 > threshold )
        {
            result += "Store 1 and 2 did great!";
            average = (store1+store2)/2;
        }
        else if(store1 > threshold && store3 > threshold )
        {
            result += "Store 1 and 3 did great!";
            average = (store1+store3)/2;
        }
        else if(store2 > threshold && store3 > threshold )
        {
            result += "Store 2 and 3 did great!";
            average = (store2+store3)/2;
        }
        else if(store1 > threshold){
            result += "Store 1 did great!";
            average = (store1);
        }
        else if(store2 > threshold){
            result += "Store 2 did great!";
            average = (store2);
        }
        else if(store3 > threshold)
        {
            result += "Store 3 did great!";
            average = (store3);
        }
        else
        {
            result += "No store met the threshold. \nWe need to increase sales.";
        }

        System.out.println(result);

        if (!(result.equals("\nNo store met the threshold. \nWe need to increase sales.")))
        {
            System.out.println("The average sales for exceeding stores: " +df.format(average));
        }
    }
}
