// T INFO 200 A, Winter 2022
// UW Tacoma SET, Charles Costarella (Chuck)
// L6oop
// StudentDB
// This is a database program to showcase student information for a school 
// This is the undergraduate student class which contains properties of a typical student with extra info
// 
// Change history
// Date ------ Developer ----- Description
// 2-14-22 --- lillom -------- Created Student, Undergrad, and Grad class
// 2-16-22 --- lillom -------- Updated Student class documentation
// 2-16-22 --- lillom -------- Created custom toString methods for the student classes
// 2-16-22 --- lillom -------- Updated method names to fit C# naming conventions, updated constructors with base
// 2-23-22 --- lillom -------- Updated UnderGrad toString method

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StudentDB
{
    // undergrad class inherited from student
    public class UnderGrad : Student
    {
        // undergrad properties
        public string YearRank { get; set; }
        public string DegreeProg { get; set; }

        // default undergrad constructor
        public UnderGrad() : base()
        {
            YearRank = "";
            DegreeProg = "";
        }

        // undergrad constructor
        public UnderGrad(string first, string last, string email, double gpa, string year, string degree)
            : base(new StudentInfo(first, last, email), gpa)
        {
            YearRank = year;
            DegreeProg = degree;
        }

        // to string method for undergrad class
        public override string ToStringStudent()
        {
            return $"  First Name: {Info.FirstName}\n" +
                   $"   Last Name: {Info.LastName}\n" +
                   $"School Email: {Info.SchoolEmail}\n" +
                   $"         GPA: {gradePtAvg}\n" +
                   $"   Year Rank: {YearRank}\n" +
                   $"      Degree: {DegreeProg}\n";
        }

        // to string method for student objects for files
        public override string ToStringFile()
        {
            return $"{Info.FirstName}\n" +
                   $"{Info.LastName}\n" +
                   $"{Info.SchoolEmail}\n" +
                   $"{gradePtAvg}\n" +
                   $"{YearRank}\n" +
                   $"{DegreeProg}\n";
        }
    }
}
