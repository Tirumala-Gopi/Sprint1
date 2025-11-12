package bookStore;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {

	private List<Book> books;
	private ReadItemCommand readItemCommand;
	private WriteItemCommand writeItemCommand;

	

	public Catalogue( ReadItemCommand readItemCommand, WriteItemCommand writeItemCommand) {
		super();
		this.books = new ArrayList<>();
		this.readItemCommand = readItemCommand;
		this.writeItemCommand = writeItemCommand;
	}

	public List<Book> getAllBooks() {
		List<Book>books=readItemCommand.readAll();
		return books;
	}

	public void addBook(Book book) {
		writeItemCommand.insertItem(book);

	}

	public void addBooks(List<Book> books) {
		for(Book book:books)
			{writeItemCommand.insertItem(book);}

	}

	public Book getBook(String isbn) {
		return readItemCommand.getItem(isbn);
	}

	public void deleteBook(Book book) {
		writeItemCommand.deleteItem(book);

	}

	public void deleteAllBooks() {
		List<Book>books=readItemCommand.readAll();
		for(Book book:books)
		{
			writeItemCommand.deleteItem(book);
		}
		

	}

}
