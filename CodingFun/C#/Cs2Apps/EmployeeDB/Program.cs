// T INFO 200 A, Winter 2022
// UW Tacoma SET, Martin Lillo
// Cs2
// EmployeeDB
// This program demonstrates how classes work in C#
// 
// Change History
// Date ----- Developer ----- Description
// 2-7-22 --- lillom -------- Created Cs2Apps
// 2-7-22 --- lillom -------- Created constructors and instance variables
// 2-8-22 --- lillom -------- Created the MonthSalary instance variable with custom getter and setter
// 2-8-22 --- lillom -------- Override toString method for console output
// 2-9-22 --- lillom -------- Changed variable names to fit C# standards
// 2-11-22 -- lillom -------- Added employee objects with same parameters except 10% raise to salary
// 2-11-22 -- lillom -------- Added user interfaces
// 2-12-22 -- lillom -------- Created another employee object to showcase negative salary

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// namespace to hold everything for EmployeeDB program
namespace EmployeeDB
{
    // driver class for the main method
    internal class Program
    {   
        // driver method to execute program
        static void Main(string[] args)
        {
            // employee objects
            Employee employeeDef = new Employee(); // default constructor
            Employee employeeNeg = new Employee("Aaron", "Rodgers", -5.4m); // negative salary
            Employee employee1 = new Employee("Martin", "Lillo", 16.6m); // correct values
            Employee employee2 = new Employee("Haha", "Clinton-Dix", 76250.7m); // correct values
            Employee employee3 = new Employee("Tommy", "Poor", 1000.1m); // correct values

            // user interfaces welcome section
            Console.WriteLine("Welcome to the Green Bay Packers Employee Database");
            Console.WriteLine("**************************************************");
            Console.WriteLine();
            Console.WriteLine("This program demonstrates how classes and objects work in C# " +
                "by creating a database of employee objects.");
            Console.WriteLine();
            Console.Write("Let's get started! Press 'Enter' to begin: ");
            Console.ReadLine();
            Console.WriteLine();

            // outline of employee database interface
            Console.WriteLine("Here's what the employee database shows:");
            Console.WriteLine("****************************************");
            Console.WriteLine();
            Console.WriteLine(employeeDef);
            Console.WriteLine();
            Console.Write("Press 'Enter' to enter continue: ");
            Console.ReadLine();
            Console.WriteLine();

            // outline of employee database interface with negative salary
            Console.WriteLine("Employee salary cannot be negative,");
            Console.WriteLine("otherwise, it will show zero for salary.");
            Console.WriteLine();
            Console.WriteLine("Example");
            Console.WriteLine("*******");
            Console.WriteLine();
            Console.WriteLine(employeeNeg);
            Console.WriteLine();
            Console.Write("Press 'Enter' to enter database: ");
            Console.ReadLine();
            Console.WriteLine();

            // user interface employee section
            Console.WriteLine("Green Bay Packers Employees");
            Console.WriteLine("***************************");

            // employee objects in string
            Console.WriteLine(employee1);
            Console.WriteLine(employee2);
            Console.WriteLine(employee3);

            // user interface employee with 10% raise
            Console.WriteLine("Green Bay Packers Employees with 10% raise");
            Console.WriteLine("******************************************");

            // employee objects in string with 10% raise
            Console.WriteLine(employee1.ToStringRaise());
            Console.WriteLine(employee2.ToStringRaise());
            Console.WriteLine(employee3.ToStringRaise());
        }
    }
}
