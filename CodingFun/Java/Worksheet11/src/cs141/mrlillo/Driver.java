/**
 * 
 */
package cs141.mrlillo;
import java.util.Scanner;

/**
 * @author marti
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String make = "";
		int yearModel = 0;
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {

			System.out.print("Enter maker: ");
			make = keyboard.next();
			System.out.print("Enter year model: ");
			yearModel = keyboard.nextInt();
			Car[] cars = new Car[3];
			cars[i] = new Car(yearModel, make);
			cars[i].print();
			System.out.println("------------------------------------");
			System.out.println("The number of cars in the system is: " + Car.getCarCount());
		}
		
		
		
	}

}
