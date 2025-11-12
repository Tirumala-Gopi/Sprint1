package junit;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class CheckoutTest {



	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket(){
		Basket obj=new Basket();
		checkout check=new checkout();
		assertEquals(0.0,check.calculatePrice(obj));
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
		
		Basket obj=new Basket();
		Book book=new Book();
		obj.getBooks().add(book);
		book.setPrice(20.0);
		checkout check=new checkout();
		assertEquals(20.0,check.calculatePrice(obj));
		
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBooksInBasket_WhenPassedBasketWithTwoBooks() {
		Basket obj=new Basket();
		Book book1=new Book();
		Book book2=new Book();
		book1.setPrice(20.0);
		book2.setPrice(20.0);
		obj.getBooks().add(book1);
		obj.getBooks().add(book2);
		checkout check=new checkout();
		assertEquals(40.0,check.calculatePrice(obj));
	
	
	}
	
	@Test
	public void discountedPrice()
	{
		Basket obj=new Basket();
		Book book1=new Book();
		Book book2=new Book();
		Book book3=new Book();
		book1.setPrice(25.99);
		book2.setPrice(25.99);
		book3.setPrice(25.99);
		obj.getBooks().add(book3);
		obj.getBooks().add(book1);
		obj.getBooks().add(book2);
		checkout check=new checkout();
		assertEquals(77.19,check.calculatePrice(obj));
		
		
	}
	
	public void discountedPriceFor7()
	{
		Basket obj=new Basket();
		Book book1=new Book();
		Book book2=new Book();
		Book book3=new Book();
		Book book4=new Book();
		Book book5=new Book();
		Book book6=new Book();
		Book book7=new Book();
		book1.setPrice(25.99);
		book2.setPrice(25.99);
		book3.setPrice(25.99);
		book4.setPrice(25.99);
		book5.setPrice(25.99);
		book6.setPrice(25.99);
		book7.setPrice(25.99);
		obj.getBooks().add(book7);
		obj.getBooks().add(book6);
		obj.getBooks().add(book5);
		obj.getBooks().add(book4);
		obj.getBooks().add(book3);
		obj.getBooks().add(book1);
		obj.getBooks().add(book2);
		checkout check=new checkout();
		assertEquals(178.29,check.calculatePrice(obj));
		
	}
	public void discountedPriceFor10() {

		Basket obj=new Basket();
		Book book1=new Book();
		Book book2=new Book();
		Book book3=new Book();
		Book book4=new Book();
		Book book5=new Book();
		Book book6=new Book();
		Book book7=new Book();
		Book book8=new Book();
		Book book9=new Book();
		Book book10=new Book();
		book1.setPrice(25.99);
		book2.setPrice(25.99);
		book3.setPrice(25.99);
		book4.setPrice(25.99);
		book5.setPrice(25.99);
		book6.setPrice(25.99);
		book7.setPrice(25.99);
		book8.setPrice(25.99);
		book9.setPrice(25.99);
		book10.setPrice(25.99);
		obj.getBooks().add(book10);
		obj.getBooks().add(book9);
		obj.getBooks().add(book8);
		obj.getBooks().add(book7);
		obj.getBooks().add(book6);
		obj.getBooks().add(book5);
		obj.getBooks().add(book4);
		obj.getBooks().add(book3);
		obj.getBooks().add(book1);
		obj.getBooks().add(book2);
		checkout check=new checkout();
		assertEquals(293.68,check.calculatePrice(obj));
		
	}
}
