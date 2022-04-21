
// Lab1a.java
  // This short class has several bugs for practice.
  // Authors: Carol Zander, Rob Nash, Clark Olson, you
  public class Lab1a 
  {
    public static void main(String[] args) 
    {
      compareNumbers();
      calculateDistance();
    }

    public static void compareNumbers() 
    {
      int firstNum = 5;
      int secondNum = 3;
      System.out.println("Sum is:" + (firstNum + secondNum));
      System.out.println("Difference is:" + (firstNum - secondNum));
      System.out.println("Product is:" + (firstNum * secondNum));
    }

    public static void calculateDistance() 
    {
      int velocity = 10; //miles-per-hour
      int time = 2; //hoursint
      int distance = velocity * time;
      System.out.println("Total distance is:" + distance);
    }
  }
