import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *Martin Lillo
 *
 *This is the method to report out race data
 */
public class RaceReport
{
    private Race Indianapolis500; 
    
    private DecimalFormat doublePrintAlt = new DecimalFormat("0.0#"); // used from GitHub and recommended from Dagem
    
    private Scanner userInput = new Scanner(System.in); 
    
    public RaceReport()
    {
        Indianapolis500 = new Race(); 
        testAndPrintReport(); 
        System.out.println("Thank you for using the Indie 500 simulation.");
        System.out.print("Have a great day! Go Roughnecks!");
    }
    
    public void testAndPrintReport()
    {
        System.out.println(Indianapolis500.testTied() + Indianapolis500.testTiedSecond());
        
        System.out.println(Indianapolis500.getRacerTimes());
        
        System.out.println("The range of the race times (in seconds): " +
        doublePrintAlt.format(Indianapolis500.range()) + "\n");
        
        System.out.println("The average time of all racers (in seconds): " +
        doublePrintAlt.format(Indianapolis500.average())+ "\n");
    }
}
