/*
TCSS 143
Martin Lillo
StudentTicket Class
*/
import java.util.Random; // import number generator 

public class StudentTicket extends Ticket { // StudentTicket inherits from the Ticket superclass
   
   // student ticket data
   private boolean honors;
   
   public StudentTicket(double price, int daysEarly, boolean honors) { // student ticket constructor with superclass and instance parameters
      
      super(price, daysEarly);
      
      this.honors = honors;
   }
   
   // student ticket constructor with price and honors parameters
   public StudentTicket(double price, boolean honors) {
      
      super(price);
      
      this.honors = honors;
      
      if (honors = true) {
         
         price = super.getPrice() * (1/2) - 5;
      }
      else {
         
         price = super.getPrice() * (1/2);
      }
   }
   
   // create new methods for honor student conditions   
   public boolean isHonorStudent() {
      
      return this.honors;
   }
   
   public void setHonorStudent(boolean honors) {
      
      this.honors = honors;
   }
   
   //@verride getDaysEarly() method
   public int getDaysEarly() {
      
      return 14; // return days before "event"
   }
   
   
   public boolean checkTicket(StudentTicket t) {
      
      boolean checker = false;
      
      if ((t.getPromotionCode()).equals("KEXP call-in winner")) {
         
         return true;
      }
      
      return checker;
   }
   
      
   //@verride toString() method
   public String toString() {
      
      return "$" + getPrice() + " from " + getDaysEarly() + " days ago with promotional code " + getPromotionCode() + " (student)";
   }   
}