/**
 * 
 */
package cs141.mrlillo;
import java.util.Scanner;

/**
 * @author marti
 *
 */
public class Lab3A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input the temperature in Kelvin: ");
		double kelvin = keyboard.nextDouble();
		method1(kelvin);
		method2(kelvin);

		System.out.println("Input the temperature in Fahrenheit: ");
		double fahrenheit = keyboard.nextDouble();
		method3(fahrenheit);
		
		System.out.println("Input the temperature in Celsius: ");
		double celsius = keyboard.nextDouble();
		method4(celsius);
	    
	}
		
		//Kelvin to Fahrenheit
		private static double method1(double kelvin) {
			double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
	        System.out.println("The temperature in Fahrenheit is " + fahrenheit);
	        return fahrenheit;		
		}
		
		//Kelvin to Celsius
		private static double method2(double kelvin) {
			 double celsius = kelvin - 273.15;
		     System.out.println("The temperature in Celsius is " + celsius);
		     return celsius;
		}
		
		//Fahrenheit to Kelvin
		private static double method3(double fahrenheit) {
	        double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
	        System.out.println("The temperature in Kelvin is " + kelvin);
	        return kelvin;

		}
		
		//Celsius to Kelvin
		private static double method4(double celsius) {
	        double kelvin = celsius + 273.15;
	        System.out.println("The temperature in Kelvin is " + kelvin);
	        return kelvin;
		}
		

}
