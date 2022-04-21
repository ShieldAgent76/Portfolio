/**
 * 
 */
package cs141.eelradie;


/**
 * @author eelradie
 *
 */
public class RunMyClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInformation scarlett = new StudentInformation("Scarlett", "Johansson", 1);
		StudentInformation emma = new StudentInformation("Emma", " Watson", 3, 97, -5, 123);
		StudentInformation jason = new StudentInformation("Jason", "Statham", 2);
		StudentInformation will = new StudentInformation("Will", "Smith", 4, 105, 91, 93);

		System.out.println("The number of students in the system is: " + StudentInformation.getStdCount());
		System.out.println("***********************************");
		scarlett.print();
		System.out.println("------------------------------------");
		emma.print();
		System.out.println("------------------------------------");
		jason.print();
		System.out.println("------------------------------------");
		will.print();
		System.out.println("------------------------------------");
	}

}
