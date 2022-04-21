/**
 * 
 */
package lillom;

import java.util.*;

/**
 * @author Martin Lillo
 * @version 1.0
 */
public class Slots {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		slot();
	}
		
	public static void slot() {
		
		int number1 = (int)(Math.random() * (3 - 1) + 1);
		int number2 = (int)(Math.random() * (3 - 1) + 1);
		int number3 = (int)(Math.random() * (3 - 1) + 1);
		System.out.println(number1 + " " + number2 + " " + number3);
		
		if (number1 == number2 && number1 == number3) {
			System.out.println("Congratulations! You win.");
		}
		
		menu();
	}
	
	public static void menu() {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Play again? Y or N: ");
		char input = keyboard.next().charAt(0);
		if (input == 'y') {
			slot();
		}
		else if (input == 'n') {
			System.out.println("Goodbye");
			System.exit(0);
		}
		else {
			System.out.println("Error. Input invalid");
			menu();
		}
	}
}
