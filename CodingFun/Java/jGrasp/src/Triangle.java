/*
   TCSS 143
   Author: Raghavi Sakpal
   Demo of Abstract Classes & Interfaces
*/

public class Triangle extends Shape {
   // Instane field
   private int length;
   private int height;
   
   // Constructor
   public Triangle(int length, int width, int height, String color) {
      super(width,color);
      this.length = length;
      this.height = height;
   }
   
   public Triangle(int length, int width, int height)   {
      super(width);
      this.length = length;
      this.height = height;
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

   // get method: return height 
   public int getHeight()  {
      return this.height;
   }
   
   // set method: set height 
   public void setHeight(int length)   {
      this.height = height;
   }
   
   // Method: Calculate and return area of a rectangle
   public double area() {
      double s = (this.length + getWidth() + this.height)/2.0;
      return Math.sqrt(s * (s-this.length) * (s-getWidth()) * (s-this.height));
   }
   
   // Method: Calculate and return perimeter of a circle 
   public double perimeter() {
      return (this.length + getWidth() + this.height);
   }
   
   // @verride toString() method
   public String toString()   {
      return "Rectangle:\n" + "Length: " + this.length + "\nHeight: " + this.height + "\nWidth:" + super.toString();
   }

}