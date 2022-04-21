/**
 * 
 */
package cs141.mrlillo;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author marti
 *
 */
public class LongestWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String[][] words = new String[2][2];
		
		System.out.println("Enter four words you know");
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				words[i][j] = keyboard.next();
			}
			
		}
		
		printArray(words);
		System.out.println();
		findLongestWordAndOccurrences(words);
		
	}
	
	
	public static void findLongestWordAndOccurrences(String words[][]) {
		
		int occurence = 0;
		String longest = words[0][0];
		for (int i = 0; i < words.length; i++ ) {
			for (int j = 0; j < words.length; j++) {
				if (words[0][0].length() <= words[i][j].length()) {
					
					longest = words[i][j];
					
					if (longest.equals(words[i][j])) {
						
						occurence++;
					}
				}
			}
		}
		
		System.out.println("Longest word: " + longest);
		System.out.println("Longest word occurence: " + occurence);
	}
	
	
	public static void printArray(String words[][]) {
		
		System.out.println("Dictionary");
		System.out.println("----------");
		
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				
				System.out.print(words[i][j] + " ");
			}
		}
	}
	
	
	

}
