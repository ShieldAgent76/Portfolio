package cs141.eelradie;
/**
 * @author eelradie
 *
 */
public class Item {
	private String itemName;
	private String itemDescription;
	private double itemPrice;
	private int itemQuantity;

	public Item(String itemName, String itemDescription, double itemPrice, int itemQuantity)
    {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

	public String getName() {
		return itemName;
	}

	public void setName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return itemPrice;
	}

	public void setPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getQuantity() {
		return itemQuantity;
	}

	public void setQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getDescription() {
		return itemDescription;
	}

	public void setDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	
	public double getItemCost() {
		return getPrice() * getQuantity();

	}	
	public void printItemCost() {
		double quantityCost = (getPrice() * getQuantity());
		System.out.println(getQuantity() + "  "+ getName()  + " @ $" + getPrice() + " = $" + quantityCost);
	}
	
	public void printItemDescription() {
		System.out.println(getName() + ": " + getDescription());
	}

}