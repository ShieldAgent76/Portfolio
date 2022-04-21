/*
Martin Lillo
PA3
Disk class for the disk object
*/
import java.util.*;

public class Disk implements Comparable<Disk> {
   
   // fields of disk
   private int width;
   
   // disk constructor
   public Disk(int width) {
      this.width = width;
   }
   
   // disk methods
   public int getWidth() {
      return width;
   }
   
   // compareTo method for our disk
   public int compareTo(Disk disk) {
      
      if (this.width > disk.width) {
         return 1;
      }
      else if (this.width < disk.width) {
         return -1;
      }
      else {
         return 0;
      }
   }
}