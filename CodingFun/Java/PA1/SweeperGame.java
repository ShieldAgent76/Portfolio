/*
Martin Lillo
TCSS 143 Autumn 2020
Sweeper Game (PA1)
*/

import java.util.Scanner;

public class SweeperGame {
   
   //instance variables
   private char[][] gameBoard;
   private int treasureX;
   private int treasureY;
   private int totalMoves;
   private boolean found;
   
   // sweeper game constructor
   public SweeperGame(int height, int width) {
      
      gameBoard = new char[height][width];
      for (int i = 0; i < height; i++) {
         for (int j = 0; j < width; j++ ) {
           
            gameBoard[i][j] = ' ';
         }
      }
      // generate random spot for treasure
      treasureX = (int)(Math.random() * width);
      treasureY = (int)(Math.random() * height);
      gameBoard[treasureY][treasureX] = 'T';
      
      totalMoves = 0;
      found = false;     
   }
   
   public boolean beenSwept(int x, int y) {
      
      if (Character.isDigit(gameBoard[y][x])) { // checks if a spot has already been found
         
         return true;
      }
      else {
         
         return false;
      }
   }
   
   public boolean treasureFound(int x, int y) { // check is the treasure has already been found
      
      if (gameBoard[y][x] == 'T') {
         
         return true;
      }
      else {
         
         return false;
      }
   
   }
      
   public boolean checkOutOfBounds(int x, int y) { // checks if the coordinates enetered are out of range of the grid
      
      int height = gameBoard.length - 1;
      int width = gameBoard[0].length - 1;
      if (x <= width && x >= 0){
         if ( y <= height && y >= 0) {
            
            return true;
         }
         else {
            return false;
         }
      }
      else {
         return false;
      }
   }
   
   // getter statements to update data
   public int getBoardHeight() {
      
      return gameBoard.length;
   }
   
   public int getBoardWidth() {
      
      return gameBoard[0].length;
   }
      
   public int getTotalMoves() {
      
      return totalMoves;
   }
      
   public boolean digSand(int x, int y) {
      
      if (treasureFound(x, y)) { // calls treasureFound() method
         
         found = true;
         return true;
      }
      else {
         
         int manhattanNum = (Math.abs(treasureX - x) + Math.abs(treasureY - y)); // using the manhatten distance to calculate distance
         String manhattanStr = Integer.toString(manhattanNum);
         char c = manhattanStr.charAt(0); 
         gameBoard[y][x] = c;
         totalMoves++;
         
         return false;
         
      }
   }
            
   public String toString()  { // toString() method where the grid is different symbols to create a grid
      String str = "";         // this was the most difficult emthod to execute. I had to look online to find a good solution
      String sep = "";
      str += ",";
      sep += "`";
      for(int i = 0; i < gameBoard[0].length; i++){
         str += "~,";
         sep += "~`";
      }
      str += "\n";
      sep += "\n";
      for(int i = gameBoard.length-1; i >= 0; i--){
         
         for(int j = 0; j < gameBoard[0].length; j++){
         
            if(j % 2 == 0){
               str += ";";
            }
            else
               str += ":";
               
            if(gameBoard[i][j]== 'T' && found == false){
               str += ".";
            }
            
            else if(gameBoard[i][j]== 'T' && found == true){
               str += "T";
            } 
            else if(gameBoard[i][j]== ' '){
               str += ".";
            
            }
            else
               str += gameBoard[i][j];
            
            
         }
         if(gameBoard[0].length % 2 == 0){
               str += ";";
            }
            else
               str += ":";
         str += "\n";
         str += sep;
         
      }
   
      return str;
   }  
}

// I am unsure on how to make a hierarchy diagram using jGrasp. It gives me an error everytime.