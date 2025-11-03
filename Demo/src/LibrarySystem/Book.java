package LibrarySystem;

public class Book {


	    // Private attributes
	    private String title;
	    private String author;
	    private int pages;
	    private boolean isAvailable;

	    // Constructor
	    public Book(String title, String author, int pages, boolean isAvailable) {
	        this.title = title;
	        this.author = author;
	        this.pages = pages;
	        this.isAvailable = isAvailable;
	    }

	    // Getters & Setters
	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public int getPages() {
	        return pages;
	    }

	    public void setPages(int pages) {
	        this.pages = pages;
	    }

	    public boolean isAvailable() {
	        return isAvailable;
	    }

	    public void setAvailable(boolean isAvailable) {
	        this.isAvailable = isAvailable;
	    }

	    // Methods
	    public void borrowBook() {
	        System.out.println("Borrowing " + title);
	        this.isAvailable = false;
	    }

	    public void returnBook() {
	        System.out.println("Returning " + title);
	        this.isAvailable = true;
	    }

	    public String getInfo() {
	        return "Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Available: " + isAvailable;
	    }
	}

