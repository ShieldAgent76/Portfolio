/**
 * Random Number Generator Class
 */
package lillom;
import java.util.Scanner;
import java.util.Random;

/**
 * @author Martin Lillo
 * @version 1.0
 */
public class Number_Generator {
	
	/**
	 * Scanner object.
	 */
	private static final Scanner INPUT = new Scanner(System.in);
	
	/**
	 * Random object.
	 */
	private static final Random RANDOM = new Random();
	
	/**
	 * Number Generator method.
	 * @param theInput
	 * @return result
	 */
	public static int numGen(final int theInputMax, final int theInputMin) {
		final int result = RANDOM.nextInt(theInputMax - theInputMin) + theInputMin;
		return result;
	}
	
	/**
	 * Input method.
	 */
	public static void input() {
		System.out.print("Enter min: ");
		int min = INPUT.nextInt();
		System.out.print("Enter max: ");
		int max = INPUT.nextInt();
		System.out.println("Result: " + numGen(max, min));
	}
	
	/**
	 * Main method.
	 * @param theArgs
	 */
	public static void main(final String[] theArgs) {
		input();
	}
}
