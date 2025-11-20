package com.fdmgroup.comparisonsExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class Runner {

	public static void main(String[] args) {

		Book book1 = new Book("Learn Java", 45678, 19.99, 500, 4.3);
		Book book2 = new Book("Learn UNIX", 65432, 17.5, 650, 3.9);
		Book book3 = new Book("Learn SQL", 87956, 9.75, 220, 4.4);
		Book book4 = new Book("Learn Agile", 35367, 25.5, 500, 4.4);
		Book book5 = new Book("Learn React", 55676, 28.75, 490, 4.8);
		Book book6 = new Book("Learn JavaScript", 34343, 14.99, 300, 4.4);
		Book book7 = new Book("Learn Python", 65767, 27.25, 500, 4.1);

		List<Book> booklist = Arrays.asList(book1, book2, book3, book4, book5, book6, book7);

		NumberOfPagesComparator np = new NumberOfPagesComparator();

		Collections.sort(booklist, np);
		for (Book book : booklist) {
			System.out.println(book);
		}

		System.out.println("----------------2222---------------");
		NameComparator nc = new NameComparator();
		Collections.sort(booklist, nc);
		for (Book book : booklist) {
			System.out.println(book);
		}

		System.out.println("----------------3333---------------");

		PriceComparator pc = new PriceComparator();
		Collections.sort(booklist, pc);
		for (Book book : booklist) {
			System.out.println(book);
		}

		System.out.println("----------------4444---------------");

		IsbnAndPagesComparator ic = new IsbnAndPagesComparator();
		Collections.sort(booklist, ic);
		for (Book book : booklist) {
			System.out.println(book);
		}
		
		
		System.out.println("----------------5555---------------");

		RatingAndPriceComparator rp=new RatingAndPriceComparator();
		Collections.sort(booklist, rp);
		for (Book book : booklist) {
			System.out.println(book);
		}
		
		System.out.println("----------------Treeset---------------");

		Set<Book>treeset=new TreeSet<>(rp);
		
		treeset.add(book7);
		treeset.add(book6);
		treeset.add(book5);
		treeset.add(book4);
		treeset.add(book3);
		treeset.add(book2);
		treeset.add(book1);
		for(Book treset:treeset) {
		System.out.println(treset);}
		
		System.out.println("----------------priority---------------");
		
		
		PriorityQueue <Double>pq=(createQueueDescending(book1.getPrice(),book2.getPrice(),book3.getPrice(),book4.getPrice(),book5.getPrice(),book6.getPrice(),book7.getPrice()));
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}

	}
	
	public static PriorityQueue<Double> createQueueDescending(Double... values) {
	    PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());

	    for (Double d : values) {
	        pq.add(d);
	    }

	    return pq;
	}
	
	


}
