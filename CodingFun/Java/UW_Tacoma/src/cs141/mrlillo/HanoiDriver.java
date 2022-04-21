/**
 * 
 */
package cs141.mrlillo;

import java.util.*;

/**
 * @author marti
 *
 */
public class HanoiDriver {
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("How many disks do you want");
		int choice = input.nextInt();
		Hanoi game = new Hanoi(choice);
		game.recursiveTOH(choice, 1, 3);
	}
}
