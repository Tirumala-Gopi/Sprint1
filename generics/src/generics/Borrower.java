package generics;

public class Borrower implements CatalogItem<Integer> {

	
	private int id;
	
	
	
	@Override
	public String toString() {
		return "Borrower [id=" + id + "]";
	}

	public Borrower(int id) {
		super();
		this.id = id;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(int id) {
		this.id=id;
		
	}

}
