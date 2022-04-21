/**
 * 
 */
package cs141.mrlillo;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author marti
 *
 */
public class StatementOccurence {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
    { 
        Scanner keyboard = new Scanner(System.in);
        String statement = ""; 
        
        System.out.println("Enter your statement");
		statement = keyboard.nextLine();
		String[] statementArray = statement.split(" ");
		for (int i = 0; i < statementArray.length; i++) {
			System.out.print(statementArray[i] + " ");
		} 
        String[] statementCopy   = statementArray;
        System.out.println();
        printString(statementArray, statementCopy);
        System.out.println("Total words: " + statementArray.length);
        uniqueCounter(statement, statementArray);
        
    }
	
	public static int occurence(String[] statementArray, String statement) { 
           
		   int count = 0; 
           for (int i = 0; i < statementArray.length; i++) {
               if (statement.equalsIgnoreCase(statementArray[i])) {
                    
            	   count++;
                }
            }
  
           return count; 
    } 
  
    public static void printString(String[] statementArray, String[] statementCopy) { 
        
    	for (int i = 0; i < statementCopy.length; i++) { 
            
        	System.out.println(statementCopy[i] + " occurence is: " + occurence(statementArray, statementCopy[i]));
    	}
    }
    
    public static int uniqueCounter(String statement, String statementArray[]) {
    	
    	// I tried everything and nothing was working the way I wanted it to.
    	int words = 1;
    	String wordCheck = statementArray[0];
    	for (int i = 0; i < statementArray.length; i++) {
    		if (!wordCheck.equalsIgnoreCase(statementArray[i])) {
    			
    			words++;
    		}
    	}
    	
    	System.out.println("Unique words: " + words);
    	return words;
    }
}
