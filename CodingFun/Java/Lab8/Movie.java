/*
   TCSS 143
   Author: Martin Lillo
   Description: Movie Object Class
*/
import java.util.*;

public class Movie implements Comparable
{
   // Variable to store Movie Title 
   private String title;
   // Variable to store Movie release date
   private int year;
   
   // Default Constructor   
   public Movie() 
   {
      this.year = 0;
      this.title = "";
   }
   
   // Constructor: create an instance of Movie with parameter Title & Release Year 
   public Movie(String title, int year) 
   {
      this.title = title;
      this.year = year;
   }
   
   // Method: Return Movie Title    
   public String getName()
   {
      return title;
   }
   
   // TO DO: @verride toString() method to return String representation of Movie info (Title & Year) 
   public String toString()
   {
      // Add the code for toString() here.
      return title + "\nYear: " + Integer.toString(year);    
   }
    
   /*
      TO DO
      Method: To compare this instance of Movie with Movie parameter to see if they are equal (title & release date).
      Parameter: Object obj
      Return: boolean true/or false
   */  
   public boolean equals( Object obj )
   {
      // Add the code for equals() here.
      if (title.equals(this.title) && year == this.year) {
         return true;
      }
      else { 
         return false;
      }
   }
   
   /*
      TO DO
      Method: To compare this instance of Movie with Movie parameter to return <, > or == based on relsease date
              If release year is same then compare based on Movie Title.
      Parameter: Object obj
      Return: int
   */   
   public int compareTo( Object obj )
   {
      // Add the code for compareTo() here.
      
      Movie movie = (Movie) obj;
      int check = 0;
      
      if (this.year > movie.year) {
         return 1;
      }
      else if (this.year < movie.year) {
         return -1;
      }
      else if (this.year == movie.year) {
         return this.title.compareTo(movie.title);
      }
      return check;   
   }
}
/*
class sortMovies implements Comparator<Movie> {
   
   public int compare(Movie movie1, Movie movie2) {
      return movie2.compareTo(movie1);
   }
}
*/