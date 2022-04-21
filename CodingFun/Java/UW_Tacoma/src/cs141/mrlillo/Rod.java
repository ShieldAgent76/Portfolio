/**
 * 
 */
package cs141.mrlillo;

import java.util.*;

/**
 * @author marti
 *
 */
public class Rod {
	
	private List<Disk> diskStack;
	private char name;
	
	/**
	 * initalizes a rod with a name, the Name, and the number of disks, diskNum
	 * @param theName
	 * @param diskNum
	 */
	public Rod(char theName, int diskNum) {
		this.name = theName;
		this.diskStack = new ArrayList<Disk>();
		for(int i=0;i<diskNum;i++){
			Disk newDisk = new Disk(diskNum-i);
			this.diskStack.add(newDisk);
		}
		
	}
	
	/**
	 * returns name of the Rod
	 * @return this.name
	 */
	public char getName(){
		return this.name;
	}
	
	/**
	 * pops a disk off the top of the rod and returns that disk
	 * @return theReturn
	 */
	public Disk getDisk(){
		int diskIndex = diskStack.size()-1;
		Disk toReturn = diskStack.get(diskIndex);
		diskStack.remove(diskIndex);
		return toReturn;
	}
	
	/**
	 * Adds a disk to a rod returns true upon successful or false on failure
	 * @param toAdd
	 * @return true/false
	 */
	public boolean addDisk(Disk toAdd){
		Disk topDisk = new Disk(0);
		int diskIndex = diskStack.size()-1;
		if (diskIndex<0) diskIndex=0;
		
		if (diskIndex!=0){
			topDisk = diskStack.get(diskIndex);
		}
		if (topDisk.getSize()>=toAdd.getSize()|| diskIndex==0){
			diskStack.add(toAdd);
			return true;
		} else return false;
	}
	
	/**
	 * Adds the state of the Rod to the string builder in preparation for printing to the console
	 * @param mySB
	 * @param diskNum
	 */
	public void addStateToSB(StringBuilder mySB, int diskNum){
		int diskIndex=diskStack.size()-1;
		int count = 0;
		switch (this.name){
		case 'A':
			for(int i=diskNum-1;i>=0;i--){
				
				if(count<=diskIndex){
					mySB.delete(i*9,(i*9)+1);
					mySB.insert(i*9,this.diskStack.get(count).getSize() );
					count++;
				}
				
			}
			
		case 'B':
			for(int i=diskNum-1;i>=0;i--){
				
				if(count<=diskIndex){
					mySB.delete((i*9)+3,(i*9)+4);
					mySB.insert((i*9)+3,this.diskStack.get(count).getSize() );
					count++;
				}
				
			}
			
		case 'C':
			for(int i=diskNum-1;i>=0;i--){
				
				if(count<=diskIndex){
					mySB.delete((i*9)+6,(i*9)+7);
					mySB.insert((i*9)+6,this.diskStack.get(count).getSize() );
					count++;
				}
				
			}
		}
	}
}
