// T INFO 200 A, Winter 2022
// UW Tacoma SET, Charles Costarella (Chuck)
// L6oop
// StudentDB
// This is a database program to showcase student information for a school
// This is the main program that will run the application
// 
// Change history
// Date ------ Developer ----- Description
// 2-14-22 --- lillom -------- Created l6oop
// 2-16-22 --- lillom -------- created interfaces and list for student objects
// 2-23-22 --- lillom -------- Updated main menu for better user experience
// 2-23-22 --- lillom -------- Created methods for the main menu
// 2-28-22 --- lillom -------- Updated documentation for updating student, added IO to system
// 3-4-22 ---- lillom -------- Updated documentation for Program.cs

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudentDB
{ 
    // class where the driver method will be held
    internal class Program
    {
        // driver method
        static void Main(string[] args)
        {
            UWDatabase app = new UWDatabase();

            app.RunApp();
        }
    }
}
