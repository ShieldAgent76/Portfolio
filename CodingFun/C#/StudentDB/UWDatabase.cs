// T INFO 200 A, Winter 2022
// UW Tacoma SET, Charles Costarella (Chuck)
// L6oop
// StudentDB
// This is a database program to showcase student information for a school 
// This is the program application to read and write files
// 
// Change history
// Date ------ Developer ----- Description
// 3-1-22 ---- lillom -------- Created UWDatabase class
// 3-4-22 ---- lillom -------- Updated writing to file formatting
// 3-5-22 ---- lillom -------- Added another undergrad and grad student objects to list
// 3-5-22 ---- lillom -------- Added interface explaining how to update student

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudentDB
{
    internal class UWDatabase
    {
        // student objects for program
        UnderGrad underGrad1 = new UnderGrad("Thomas", "Edward", "edwardt@uw.edu", 3.7, "junior", "Computer Science");
        UnderGrad underGrad2 = new UnderGrad("Rex", "Lapis", "lapisr@uw.edu", 4.0, "senior", "Literature");
        UnderGrad underGrad3 = new UnderGrad("Rosa", "Flowers", "flowersr@uw.edu", 2.9, "freshman", "Business");
        UnderGrad underGrad4 = new UnderGrad("Shane", "Robert", "roberts@uw.edu", 3.3, "sophomore", "Engineering");
        GradStudent grad1 = new GradStudent("Holly", "Flames", "flamesh@uw.edu", 2.5, "John Red", 5000);
        GradStudent grad2 = new GradStudent("Pyra", "Fluer", "fluerp@uw.edu", 4.0, "Rexa Floor", 10000);
        GradStudent grad3 = new GradStudent("Wilbur", "Soot", "sootw@uw.edu", 3.5, "Tommy Claps", 25000);
        GradStudent grad4 = new GradStudent("Mallow", "Hive", "hivem@uw.edu", 2.9, "Lana Rhodes", 1000);

        // list of UW student objects for database storage and manipulation
        private List<Student> StudentsUW = new List<Student>();
        
        // method to read data from file
        public void ReadData()
        {
            StreamReader inFile = new StreamReader("INPUTUW.txt");

            string first = string.Empty;
            while ((first = inFile.ReadLine()) != null)
            {
                string last = inFile.ReadLine();
                double gpa = double.Parse(inFile.ReadLine());
                string email = inFile.ReadLine();

                Student newStudent = new Student(new StudentInfo(first, last, email), gpa);
                StudentsUW.Add(newStudent);

                Console.WriteLine($"Adding student to UW database:\n{newStudent}");
            }
        }

        // method to run the database app
        public void RunApp()
        {
            StartProg();

            // student default objects 
            StudentsUW.Add(underGrad1);
            StudentsUW.Add(underGrad2);
            StudentsUW.Add(underGrad3);
            StudentsUW.Add(underGrad4);
            StudentsUW.Add(grad1);
            StudentsUW.Add(grad2);
            StudentsUW.Add(grad3);
            StudentsUW.Add(grad4);

            while (true)
            {
                MainMenu();

                Console.WriteLine();
                Console.Write("Choice: ");
                char userChoice = char.Parse(Console.ReadLine().ToUpper());
                string email = string.Empty;
                Console.WriteLine();

                switch (userChoice)
                {
                    case 'C':
                        CreateStudent();
                        break;
                    case 'R':
                        ReadStudent(out email);
                        break;
                    case 'U':
                        UpdateStudent();
                        break;
                    case 'D':
                        DeleteStudent();
                        break;
                    case 'P':
                        PrintRecords();
                        break;
                    case 'S':
                        SaveDatabase();
                        break;
                    case 'E':
                        ExitDatabase();
                        break;
                    default:
                        Console.WriteLine("That's not a valid choice\n");
                        break;
                }
            }
        }

        // program start interface
        public void StartProg()
        {
            Console.WriteLine("Welcome to the University of Washington Student Database");
            Console.WriteLine();
            Console.WriteLine("This is to showcase object oriented programming in C#");
            Console.WriteLine("by creating a student database for a school or university.");
            Console.WriteLine();
            Console.Write("Let's get started. Press 'Enter' to begin: ");
            Console.ReadLine();
            Console.WriteLine();
        }

        // main menu interface
        public void MainMenu()
        {
            Console.WriteLine("University of Washington Student Database Menu");
            Console.WriteLine("**********************************************");
            Console.WriteLine();
            Console.WriteLine("Type in a character to choose a command");
            Console.WriteLine();
            Console.WriteLine("[C]: Create or add a record to the database");
            Console.WriteLine("[R]: Read the details of a record. (Search)");
            Console.WriteLine("[U]: Update or modify some details of an existing record in the database");
            Console.WriteLine("[D]: Delete or remove a record from the database");
            Console.WriteLine("[P]: Print the database");
            Console.WriteLine("[S]: Save the database");
            Console.WriteLine("[E]: Exit the databse");
        }

        // end program menu
        public void EndProg()
        {
            Console.WriteLine("Thank you for using the UW Student Database");
            Console.WriteLine();
            Console.WriteLine("Go Dawgs!");
        }

        // create student method
        public void CreateStudent() 
        {
            string email = string.Empty;
            Student student = ReadStudent(out email);
            if (student == null)
            {
                Console.WriteLine($"Adding new stuent. Email: {email}");
                Console.WriteLine();
                Console.Write("Enter First Name: ");
                string first = Console.ReadLine();
                Console.WriteLine();
                Console.Write("Enter Last Name: ");
                string last = Console.ReadLine();
                Console.WriteLine();
                Console.Write("Enter Grade Point Average (GPA): ");
                double gpa = double.Parse(Console.ReadLine());
                Console.WriteLine();
                Console.Write("Are you a undergrad or grad? [U or G]: ");
                char rank = char.Parse(Console.ReadLine().ToUpper());
                Console.WriteLine();
                if (rank == 'U')
                {
                    Console.Write("What is your rank?: ");
                    string year = Console.ReadLine().ToLower();
                    Console.WriteLine();
                    Console.Write("Enter planned degree: ");
                    string degree = Console.ReadLine();
                    Console.WriteLine();

                    student = new UnderGrad(first, last, email, gpa, year, degree);
                    StudentsUW.Add(student);
                    Console.WriteLine("Student Created");
                    Console.WriteLine();
                }
                else if (rank == 'G')
                {
                    Console.Write("Enter Faculty Advisor: ");
                    string adv = Console.ReadLine();
                    Console.WriteLine();
                    Console.Write("Enter the number of financial tuition credits: ");
                    Decimal creds = Decimal.Parse(Console.ReadLine());
                    Console.WriteLine();

                    student = new GradStudent(first, last, email, gpa, adv, creds);
                    StudentsUW.Add(student);
                    Console.WriteLine("Student Created");
                    Console.WriteLine();
                }
                else
                {
                    Console.WriteLine("That is not valid option. Student not created");
                }
            }
            else
            {
                Console.WriteLine($"{email} already exists");
            }
        }

        // read student information method
        public Student ReadStudent(out string email)
        {
            Console.Write("Enter email: ");
            email = Console.ReadLine();
            Console.WriteLine();

            foreach (Student student in StudentsUW)
            {   
                if (email == student.Info.SchoolEmail)
                {
                    Console.WriteLine($"Found email: {email}");
                    Console.WriteLine();
                    return student;
                }
            }
            Console.WriteLine($"{email} not found");
            Console.WriteLine();
            return null;
        }

        // update student information method
        public void UpdateStudent() 
        {
            // to update, find student, remove it, and add it with new information

            // interface explaing updating student
            Console.WriteLine("To update student remove current one");
            Console.WriteLine("then, add it with new information");
            Console.Write("Press 'Enter' to continue: ");
            Console.ReadLine();
            Console.WriteLine();

            // find and delete student
            DeleteStudent();

            // add new one with new information
            CreateStudent();
        }

        // delete student method
        public void DeleteStudent()
        {
            string email = string.Empty;
            Student student = ReadStudent(out email);
            if (student != null)
            {
                StudentsUW.Remove(student);
                Console.WriteLine("Student Deleted");
                Console.WriteLine();
            }
            else
            {
                Console.WriteLine("Error. Student not found!");
            }
        }

        // print all students in database method
        public void PrintRecords()
        {
            Console.WriteLine("University of Washington Students");
            Console.WriteLine("*********************************");
            foreach (Student student in StudentsUW)
            {
                Console.Write(student.ToStringStudent());
                Console.WriteLine();
            }
        }

        // save student database method
        public void SaveDatabase()
        {
            // to save student database, save it to a text file
            WriteData();
        }

        // exit database method
        public void ExitDatabase()
        {
            EndProg();
            Environment.Exit(0);
        }

        // method to write database data to text file
        public void WriteData()
        {
            Console.WriteLine("Writing to text file...");
            Console.WriteLine();
            Console.WriteLine("******************** UW Student Records **************************");
            Console.WriteLine();
            StreamWriter outFile = new StreamWriter("OUTPUTUW.txt");
            foreach (Student students in StudentsUW)
            {
                outFile.WriteLine(students.ToStringFile());
                Console.WriteLine(students.ToStringFile());
            }
            Console.WriteLine("******************************************************************");
            outFile.Close();
        }
    }
}
