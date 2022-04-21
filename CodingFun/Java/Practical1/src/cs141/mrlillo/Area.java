/**
 * 
 */
package cs141.mrlillo;

/**
 * @author marti
 *
 */
public class Area implements Shape {
	
	public void RectangleArea(double length, double width) {
		
		double rectArea = length * width;
		System.out.println("Rectangle area: " + rectArea);
	}
	
	public void SquareArea(double side) {
		
		double squareArea = Math.pow(side, 2.0);
		System.out.println("Square area: " + squareArea);
	}
	
	public void CircleArea(double radius) {
		
		double circleArea = Math.PI * Math.pow(radius, 2.0);
		System.out.println("Circle area: " + circleArea);
	}
}
