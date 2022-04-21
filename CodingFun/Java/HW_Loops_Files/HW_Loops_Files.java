import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Martin Lillo
 * with help from Dagem
 */
public class HW_Loops_Files 
{
    public static void main(String[] args)
    {
        int courseNumber; //course number
        
        Scanner inputFile = null;
        
        try 
        {
            inputFile = new Scanner(new FileInputStream("courseData-2.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }

        double programWeight = inputFile.nextDouble(); //get program score
        double midtermWeight = inputFile.nextDouble(); //get midterm score
        double finalWeight = inputFile.nextDouble(); //get final score
        double average = 0;
        int count = 0;
        
        //Per class, print a table of ID numbers, grades, weighted average
        //    per student, and a Pass or Fail programs grade.  The class
        //    average is also printed.
        for (int i = 0; i < 3; i++) 
        {
            // Read class number, print class number title, headings.
            courseNumber = inputFile.nextInt();
    
            //... rest of the code goes here ...
            System.out.println("Grade Data For Class " + courseNumber);
            System.out.println(String.format("%10s %10s %10s %10s %20s %20s", 
                                             "ID", "Programs", "Midterm", "Final",
                                             "Weighted Average", "Programs Grade"));
            System.out.println(String.format("%10s %10s %10s %10s %20s %20s",
                                             "--", "-------", "-------", "------",
                                             "----------------", "--------------"));
    
            int programScore = 0;
            int midtermScore = 0;
            int finalScore;
            String classGrade;

            while (inputFile.hasNextInt()) 
            {
                int courseID = inputFile.nextInt();

                if (courseID > 0) 
                {
                    count++;
                    
                    for (int j = 0; j < 3; j++) 
                    {
                        int grade = inputFile.nextInt();

                        if (j == 0) 
                        {
                            programScore = grade;
                        }
                        
                        else if (j == 1) 
                        {
                            midtermScore = grade;
                        }
                        
                        else 
                        {
                            finalScore = grade;

                            double weightedAverage = (programWeight * programScore) + (midtermWeight * midtermScore)
                                                     + (finalWeight * finalScore);

                            if (programScore < 70)
                            {
                                classGrade = "Fail";
                            }
                            
                            else 
                            {
                                classGrade = "Pass";
                            }

                            System.out.println(String.format("%10s %10s %10s %10s %20s %20s",
                                                            courseID, programScore, midtermScore, finalScore,
                                                            weightedAverage, classGrade));

                            average += weightedAverage;
                        }
                    }
                }
                
                else 
                {
                    break;
                }
            }

            System.out.println("\nClass average: " + average / count);
            System.out.println();
        }
    }
}
