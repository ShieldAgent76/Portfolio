/*
   TCSS 143
   Author: Raghavi Sakpal
   Demo of Abstract Classes & Interfaces
*/

public abstract class Shape implements ShapeInterf, Comparable<Shape>{
   // Instance fields 
   private int side;          // Every shape has as a side 
   private String color;      // Every shape has a color 
   
   private static int shpCount = 0 ;
   
   // Abstract Methods
   //public abstract double area();
   //public abstract double perimeter();
   
   // Constructor 
   public Shape(int side, String color)   {
      if(side <=0)
         throw new IllegalArgumentException("Side cannot be 0 or negative");
      this.side = side;
      this.color = color;
      shpCount++;
   }
   
   public Shape(int side)  {
      this(side,"green");
   }
   
   // get method: Return side 
   public int getSide() {
      return this.side;
   }
   
   // set method: Update side
   public void setSide(int side) {
      this.side = side;
   }
   
   // get method: Return color 
   public String getColor() {
      return this.color;
   }
   
   // set method: Update color
   public void setColor(String color) {
      this.color = color;
   }
   
   // @verride toString() method
   public String toString()   {
      return this.side + "\nColor: " + this.color;
   }
   
   // Method to return shape count
   public static int getShapeCount()   {
      return shpCount;
   }
   
   // Implement the compareTo() methods
   public int compareTo(Shape s) {
      return (int)(area() - s.area());
   }
}


   