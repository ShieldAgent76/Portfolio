import java.util.Scanner;

public class Lab3d 
{
  public static void main(String[] args) 
  {
    Scanner myInput = new Scanner(System.in);
    
    System.out.println("Enter (3) digits: ");
    int X = myInput.nextInt();
    int Y = myInput.nextInt();
    int Z = myInput.nextInt();
    sort (X,Y,Z);
  }
    
  public static int findMid(int X, int Y, int Z) 
  {
    int third = Math.max(Math.max(X,Y), Math.max(X,Z));
    int min = Math.max(Math.min(third,X), Math.min(third,Y));
    int max = Math.max(Math.min(third,Y), Math.min(third,Z));
    int mid = Math.max(Math.min(third,X), Math.min(third,Z));
    return Math.min(Math.min(min, max), Math.min(min, mid));
  }
    
  public static void sort(int X, int Y, int Z)
  {
    System.out.println(Math.min(Math.min(X,Y), Math.min(X,Z)) + " " + findMid(X,Y,Z) + " " + Math.max(Math.max(X,Y), Math.max(X,Z)));
  }
}
