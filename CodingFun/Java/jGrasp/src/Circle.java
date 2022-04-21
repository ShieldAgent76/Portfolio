/*
   TCSS 143
   Author: Raghavi Sakpal
   Demo of Abstract Classes & Interfaces
*/

public class Circle extends Shape {
   
   // Constructor 
   public Circle(int radius, String color)   {
      super(radius,color);
   }
   
   public Circle(int radius)  {
      super(radius);
   }
   
   // get method: Return radius
   public int getRadius()  {
      return getSide();
   }
   
   // set method: Update radius
   public void setRadius(int radius)   {
      setSide(radius);
   }
   
   // Method: Calculate and return area of a circle 
   public double area() {
      return PI * Math.pow(getRadius(),2);
   }
   
   // Method: Calculate and return perimeter of a circle 
   public double perimeter() {
      return 2 * PI * getRadius();
   }
   
   // @verride toString() method
   public String toString()   {
      return "Circle: \nRadius:" + super.toString();
   }
}