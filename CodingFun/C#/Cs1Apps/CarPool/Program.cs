//////////////////////////////////////////////////////////////////
/// T INFO 200 A, Winter 2022
/// UW Tacoma SET, Martin Lillo
/// Cs1
/// CarPool (Car Pooling)
/// This is one of the programs for the Cs1 apps
/// This programs calculates daily driving costs so that the user can compare it to car pooling services
/// 
/// Change History
/// Date ----- Developer ----- Description
/// 1-19-22 -- lillom -------- Created Cs1Apps and CarPool
/// 1-21-22 -- lillom -------- created methods for CarPool
/// 1-21-22 -- lillom -------- car pooling links:
/// https://transportation.uw.edu/getting-here/rideshare/carpool
/// https://moovit.com/carpool/
/// https://www.ridesharing.com/
/// 1-21-22 -- lillom -------- numerical string formatting link:
/// https://docs.microsoft.com/en-us/dotnet/standard/base-types/custom-numeric-format-strings
/// 1-22-22 -- lillom -------- fixed grammer

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// namespace will hold CarPool program
namespace CarPool
{
    // only class used for the CarPool program
    internal class Program
    {
        // only main method will be used for the CarPool program
        static void Main(string[] args)
        {
            // user interface when first opened
            Console.WriteLine("***************************************");
            Console.WriteLine("Welcome to the Car Pool Savings Program");
            Console.WriteLine("***************************************");
            Console.WriteLine();
            Console.WriteLine("This programs calculates your daily driving so this can used as tool when comparing it to car pooling services available");
            Console.Write("Let's get started! Press 'Enter' to begin: ");
            Console.ReadLine();
            Console.WriteLine();

            // user input for calculation

            // miles driven
            Console.Write("Enter total miles driven (int): ");
            int milesDriven = int.Parse(Console.ReadLine());
            Console.WriteLine();
            Console.WriteLine($"You have been driving for {milesDriven} miles.");
            Console.WriteLine();

            // cost per gallon of gas
            Console.Write("Enter cost per gallon of gas (enter #.##): ");
            double gallonCost = double.Parse(Console.ReadLine());
            Console.WriteLine();
            Console.WriteLine($"It costs ${gallonCost.ToString("#.##")} per gallon of gas.");
            // https://docs.microsoft.com/en-us/dotnet/standard/base-types/custom-numeric-format-strings
            Console.WriteLine();

            // average miles per gallon
            Console.Write("Enter miles per gallon (int): ");
            int milesPerGallon = int.Parse(Console.ReadLine());
            Console.WriteLine();
            Console.WriteLine($"Your fuel economy is {milesPerGallon} mpg.");
            Console.WriteLine();

            // parking fees
            Console.Write("Enter parking fees (enter #.##): ");
            double parkingFee = double.Parse(Console.ReadLine());
            Console.WriteLine();
            Console.WriteLine($"It costs ${parkingFee.ToString("#.##")} for parking.");
            // https://docs.microsoft.com/en-us/dotnet/standard/base-types/custom-numeric-format-strings
            Console.WriteLine();

            // tolls per day
            Console.Write("Enter tolls (enter #.##): ");
            double tollsPaid = double.Parse(Console.ReadLine());
            Console.WriteLine();
            Console.WriteLine($"It costs ${tollsPaid.ToString("#.##")} for tolls.");
            // https://docs.microsoft.com/en-us/dotnet/standard/base-types/custom-numeric-format-strings
            Console.WriteLine();

            // displays information entered
            Console.WriteLine("Your driving information:");
            Console.WriteLine("*************************");
            Console.WriteLine();
            Console.WriteLine($"You have been driving for {milesDriven} miles.");
            Console.WriteLine();
            Console.WriteLine($"It costs ${gallonCost.ToString("#.##")} per gallon of gas.");
            Console.WriteLine();
            Console.WriteLine($"Your fuel economy is {milesPerGallon} mpg.");
            Console.WriteLine();
            Console.WriteLine($"It costs ${parkingFee.ToString("#.##")} for parking.");
            Console.WriteLine();
            Console.WriteLine($"It costs ${tollsPaid.ToString("#.##")} for tolls.");
            Console.WriteLine();

            // displays links recommened for car pooling
            Console.WriteLine("Car Pooling links for reference:");
            Console.WriteLine("********************************");
            Console.WriteLine();
            Console.WriteLine("UW: https://transportation.uw.edu/getting-here/rideshare/carpool");
            Console.WriteLine();
            Console.WriteLine("Moovit: https://moovit.com/carpool/");
            Console.WriteLine();
            Console.WriteLine("RideSharing: https://www.ridesharing.com/");
            Console.WriteLine();

            // closing statement
            Console.WriteLine("Thank you for using the Car Pooling Program. Hope this helps.");
        }
    }
}
