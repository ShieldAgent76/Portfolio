/*
   TCSS 143
   Driver Program for Lab 3
*/

public class TicketMain {
   public static void main(String[] args) {
      // Create a Student Ticket 
      StudentTicket t1 = new StudentTicket(100,true);
      t1.setPromotionCode("KEXP call-in winner");
      System.out.println(t1);
      
      // Generate a general ticket
      Ticket t2 = new Ticket(55, 40);
      System.out.println(t2);
      
      // Generate a student ticket
      StudentTicket t3 = new StudentTicket(90,false);
      t3.setPromotionCode("KEXP call-in winner");
      System.out.println(t3);
      
      // Check for equality
      System.out.println("Ticket t1 and Ticket t2 are equal: " + t1.equals((Ticket)t2));  // Should return false
      System.out.println("Ticket t1 and Ticket t3 are equal: " + t1.equals((StudentTicket)t3));  // Should return true
      
      // Total tickets generated 
      System.out.println("Total Tickets generated so far: " + Ticket.getTicketCount());
   }
}