package com.fdmgroup.comparisonsExercise;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		if(book1.getPrice()!=book2.getPrice()) {
			return (int)(book2.getPrice()-book1.getPrice());
		}
		else {
			return book2.compareTo(book1);
		}
		
		
		
	}

}
