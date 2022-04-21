/**
 * 
 */
package cs141.mrlillo;
import java.util.Scanner;

/**
 * @author marti
 *
 */
public class Caller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double length = 0.0;
		double width = 0.0;
		double side = 0.0;
		double radius = 0.0;
		Area area = new Area();
		
		System.out.print("Enter length: ");
		length = keyboard.nextDouble();
		System.out.print("Enter width: ");
		width = keyboard.nextDouble();
		area.RectangleArea(length, width);
		
		System.out.print("Enter side: ");
		side = keyboard.nextDouble();
		area.SquareArea(side);
		
		System.out.print("Enter radius: ");
		radius = keyboard.nextDouble();
		area.CircleArea(radius);
	}

}
