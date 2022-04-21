/**
 * 
 */
package cs141.mrlillo;

/**
 * @author marti
 *
 */
public class Item {
	
	private String name = "";
	private String description = "";
	private double price = 0.0;
	private int quantity = 0;
	
	public Item(String name, String description, double price, int quantity) {
		
		this.setName(name);
		this.setDescription(description);
		this.setPrice(price);
		this.setQuantity(quantity);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getCost() {
		return getPrice() * getQuantity();
	}
	
	public void printCost() {
		
		double cost = getPrice() * getQuantity();
		System.out.println(getQuantity() + " " + getName() + " @ $" + getPrice() + " = $" + cost);
	}
	
	public void printDescription() {
		System.out.println(getName() + ": " + getDescription());
	}

}
