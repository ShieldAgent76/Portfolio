// T INFO 200 A, Winter 2022
// UW Tacoma SET, Martin Lillo
// Cs2
// GuessTheNumber
// This program is a game where the user guesses the number the program generates
// 
// Change History
// Date ----- Developer ----- Description
// 2-7-22 --- lillom -------- Created Cs2Apps
// 2-9-22 --- lillom -------- Random number generator from link:
// https://docs.microsoft.com/en-us/dotnet/api/system.random?view=net-6.0
// 2-10-22 -- lillom -------- another guessing game code from link:
// https://tlg.trinity.nottingham.sch.uk/computing/csharp/workedExamples/guessTheNumber.aspx

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GuessTheNumber
{
    // only class used for GuessTheNumber
    internal class Program
    {
        // driver method
        static void Main(string[] args)
        {
            // random object added
            Random randomObj = new Random();

            int numberToGuess = randomObj.Next(1, 1000);
            // random number generator from:
            // https://docs.microsoft.com/en-us/dotnet/api/system.random?view=net-6.0

            //Console.WriteLine(numberToGuess); // used for testing purposes

            // title user interface
            Console.WriteLine("Welcome to Guess the Number game!");
            Console.WriteLine("*********************************");
            Console.WriteLine();
            Console.WriteLine("This program makes the user guess what number the program has generated");
            Console.WriteLine();
            Console.Write("Let's get started! Press 'Enter' to begin!: ");
            Console.ReadLine();
            Console.WriteLine();

            // default user guess initial value
            int userGuess = 0;

            while (userGuess != numberToGuess)
            {
                // game user interface
                Console.Write("Enter a number between 1 - 1000: ");
                int.TryParse(Console.ReadLine(), out userGuess);
                Console.WriteLine();

                // game conditions, ends if user guesses number
                if (userGuess < 1 || userGuess > 1000)
                {
                    Console.WriteLine("{0} is out of bounds!\n", userGuess);
                }
                else if (userGuess > numberToGuess)
                {
                    Console.WriteLine("{0} is too high!\n", userGuess);
                }
                else if (userGuess < numberToGuess)
                {
                    Console.WriteLine("{0} is too low!\n", userGuess);
                }
                else if (userGuess == numberToGuess)
                {
                    Console.WriteLine("{0} is right! Congratulations.\n", userGuess);
                }
                
            }

            // code above from link:
            // https://tlg.trinity.nottingham.sch.uk/computing/csharp/workedExamples/guessTheNumber.aspx
        }
    }
}
