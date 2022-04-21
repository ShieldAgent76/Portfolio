import java.util.Scanner;
import java.util.Random;

/**
 * Martin Lillo
 * 
 * This program is a dice game where the user needs to guess the number when the dice rolls
 * This is based off one of the labs during this quarter.
 */
public class DiceGame
{
  public static void main(String[] args) 
  {  
    System.out.println("Ready to test your luck?");
    System.out.println("Enter numbers from 1 to 10."); 
      
    int score = 0;
    for(int i = 0 ; i < 5 ; i++) 
    {
      score += playRound();
    }
    
    gameResult(score);
  }

  
  public static int playRound() // method to create dice and roll 
  {
      // new random class
      Random randomGenerator = new Random(); 
  
      // generate random numbers from dice 
      int[] diceRoll = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int random = diceRoll[(int) Math.floor(diceRoll.length * Math.random())];
      
      // create new scanner class
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter your guess... ");
      int userGuess = userInput.nextInt();
      
      
      // compare random generated number to what the user has put down
      int score = 0;
      
      if (userGuess == random) 
      {
          System.out.println("1 point awarded!");
          score += 1;
      }

      else 
      {
          System.out.println("No points awarded...");
      }
      
      return score;
  }
  
  public static void gameResult(int score) 
  {
      System.out.println("You have " + score + " points.");
      System.out.println("Thanks for playing the game!");
      System.out.println("Have a good night folks!");
  }

  
  /*
  public static void testMethod()
  {
      
  }
  */
}

