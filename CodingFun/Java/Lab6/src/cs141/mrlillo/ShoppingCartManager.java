/**
 * 
 */
package cs141.mrlillo;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author marti
 *
 */
public class ShoppingCartManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String description;
		double price;
		int quantity;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to Amazon Go. Your virtual shopping experience!");
		System.out.print("Enter name: ");
		name = keyboard.nextLine();
		Date todayDateAndTime = Calendar.getInstance().getTime();
		ShoppingCart cart = new ShoppingCart(name, todayDateAndTime);
		System.out.println();
		
		char choice;

		do {
			printMenu();
			choice = keyboard.nextLine().toLowerCase().charAt(0);
			System.out.println();
			switch (choice) {
			case 'a':
				System.out.println("Adding item...");
				System.out.println("------------------------------------");
				System.out.print("Enter the Item name: ");
				name = keyboard.nextLine();
				System.out.print("Enter the Item description: ");
				description = keyboard.nextLine();
				System.out.print("Enter the Item price: ");
				price = keyboard.nextDouble();
				System.out.print("Enter the Item quantity: ");
				quantity = keyboard.nextInt();
				keyboard.nextLine();
				Item item = new Item(name, description, price, quantity);
				cart.addItem(item);
				break;
			case 'r':
				System.out.println("Removing item...");
				System.out.println("------------------------------------");
				System.out.print("Enter item name: ");
				cart.removeItem(keyboard.nextLine());
				break;
			case 'c':
				System.out.println("Changing item...");
				System.out.println("------------------------------------");
				System.out.print("Enter Item name: ");
				name = keyboard.nextLine();
				System.out.print("Enter Item new quantity: ");
				quantity = keyboard.nextInt();
				keyboard.nextLine();
				cart.changeItemQuantity(name, quantity);
				break;
			case 'd':
				System.out.println("Displaying descriptions...");
				System.out.println("------------------------------------");
				cart.printDescription();
				break;
			case 's':
				System.out.println("Displaying cart...");
				System.out.println("------------------------------------");
				cart.printTotal();
				break;
			case 'e':
			case 'E':
				System.out.println("Thank you for coming! We hope to see you again soon.");
				System.exit(0);
				break;
			default:
				System.out.println("This option is not valid!");
				break;
			}
			System.out.println("------------------------------------");
			System.out.println();
		} while (true);
	}

	public static void printMenu() {
		System.out.println("------MENU------");
		System.out.println("a - Add item to cart");
		System.out.println("r - Remove item from cart");
		System.out.println("c - Change item quantity");
		System.out.println("d - Display items' descriptions");
		System.out.println("s - Display shopping cart contents");
		System.out.println("e - Quit");
		System.out.println();
		System.out.print("Choose an option: ");

	}
}
