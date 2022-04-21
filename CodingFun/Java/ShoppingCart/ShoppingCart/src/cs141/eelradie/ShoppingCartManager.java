/**
 * 
 */
package cs141.eelradie;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author eelradie
 *
 */
public class ShoppingCartManager {
	public static void main(String[] args) {
		String itemName;
		String itemDescription;
		double itemPrice;
		int itemQuantity;

		Scanner input = new Scanner(System.in);
		System.out.println("You are starting a new Shopping Cart...");
		System.out.print("Enter Customer's Date: ");
		String customerName = input.nextLine();
	    Date todayDateAndTime = Calendar.getInstance().getTime();
		ShoppingCart cart = new ShoppingCart(customerName, todayDateAndTime);
		System.out.println();

		char choice;

		do {
			printMenu();
			choice = input.nextLine().toLowerCase().charAt(0);
			System.out.println();
			switch (choice) {
			case 'a':
				System.out.println(".:.:.:.Adding Item.:.:.:.");
				System.out.print("Enter the Item name: ");
				itemName = input.nextLine();
				System.out.print("Enter the Item description: ");
				itemDescription = input.nextLine();
				System.out.print("Enter the Item price: ");
				itemPrice = input.nextDouble();
				System.out.print("Enter the Item quantity: ");
				itemQuantity = input.nextInt();
				input.nextLine();
				Item item = new Item(itemName, itemDescription, itemPrice, itemQuantity);
				cart.addItem(item);
				break;
			case 'd':
				System.out.println(".:.:.:.Removing Item.:.:.:.");
				System.out.print("Enter item name:");
				cart.removeItem(input.nextLine());
				break;
			case 'c':
				System.out.println(".:.:.:.Mdifying Item's Quantity.:.:.:.");
				System.out.print("Enter Item name: ");
				itemName = input.nextLine();
				System.out.print("Enter Item new quantity: ");
				itemQuantity = input.nextInt();
				input.nextLine();
				cart.modifyItemQuantity(itemName, itemQuantity);
				break;
			case 'i':
				System.out.println(".:.:.:.Display items' descriptions.:.:.:.");
				cart.printDescriptionOfAllItems();
				break;
			case 'o':
				System.out.println(".:.:.:.Display shopping cart contents.:.:.:.");
				cart.printTotal();
				break;
			case 'q':
			case 'Q':
				System.exit(0);
				break;
			default:
				System.out.println("This option is not valid!");
				break;
			}
			System.out.println("------------------------------------");
		} while (true);
	}

	public static void printMenu() {
		System.out.println("\n\n\n-----MENU----");
		System.out.println("a - Add item to cart");
		System.out.println("d - Remove item from cart");
		System.out.println("c - Change item quantity");
		System.out.println("i - Display items' descriptions");
		System.out.println("o - Display shopping cart contents");
		System.out.println("q - Quit");
		System.out.print("\nChoose an option: ");

	}

}
