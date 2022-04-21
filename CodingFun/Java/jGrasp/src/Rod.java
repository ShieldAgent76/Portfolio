/*
Martin Lillo
PA3
Rod class for the rod object
*/
import java.util.*;

public class Rod {
   
   private int n;
   
   // linkedlist to store disks
   private LinkedList<Disk> diskStorage;
   private int storageIndex;
   
   // rod constructor
   public Rod(int n) {
      
      this.n = n; // n represents disks
      this.diskStorage = new LinkedList<Disk>(); // initialize linkedlist for disk storage
      this.storageIndex = diskStorage.size();
      
      for (int i = 0; i < n; i++) {         
         diskStorage.add(new Disk(i + 1)); // for n disks inputed, add them into the list
      } 
   }
   
   // method to get number of disks
   public int getNumDisks() {   
     return diskStorage.size();
   }
   
   // method to return top disk
   public Disk getDisk() {
      return diskStorage.get(storageIndex);
   }

   // method to remove disk
   public Disk removeDisk() {
      
      getDisk();
      return diskStorage.remove(storageIndex);
   }
   
   // method to add disk
   public void addDisk(Disk newDisk) {
      
      Disk topDisk = new Disk(0);
      
      if (storageIndex < 0) {
         storageIndex = 0;
      }
      else if (storageIndex != 0) {
         topDisk = diskStorage.get(storageIndex);
      }
      else if (topDisk.getWidth() >= newDisk.getWidth() || storageIndex == 0) { 
         diskStorage.add(storageIndex, newDisk);
      } 
   }

   // toString method
   public String toString() {
      
      String statement = "";
      
      for (int i = n - 1; i >= 0; i--) {
         statement += diskStorage.get(i).getWidth() + " "; // I was having rouble at line 67 because somehow it tells me that my index is out of bounds or something like that
      }
      return statement;
   }
}