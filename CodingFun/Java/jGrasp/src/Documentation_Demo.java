import java.util.Scanner;

public class Documentation_Demo {

   public static final int TOTAL_STUDENTS = 10;
   
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      
      int[] testScores = new int [TOTAL_STUDENTS];
      double classAverage = 0.0;
      
      int totalPassed = 0;
      
      getTestScores(testScores, keyboard);
      classAverage = getTestAverage(testScores);
      totalPassed = getTotalPassed(testScores);
      displayResults(testScores, classAverage, totalPassed);
   }

   public static void getTestScores(int[] theTestScores, Scanner theKeyboard) {
      
      for (int i = 1; i <= TOTAL_STUDENTS; i++) {
         System.out.printf("Enter test score #%2d: ", i);
         theTestScores[i - 1] = theKeyboard.nextInt();
      }
         
         System.out.println();
   }
   
   public static double getTestAverage(int[] theTestScores) {
   
      double sum = 0.0;
      
      for (int i = 0; i < TOTAL_STUDENTS; i++) {
         
         sum += theTestScores[i];
      }
      return sum / TOTAL_STUDENTS;
   }
   
   public static int getTotalPassed(int[] theTestScores) {
      
      int totalPassingSum = 0;
      
      int i = 0;
      while (i < TOTAL_STUDENTS) {
         if (theTestScores[i] >= 75) {
            totalPassingSum++;
         }
         i++;
      }
      return totalPassingSum;
   }
   
   public static void displayResults(int[] theTestScores, double theClassAverage, int theTotalPassed) {
      String output = "The class average = " + theClassAverage + "%\n" + "The total passing = " + theTotalPassed + "\n" + "All test scores are in:\n";
      
      for (int i = 0; i < TOTAL_STUDENTS; i++) {
         output += String.format("\t Test #%2d:%4d\n", i + 1, theTestScores[i]);
      }
      System.out.println(output);
   }
}
      