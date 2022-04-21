/**
 * 
 */
package cs141.mrlillo;
import java.util.Scanner;

/**
 * @author marti
 *
 */
public class PizzaCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to Times Square Pizzeria!");
		System.out.println("What is the tax rate as a floating-point number?");
		double tax = keyboard.nextDouble();
		System.out.println("What is the price per square inch?");
		double price = keyboard.nextDouble();
		System.out.format("10 inch pizza costs %.2f.\n", (100 * price) + tax);
		System.out.format("12 inch pizza costs %.2f.\n", (144 * price) + tax);
		System.out.format("14 inch pizza costs %.2f.\n", (196 * price) + tax);
	}

}
