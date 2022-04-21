/**
 * 
 */
package cs141.mrlillo;
import java.util.Scanner;

/**
 * @author marti
 *
 */
public class TargetString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String[] owner = {"Alice", "Bob", "Carol"};
		
		System.out.print("Who are you looking for? ");
		String name = keyboard.next();
		
		if (name.equals(owner[0])) {
			System.out.println(name + " is on the list.");
		}
		else if (name.equals(owner[1])) {
			System.out.println(name + " is on the list.");
		}
		else if (name.equals(owner[2])) {
			System.out.println(name + " is on the list.");
		}
		else {
			System.out.println(name + " is not on the list.");
		}
		

	}

}
