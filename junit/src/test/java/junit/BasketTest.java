package junit;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class BasketTest {
	

	

	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded() {
		int expectedresult=0;
		Basket obj=new Basket();
		
		
		int Actualresult=obj.getBooks().size();
		assertEquals(expectedresult,Actualresult);
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {
		Basket obj=new Basket();
		Book book=new Book();
		obj.getBooks().add(book);
		assertEquals(1,obj.getBooks().size());
		
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithTwoBooks() {
		Basket obj=new Basket();
		Book book1=new Book();
		Book book2=new Book();
		obj.getBooks().add(book1);
		obj.getBooks().add(book2);
		assertEquals(2,obj.getBooks().size());
	}

}
