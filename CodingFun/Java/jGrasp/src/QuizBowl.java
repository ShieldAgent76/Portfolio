/*
Author: Martin Lillo
TCSS 143 Fall 2020
Description: Class QuizBowl to read from sample.txt file and play quiz
*/

import java.util.*;
import java.io.*;

public class QuizBowl   {
   public static void main(String[] args) throws FileNotFoundException {
      // Input
      String firstNm, lastNm, fileNm;                                // To store the player's first and last name
      Scanner consoleIp = new Scanner(System.in);                    // Scanner to read user input from console
      
      // Accept player's first and last name
      System.out.println("What is your first name?");
      firstNm = consoleIp.next();
      System.out.println("What is your last name?");
      lastNm = consoleIp.next();
      
      // Create an instace of Player object
      Player pl = new Player(firstNm,lastNm);
      
      // Accept file details from player
      System.out.println("What file stores your questions?");
      fileNm = consoleIp.next();
      
      // Scanner to read from the file
      Scanner fileIp = new Scanner(new File(fileNm));
      // Read the total number of questions from the file
      int numQues = fileIp.nextInt();
      ArrayList<Question> questionBank = new ArrayList<Question>(numQues);  // ArrayList of questions read from file
      
      // Method Call: Read rest of the file and store questions & answers in ArrayList
      fillQuestionBank(fileIp,questionBank);
      
      // Method Call: Accept number of questions player wants to play 
      int playNumQues = validateInput(consoleIp,numQues);
      
      // Method Call: Play the quiz
      playQuizBowl(consoleIp,questionBank,pl,playNumQues);
      
      // Display player's final score
      System.out.println(pl);
   }
   
   /* TO DO
      Method: Read questions from the file and store in ArrayList
      Parameter: Scanner, ArrayList
      Return: None
   */
   public static void fillQuestionBank(Scanner fileIp, ArrayList<Question> qBank) {
      
      int pointsPossible = 0;
      String question = "";
      String answer = "";
      
      while(fileIp.hasNextLine()) {
			if (fileIp.next().equals("TF")) {
            pointsPossible = fileIp.nextInt();
            question = fileIp.nextLine();
            answer = fileIp.nextLine();
            qBank.add(new QuestionTF(question, pointsPossible, answer)); 
         }
         /*
         else if (fileIp.next().equals("SA")) {
            pointsPossible = fileIp.nextInt();
            question = fileIp.nextLine();
            answer = fileIp.nextLine();
            qBank.add(new QuestionSA(question, pointsPossible, answer)); 
         }
         
         else if (fileIp.next().equals("MC")) {
            pointsPossible = fileIp.nextInt();
            question = fileIp.nextLine();
            answer = fileIp.nextLine();
            qBank.add(new QuestionMC(question, pointsPossible, answer)); 
         }
         */
		}
   }
    
   /*
      Method: Validate input range and data type of the number of questions player wants to play
      Parameter: Scanner, int
      Return: int
   */
   public static int validateInput(Scanner input, int numQues)  {
      int playQues;           // Store number of questions player wants to play
      
      // Loop to validate the input range
      do {
         System.out.println("How many questions would you like (out of " + numQues + ")?");

         //Loop to validate the data type of the input
         while(!input.hasNextInt()) {
            // Discard the invalid input
            input.next();
            System.out.println("Sorry, that is not valid.");
            System.out.println("How many questions would you like (out of " + numQues + ")?");
         }
         playQues = input.nextInt();
         
         if(playQues > numQues)
            System.out.println("Sorry, that is too many.");
        
      }while(playQues > numQues);
      
      return playQues;
   }
   
   /*
      Method: Play quiz by randomly choosing questions
      Parameter: Scanner, ArrayList, Player, int
      Return: none
   */
   public static void playQuizBowl(Scanner input, ArrayList<Question> qBank, Player p, int playNumQues)   {
      Random rand = new Random();
      int quesNo;                                                 // Variable for question number
      ArrayList<Integer> duplicate = new ArrayList<Integer>();    // Store all the question numbers
      
      // Loop till player number of questions
      for(int i = 1; i <= playNumQues; i++)  {
         // loop to make sure no duplicate question is asked
         do {
            // Randomly select a question from the question bank
            quesNo = rand.nextInt(qBank.size());
         }while(duplicate.contains(quesNo));
         
         // Add the quesNo to the duplicate list
         duplicate.add(quesNo);
         
         // Display the question and accept user answer
         Question q = qBank.get(quesNo);
         System.out.println(q);
         String playerAns = input.next();
         
         // Check if the user wants to SKIP the question
         if(playerAns.equals("SKIP"))
            System.out.println("You have elected to skip that question.");
         else if(q.getAnswer().equals(playerAns)) {   // Check if the user answer is correct
           System.out.println("Correct! You get " + q.getPoints() + " points.");
           p.updatePlayerScore(q.getPoints());
         }
         else {      // if the user answer is incorrect
            System.out.println("Incorrect, the answer was " + q.getAnswer() + ". You lose " + q.getPoints() + " points.");
            p.updatePlayerScore(-1 * q.getPoints());
         }
         
         System.out.println();
      } 
   }
}