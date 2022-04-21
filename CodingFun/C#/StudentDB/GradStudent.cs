// T INFO 200 A, Winter 2022
// UW Tacoma SET, Charles Costarella (Chuck)
// L6oop
// StudentDB
// This is a database program to showcase student information for a school 
// This is the graduate student class which contains properties of a typical student with extra info
// 
// Change history
// Date ------ Developer ----- Description
// 2-14-22 --- lillom -------- Created Student, Undergrad, and Grad class
// 2-16-22 --- lillom -------- Updated Student class documentation
// 2-16-22 --- lillom -------- Created custom toString methods for the student classes
// 2-16-22 --- lillom -------- Updated method names to fit C# naming conventions, updated constructors with base
// 2-23-22 --- lillom -------- Updated GradStudent toString method
// 2-23-22 --- lillom -------- Changed tuitionCred from double to int
// 3-4-22 ---- lillom -------- Changed tuitionCred from int to Decimal

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudentDB
{
    // graduate student class inherited from student
    public class GradStudent : Student
    {
        // grad properties
        public string FacultyAdv { get; set; }

        protected Decimal tuitionCred;

        // default grad constructor
        public GradStudent() : base()
        {
            FacultyAdv = "";
            tuitionCred = 0;
        }

        // grad constructor
        public GradStudent(string first, string last, string email, double gpa, string faculty, Decimal tuition)
            : base(new StudentInfo(first, last, email), gpa)
        {
            FacultyAdv = faculty;
            tuitionCred = tuition;
        }

        // tuitionCred getter and setter
        public Decimal TuitionCred
        {
            get
            {
                return tuitionCred;
            }
            set
            {
                if (value < 0)
                {
                    Console.WriteLine("Error. Tuition credits cannot be below 0.");
                }
                else
                {
                    tuitionCred = value;
                }
            }
        }

        // to string method for graduate class
        public override string ToStringStudent()
        {
            return $"  First Name: {Info.FirstName}\n" +
                   $"   Last Name: {Info.LastName}\n" +
                   $"School Email: {Info.SchoolEmail}\n" +
                   $"         GPA: {gradePtAvg}\n" +
                   $"     Advisor: {FacultyAdv}\n" +
                   $"     Credits: {tuitionCred}\n";
        }

        // to string method for student objects for files
        public override string ToStringFile()
        {
            return $"{Info.FirstName}\n" +
                   $"{Info.LastName}\n" +
                   $"{Info.SchoolEmail}\n" +
                   $"{gradePtAvg}\n" +
                   $"{FacultyAdv}\n" +
                   $"{tuitionCred}\n";
        }
    }
}
