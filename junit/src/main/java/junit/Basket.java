package junit;

import java.util.ArrayList;

public class Basket {
	private ArrayList<Book> books ;

	public Basket() {
		super();
		this.books = new ArrayList<>();
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	@Override
	public String toString() {
		return "Basket [books=" + books + "]";
	}

	public void setBooks() {
		this.books = new ArrayList<>();
	}

	
	
	

	
	

}
