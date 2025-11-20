package com.fdmgroup.comparisonsExercise;

import java.util.Comparator;

public class IsbnAndPagesComparator implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {

		if(book1.getNumberOfPages()!=book2.getNumberOfPages()) {
			return book1.getNumberOfPages()-book2.getNumberOfPages();}
		
		
		else if(book1.getIsbn()!=book2.getIsbn()) {
				return book2.getIsbn()-book1.getIsbn();
			}
		
		
		
		
		else
			{return book1.compareTo(book2);}
	}

}
