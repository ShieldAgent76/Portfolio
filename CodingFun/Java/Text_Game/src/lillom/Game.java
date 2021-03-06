/**
 * 
 */
package lillom;

import java.util.*;
/**
 * @author marti
 *
 */
public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Scanner objects
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		// game variables
		String[] enemies = new String[6];
		enemies[0] = "Ugly Oger";
		enemies[1] = "Cyber Droid";
		enemies[2] = "Imperial Soldier";
		enemies[3] = "Academy Student";
		enemies[4] = "Masquerade Noble";
		enemies[5] = "Gray Hyena";
		int maxEnemyHealth = 100;
		int enemyAttackDamage = 25;
		
		// player variables
		int health = 100;
		int attackDamage = 50;
		int healthKits = 3;
		int healthKitsHealAmount = 30;
		int healthKitsDropChance = 50;
		
		boolean run = true;
		
		System.out.println("Welcome! Let's Battle!");
		
		GAME:
		while (run) {
			
			System.out.println("----------------------");
			
			int enemyHealth = random.nextInt(maxEnemyHealth);
			String enemy = enemies[random.nextInt(enemies.length)];
			System.out.println("\t# " + enemy + " has appeared: #\n");
			
			while (enemyHealth > 0) {
				
				System.out.println("\tYour HP: " + health);
				System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
				System.out.println("\n\tWhat do you want to do?");
				System.out.println("\t1. Attack");
				System.out.println("\t2. Heal");
				System.out.println("\t3. Run");
				
				String userInput = input.nextLine();
				if (userInput.equals("1")) {
					
					int damageDealt = random.nextInt(attackDamage);
					int damageTaken = random.nextInt(enemyAttackDamage);
					
					enemyHealth -= damageDealt;
					health -= damageTaken;
					
					System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
					System.out.println("\t> You recieve " + damageTaken + " back!");
					
					if (health < 1) {
						System.out.println("You have died. Game over.");
						break;
					}
				}
				else if (userInput.equals("2")) {
					
					if (healthKits > 0) {
						
						health += healthKitsHealAmount;
						healthKits--;
						System.out.println("\t> You used a health kit for " + healthKitsHealAmount + ".");
						System.out.println("\t> You now have " + health + " HP.");
						System.out.println("\t> You now have " + healthKits + " health kits left.");
					}
					else {
						System.out.println("\t> No more health kits!");
					}
				}
				else if (userInput.equals("3")) {
					System.out.println("\tYou run away from the " + enemy + "!");
					continue GAME;
				}
				else {
					System.out.println("\tThat is not an option you bingo!");
				}
			}
			
		}
	}

}
