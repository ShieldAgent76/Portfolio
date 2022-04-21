/**
 * 
 */
package cs141.mrlillo;

/**
 * @author marti
 *
 */
public class Car {
	
	private String make = "";
	private int yearModel = 0;
	public static int carCount = 0;
	
	public Car(int yearModel, String make) {
		this.yearModel = yearModel;
		this.make = make;
		carCount++;
	}

	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public int getYearModel() {
		return yearModel;
	}
	
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	
	public static int getCarCount() {
		return carCount;
	}
	
	public void print() {
		System.out.println("Maker: " + this.make);
		System.out.println("Model Year: " + this.yearModel);
	}
}
