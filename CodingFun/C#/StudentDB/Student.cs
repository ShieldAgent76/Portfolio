// T INFO 200 A, Winter 2022
// UW Tacoma SET, Charles Costarella (Chuck)
// L6oop
// StudentDB
// This is a database program to showcase student information for a school 
// This is the student class which contains properties of a typical student
// 
// Change history
// Date ------ Developer ----- Description
// 2-14-22 --- lillom -------- Created Student, Undergrad, and Grad class
// 2-16-22 --- lillom -------- Updated Student class documentation
// 2-16-22 --- lillom -------- Created custom toString methods for the student classes
// 2-16-22 --- lillom -------- Updated method names to fit C# naming conventions, updated constructors with base
// 2-23-22 --- lillom -------- Updated toString method so that it would be more effecient to print info
// 2-28-22 --- lillom -------- Changed email property from protected to public
// 3-2-22 ---- lillom -------- Changed email property from public to protected and created custom setter for email value
// 3-4-22 ---- lillom -------- Put first and last name and school email properties to StudentInfo

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudentDB
{ 
    // base student class to hold student properties
    public class Student
    {
        // student properties 
        public StudentInfo Info { get; set; }
        protected double gradePtAvg;

        // default student constructor
        public Student()
        {
            Info = null;
            gradePtAvg = 0;
        }

        // student constructor
        public Student(StudentInfo info, double gpa)
        {
            Info = info;
            gradePtAvg = gpa;
        }

        // gpa getter and setter
        public double GradePtAvg
        {
            get
            {
                return gradePtAvg;
            }
            set
            {
                if (value >= 0.0 && value <= 4.0)
                {
                    gradePtAvg = value;
                }
                else
                {
                    gradePtAvg = 0.0;
                }
            }
        }

        // toString method to print student info for school
        public virtual string ToStringStudent()
        {
            return $"  First Name: {Info.FirstName}\n" +
                   $"   Last Name: {Info.LastName}\n" +
                   $"School Email: {Info.SchoolEmail}\n" +
                   $"         GPA: {gradePtAvg}\n";
        }

        // toString method for file output
        public virtual string ToStringFile()
        {
            return $"{Info.FirstName}\n" +
                   $"{Info.LastName}\n" +
                   $"{Info.SchoolEmail}\n" +
                   $"{gradePtAvg}\n";
        }
    }
}
