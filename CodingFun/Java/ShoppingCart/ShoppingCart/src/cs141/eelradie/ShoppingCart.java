/**
 * 
 */
package cs141.eelradie;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author eelradie
 *
 */
public class ShoppingCart {
	private String customerName;
	private Date todayDateAndTime;
	private ArrayList<Item> cartItems = new ArrayList<>();

	public ShoppingCart(String customerName, Date todayDateAndTime) {
		this.customerName = customerName;
		this.todayDateAndTime = todayDateAndTime;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setDate(Date todayDateAndTime) {
		this.todayDateAndTime = todayDateAndTime;
	}

	public String getDate() {
		return todayDateAndTime.toString();
	}

	public void addItem(Item item) 
	{
		cartItems.add(item);
		System.out.println("\tItem Added!");

	}

	public void removeItem(String itemName) {
		boolean removeFlag = true;
		for (int i = 0; i < cartItems.size(); ++i) {
			Item item = cartItems.get(i);
			if (itemName.equalsIgnoreCase(item.getName())) {
				cartItems.remove(i);
				removeFlag = false;
				System.out.println("\tItem Removed!");

			} 
			if(removeFlag) {
				System.out.println("Error: Item not found in cart. Nothing modified.");
			}
		}

	}

	public void modifyItemQuantity(String itemName, int newQuantity) // FIX!! default values for if statement
	{
		Item item;
		boolean modifyFlag = true;
		for (int i = 0; i < cartItems.size(); ++i) {
			item = cartItems.get(i);
			if (itemName.equalsIgnoreCase(item.getName())) {
				cartItems.get(i).setQuantity(newQuantity);
				modifyFlag = false;
				System.out.println("\tItem Modified!");
			}
			if(modifyFlag) {
				System.out.println("Error: Item not found in cart. Nothing modified.");
			}
		}
	}

	public int getNumItemsInCart() {
		int count = 0;
		for (int i = 0; i < cartItems.size(); ++i) {
			count += cartItems.get(i).getQuantity();
		}
		return count;
	}

	public double getTotalCostOfCart() {
		double totalCostOfCart = 0;
		for (int i = 0; i < cartItems.size(); ++i) {
			totalCostOfCart += cartItems.get(i).getItemCost();
		}
		return totalCostOfCart;
	}

	public void printTotal() 
	{
		for (int i = 0; i < cartItems.size(); i++) {
			cartItems.get(i).printItemCost();
		}
		System.out.println("Total: $" + getTotalCostOfCart());
	}

	public void printDescriptionOfAllItems() {
		for (int i = 0; i < cartItems.size(); ++i) {
			cartItems.get(i).printItemDescription();
		}
	}

}
