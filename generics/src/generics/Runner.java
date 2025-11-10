package generics;

public class Runner {

	public static void main(String[] args) {
		
//		pair one=new pair("gopi",24);
//		pair two=new pair("go",2);
//		
//		System.out.println(one.getFirstElement());
		
		
		
		Book b=new Book(24);
		Borrower B=new Borrower(2);
		
//		System.out.println(b.getId());
//		System.out.println("before set id "+B.getId());
//		B.setId(5);
//		System.out.println("after set id="+B.getId());
		
		Catalog<CatalogItem>itemlist=new Catalog<>();
		itemlist.addItem(B);
		itemlist.addItem(b);
		
		//System.out.println(itemlist.getItems());
		
		System.out.println(itemlist.findItem(1));
	}

}
