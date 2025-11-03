package LibrarySystem;

public class Library {

	
	    // Private attributes
	    private String name;
	    private String address;
	    private int totalBooks;

	    // Constructor
	    public Library(String name, String address, int totalBooks) {
	        this.name = name;
	        this.address = address;
	        this.totalBooks = totalBooks;
	    }

	    // Getters & Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public int getTotalBooks() {
	        return totalBooks;
	    }

	    public void setTotalBooks(int totalBooks) {
	        this.totalBooks = totalBooks;
	    }

	    // Methods
	    public void addBooks(int count) {
	        totalBooks += count;
	        System.out.println("Added " + count + " books");
	    }

	    public void removeBooks(int count) {
	        totalBooks -= count;
	        System.out.println("Removed " + count + " books");
	    }

	    public String getInfo() {
	        return "Library: " + name + ", Address: " + address + ", Total books: " + totalBooks;
	    }
	}


