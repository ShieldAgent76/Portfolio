/*
Author: Martin Lillo
TCSS 143 Fall 2020
Description: Class Player for user interaction
*/

public class Player {
      
   private String first;
   private String last;
   private int pointsEarned = 0;
   
   public Player(String first, String last) {
      
      this.first = first;
      this.last = last;
   }
   
   public String getFirstName() {
      return first;
   }
   
   public String getLastName() {
      return last;
   }
   
   public int getPlayerScore() {
      return pointsEarned;
   }
   
   public int updatePlayerScore(int pointsEarned) {
      pointsEarned++;
      return pointsEarned;
   }
   
   public String toString() {
      return "Points: " + pointsEarned;
   }
}