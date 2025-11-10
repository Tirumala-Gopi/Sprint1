package generics;

public class Book implements CatalogItem<Integer> {
	private int id;
	

	public Book(int id) {
		super();
		this.id = id;
	}
	

	@Override
	public String toString() {
		return "Book [id=" + id + "]";
	}


	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		
	}

}
