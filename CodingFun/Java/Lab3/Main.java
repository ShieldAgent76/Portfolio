import java.util.Scanner;
import java.util.Random;

public class Main 
{
  public static void main(String[] args) 
  {
    int score = 0;
    for(int i = 0 ; i < 5 ; i++) 
    {
      if(playRound()) 
      {
        score++;
      }
    }
    
    reportResults(score);
  }
  
  public static int playRound() {
    // Create instance of Random class 
    Random randGenerator = new Random(); 
  
    // Generate random integers in range 1 to 20
    int[] diceRoll = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 ,17 ,18, 19, 20}; 


    
    Scanner myInput = new Scanner(System.in);
    //Acquire user input
    ;

    // Compare random number to user input
    // If the user won
    if( <TODO> ) 
    {
      System.out.println( "Point awarded!" );
      return 1;
    }
    // Otherwise
    else 
    {
      System.out.println( "No point awarded..." );
      return 0;
    }
  }
  
  public static void gameResult( int score ) 
  {
    // <TODO> - Report result based on user's score
  }
  
  
}

