/**
 * 
 */
package tcss142.lillom;

/**
 * @author marti
 *
 */
public class CirculatingBook extends LibraryBook {
	 
	// fields
	private String currentHolder;
	private String dueDate;
	
	// constructor
	public CirculatingBook(String author, String title, String ISBN, String callNumber) {
		super(author, title, ISBN, callNumber);
		currentHolder = null;
		dueDate = null;
	}
	
	// methods
	@Override
	public void checkout(String currentHolder, String dueDate) {
		this.currentHolder= currentHolder;
		this.dueDate = dueDate;
	}

	@Override
	public void returned() {
		this.currentHolder = null;
		this.dueDate = null;
	}

	@Override
	public String circulationStatus() {
		if (currentHolder == null && dueDate == null) {
			return "book available on shelves";
		}
		else {
			return "book checked out by " + getAuthor() + " and due back on " + dueDate;
		}
	}
}
