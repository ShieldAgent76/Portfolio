/*
Author: Martin Lillo
TCSS 143 Fall 2020
Description: Class QuestionMC for creating mutilple choice questions
*/
import java.util.*;

public class QuestionMC extends Question {
   
   ArrayList<String> choices = new ArrayList<String>();
   
   public QuestionMC(String question, int point, ArrayList<String> choices, String correct) {
   
      super(question, point, correct);
      for (String choice : choices) {
         choices.add(choice);
      }
   }
   /*
   public String toString() {
   
   }
   */
}