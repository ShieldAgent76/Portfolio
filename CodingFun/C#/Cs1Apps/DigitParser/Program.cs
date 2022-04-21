//////////////////////////////////////////////////////////////////
/// T INFO 200 A, Winter 2022
/// UW Tacoma SET, Martin Lillo
/// Cs1
/// DigitParser (Digit Parser)
/// This is one of the programs for the Cs1 apps
/// This programs takes the number the user entered and converts it into a string of numbers
/// 
/// Change History
/// Date ----- Developer ----- Description
/// 1-19-22 -- lillom -------- Created Cs1Apps and DigitParser
/// 1-19-22 -- lillom -------- Created methods for digit parser
/// 1-19-22 -- lillom -------- custom numerical format string on line 40 from:
/// https://docs.microsoft.com/en-us/dotnet/standard/base-types/custom-numeric-format-strings
/// 1-20-22 -- lillom -------- added Console.WriteLine(); to make it more readable and updated documentation
/// 1-22-22 -- lillom -------- fixed grammer and updated documentation

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// namespace will hold DigitParser program for Cs1
namespace DigitParser
{
    // main class will hold the DigitParser program
    internal class Program
    {
        // only main method will be used for DigitParser 
        static void Main(string[] args)
        {
            // user interface when first opened
            Console.WriteLine("****************************");
            Console.WriteLine("Welcome to the Digit Parser!");
            Console.WriteLine("****************************");
            Console.WriteLine();
            Console.WriteLine("This program takes a number and converts it into a sequence of numbers");
            Console.WriteLine();
            Console.WriteLine("(It will all make sense when you use it.)");
            Console.WriteLine();
            Console.Write("Let's get started. Press 'Enter' to begin: ");
            Console.ReadLine();
            Console.WriteLine();

            // user enter 5 numbers or digits which then converts it into a strinf based of the formating on line 51
            // if user enters more than 5, then the number parser will convert the first number into a combination of numbers
            Console.Write("Enter a number (max 5 digits): ");
            int numberEntered = int.Parse(Console.ReadLine());
            Console.WriteLine();
            Console.WriteLine(numberEntered.ToString("# # # # #"));
            // https://docs.microsoft.com/en-us/dotnet/standard/base-types/custom-numeric-format-strings
            Console.WriteLine();
            Console.WriteLine("Thank you for using the Digit Parser program.");
        }
    }
}
