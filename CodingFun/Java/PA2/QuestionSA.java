/*
Author: Martin Lillo
TCSS 143 Fall 2020
Description: Class QuestionSA for creating short answer questions
*/

public class QuestionSA extends Question {
   
   public QuestionSA(String question, int point, String correct) {
      
      super(question, point, correct);
   }
   
   public String toString() {
      return getQuestion() + getPoints() + getAnswer();
   } 
}