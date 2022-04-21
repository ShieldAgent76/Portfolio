// T INFO 200 A, Winter 2022
// UW Tacoma SET, Charles Costarella (Chuck)
// L6oop
// StudentDB
// This is a database program to showcase student information for a school 
// This is the student class which contains information of the student
// 
// Change history
// Date ------ Developer ----- Description
// 3-4-22 ---- lillom -------- Created StudentInfo class
// 3-5-22 ---- lillom -------- Updated setter for email for accuracy of data (check if it contains "@uw.edu")

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudentDB
{
    public class StudentInfo
    {
        // student properties 
        public string FirstName { get; set; }
        public string LastName { get; set; }
        protected string schoolEmail;

        // default constructor
        public StudentInfo()
        {
            FirstName = "";
            LastName = "";
            schoolEmail = "";
        }

        // student info constructor
        public StudentInfo(string first, string last, string email)
        {
            FirstName = first;
            LastName = last;
            schoolEmail = email;
        }

        // school email getter and setter
        public string SchoolEmail
        {
            get
            {
                return schoolEmail;
            }
            set
            {
                if (value.Contains("@uw.edu") && value.Length > 3)
                {
                    schoolEmail = value;
                }
                else
                {
                    Console.WriteLine("Not a valid email address");
                }
            }
        }

        // toString method to print student legal info for contact
        public string ToStringContact()
        {
            return $"  First Name: {FirstName}\n" +
                   $"   Last Name: {LastName}\n" +
                   $"School Email: {schoolEmail}\n";
        }
    }
}