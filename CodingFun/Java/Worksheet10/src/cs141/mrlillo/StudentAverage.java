/**
 * 
 */
package cs141.mrlillo;

/**
 * @author marti
 *
 */
public class StudentAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grades = new int[][] { { 10, 9, 10, 9, 8, 6, 8, 5, 9, 10 },
									 { 8, 9, 10, 9, 8, 6, 8, 5, 9, 10 },
									 { 9, 9, 9, 9, 8, 10, 10, 9, 9, 8 },
									 { 10, 5, 6, 5, 6, 9, 6, 7, 8, 8 },
									 { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 } };
		double[] average = new double [grades[0].length];
		
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 5; j++) {
				 
				average[i] += grades[j][i]; 
			 }
			
			average[i] /= grades.length;
			System.out.println("Homework " + (i + 1) + " average is " + average[i]);
		} 
	}
}
