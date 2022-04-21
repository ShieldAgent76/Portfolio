import java.util.Scanner; 
import java.io.File;
import java.io.FileNotFoundException; 
import java.io.IOException;    
import java.io.BufferedWriter; 
import java.io.FileWriter;

/**
 * Martin Lillo
 */
public class HW_Arrays
{    
    public static void main(String[] args)
    {
        // variables
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Mass: ");
        int mass = input.nextInt(); // kg
        System.out.println("Enter the Cross Sectional Area: ");
        float crossSectionalArea = input.nextFloat(); // m^2
        System.out.println("Enter the Drag Coefficient: ");
        float dragCoefficient = input.nextFloat(); // unitless
        System.out.println("Enter the Time: ");
        int time = input.nextInt(); // sec
        System.out.println("Enter the Time Step: ");
        double timeStep = input.nextDouble(); // difference in time
        double airDensity = 1.14; // kg/m^3
        double gravity = 9.81; // m/s^2
        double velocity; // m/s
        System.out.println("Calculating Velocity...");
        
        // velocity calculation
        velocity = (time - timeStep) + (gravity - ((dragCoefficient * crossSectionalArea * airDensity) 
                    / (2 * mass)) * Math.pow(time - timeStep,2)) * timeStep;                                
        
        double[] timeArray = new double[160];
        double[] velocityArray = new double[160];
        
        double timeAdded = 0;
        
        for (int i = 0; i < timeArray.length; i++)
        {
            timeArray[i] = timeAdded;
            timeAdded = timeStep + timeAdded;
            System.out.println(timeArray[i]);
        }
        
        for (int i = 0; i < velocityArray.length; i++)
        {
            velocityArray[i] = velocity;
            System.out.println(velocityArray[i]);
        }
        
        // Exporting as a .csv file    
        FileWriter fw = null;
        BufferedWriter writer = null;
        try 
        {
          fw = new FileWriter("output.csv");
          writer = new BufferedWriter(fw);
          writer.write("Time,Velocity\n");
          for(int i = 0; i < timeArray.length; i++) 
          {
            String line = "" + timeArray + ", " + velocityArray + "";
            writer.write(line);
          }
          writer.close();
        }
        
        catch (IOException e) 
        {
          e.printStackTrace();
        }
        
        System.out.println("Thank you and have a nice day!");
    }
        
    private int testMethod(int a, int b) 
    {
       if(a < 100) 
       {
           return 100 * a + b;
       } 
       
       else 
       {
           return a + b;
       }
    }
}
