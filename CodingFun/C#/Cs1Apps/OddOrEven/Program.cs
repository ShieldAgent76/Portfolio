//////////////////////////////////////////////////////////////////
/// T INFO 200 A, Winter 2022
/// UW Tacoma SET, Martin Lillo
/// Cs1
/// OddOrEven (Odd or Even)
/// This is one of the programs for the Cs1 apps
/// This programs is a game where the user guesses if the number it entered is odd or even
/// 
/// Change History
/// Date ----- Developer ----- Description
/// 1-19-22 -- lillom -------- Created Cs1Apps and OddOrEven
/// 1-19-22 -- lillom -------- Created methods for odd or even
/// 1-20-22 -- lillom -------- Added a Console.WriteLine(); to add space to look visually appealing
/// 1-20-22 -- lillom -------- Redid the program to fit problem description
/// 1-22-22 -- lillom -------- Added 'for' to closing statement for proper English, shorten '*' to fit title

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// namespace OddOrEven will hold odd or even program for the Cs1 apps assignment
namespace OddOrEven
{
    // main class will hold the OddOrEven program
    internal class Program
    {
        // main method will be the only method used in the program
        static void Main(string[] args)
        {
            // user interface when the program firsts opens
            Console.WriteLine("***********************");
            Console.WriteLine("Welcome to Odd or Even!");
            Console.WriteLine("***********************");
            Console.WriteLine();
            Console.WriteLine("This programs checks the number you enetered is odd or even");
            Console.WriteLine();
            Console.Write("Let's Begin! Press 'Enter' to begin: "); // user presses enter key to begin game
            Console.ReadLine();

            Console.WriteLine();

            // user input for number
            Console.Write("Enter a number (int): ");
            int numberEntered = int.Parse(Console.ReadLine());
            Console.WriteLine();
            Console.WriteLine($"The number entered is {numberEntered}");
            Console.WriteLine();

            // calculates and prints statement based on modulo formula
            int theResult = numberEntered % 2;
            
            if (theResult == 0)
            {
                Console.WriteLine("Your number is even");
            }
            else
            {
                Console.WriteLine("Your number is odd");
            }
            Console.WriteLine();
            
            // closing statement
            Console.WriteLine("Thank you for coming! We hope to see you again real soon.");
        }
    }
}
