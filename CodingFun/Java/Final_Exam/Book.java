/**
 * 
 */
package tcss142.lillom;

/**
 * @author marti
 *
 */
public class Book {
	
	// fields
	private String author;
	private String title;
	private String ISBN;
	
	// constructor
	public Book (String author, String title, String ISBN) {
		
		this.setAuthor(author);
		this.setTitle(title);
		this.setISBN(ISBN);
	}
	
	// getter and setter methods
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	// toString method
	public String toString() {
		return "Title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nISBN: " + ISBN;
	}
}
