// T INFO 200 A, Winter 2022
// UW Tacoma SET, Martin Lillo
// Cs1
// AITeacher
// This program is an automated reservations system for an airline company
// 
// Change History
// Date ----- Developer ----- Description
// 2-7-22 --- lillom -------- Created Cs2Apps
// 2-11-22 -- lillom -------- code from link:
// https://github.com/Tidogo/Cs2App/blob/829f01f4242ddb719fb28bd4fcf9e7ed8a31253e/AITeacher/Program.cs
// 2-12-22 -- lillom -------- updated documentation comments

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AITeacher
{
    // only class used for AITeacher
    internal class Program
    {
        // question maker method
        public static bool createQuestion()
        {
            // create variables to be used later
            Random rand = new Random();
            int rand1 = rand.Next(0, 9);
            int rand2 = rand.Next(0, 9);
            int correctGuess = rand1 * rand2;
            int userGuess = 0;
            bool gameStatus = true;
            string gameContinue = "";

            // while loop to keep game going while user guess is incorrect
            while (userGuess != correctGuess)
            {
                Console.Write($"What is {rand1} * {rand2}?: ");
                userGuess = int.Parse(Console.ReadLine());
                Console.WriteLine();

                // check conditions if user guesses correctly
                if (userGuess == correctGuess)
                {
                    Console.WriteLine("Very good!");
                    Console.WriteLine();
                    Console.Write("Play again? Type yes or no?: ");
                    gameContinue = Console.ReadLine();
                    Console.WriteLine();

                    // asks for user if game should continue
                    if (gameContinue == "yes")
                    {
                        gameStatus = true;
                    }
                    else if (gameContinue == "no")
                    {
                        gameStatus = false;
                    }
                }
                else
                {
                    Console.WriteLine("No. Please try again.");
                    Console.WriteLine();
                }
            }
            return gameStatus;
        }

        // driver method
        static void Main(string[] args)
        {
            // user interface
            Console.WriteLine("Welcome to Ms. Frizzle's Multiply Game!");
            Console.WriteLine("***************************************");
            Console.WriteLine();
            Console.WriteLine("Are you kids ready to learn multiplication?");
            Console.WriteLine();
            Console.WriteLine("We are going to have a fun time learning!");
            Console.WriteLine();
            Console.Write("Let's get started! Press 'Enter' to begin: ");
            Console.ReadLine();
            Console.WriteLine();
            
            // game program and status
            bool playGame = createQuestion();

            while (playGame == true)
            {
                playGame = createQuestion();
            }

            // code above from link:
            // https://github.com/Tidogo/Cs2App/blob/829f01f4242ddb719fb28bd4fcf9e7ed8a31253e/AITeacher/Program.cs

            // game end interface
            if (playGame == false)
            {
                Console.WriteLine("Thank you for playing Ms.Frizzle's Multiply Game!");
                Console.WriteLine();
                Console.WriteLine("Stay in school to reach your dreams!");
            }
        }
    }

    
}
