import java.util.Scanner;

/**
 * Martin Lillo
 * 
 * This is a constructor for the main method ReportDriver.
 * the objective of the Race method is to get user input of the racers.
 */
public class Race
{
    private double racer1;
    private double racer2;
    private double racer3;
    
    boolean first = true;
    
    public Race()
    {
        raceTimes(); 
        sortTimes(); 
    }
    
    public void raceTimes()
    {
        System.out.println("Enter the race times of the three racers (in seconds): ");
        
        Scanner userInput = new Scanner(System.in);
        
        racer1 = userInput.nextDouble();
        racer2 = userInput.nextDouble();
        racer3 = userInput.nextDouble();
        
        System.out.println();
    }
    
    public void sortTimes()
    {
        if (racer1 > racer2)
        {
            double temp = racer1;
            racer1 = racer2;
            racer2 = temp;
        }

        if (racer2 > racer3)
        {
            double temp = racer2;
            racer2 = racer3;
            racer3 = temp;
        }

        if (racer1 > racer3) 
        {
            double temp = racer1;
            racer1 = racer3;
            racer3 = temp;
        }
    }   

    public String testTied()
    {
        if(racer1 == racer3 || racer1 == racer2)
        {
            if(racer1 == racer3 && racer1 == racer2)
            {
                first = true;
                return "All are tied for First.\n";
            }
            else
            {
                first = true;
                return "Some racers are tied for First \n";
            }
        }
        first = false;
        return "None are tied for First.\n";
    }

    public String testTiedSecond()
    {
        if(!first)
        {
            if(racer2 == racer3)
            {
                return "Two racers are tied for Second\n";
            }
            return "None are tied for Second.\n";
        }
        return "";
    }

    public String getRacerTimes()
    {
        return "First racer (time in seconds): " + racer1 + 
        "\nSecond racer (time in seconds): " + racer2 + 
        "\nThird racer (time in seconds): "+ racer3 + "\n";
    }
    
    public double range()
    {
        return racer3 - racer1;
    }
    
    public double average()
    {
        double total = racer1 + racer2 + racer3;
        return (total / 3);
    }
}
