///////////////////////////////////////////////////////////////////////
/// Change history
/// Date ------ Developer ----- Description
/// 1-5-22 ---- lillom ----- learning and testing C# programs, created Mileage program
/// 1-7-22 ---- lillom ----- updated documentation, updated user interface, added sign off function, added method to round milesPerGallon
/// 1-8-22 ---- lillom ----- added "eg" to user input

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// mileage namespace will hold Mileage project for lab 1
namespace Mileage
{
    // main class that will hold all Mileage methods
    internal class Program
    {
        // main method will be the only method used in the program
        static void Main(string[] args)
        {
            // what will user do with this program?
            // prints user interface which explains program
            Console.WriteLine(@"
***************************************************************
Welcome to the Damian Lillard Toyota Dealership MPG Calculator!
***************************************************************

This program lets you calculate number of MPG (miles per gallon) by taking
your miles driven divided by gallons used.

");
            //  takes user input and prints output for miles driven
            Console.Write("Enter number of miles driven (whole number - eg: 7): ");
            int milesTraveled = int.Parse(Console.ReadLine());

            //  takes user input and prints output for gallons used
            Console.Write("Enter number of gallons used (decimal - eg: 12.4): ");
            double gallonsUsed = double.Parse(Console.ReadLine());

            // calculates mpg by taking miles and gallons used from user and printing output
            // milesPerGallon will be rounded to the nearest whole number
            double milesPerGallon = milesTraveled / gallonsUsed;
            Console.WriteLine($"You traveled {milesTraveled} miles and used {gallonsUsed} gallons. " +
                $"Mileage used is {Math.Round(milesPerGallon)} mpg.");

            // signs off program
            Console.WriteLine();
            Console.WriteLine("Thank you for using the Damian Lillard Toyota Dealership MPG Calculator!");
            Console.WriteLine();
            Console.WriteLine("We hope to see you again soon.");
            Console.WriteLine();
            Console.WriteLine("Go Blazers!");
        }
    }
}
