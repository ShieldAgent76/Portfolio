/*
Author: Martin Lillo
TCSS 143 Fall 2020
Description: Class Question is an abstract (concept) of a quiz question
*/

public abstract class Question {
   
   private final String question;
   private final int point;
   private final String correct;
   
   public Question(String question, int point, String correct) {
      
      this.question = question;
      this.point = point;
      this.correct = correct;
   }
   
   public String getQuestion() {
      return question;
   }
   
   public int getPoints() {
      return point;
   }
   
   public String getAnswer() {
      return correct;
   }
}