/**
 * Martin Lillo
 */
public class Lab4c 
{
  public static void main( String[] args ) 
  {
      long seeds = 1;
      
      for(int year = 1 ; year <= 100 ; year++) 
      {
          System.out.println(String.format("%03d", year) + "  " + (seeds)); // Start of year
          seeds = seeds * 2; // End of year
      }
  } 
} 