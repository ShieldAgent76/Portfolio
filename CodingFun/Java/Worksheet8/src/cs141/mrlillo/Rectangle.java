/**
 * 
 */
package cs141.mrlillo;

/**
 * @author marti
 *
 */
public class Rectangle {
	
	private double width = 0;
	private double height = 0;
	
	public static int count = 0;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.setWidth(width);
		count++;
	}
	
	Rectangle() {
		this.height = 1;
		this.setWidth(1);
		count++;
		System.out.println("I am alive!");
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	public static int getCount() {
		return count;
	}
	
	public double getPerimeter() {
		double equation = 2 * (this.height + this.width);
		return equation;
	}
	
	public double getArea() {
		return this.width * this.height;
	}

}
