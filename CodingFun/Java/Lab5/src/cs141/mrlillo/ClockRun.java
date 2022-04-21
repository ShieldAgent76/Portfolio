/**
 * 
 */
package cs141.mrlillo;
import java.util.Scanner;

/**
 * @author marti
 *
 */
public class ClockRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int seconds = 0;
		int minutes = 0;
		int hours = 0;
		
		System.out.print("Enter time in seconds (0 - 3599): ");
		seconds = keyboard.nextInt();
		Clock firstClock = new Clock(seconds);
		System.out.println(firstClock.toPrint());
		System.out.println();
		for (int i = 0; i < 10; i++) {
			firstClock.tick();
			System.out.println(firstClock.toPrint());
		}
		
		System.out.print("Enter time in hours (0 - 23): ");
		hours = keyboard.nextInt();
		System.out.print("Enter time in minutes (0 - 59): ");
		minutes = keyboard.nextInt();
		System.out.print("Enter time in seconds (0 - 59): ");
		seconds = keyboard.nextInt();
		Clock secondClock = new Clock(hours, minutes, seconds);
		System.out.println(secondClock.toPrint());
		for (int i = 0; i < 10; i++) {
			secondClock.tick();
			System.out.println(secondClock.toPrint());
		}
		
		Clock thirdClock = new Clock(hours, minutes, seconds); 
		thirdClock.subtractClock(firstClock);

	}

}
