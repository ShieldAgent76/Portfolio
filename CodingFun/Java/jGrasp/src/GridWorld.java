/*
   TCSS 143 
   Author: Raghavi Sakpal
   Description: Objects & Recursion
*/
import java.util.*;

public class GridWorld {
      private char[][] grid;              // Define a 2D array of grid 
      private final int DEFAULT_SIZE = 2; // Default size of the grid 
      private char prey = 'P';            // Target goal is a prey 
      
      // Default Constructor: Construct a 2D array of size 2 * 2
      public GridWorld()   {
         grid = new char[DEFAULT_SIZE][DEFAULT_SIZE];
         for(int row = 0; row < DEFAULT_SIZE; row++) {
            for(int col = 0; col < DEFAULT_SIZE; col++) {
               grid[row][col] = ' ';      
            }
         }
         
         // Randomize the position of the prey on the grid
         randomPreyPosition();
      }
      
      // Constructor: Accept grid size from user 
      public GridWorld(int rowSize, int colSize)   {
         grid = new char[rowSize][colSize];
         for(int row = 0; row < rowSize; row++) {
            for(int col = 0; col < colSize; col++) {
               grid[row][col] = ' ';      
            }
         }
         // Randomize the position of the prey on the grid
         randomPreyPosition();
      }
      
      // Randomize the position of the prey on the grid 
      private void randomPreyPosition()   {
         Random rand = new Random();
         grid[rand.nextInt(grid.length)][rand.nextInt(grid[0].length)] = prey;
      }
      
      // Method: Return total number of rows 
      public int getRow() {
         return grid.length;
      }
      
      // Method: Return total number of cols 
      public int getCol() {
         return grid[0].length;
      }
      
      // Method: Return true if prey is found at parameter row and col 
      public boolean isPrey(int row, int col) {
         return grid[row][col] == prey;
      }
      
      // Method: To place beast at given postion 
      public void fillGrid(int row, int col, char beast)  {
         grid[row][col] = beast;
      }
      
      // Method: To check if the grid is filled at parameter row and col
      public boolean isFilled(int row, int col) {
         return grid[row][col] != ' ' && !isPrey(row,col);
      }
      
      // Method: To check bound of the grid 
      public boolean isGridBoundary(int row, int col) {
         return ((row >= 0 && row < grid.length) && (col >= 0 && col < grid[0].length));
      }
      
      // @verride toString() method to display the grid 
      public String toString()   {
         String str = "";
         
         for(int i = 0; i < grid[0].length; i++)
            str += " -";
         str += "\n";  
         for(int row = 0; row < grid.length; row++)   {
            str += "|";
            for(int col = 0; col < grid[0].length; col++)   {
               str += (grid[row][col] + "|");
            }
            str += "\n";
            for(int i = 0; i < grid[0].length; i++)
               str += " -";
            str += "\n";
         }
         
         return str;
      }
}

