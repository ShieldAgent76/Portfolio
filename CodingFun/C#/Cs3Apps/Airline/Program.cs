// T INFO 200 A, Winter 2022
// UW Tacoma SET, Martin Lillo
// Cs3
// Airline (Airline Reservations System)
// This program is an automated reservations system for an airline company
// 
// Change History
// Date ----- Developer ----- Description
// 3-7-22 --- lillom -------- Created Airline project and Cs3Apps
// 3-10-22 -- lillom -------- Added method to check if seat is available and reserve it
// 3-10-22 -- lillom -------- Added switch for user interface
// 3-11-22 -- lillom -------- Modified checking and assigning seating methods
// 3-11-22 -- lillom -------- Code inspired from solution from the website:
// http://www-old.oit.edu/faculty/sergey.goldman/mis218/assignments/assignments.html
// it is called: very basic Airline Reservation Console version with some display version 2. 

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Airline
{
    internal class Program
    {
        // total seats for first class and economy
        public static int firstClassSeats = 5;
        public static int economySeats = 5;

        // initial value for seatign section (first class at 0, economy at 6)
        public static int firstClassSection = 0;
        public static int economySeatSection = 6;

        // seat counter to show how many seat are still available
        public static int firstClassCounter = 5;
        public static int economyCounter = 5;

        // boolean array for when a seat has been taken
        public static bool[] firstClassTaken = new bool[firstClassSeats];
        public static bool[] economyTaken = new bool[economySeats];

        // set all seating status to be false
        public static void DefaultSeating()
        {
            for (int i = 0; i < firstClassTaken.Length; i++)
            {
                firstClassTaken[i] = false;
            }

            for (int i = 0; i < economyTaken.Length; i++)
            {
                economyTaken[i] = false;
            }
        }

        // check if seats are available
        public static bool CheckFirstClass()
        {
            for (int i = 0; i < firstClassSeats; i++)
            {
                if (firstClassTaken[i] == false)
                {
                    return true;
                }
            }
            return false;
        }

        public static bool CheckEconomy()
        {
            for (int i = 0; i < economySeats; i++)
            {
                if (economyTaken[i] == false)
                {
                    return true;
                }
            }
            return false;
        }

        // reserve avaialbe seat methods
        public static int ReserveFirstClass()
        {
            for (int i = 0; i < firstClassSeats; i++)
            {
                if (firstClassTaken[i] == false)
                {
                    firstClassTaken[i] = true;
                    return ++firstClassSection;
                }
            }
            return -1;
        }

        public static int ReserveEconomy()
        {
            for (int i = 0; i < economySeats; i++)
            {
                if (economyTaken[i] == false)
                {
                    economyTaken[i] = true;
                    return economySeatSection++;
                }
            }
            return -1;
        }

        // assign seating based of availablity
        public static void AssignFirstClass()
        {
            bool availableSeat = CheckFirstClass();

            if (availableSeat == true)
            {
                int seatNumber = ReserveFirstClass();
                Console.WriteLine($"You are assigned to FIRST CLASS, seat number {seatNumber}");
                Console.WriteLine();
                Console.WriteLine($"There are {--firstClassCounter} available FIRST CLASS seats left.");
            }
            else
            {
                Console.WriteLine("There are no more FIRST CLASS seats available!");
                Console.WriteLine();
                Console.WriteLine("Next flight in three hours.");
            }
        }

        public static void AssignEconomy()
        {
            bool availableSeat = CheckEconomy();

            if (availableSeat == true)
            {
                int seatNumber = ReserveEconomy();
                Console.WriteLine($"You are assigned to ECONOMY, seat number {seatNumber}");
                Console.WriteLine();
                Console.WriteLine($"There are {--economyCounter} available ECONOMY seats left.");
            }
            else
            {
                Console.WriteLine("There are no more ECONOMY seats available!");
                Console.WriteLine();
                Console.WriteLine("Next flight in three hours.");
            }
        }

        // code above inpsired from website:
        // http://www-old.oit.edu/faculty/sergey.goldman/mis218/assignments/assignments.html
        // it is called: very basic Airline Reservation Console version with some display version 2.

        // driver method
        static void Main(string[] args)
        {
            DefaultSeating();
            
            // user starting interface
            Console.WriteLine("Welcome to Delta Airlines!");
            Console.WriteLine();
            Console.WriteLine("Thank you for flying with us!");
            Console.WriteLine();
            Console.WriteLine("This is where you get to assign your seat for your upcoming flight.");
            Console.WriteLine();
            Console.Write("Let's get started! Press 'Enter' to enter into seating assignment: ");
            Console.ReadLine();
            Console.WriteLine();

            // while loop to keep program running
            while (true)
            {
                // user selection interface
                Console.WriteLine("Please make your choice:");
                Console.WriteLine("************************");
                Console.WriteLine("1) First Class");
                Console.WriteLine("2) Economy");
                Console.WriteLine("3) Exit");
                Console.WriteLine();
                Console.Write("Selection: ");
                int userChoice = int.Parse(Console.ReadLine()); 
                
                // switch case for better looping of program ( looks better than if else if statements)
                switch (userChoice)
                {
                    case 1:
                        Console.WriteLine();
                        AssignFirstClass();
                        Console.WriteLine();
                        break;
                    case 2:
                        Console.WriteLine();
                        AssignEconomy();
                        Console.WriteLine();
                        break;
                    case 3:
                        Console.WriteLine();
                        Console.WriteLine("Thank for flying with us!");
                        Console.WriteLine();
                        Console.WriteLine("We hope to see you again soon.");
                        Environment.Exit(0);
                        break;
                    default:
                        Console.WriteLine();
                        Console.WriteLine("That is not a valid option.");
                        Console.WriteLine();
                        break;
                }
            }
        }
    }
}
