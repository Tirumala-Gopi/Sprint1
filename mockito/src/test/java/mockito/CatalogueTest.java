package mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import bookStore.Book;
import bookStore.Catalogue;
import bookStore.ReadItemCommand;
import bookStore.WriteItemCommand;


@ExtendWith(MockitoExtension.class)

class CatalogueTest {

	@Mock
	private ReadItemCommand mockReadItemCommand;

	@Mock
	private WriteItemCommand mockWriteItemCommand;

	@Mock
	private List<Book> mockBooks;

	private Catalogue catalogue;

	@BeforeEach
	void setUp()  {
		catalogue = new Catalogue(mockReadItemCommand, mockWriteItemCommand);
	}

	@Test
	void getAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue() {

		when(mockReadItemCommand.readAll()).thenReturn(new ArrayList<Book>());
		mockBooks = catalogue.getAllBooks();
		assertEquals(0, mockBooks.size());
	}

	@Test
	void getAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled() {

		catalogue.getAllBooks();
		verify(mockReadItemCommand, times(1)).readAll();
	}

	@Test
	void getAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled() {

		when(mockReadItemCommand.readAll()).thenReturn(mockBooks);
		List<Book> books = catalogue.getAllBooks();
		assertEquals(books, mockBooks);
	}

	@Test
	void test4() {

		Book book = new Book();
		catalogue.addBook(book);
		verify(mockWriteItemCommand).insertItem(book);

	}

	@Test
	void test5() {
		List<Book> books = new ArrayList<>();
		Book book1 = new Book();
		Book book2 = new Book();
		books.add(book1);
		books.add(book2);
		catalogue.addBooks(books);
		verify(mockWriteItemCommand, times(2)).insertItem(any(Book.class));

	}

	@Test
	void test6() {
		Book book = new Book("one");
		when(mockReadItemCommand.getItem("one")).thenReturn(book);
		Book returned = catalogue.getBook("one");
		assertEquals(book, returned);
	}

	@Test
	void test7() {
		Book book = new Book();
		catalogue.deleteBook(book);
		verify(mockWriteItemCommand).deleteItem(book);
	}

	@Test
	void test8() {
		List<Book> books = new ArrayList<>();
		Book book1 = new Book();
		Book book2 = new Book();
		books.add(book1);
		books.add(book2);
		when(mockReadItemCommand.readAll()).thenReturn(books);
		catalogue.deleteAllBooks();
		verify(mockWriteItemCommand, times(2)).deleteItem(any(Book.class));

	}

}
