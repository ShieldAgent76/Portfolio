/**
 * 
 */
package cs141.mrlillo;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author marti
 *
 */
public class ShoppingCart {
	
	private String customer = "";
	private Date todayDateAndTime;
	private ArrayList<Item> cartItems = new ArrayList<>();
	
	public ShoppingCart(String name, Date todayDateAndTime) {
		
		this.customer = customer;
		this.setTodayDateAndTime(todayDateAndTime);
	}
	
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCustomer() {
		return customer;
	}

	public Date getTodayDateAndTime() {
		return todayDateAndTime;
	}

	public void setTodayDateAndTime(Date todayDateAndTime) {
		this.todayDateAndTime = todayDateAndTime;
	}
	
	public void addItem(Item item) {
		
		cartItems.add(item);
		System.out.println("Item Added");
	}
	
	public void removeItem(String name) {
		
		boolean remove = true;
		for (int i = 0; i < cartItems.size(); i++) {
			
			Item item = cartItems.get(i);
			if (name.equalsIgnoreCase(item.getName())) {
				
				cartItems.remove(i);
				remove = false;
				System.out.println("Item Removed");

			} 
				if(remove) {
					System.out.println("Error: Item not found in cart. Nothing has been changed.");
				}
		}

	}
	
	public void changeItemQuantity(String name, int newQuantity) {
		
		Item item;
		boolean modify = true;
		for (int i = 0; i < cartItems.size(); i++) {
			
			item = cartItems.get(i);
			if (name.equalsIgnoreCase(item.getName())) {
				
				cartItems.get(i).setQuantity(newQuantity);
				modify = false;
				System.out.println("Item Changed");
			}
				if(modify) {
					System.out.println("Error: Item not found in cart. Nothing has been changed.");
				}
		}
	}

	public int getNumOfItems() {
		
		int count = 0;
		for (int i = 0; i < cartItems.size(); i++) {
			count += cartItems.get(i).getQuantity();
		}
		return count;
	}

	public double getTotalCost() {
		
		double total = 0;
		for (int i = 0; i < cartItems.size(); ++i) {
			total += cartItems.get(i).getCost();
		}
		return total;
	}

	public void printTotal() {
		for (int i = 0; i < cartItems.size(); i++) {
			cartItems.get(i).printCost();
		}
		System.out.println("Total: $" + getTotalCost());
	}

	public void printDescription() {
		for (int i = 0; i < cartItems.size(); ++i) {
			cartItems.get(i).printDescription();
		}
	}

}
