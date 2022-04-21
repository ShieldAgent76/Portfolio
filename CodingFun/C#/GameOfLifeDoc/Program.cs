///////////////////////////////////////////////////////////////////////
// T INFO 200 A, Winter 2022
// UW Tacoma SET, Charles Costarella (Chuck)
// L5life
// Game of Life (GameOfLife)
// This is the game of life program based of the 
// computational phenomenon invented by British mathematician John Conway in 1970 
// to show possibilities of population simulations in a mathematically controlled environment.
// The objective of game of life it to simulate how "life" would operate.
// The conditions to the game of life are: 
// a cell is born if it has exactly three neighbors, 
// survives if it has two or three living neighbors, 
// and dies otherwise. 
//
// There was another game of life program where it functions better than this one
// however, one of the methods in the code only runs on .NET core
// link: https://khalidabuhakmeh.com/program-the-game-of-life-with-csharp-and-emojis
//
// I chose to do it this way because I don't the cell board to overhaul the output file
// Plus, it looks better when the board updates itself as if it were an actual simulation
// That's why I chose to do it this way instead of what was shown in class.
//
// This is the Doc version. In this one, I exaplin to the fullest I can on how the program works.
// 
// Change history
// Date ------ Developer ----- Description
// 1-31-22 --- lillom -------- Created Game of life program
// 1-31-22 --- lillom -------- game of life code from link:
// https://gist.github.com/lennartb-/7482783
// 2-4-22 --- lillom -------- added UI methods and restructured classes in structure
// 2-4-22 --- lillom -------- added (Martin) to comments to distguish between mine and original developer comments
// 2-4-22 --- lillom -------- changed some variable names for originality and fit C# naming conventions
// 2-5-22 --- lillom -------- created GameOfLifeTest.txt file
// 2-5-22 --- lillom -------- added explannation about other GameOfLife C# file found on the web
// 2-5-22 --- lillom -------- added explanantion why I perfered this example than the class example
// 2-17-22 -- lillom -------- Added documentation for clairification of program
// 2-19-22 -- lillom -------- Updated documentation and change history, there was a typo on the dates
// 2-19-22 -- lillom -------- Boolean literals microsoft docs link:
// https://docs.microsoft.com/en-us/dotnet/csharp/language-reference/builtin-types/bool

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// namespace used for the game of life program
namespace GameOfLife
{
    // GameOfLife class that contains the methods regarding to the game of life grid, cells, and UI
    internal class GameOfLife
    {
        // grid properties that will be used in the game of life
        private int GridRows; // rows of the grid 
        private int GridColumns; // columns of the grid
        private bool[,] GridCells; // 2D array to not olny fill 2D array requirements but to also set up grid,
                                   // it's a boolean value because


        // the game of life constructor

        /// <summary>
        /// Initializes a new Game of Life.
        /// </summary>
        /// <param name="GridRows">Heigth of the cell field.</param>
        /// <param name="GridColumns">Width of the cell field.</param>
        public GameOfLife(int GridRows, int GridColumns)
        {
            this.GridRows = GridRows;
            this.GridColumns = GridColumns;
            GridCells = new bool[GridRows, GridColumns];
            GenerateGrid(); // calls the GenerateGrid() method
        }

        // game of life user interface (Martin)
        public static void UserInterface()
        {
            Console.WriteLine("****************************");
            Console.WriteLine("Welcome to the Game of Life!");
            Console.WriteLine("****************************");
            Console.WriteLine();
            Console.WriteLine("What is the Game of life?");
            Console.WriteLine("*************************");
            Console.WriteLine("The game of life program based of the \n" +
                                "computational phenomenon invented by British mathematician John Conway in 1970 \n" +
                                "is to show possibilities of population simulations \n" +
                                "in a mathematically controlled environment.");
            Console.WriteLine();
            Console.Write("Let's get started! Press 'Enter' to begin: ");
            Console.ReadLine();
            Console.Clear(); // clear console output
        }

        // user interface 2 (Martin)
        public static void UserInterface2()
        {
            Console.WriteLine("The objective of game of life it to simulate how 'life' would operate \n" +
                                "after a set number of runs or generations.");
            Console.WriteLine();
            Console.WriteLine("The conditions to the game of life are: \n" +
                                "a cell is born if it has exactly three neighbors,\n" +
                                "survives if it has two or three living neighbors,\n" +
                                "and dies otherwise.");
            Console.WriteLine();
            Console.WriteLine("Keys to the Game of Life");
            Console.WriteLine("************************");
            Console.WriteLine("x = alive cell");
            Console.WriteLine("' ' (empty space) = dead cell");
            Console.WriteLine();
            Console.Write("Press 'Enter' to begin the simulation: ");
            Console.ReadLine();
            Console.Clear();

            // I had to clear the console because the game of life would take up part of the interfaces
        }

        // the DrawAndGrow() method calls the DrawGame() and GrowCells() methods to create and initilize the game 

        /// <summary>
        /// Advances the game by one generation and prints the current state to console.
        /// </summary>
        public void DrawAndGrow()
        {
            DrawGame();
            GrowCells();
        }

        // draws the game to the console by creating a string buffer 
        // to randomize which section of the game board has alive and dead cells

        /// <summary>
        /// Draws the game to the console.
        /// </summary>
        private void DrawGame()
        {
            string buffer = "";
            for (int i = 0; i < GridRows; i++)
            {
                for (int j = 0; j < GridColumns; j++)
                {
                    buffer += GridCells[i, j] ? "x" : " ";

                    // literal value from link:
                    // https://docs.microsoft.com/en-us/dotnet/csharp/language-reference/builtin-types/bool

                    // x means alive cell
                    // " " means dead cell
                }

                buffer += "\n";
            }
            Console.SetCursorPosition(0, Console.WindowTop); // sets the game board to the set coordinates
                                                             // on the console top left
            Console.Write(buffer.TrimEnd('\n')); // acts like a Console.WriteLine()
                                                 // for creating new a line 
        }

        // nested for loop to check for number of neighbors to see
        // if conditions to grows the cells are correct

        /// <summary>
        /// Advances the game by one generation according to GoL's ruleset.
        /// </summary
        private void GrowCells()
        {
            for (int i = 0; i < GridRows; i++)
            {
                for (int j = 0; j < GridColumns; j++)
                {
                    int numOfAliveNeighbors = GetNeighbors(i, j); // call GetNeighbors() method to get number of 
                                                                  // alive cells in the board

                    if (GridCells[i, j]) // if statement to check if there is a cell in that spot and
                                         // what number of neighbors that cell has
                    {
                        if (numOfAliveNeighbors < 2)
                        {
                            GridCells[i, j] = false;
                        }
                        
                        if (numOfAliveNeighbors > 3)
                        {
                            GridCells[i, j] = false;
                        }
                    }
                    else
                    {
                        if (numOfAliveNeighbors == 3)
                        {
                            GridCells[i, j] = true;
                        }
                    }
                }
            }
        }

        // nested for loop to check if neighbor cells are dead or alive

        /// <summary>
        /// Checks how many alive neighbors are in the vicinity of a cell.
        /// </summary>
        /// <param name="x">X-coordinate of the cell.</param>
        /// <param name="y">Y-coordinate of the cell.</param>
        /// <returns>The number of alive neighbors.</returns>
        private int GetNeighbors(int x, int y)
        {
            int NumOfAliveNeighbors = 0;

            for (int i = x - 1; i < x + 2; i++)
            {
                for (int j = y - 1; j < y + 2; j++)
                {
                    if (!((i < 0 || j < 0) || (i >= GridRows || j >= GridColumns)))
                    {
                        if (GridCells[i, j] == true) NumOfAliveNeighbors++;
                    }
                }
            }
            return NumOfAliveNeighbors;
        }

        /// <summary>
        /// Initializes the field with random boolean values.
        /// </summary>
        private void GenerateGrid()
        {
            Random generator = new Random();
            int number;
            for (int i = 0; i < GridRows; i++)
            {
                for (int j = 0; j < GridColumns; j++)
                {
                    number = generator.Next(2);
                    GridCells[i, j] = ((number == 0) ? false : true);
                }
            }
        }

        // code from link: https://gist.github.com/lennartb-/7482783
        // user interfaces were made by me (Martin)
    }

    // main driver class of the game of life program
    internal class Program
    {
        // driver method to game of life (Martin)
        public static void Main(string[] args)
        {
            // Constants for the game rules.
            int GridColumns = 40;
            int GridRows = 10;
            uint MaxRuns = 100; // max number of runs that simulation can run
            int runs = 0; // starting number of run
            GameOfLife sim = new GameOfLife(GridRows, GridColumns);

            // my user interface for the game of life program (Martin)
            GameOfLife.UserInterface();
            GameOfLife.UserInterface2();

            // game of life runs while runs is less than max runs and increments as simulation runs
            while (runs++ < MaxRuns)
            {
                sim.DrawAndGrow();

                // Give the user a chance to view the game in a more reasonable speed.
                System.Threading.Thread.Sleep(100);
            }

            // code from link: https://gist.github.com/lennartb-/7482783

            // to give space on the console when execution is done (Martin)
            // when it says 'Press any key to continue...' (Martin)
            Console.WriteLine();
            Console.WriteLine();
        }
    }
}
