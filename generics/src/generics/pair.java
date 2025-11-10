package generics;

public class pair <F,S> {
	private F firstElement;
	private S secondElement;
	public F getFirstElement() {
		return firstElement;
	}
	public void setFirstElement(F firstElement) {
		this.firstElement = firstElement;
	}
	public S getSecondElement() {
		return secondElement;
	}
	public void setSecondElement(S secondElement) {
		this.secondElement = secondElement;
	}
	@Override
	public String toString() {
		return "pair [firstElement=" + firstElement + ", secondElement=" + secondElement + "]";
	}
	public pair(F firstElement, S secondElement) {
		super();
		this.firstElement = firstElement;
		this.secondElement = secondElement;
	}
	
	
	
	
	
	
	

}
