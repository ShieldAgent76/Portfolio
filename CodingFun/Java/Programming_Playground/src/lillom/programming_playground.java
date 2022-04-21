/**
 * 
 */
package lillom;

import java.util.*;

/**
 * @author Martin Lillo
 *
 */
public class programming_playground {
	
	/**
	 * Random Object
	 */
	private static final Random RANDOM = new Random();
	
	/**
	 * Scanner Object
	 */
	private static final Scanner KEYBOARD = new Scanner(System.in);
	
	/**
	 * List to hold songs
	 */
	private static List<String> songs = new ArrayList<String>();
	
	/**
	 * Number Generator method.
	 * @param theInput
	 * @return result
	 */
	public static int numGen(final int theInput) {
		final int result = RANDOM.nextInt(theInput);
		return result;
	}
	
	/**
	 * Menu method
	 */
	public static void menu() {
		System.out.print("Enter a number between 0 - 7: ");
		int input = KEYBOARD.nextInt();
		if (input < 0 || input > 7) {
			System.out.println("Error. Invaild input");
		}
		System.out.println("Song for today: " + songs.get(input));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// song list
		songs.add("Ain't no Crying");
		songs.add("Syndicate");
		songs.add("Welcome Home");
		songs.add("Blue");
		songs.add("In My Head");
		songs.add("Kiss Your Dreams Goodbye");
		songs.add("Turn Back Time");
		songs.add("4AM");
		
		menu();
	}

}
