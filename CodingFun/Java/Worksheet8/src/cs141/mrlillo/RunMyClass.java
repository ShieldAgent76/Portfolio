/**
 * 
 */
package cs141.mrlillo;

/**
 * @author marti
 *
 */
public class RunMyClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(10, 10);
		System.out.format("Rectangle height: %4.2f \n", rectangle.getHeight());
		System.out.format("Numbers of rectangle: %d \n", Rectangle.getCount());
		
		Rectangle rectangle2 = new Rectangle(20, 30);
		System.out.format("Rectangle2 height: %4.2f \n", rectangle2.getHeight());
		System.out.format("Numbers of rectangle: %d \n", Rectangle.getCount());
	
		Rectangle rectangle3 = new Rectangle();
		System.out.format("Rectangle3 height: %4.2f \n", rectangle3.getHeight());
		System.out.format("Numbers of rectangle: %d \n", Rectangle.getCount());
		
		System.out.format("Rectangle perimeter: %4.2f \n", rectangle.getPerimeter());
		System.out.format("Rectangle2 perimeter: %4.2f \n", rectangle2.getPerimeter());
		System.out.format("Rectangle3 perimeter: %4.2f \n", rectangle3.getPerimeter());
		
		System.out.format("Rectangle area: %4.2f \n", rectangle.getArea());
		System.out.format("Rectangle2 area: %4.2f \n", rectangle2.getArea());
		System.out.format("Rectangle3 area: %4.2f \n", rectangle3.getArea());
		rectangle3.setHeight(22);
		System.out.format("Rectangle3 area: %4.2f \n", rectangle3.getArea());
	}

}
