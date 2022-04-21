/**
 * 
 */
package cs141.mrlillo;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author marti
 *
 */
public class ArrayFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int[] numInput = new int[5];
		
		System.out.println("Enter five numbers");
		for (int i = 0; i < 5; i++) {
			
			numInput[i] = keyboard.nextInt();
		}
		
		findMin(numInput);
		findMax(numInput);
		findAvg(numInput);
		String numString = Arrays.toString(numInput);
		System.out.println("Array: " + numString);
	}
	
	public static void findMin(int numInput[]) {
		
		int min = numInput[0];
		for (int i = 0; i < 5; i++) {
			if (numInput[i] < min) {
				min = numInput[i];
			}
		}
		
		System.out.println("Min: " + min);
	}
	
	public static void findMax(int numInput[]) {
			
		int max = numInput[0];
		for (int i = 0; i < 5; i++) {
			if (numInput[i] > max) {
				max = numInput[i];
			}
		}
		
		System.out.println("Max: " + max);
	}
	
	public static void findAvg(int numInput[]) {
		
		int total = numInput[0];
		for (int i = 1; i < 5; i++) {
			total += numInput[i];
		}
		
		System.out.println("Total: " + total);
		double average = (double)total / 5;
		System.out.println("Average: " + average);
	}

}
