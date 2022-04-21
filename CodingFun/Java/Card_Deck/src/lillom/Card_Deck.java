/**
 * 
 */
package lillom;

/**
 * @author marti
 *
 */
public class Card_Deck {
	
	class Cards {
		
		private String suit = "";
		private String color = "";
		private int number = 0;
		
		public String getSuit() {
			return suit;
		}
		public void setSuit(String suit) {
			this.suit = suit;
		}
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
	}
}
