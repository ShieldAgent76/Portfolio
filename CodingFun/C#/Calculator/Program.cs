////////////////////////////////////////////////////////////////////
/// T INFO 200 A, Winter 2022
/// UW Tacoma SET, Charles Costarella (Chuck)
/// L4calc
/// Calculator
/// This is a calculator program created from C#
/// Has basic function of calculator (addition, multiplication, etc)
/// 
/// Change history
/// Date ------ Developer ----- Description
/// 1-26-22 --- lillom -------- Created Calculator program
/// 1-28-22 --- lillom -------- c# calculator code from link:
/// https://www.instructables.com/Creating-a-Calculator-Visual-Studio-C/
/// 1-29-22 --- lillom -------- program.cs will not be touched all of the time, most of the work is on Form1.cs
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Windows.Forms;

// namespace will hold the calculator program
namespace Calculator
{
    // only class used for calculator program
    internal static class Program
    {
        // only method used for calculator program
        /// <summary>
        /// The main entry point for the application.
        /// </summary>
        [STAThread]
        static void Main()
        {
            Application.EnableVisualStyles();
            Application.SetCompatibleTextRenderingDefault(false);
            Application.Run(new Form1());
        }
    }
}
