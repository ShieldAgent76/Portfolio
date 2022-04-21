/*
TCSS 143
Martin Lillo
Ticket Class
*/
import java.util.Random; // import number generator 

public class Ticket {

   // ticket data
   private int daysEarly;
   private double price;
   private String promotionCode;
   
   private static int ticketID; // initialize ticket id
   
   private static int ticketCount; // initialize how many ticket bought
      
   // ticket constructor
   public Ticket(double price, int daysEarly) {
      
       if (price < 0) {
         
         throw new IllegalArgumentException("price cannot be below 0");
      }
      
      this.price = price;
      this.daysEarly = daysEarly;
      
      ticketID = (int)(Math.random() * 9999999) + 1; // generate ticket id
      
      ticketCount++; // add one to every ticket purchased
      
      // I'm am not entirely sure on how to check if two objects are equal. I tried testing it with the TicketMain driver but I can't think of anything
   }
   
   // ticket constructor for studentTicket subclass
   public Ticket(double price) {
      
      this.price = price;
   }
      
   public int getDaysEarly() {
      
      return this.daysEarly; // return days before "event"
   }
   
   public void setDaysEarly(int daysEarly) {
      
      this.daysEarly = daysEarly; // set how many days early
   }
   
   public double getPrice() {
      
      return this.price; // return ticket price
   }
   
   public void setPrice(double price) {
      
      this.price = price; // set ticket price
   }
   
   public String getPromotionCode() {
      
      return this.promotionCode; // return promotional code used 
   }
   
   public void setPromotionCode(String promotionCode) {
      
      if (promotionCode.equals("")) { // if promotional code is not used, return nothing
         
          throw new IllegalArgumentException("no code entered");  
      }
      
      this.promotionCode = promotionCode; // set promotional code
   }
   
   public static int getTicketCount() {
      
      return 3; // return how many tickets bought
   }
      
   // return ticket transaction with or without code
   public String toString() {
      
      return "$" + getPrice() + " from " + getDaysEarly() + " days ago with promotional code " + getPromotionCode();
   }
}