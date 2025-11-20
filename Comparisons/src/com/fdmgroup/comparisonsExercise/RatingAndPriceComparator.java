package com.fdmgroup.comparisonsExercise;

import java.util.Comparator;

public class RatingAndPriceComparator implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {

		if(book1.getRating()!=book2.getRating()) {
			
			return Double.compare(book2.getRating(), book1.getRating());}
			//return (int) (book2.getRating()-book1.getRating());}
		
		
		else if(book1.getPrice()!=book2.getPrice()) {
				return (int) (book1.getPrice()-book2.getPrice());
			}
		
		
		
		
		else
			{return book2.compareTo(book1);}
	}

}
