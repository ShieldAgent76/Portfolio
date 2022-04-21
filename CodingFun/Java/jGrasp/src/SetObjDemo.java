/*
   TCSS 143
   Author:    Raghavi Sakpal
   Description: Set Demo with Objects
*/
import java.util.*;

public class SetObjDemo {
   public static void main(String[] args) {
      // Declare a HashSet of Point (use Polymorphism)
      Set<Point> ptSet1 = new HashSet<Point>();
   
      // Add few instances of Point & Point3D
      ptSet1.add(new Point());
      ptSet1.add(new Point3D(4,4,4));
      ptSet1.add(new Point());          // duplicate entry for x = 0, y = 0
      ptSet1.add(new Point(-4,-4));
      ptSet1.add(new Point3D(-2,3,-1));
      ptSet1.add(new Point3D(-2,3,-1)); // duplicate entry for x = -2, y = 3, z = -1
   
      // Display the ptSet 
      System.out.println("Example of HashSet:" + ptSet1);
      
      // Declare a HashSet of Point (use Polymorphism)
      Set<Point> ptSet2 = new TreeSet<Point>();
   
      // Add few instances of Point & Point3D
      ptSet2.add(new Point());
      ptSet2.add(new Point3D(4,4,4));
      ptSet2.add(new Point());          // duplicate entry for x = 0, y = 0
      ptSet2.add(new Point(-4,-4));
      ptSet2.add(new Point3D(-2,3,-1));
      ptSet2.add(new Point3D(-2,3,-1)); // duplicate entry for x = -2, y = 3, z = -1
   
      // Display the ptSet 
      System.out.println("Example of TreeSet:" + ptSet2);
      
      // Display distance from origin for HashSet ptSet1
      System.out.println("Displaying distance from origin of each point");
      displayDistance(ptSet1);
      
      // Remove Points with distance less than 3 from origin 
      removePoint(ptSet2);
      System.out.println("Updated point set:" + ptSet2);

   }
   
   /* 
      Method: Display distance of each point from origin
      Parameter: Set<Point>
      Return: none
   */
   public static void displayDistance(Set<Point> ptSet)  {
      // Loop and display distance of each point from origin 
      for(Point p: ptSet)  {
         System.out.println("Distance from origin for point" + p + " is:" + p.distanceOrigin());
      }
   }
   
   /* 
      Method: Remove Points with distance less than 3 from origin 
      Parameter: Set<Point>
      Return: none
   */
   public static void removePoint(Set<Point> ptSet)   {
      // Declare an iterator 
      Iterator<Point> itr = ptSet.iterator();
      
      // Loop till end of the Set 
      while(itr.hasNext()) {
         Point p = itr.next();      // Store point 
         if(p.distanceOrigin() < 3) {
            // ptSet.remove(p);        // Careful ! Concurrent Modification Exception 
            itr.remove();
         }
      }
   }
}