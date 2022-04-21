/*
   TCSS 143 
   Author: Raghavi Sakpal
   Description: Objects & Recursion
*/
import java.util.*;

public class BeastWorld {
   public static void main(String[] args) {
      // Create an instance of Gridword of size 4 * 4
      GridWorld g = new GridWorld(4,4);
      // Declare a Beast 
      char beast = 'B';
      
      // Display the gridworld 
      System.out.println(g);
      
      // Randomize the postion of the Beast in the GridWorld
      // Make sure the Beast is not placed in the postion of the Prey 
      Random rand = new Random();
      int row,col;
      do {
         row = rand.nextInt(g.getRow());
         col = rand.nextInt(g.getCol());
      }while(g.isPrey(row,col));
      g.fillGrid(row,col,beast);
      
      System.out.println("Let's find the prey !");
      // Method Call: Beast navigates in the Grid World to find the Prey
      findPrey(g,beast,row,col);
   }
      
   /*
      Method: Recursively move the beast to find the prey. Our beast will move in clockwise direction (Up, Right, Down, Left)
      Parameter: GridWorld g, char beast, int startRow, int startCol
      Return: void 
   */
   public static void findPrey(GridWorld g, char beast, int row, int col)  {
      // Check if prey found 
      if(g.isPrey(row,col))    {                 // Base Case
         g.fillGrid(row,col,beast); 
         System.out.println("Prey Found !");      
         System.out.print(g);  
      } 
      else {
         g.fillGrid(row,col,beast);       
         System.out.print(g);
         
         // Check if you can move up
         if(row-1 >= 0 && !g.isFilled(row-1,col))
            findPrey(g,beast,row-1,col);        // move the beast up
            
         // Check if you can move right
         else if(col+1 < g.getCol() && !g.isFilled(row,col+1))
            findPrey(g,beast,row,col+1);        // move the beast right
            
         // Check if you can move down
         else if(row+1 < g.getRow() && !g.isFilled(row+1,col))
            findPrey(g,beast,row+1,col);        // move the beast down         
      

         // Check if you can move left
         else if(col-1 >= 0 && !g.isFilled(row,col-1))
            findPrey(g,beast,row,col-1);        // move the beast left

      }
   }
}
