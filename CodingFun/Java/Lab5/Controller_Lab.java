import java.util.Scanner; // For user input

/**
 * Martin Lillo
 */

public class Controller_Lab 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    boolean doContinue = true;

    while(doContinue) 
    {
      System.out.println("Welcome! Enter a input for oribital calculations.");
      System.out.println("Orbital Velocity - 1");
      System.out.println("Orbital Period - 2");
      System.out.println("Orbital Charting - 3");
      System.out.println("Orbital Position - 4");
      System.out.println("Exit - 0");
      System.out.println("Enter Program: ");
      int userInput = input.nextInt(); // Take user input

      // Process input
      if (userInput == 1) 
      {
        System.out.println("Enter altitude: ");
        calcOrbitVelocity(userInput = input.nextInt());
        doContinue = true;
      }
      
      else if (userInput == 2) 
      {
        System.out.println("Enter altitude: ");
        calcOrbitalPeriod(userInput = input.nextInt());
        doContinue = true;
      }
      
      else if (userInput == 3) 
      {
        System.out.println("Enter altitude: ");
        chartOrbitalCharting(userInput = input.nextInt());
        doContinue = true;
      }
      
      else if (userInput == 4) 
      {
        System.out.println("Enter period (min) to find altitude: ");
        int result = calcOrbitalPosition(userInput = input.nextInt());
        System.out.println("The period is " + result);
        doContinue = true;
      }
      
      else if (userInput == 0) 
      {
        function0();
        doContinue = false;
      }
      
      else 
      {
        System.out.println("Unrecognized input.");
        doContinue = true;
      }
    } 
  } 
  
  public static double calcOrbitVelocity(int altitude) 
  {
    System.out.println("Calculating Orbital Velocity...");
    double gravConstant = 6.674e-11; // m^3 kg^-1 s^-2
    double earthMass    = 5.9722e24; // kg
    double earthRadius  = 6.37e6;    // meters
    
    double r  = earthRadius + altitude; // meters from gravitational center
    double gm = gravConstant * earthMass;  // m^3 s^-2

    double orbitalVelocity = Math.sqrt( gm / r );
    System.out.println( "Orbital velocity @ " + altitude + " m Above Ground Level (AGL) is: " + orbitalVelocity + " m/s");
    return orbitalVelocity;
  } 
  
  public static double calcOrbitalPeriod(int altitude) 
  {
    //System.out.println("Calculating Orbital Period...");
    double gravConstant = 6.674e-11; // m^3 kg^-1 s^-2
    double earthMass    = 5.9722e24; // kg
    double earthRadius  = 6.37e6;    // meters
    
    double radius = earthRadius + altitude;
    double tau = 2 * Math.PI;
    double circumference = tau * radius;
    //System.out.println("The circumference of a unit circle is: " + circumference);
    
    double r  = earthRadius + altitude; // meters from gravitational center
    double gm = gravConstant * earthMass;  // m^3 s^-2
    double velocity = Math.sqrt( gm / r );
    
    double orbitalPeriod = circumference / velocity;
    //System.out.println("The period is: " + orbitalPeriod);
    
    return orbitalPeriod;
  } 
  
  public static void chartOrbitalCharting(int altitude) 
  {
    System.out.println("Charting Orbital...");
    int maxAltitude = altitude * 1000; // meters
    System.out.println("AGL      Period (Hrs)");
    System.out.println("(KKM)    0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28");
    System.out.println("---------|-----------|-----------|-----------|-----------|-----------|-----------|-----------|");
    for(int i = 0; i < altitude; i++) 
    {
      int currAGL = i * 1000000;
      double currPeriod = calcOrbitalPeriod(currAGL);
      System.out.print( String.format("%3d      .", i));
      int indents = (int)((currPeriod*3) / 3600.0);
      for(int j = 0; j < indents; j++) 
      {
        System.out.print(" ");
      }
      System.out.println("X (" + (int)currPeriod + ")");
    }
    System.out.println();
  }

  public static int calcOrbitalPosition(int targetPeriod) 
  {
      int guessAlt = 409000;
      if (calcOrbitalPeriod(guessAlt) == targetPeriod) 
      {
        return guessAlt;
      }
      
      double guessResult = calcOrbitalPeriod(guessAlt);
      while (guessResult <= targetPeriod)
      {
          guessResult = calcOrbitalPeriod(guessAlt);
          guessResult++;
      }
      return guessAlt;
  } 
  
  public static void function0() 
  {
    System.out.println("Exiting...");
    System.out.println("Done! See Ya Later!");
  } 
} 
