// T INFO 200 A, Winter 2022
// UW Tacoma SET, Martin Lillo
// Cs2
// BarChart
// This program prints out number of astericks from user to act like a bar graph
// 
// Change History
// Date ----- Developer ----- Description
// 2-7-22 --- lillom -------- Created Cs2Apps
// 2-8-22 --- lillom -------- filled out main method
// 2-11-22 -- lillom -------- created user interfaces

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// namespace for the BarChart program
namespace BarChart
{
    // only class used for the program
    internal class Program
    {
        // only method used for BarChart
        static void Main(string[] args)
        {
            // user interface
            Console.WriteLine("Welcome to the Bar Chart program!");
            Console.WriteLine("*********************************");
            Console.WriteLine();
            Console.WriteLine("This program takes the number the user inputed and displays the stars" +
                " based on the user input.");
            Console.WriteLine();
            Console.Write("Let's get started! Press 'Enter' to begin: ");
            Console.ReadLine();
            Console.WriteLine();

            // user input for stars
            Console.Write("Enter number of stars (1-30): ");
            int starInput = int.Parse(Console.ReadLine());
            Console.WriteLine();
            
            // condition to check if input is between 1 and 30
            if (starInput < 0 || starInput > 30)
            {
                Console.WriteLine("Stars inputted cannot be below 1 or above 30");
            }
            else
            {
                // for loop to print stars in a string basedof user input
                string starString = "";
                for (int i = 1; i <= starInput; i++)
                {
                    starString += "*";
                }

                Console.WriteLine(starString);
            }
        }
    }
}
