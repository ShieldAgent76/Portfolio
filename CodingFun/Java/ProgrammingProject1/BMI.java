
/**
 * Determining a person's BMI
 *
 * Martin Lillo
 * 
 */
public class BMI
{
    public static void main(String[] args)
    {
        int weight = 62; //in kilograms
        int height = 2; //in meters
        int BMI;
        
        BMI = (weight/(height * height));
        System.out.println("Weight in kilograms " + weight);
        System.out.println("Height in meters " + height);
        System.out.println("Your Body Mass Index is " + BMI);
    }
}
