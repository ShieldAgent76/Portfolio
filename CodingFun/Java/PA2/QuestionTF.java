/*
Author: Martin Lillo
TCSS 143 Fall 2020
Description: Class QuestionTF for creating True/False questions
*/

public class QuestionTF extends Question {
   
   public QuestionTF(String question, int point, String correct) {
      
      super(question, point, correct);
   }
   
   public String toString() {
      return getQuestion() + getPoints() + getAnswer();
   }
}