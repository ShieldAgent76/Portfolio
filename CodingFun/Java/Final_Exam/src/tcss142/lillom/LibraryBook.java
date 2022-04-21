/**
 * 
 */
package tcss142.lillom;

/**
 * @author marti
 *
 */
public abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
	
	// fields
	private String callNumber;
	
	// constructor
	public LibraryBook(String author, String title, String ISBN, String callNumber) {
		super(author, title, ISBN);
		this.callNumber = callNumber;
	}
	
	// getter and setter methods for callNumber
	public String getCallNumber() {
		return callNumber;
	}
	
	public void setCallNumber(String callNumber) {
		this.callNumber = callNumber;
	}
	
	// abstract methods
	public abstract void checkout(String currentHolder, String dueDate); // handles checkout processing
	public abstract void returned(); // handles returning processing
	public abstract String circulationStatus(); // checks if book is on the shelves
	
	// toString method
	public String toString() {
		return super.toString() + "\nCirculation Status: " + circulationStatus() + "\nCall Number: " + getCallNumber() +"\n";
	}
	
	// compareTo method
	public int compareTo(LibraryBook otherBook) {
		
		if (callNumber.equals(otherBook.callNumber)) {
			return 0;
		}
		else if (callNumber.charAt(0) < otherBook.callNumber.charAt(0)) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
