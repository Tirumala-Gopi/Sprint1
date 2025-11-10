package generics;

import java.util.ArrayList;
import java.util.List;

public class Catalog <T> {
	
	private List<T>items;

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}

	public Catalog() {
		super();
		this.items = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Catalog [items=" + items + "]";
	}
	
	public void addItem(T item)
	{
		items.add(item);
	}
	
	public T findItem(int id)
	{
	 
		return items.get(id);
	}
	

}
