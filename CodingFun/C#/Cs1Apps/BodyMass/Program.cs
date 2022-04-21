//////////////////////////////////////////////////////////////////
/// T INFO 200 A, Winter 2022
/// UW Tacoma SET, Martin Lillo
/// Cs1
/// BodyMass (Body Mass Calculator)
/// This is one of the programs for the Cs1 apps
/// This programs is a BMI calculator which takes weight from user and calculates BMI which indicates if the user is healthy or not
/// 
/// Change History
/// Date ----- Developer ----- Description
/// 1-20-22 -- lillom -------- Created documentation and BodyMass program
/// 1-20-22 -- lillom -------- Programs was inspired by US HHS, link is below:
/// https://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmicalc.htm
/// 1-20-22 -- lillom -------- Numeric string formatting from link:
/// https://docs.microsoft.com/en-us/dotnet/standard/base-types/standard-numeric-format-strings
/// 1-22-22 -- lillom -------- Updated documentation

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// namespace will hold the BodyMass program
namespace BodyMass
{
    // only class used in the BodyMass program
    internal class Program
    {
        // only main method will be used for the BodyMass program
        static void Main(string[] args)
        {
            // user interface when first opened
            Console.WriteLine("************************************************");
            Console.WriteLine("Welcome to the BMI (Body Mass Index) Calculator!");
            Console.WriteLine("************************************************");
            Console.WriteLine();
            Console.WriteLine("This programs calculates your BMI to see if you are healthy or not.");
            Console.WriteLine();
            Console.Write("Let's get started! Press 'Enter' to begin: ");
            Console.ReadLine();
            Console.WriteLine();

            // variables from user input for BMI calculation
            Console.Write("Enter weight (lbs): ");
            double userWeight = double.Parse(Console.ReadLine());
            Console.WriteLine();
            Console.Write("Enter height (in): ");
            double userHeight = double.Parse(Console.ReadLine());
            Console.WriteLine();

            // BMI calculation
            double resultsBMI = (userWeight * 703) / (userHeight * userHeight);
            Console.WriteLine($"Your BMI is {resultsBMI.ToString("F2")}");
            // https://docs.microsoft.com/en-us/dotnet/standard/base-types/standard-numeric-format-strings
            Console.WriteLine();

            // if statements to determine if user is healthy or not
            if (resultsBMI < 18.5)
            {
                Console.WriteLine("Based on your results, you are considered underweight.");
                Console.WriteLine("Eat more calories like burgers and cakes but not too much.");
            }
            else if (resultsBMI <= 18.5 && resultsBMI >= 24.9)
            {
                Console.WriteLine("Based on your results, you are considered normal.");
                Console.WriteLine("That's good! Keep it up.");
            }
            else if (resultsBMI <= 25 && resultsBMI >= 29.9)
            {
                Console.WriteLine("Based on your results, you are considered overweight.");
                Console.WriteLine("Time to hit the gym and play some basketball and slam dunk on those fools.");
            }
            else if (resultsBMI > 30)
            {
                Console.WriteLine("Based on your results, you are considered obese.");
                Console.WriteLine("Boi, you be kinda of THICC, but you need some professional help if you are ever going to live a healthy life.");
            }

            // closing statement
            Console.WriteLine();
            Console.WriteLine("Thank you for using the BMI Calculator. Have a happy and healthy day!");
        }
    }
}
