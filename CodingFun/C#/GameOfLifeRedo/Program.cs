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
// That's why I chose to do it this way instead of what was shown in class
//
// This is a new version of the game of life where I create a new game of life program.
// 
// Change history
// Date ------ Developer ----- Description
// 1-31-21 --- lillom -------- Created Game of life program
// 1-31-21 --- lillom -------- game of life code from link:
// https://gist.github.com/lennartb-/7482783
// 2-4-21 --- lillom -------- added UI methods and restructured classes in structure
// 2-4-21 --- lillom -------- added (Martin) to comments to distguish between mine and original developer comments
// 2-4-21 --- lillom -------- changed some variable names for originality and fit C# naming conventions
// 2-5-21 --- lillom -------- created GameOfLifeTest.txt file
// 2-5-21 --- lillom -------- added explannation about other GameOfLife C# file found on the web
// 2-5-21 --- lillom -------- added explanantion why I perfered this example than the class example 

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
        public static void Main()
        {
            int M = 10, N = 10;

            // Intiliazing the grid.
            int[,] grid = {
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

            // Displaying the grid
            Console.WriteLine("Original Generation");
            for (int i = 0; i < M; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    if (grid[i, j] == 0)
                        Console.Write(".");
                    else
                        Console.Write("*");
                }
                Console.WriteLine();
            }
            Console.WriteLine();
            NextGeneration(grid, M, N);
        }

        // Function to print next generation
        static void NextGeneration(int[,] grid,
                                   int M, int N)
        {
            int[,] future = new int[M, N];

            // Loop through every cell
            for (int l = 1; l < M - 1; l++)
            {
                for (int m = 1; m < N - 1; m++)
                {

                    // finding no Of Neighbours
                    // that are alive
                    int aliveNeighbours = 0;
                    for (int i = -1; i <= 1; i++)
                        for (int j = -1; j <= 1; j++)
                            aliveNeighbours +=
                                    grid[l + i, m + j];

                    // The cell needs to be subtracted
                    // from its neighbours as it was
                    // counted before
                    aliveNeighbours -= grid[l, m];

                    // Implementing the Rules of Life

                    // Cell is lonely and dies
                    if ((grid[l, m] == 1) &&
                                (aliveNeighbours < 2))
                        future[l, m] = 0;

                    // Cell dies due to over population
                    else if ((grid[l, m] == 1) &&
                                 (aliveNeighbours > 3))
                        future[l, m] = 0;

                    // A new cell is born
                    else if ((grid[l, m] == 0) &&
                                (aliveNeighbours == 3))
                        future[l, m] = 1;

                    // Remains the same
                    else
                        future[l, m] = grid[l, m];
                }
            }

            Console.WriteLine("Next Generation");
            for (int i = 0; i < M; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    if (future[i, j] == 0)
                        Console.Write(".");
                    else
                        Console.Write("*");
                }
                Console.WriteLine();
            }
        }
    }
}
