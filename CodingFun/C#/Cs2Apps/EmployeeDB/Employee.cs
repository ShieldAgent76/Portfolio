// T INFO 200 A, Winter 2022
// UW Tacoma SET, Martin Lillo
// Cs2
// EmployeeDB
// This program demonstrates how classes work in C#
// 
// This is the employee class, it contains properties of the employee object 
//
// Change History
// Date ----- Developer ----- Description
// 2-7-22 --- lillom -------- Created Cs2Apps
// 2-9-22 --- lillom -------- Created Employee class for the Employee object
// 2-11-22 -- lillom -------- added comments for instance variables clarification
// 2-11-22 -- lillom -------- multiplied 12 to monthly salary to get yearly salary
// 2-11-22 -- lillom -------- added if statement to constuctor that set salary as zero if it is below 0
// 2-12-22 -- lillom -------- updated information about employee class

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EmployeeDB
{
    // Employee class
    public class Employee
    {
        // Employee instance variables with auto-implemented properties on some
        private string firstName { get; set; }
        private string lastName { get; set; }
        private decimal monthSalary;

        // default contructor
        public Employee()
        {
            firstName = "";
            lastName = "";
            monthSalary = 0.0m;
        }

        // employee constructor
        public Employee(string first, string last, decimal salary)
        {
            firstName = first;
            lastName = last;
            monthSalary = salary;

            if (salary < 0)
            {
                monthSalary = 0.0m;
            }
        }

        // employee object string output
        public override string ToString()
        {
            return "First Name: " + firstName + "\nLast Name: " + lastName
                + "\nYearly Salary: " + (monthSalary * 12) + "\n";
        }

        // employee object string output with 10% raise
        public string ToStringRaise()
        { 
            return "First Name: " + firstName + "\nLast Name: " + lastName
                + "\nYearly Salary with 10% raise: " + ((monthSalary + monthSalary * 0.1m) * 12) + "\n";
        }
    }
}
