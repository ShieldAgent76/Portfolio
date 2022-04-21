// T INFO 200 A, Winter 2022
// UW Tacoma SET, Martin Lillo
// Cs3
// Elimination (Duplicate Elimination)
// This program prints numbers from an array without dulplicates shown
// 
// Change History
// Date ----- Developer ----- Description
// 3-7-22 --- lillom -------- Created Elimation project and Cs3Apps
// 3-8-22 --- lillom -------- Added uniqueArr() method to create unique array for printing unique numbers
// 3-11-22 -- lillom -------- Erased everything and started over since it was getting complicated
// 3-11-22 -- lillom -------- Code inspired by:
// https://github.com/thejacobhardman/Duplicate-Elimination/blob/master/Duplicate-Elimination/Program.cs
// 3-11-22 -- lillom -------- Added the displaying of array within while loop to show array as the program goes on

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Elimination
{
    // only class used for the program
    internal class Program
    {
        // array to hold five numbers
        public static int[] fiveNums = new int[5];
        public static int numInput = 0;

        // main driver class
        static void Main(string[] args)
        {
            // starting user interface
            Console.WriteLine("Welcome to Duplicate Elimination Program!");
            Console.WriteLine();
            Console.WriteLine("This program takes in five numbers on only prints out unique one,");
            Console.WriteLine("meaning there should not be any duplicates.");
            Console.WriteLine();
            Console.WriteLine("REMEMBER: You only have five attempts to enter five numbers.");
            Console.WriteLine("Any duplicates will not be counted in the end.");
            Console.WriteLine("Same goes for invalid numbers that are either below 10 or above 100.");
            Console.WriteLine();
            Console.Write("Let's get started. Press 'Enter' to begin: ");
            Console.ReadLine();
            Console.WriteLine();

            // while loop to keep program running until user exits out
            while (true)
            {
                // for loop to print at least five numbers to array
                for (int i = 0; i < fiveNums.Length; i++)
                {
                    Console.Write("Enter a number between 10 and 100: ");
                    numInput = int.Parse(Console.ReadLine());

                    if (numInput >= 10 && numInput <= 100)
                    {
                        if (fiveNums.Contains(numInput))
                        {
                            Console.WriteLine();
                            Console.WriteLine($"{numInput} is already in array");
                            Console.WriteLine();
                        }
                        else
                        {
                            Console.WriteLine();
                            fiveNums[i] = numInput;
                            Console.WriteLine($"Number entered: {numInput}");
                            Console.WriteLine();
                            Console.WriteLine("Unique Numbers Array");
                            Console.WriteLine("********************");
                            foreach (int nums in fiveNums)
                            {
                                if (nums != 0)
                                {
                                    Console.Write(nums + " ");
                                }
                            }
                            Console.WriteLine("\n");
                        }
                    }
                    else
                    {
                        Console.WriteLine();
                        Console.WriteLine("Invalid Number Entered");
                        Console.WriteLine();
                    }
                }

                // print array
                Console.WriteLine("Unique Numbers Array");
                Console.WriteLine("********************");
                foreach (int nums in fiveNums)
                {
                    if (nums != 0)
                    {
                        Console.Write(nums + " ");
                    }
                }
                // user exit interface
                Console.WriteLine();
                Console.WriteLine();
                Console.WriteLine("Thank you for using the Duplicate Elimination Program!");
                Console.WriteLine();
                Console.WriteLine("We hope to see you again soon.");
                Environment.Exit(0); // exit program
            }

            // code above inspired by:
            // https://github.com/thejacobhardman/Duplicate-Elimination/blob/master/Duplicate-Elimination/Program.cs

            // I like the "simple" approach to it as some of the other methods had lots of method 
            // that did not make the program work
            // What I've added is user interfaces so the program is more user friendly
            // along with different formatting of the interface
        }
    }
}
