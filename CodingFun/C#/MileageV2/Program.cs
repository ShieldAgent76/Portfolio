///////////////////////////////////////////////////////////////////////
/// T INFO 200 A, Winter 2022
/// UW Tacoma SET, Charles Costarella (Chuck)
/// L2vs
/// MileageV2
/// This is an upgraded file from the first Mileage program from L1mpg
/// Has all of the functions from the first program with new functions added
/// like user input for name and destination
/// and adds a if else statement to print outputs based on mpg calculated
/// 
/// Change history
/// Date ------ Developer ----- Description
/// 1-10-22 --- lillom -------- copied code from Mileage program from L1mpg to create Mileage V2 for L2vs
/// 1-10-22 --- lillom -------- added function for entering name and destination, added if else statements for different outputs depending on mpg calculated
/// 1-13-22 --- lillom -------- added header
/// 1-14-22 --- lillom -------- created new project because the project name "Mileage V2" was not opening on Powershell so changed it to MileageV2

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// mileage namespace will hold Mileage project for lab 2
namespace MileageV2
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
            // prompts user to enter name
            Console.WriteLine("Let's Begin");
            Console.Write("First, enter your name: ");
            string name = Console.ReadLine();

            // prompts user to enter destination
            Console.Write("Enter destination: ");
            string destination = Console.ReadLine();

            //  takes user input and prints output for miles driven
            Console.Write("Enter number of miles driven (whole number - eg: 7): ");
            int milesTraveled = int.Parse(Console.ReadLine());

            //  takes user input and prints output for gallons used
            Console.Write("Enter number of gallons used (decimal - eg: 12.4): ");
            double gallonsUsed = double.Parse(Console.ReadLine());

            // calculates mpg by taking miles and gallons used from user and printing output
            // milesPerGallon will be rounded to the nearest whole number
            double milesPerGallon = milesTraveled / gallonsUsed;
            Console.WriteLine($"{name}, you traveled {milesTraveled} miles to reach {destination} and used {gallonsUsed} gallons " +
                $"which means that your fuel efficieny rate is {Math.Round(milesPerGallon)} mpg.");

            // prints outputs depending on mpg calculated
            if (milesPerGallon >= 100)
            {
                Console.WriteLine("With a mpg over 100, that is a slam dunk right there!");
            }
            else if (milesPerGallon < 100 && milesPerGallon > 50)
            {
                Console.WriteLine("With a mpg between 50 and 100, you are looking okay but come back for an appointment");
            }
            else if (milesPerGallon <= 50)
            {
                Console.WriteLine("With a mpg below 50, that is the saddest thing I've ever seen Alexa play despacito");
            }

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


