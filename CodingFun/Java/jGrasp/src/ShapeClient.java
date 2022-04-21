/*
   TCSS 143
   Author: Raghavi Sakpal
   Demo of Abstract Classes & Interfaces
*/

public class ShapeClient   {
   public static void main(String[] args) {
      Circle circ = new Circle(12);
      Rectangle rect = new Rectangle(4, 7);
      Triangle tri = new Triangle(5, 12, 13);
      printInfo(circ);	
      printInfo(tri);
      printInfo(rect);
      
      // use abstract class to create instances of different shapes
      Shape[] shapes = {tri, circ, rect}; 
      
      // use interface to create instances of different shapes 
      ShapeInterf[] shapes2 = {new Circle(5,"white"), new Triangle(3,4,2,"blue"), new Rectangle(5,5)};
      
      // Loop throug the shape2 array and print area() and perimeter()
      for(ShapeInterf sh: shapes2)
         printInfo(sh);
      
      // Comparing Shapes:
      if(tri.compareTo(circ) < 0)
         System.out.println("Area of Triangle is less than Area of Circle");
      else if(tri.compareTo(circ) > 0)
         System.out.println("Area of Triangle is greater than Area of Circle");
      else 
         System.out.println("Triangle and Circle have same area");
      
      // Display the total number of shapes created in this client
      System.out.println("Shape Count: " + Shape.getShapeCount());
      
   }
   
   /* 
      Method: To print area and perimeter of different shapes 
      Parameter: Shape (abstract class)
      Return: None
   */
   public static void printInfo(Shape s) {
	    System.out.println("The shape: " + s);
	    System.out.println("area : " + s.area());
	    System.out.println("perim: " + s.perimeter());
   }
   
   /* 
      Method: To print area and perimeter of different shapes 
      Parameter: ShapeInterf (Interface)
      Return: None
   */
   public static void printInfo(ShapeInterf s) {
	    System.out.println("The shape: " + s);
	    System.out.println("area : " + s.area());
	    System.out.println("perim: " + s.perimeter());
   }

}