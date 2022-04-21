/**
 * 
 */
package cs141.mrlillo;

/**
 * @author marti
 *
 */
public class Hanoi {
	
	private Rod[] myRods;
	private StringBuilder mySB;
	private int initialDiskNum;
	
	
	/**
	 * Constructor for a Hanoi game
	 * @param diskNum
	 */
	public Hanoi (int diskNum){
		this.initialDiskNum=diskNum;
		this.myRods = new Rod[4];
		myRods[1]=new Rod('A', diskNum);
		myRods[2]=new Rod('B', 0);
		myRods[3]=new Rod('C', 0);

		StringBuilder theSB = new StringBuilder();
		this.mySB = theSB;
		clearedSB(mySB, diskNum);
		
		
	}
	
	/**
	 * Creates a clear StringBuilder, in preparation for the Rod to insert it's disks for display
	 * @param mySB
	 * @param diskNum
	 */
	public void clearedSB(StringBuilder mySB, int diskNum){
		for(int i=0;i<diskNum;i++){
		mySB.append("        \n");
	}
	mySB.append("A  B  C \n");
	}
	
	/**
	 * Prints the status of the game
	 */
	public void printStatus(){
		this.myRods[1].addStateToSB(this.mySB, this.initialDiskNum);
		this.myRods[2].addStateToSB(this.mySB, this.initialDiskNum);
		this.myRods[3].addStateToSB(this.mySB, this.initialDiskNum);
		System.out.println(this.mySB.toString());
		mySB.delete(0, mySB.capacity());
		clearedSB(this.mySB, this.initialDiskNum);
	}
	
	/**
	 * moves a disk from removedFrom to addedTo. Returns the size of the disk
	 * @param removedFrom
	 * @param addedTo
	 * @return toMove.getSize()
	 */
	public int move(Rod removedFrom, Rod addedTo){
		Disk toMove = removedFrom.getDisk();
		boolean successfulMove = addedTo.addDisk(toMove);
		if(!successfulMove){
			removedFrom.addDisk(toMove);
			System.out.println("Illegal Move");;
		}
		return toMove.getSize();
	}
	
	/**
	 * Recursively solves the Towers of Hanoi, given the size of the inital tower nDisks, the starting peg, startPeg, and the ending peg, endPeg
	 * @param nDisks
	 * @param startPeg
	 * @param endPeg
	 */
	public void recursiveTOH(int nDisks, int startPeg, int endPeg){
	
		if(nDisks==1){
			int movedDiskSize = move(this.myRods[startPeg],this.myRods[endPeg]);
			printStatus();
			System.out.println("Move Disk "+movedDiskSize+" from "+this.myRods[startPeg].getName()+" to "+this.myRods[endPeg].getName());
			
			
		}else {
			int helper = 6-startPeg-endPeg;
			recursiveTOH(nDisks-1,startPeg,helper);
			int movedDiskSize=move(this.myRods[startPeg],this.myRods[endPeg]);
			printStatus();
			System.out.println("Move Disk "+movedDiskSize+" from "+this.myRods[startPeg].getName()+" to "+this.myRods[endPeg].getName());
			recursiveTOH(nDisks-1,helper,endPeg);
		
			
		}
		
	}
}
