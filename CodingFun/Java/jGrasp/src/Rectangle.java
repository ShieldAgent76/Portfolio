/*
   TCSS 143
   Author: Raghavi Sakpal
   Demo of Abstract Classes & Interfaces
*/

public class Rectangle extends Shape {
   // Instane field
   private int length;
   
   // Constructor
   public Rectangle(int length, int width, String color) {
      super(width,color);
      this.length = length;
   }
   
   public Rectangle(int length, int width)   {
      super(width);
      this.length = length;
   }
   
   // get method: return length 
   public int getLength()  {
      return this.length;
   }
   
   // set method: set length 
   public void setLength(int length)   {
      this.length = length;
   }
   
   // get method: return length 
   public int getWidth()  {
      return getSide();
   }
   
   // set method: set length 
   public void setWidth(int width)   {
      setSide(width);
   }

   // Method: Calculate and return area of a rectangle
   public double area() {
      return this.length * getWidth();
   }
   
   // Method: Calculate and return perimeter of a circle 
   public double perimeter() {
      return 2 * (this.length + getWidth());
   }
   
   // @verride toString() method
   public String toString()   {
      return "Rectangle:\n" + "Length: " + this.length + "\nWidth:" + super.toString();
   }

}