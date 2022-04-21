/**
 * 
 */
package lillom;

import java.util.*;
import java.util.Scanner;

/**
 * @author Martin Lillo
 * @version 2.0
 */
public class SlotsV2 {

	/**
	 * Scanner object
	 */
	private static final Scanner KEYBOARD = new Scanner(System.in);
	
	/**
	 * Random Object
	 */
	private static final Random RANDOM = new Random();
	
	/**
	 * Number Generator method.
	 * @param theInput
	 * @return result
	 */
	public static int numGen(final int theDeckMax, final int theDeckMin) {
		final int result = RANDOM.nextInt(theDeckMax - theDeckMin) + theDeckMin;
		return result;
	}
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to Quackity's casino in Las Nevadas!");
		newSlots();
	}
	
	/**
	 * Slots method
	 */
	public static void newSlots() {
		
		System.out.println();
		
		List<String> deck = new ArrayList<String>();
		deck.add("One");
		deck.add("Two");
		deck.add("Three");
		deck.add("Four");
		deck.add("Five");
		deck.add("Six");
		deck.add("Seven");
		deck.add("Eight");
		deck.add("Nine");
		deck.add("Quackity");
		deck.add("Technoblade");
		deck.add("Dream");
		
		String element1 = deck.get(numGen(11, 0));
		String element2 = deck.get(numGen(11, 0));
		String element3 = deck.get(numGen(11, 0));
		System.out.println(element1 + " " + element2 + " " + element3);
		
		if (element1.equals(element2) && element1.equals(element3)) {
			System.out.println("Congratulations! You win!");
		}
		
		menu();
	}	
	
	/**
	 * Menu method
	 */
	public static void menu() {
		
		System.out.print("Play again? Y or N: ");
		char input = KEYBOARD.next().charAt(0);
		if (input == 'y') {
			newSlots();
		}
		else if (input == 'n') {
			System.out.println("Thanks for visiting!");
			System.exit(0);
		}
		else {
			System.out.println("Error. Input invalid");
			menu();
		}
	}
}
