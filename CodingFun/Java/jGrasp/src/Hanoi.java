/*
Martin Lillo
PA3
Hanoi clas for the hanoi object
*/
public class Hanoi {

   private int n;
   
   // three rod objects
   private Rod rod1; // source rod
   private Rod rod2; // auxiliary rod
   private Rod rod3; // target rod
   
   // hanoi constructor
   public Hanoi(int n) {
      
      this.n = n; // n reperesents disks
      
      rod1 = new Rod(n);
      rod2 = new Rod(0);
      rod3 = new Rod(0);
   }
   
   // string output for hanoi object
   public String printStatus() {
      return "Rod A: " + rod1.toString() + "\nRod B: " + rod2.toString() + "\nRod C: " + rod3.toString();
   }
   
   // method to move disks
   private void move(Rod rod1, Rod rod2) {
      
      Disk moveDisk = rod1.removeDisk();
      rod2.addDisk(moveDisk);
   }
   
   // recursive method
   public void recursiveTOH() {
      
      if (n == 1) { // base case
         if (rod1.getNumDisks() == 0) {
            move(rod2, rod3);
         }
         else if (rod2.getNumDisks() == 0) {
            move(rod1, rod3);
         }
         printStatus();
      }
      else { 
         move(rod1, rod2);
         if (rod2.getNumDisks() == 1) {
            move(rod1, rod3);
         }
         printStatus();
         recursiveTOH();
      }
   }
   
}