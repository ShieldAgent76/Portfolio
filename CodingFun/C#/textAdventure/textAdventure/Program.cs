using System;

namespace textAdventure
{
    class Program
    {
        static void Main(string[] args)
        {
            MainTitle();
        }

        public static void MainTitle() 
        {
            Console.WriteLine("Welcome! Let's begin the game shall we?");
            Console.WriteLine("Press Enter to begin");
            Console.ReadLine();
            Console.Clear();
            FirstSection();
        }

        public static void FirstSection()
        {
            string choiceNum;

            Console.WriteLine("Uh-oh. Mr.Kamoshida has awakened and he is out looking for women.");
            Console.WriteLine("What do you do?");
            Console.WriteLine("1. Attack");
            Console.WriteLine("2. Run");
            Console.WriteLine("3. Do Nothing (Pee in your pants)");
            Console.Write("Enter Number: ");
            choiceNum = Console.ReadLine();
            Console.Clear();

            switch (choiceNum)
            {
                case "1":
                    {
                        Console.WriteLine("You attack!");
                        Console.WriteLine("Mr.Kamoshida is knocked out!");
                        Console.WriteLine("You win!");
                        Console.WriteLine("Press Enter to continue");
                        Console.ReadLine();
                        Winner();
                        break;
                    }
                case "2":
                    {
                        Console.WriteLine("You run!");
                        Console.WriteLine("You decide to run away from Mr.Kamoshida");
                        Console.WriteLine("He chases from the hallway. Get back here!");
                        Console.WriteLine("Press Enter to continue");
                        Console.ReadLine();
                        SecondSection();
                        break;
                    }
                case "3":
                    {
                        Console.WriteLine("You peed in your pants!");
                        Console.WriteLine("The stench fills across the school as students and teachers faint from the horrible stench.");
                        Console.WriteLine("Mr.Kamoshida in on the floor as he tries to breathe in fresh air.");
                        Console.WriteLine("You decide to use this opportunity to escape from him for now.");
                        Console.WriteLine("Press Enter to continue");
                        Console.ReadLine();
                        SecondSection();
                        break;
                    }
                default:
                    {
                        Console.WriteLine("That's not an option you dingleberry!");
                        FirstSection();
                        break;
                    }
            }

        }

        public static void SecondSection()
        {
            Random random = new Random();
            string[] optionTwo = {"In the hallway, you see that the cops are here.",
                "In the hallway, you see a stalker walking towards you.",
                "In the hallway, the fire alarm go off."};
            int ranNum = random.Next(0, 3);
            string optionText = optionTwo[ranNum];

            string choiceTwo;

            Console.WriteLine(optionText);
            Console.WriteLine("Some reason, there is a hot spring nearby in the school. You didn't understand but in your situation you had no time to think.");
            Console.WriteLine("Hide in the hot spring? Yes or No");
            Console.Write("Choice: ");
            choiceTwo = Console.ReadLine().ToLower();

            if (choiceTwo == "yes" || choiceTwo == "y")
            {
                ThirdSection();
            }
            else if (choiceTwo == "no" || choiceTwo == "n")
            {
                Console.WriteLine("Dream out of nowhere comes out and kills you, then goes back to speedrunning Minecraft.");
                Console.WriteLine("Press Enter to continue");
                Console.ReadLine();
                GameOver();
            }
            else
            {
                Console.WriteLine("That's not an option you dingleberry!");
                SecondSection();
            }
        }

        public static void ThirdSection()
        {
            int age;

            Console.WriteLine("You hide inside the hot spring but for some reasons your friends, boys and girls, are there.");
            Console.WriteLine("They are staring at you as your presence is creating an awkward atmosphere.");
            Console.WriteLine("One of them asks, how old are you?");
            Console.WriteLine("That surely came out of nowhere but maybe if you say your age, their staring might stop.");
            Console.WriteLine("How old are you?");
            Console.Write("Age: ");
            int.TryParse(Console.ReadLine(), out age);

            while (age < 100)
            {
                Console.WriteLine("What? There's no way! For real!?!");
                Console.WriteLine("How old are you?");
                Console.Write("Age: ");
                int.TryParse(Console.ReadLine(), out age);
            }

            Console.WriteLine("Wow. Okay Boomer!");
            Console.WriteLine("Press Enter to continue");
            Console.ReadLine();
            Winner();
        }

        public static void GameOver()
        {
            Console.Clear();
            Console.WriteLine("At the funeral, all of your friends and family sing songs of your life.");
            Console.WriteLine("And then, they start do the coffin dance");
            Console.WriteLine("Well, that was fun...");
            Console.WriteLine("Press Enter to try again");
            Console.ReadLine();
            Console.Clear();
            MainTitle();
        }

        public static void Winner()
        {
            Console.Clear();
            Console.WriteLine("You escaped from a terrible fate.");
            Console.WriteLine("Now that you run away from school, your adventure truly begins.");
            Console.WriteLine("Or more like a hard reset.");
            Console.WriteLine("Press Enter to try again");
            Console.ReadLine();
            Console.Clear();
            MainTitle();
        }
    }
}
