/**
 * Calculator to calculate if formula is true or false
 */
package lillom;

/**
 * @author Martin Lillo
 *
 */
public class BooleanCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// provide boolean variables
		boolean p = true;
		boolean q = true;
		boolean r = true;
		boolean s = true;
		
		// boolean calculator
		boolean formula = p || q;
		
		// checks results
		if (formula == true) {
			System.out.println("True");
		}
		else if (formula == false) {
			System.out.println("False");
		}
		else {
			System.out.println("Error");
		}
	}
}
