/**
 * 
 */
package cs141.mrlillo;

import java.util.*;

/**
 * @author marti
 *
 */
public class Disk {
	
	private int size;
	   
	   /**
	    * Creates a disk with size, width
	    * @param width
	    */
	   public Disk(int width){
		 this.size = width;
	   }
	   
	   /**
	    * returns size of the disk
	    * @return size
	    */
	   public int getSize(){
	      return this.size;
	   }
	   
	   /**
	    * sets the size of the disk
	    * @param width
	    */
	   public void setSize(int width){
	      this.size = width;
	   }

}
