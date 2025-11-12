package bookStore;

public class Book {
	
	private String isbn;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Book(String isbn) {
		super();
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + "]";
	}

	public Book() {
		super();
	}
	
	
	

}
