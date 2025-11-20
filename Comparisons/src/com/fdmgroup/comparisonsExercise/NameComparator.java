package com.fdmgroup.comparisonsExercise;

import java.util.Comparator;

public class NameComparator implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
//		if (book1.getTitle() != book2.getTitle()) {
//			return book2.compareTo(book1);
//		} else {
//
//			return book1.compareTo(book2);
//		}
return book1.getTitle().compareTo(book2.getTitle());
	}

}
