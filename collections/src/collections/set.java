package collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class set {
	
	private String name;
	private String firstNames;


	
	public set(String name, String firstNames) {
		super();
		this.name = name;
		this.firstNames = firstNames;
	}



	@Override
	public String toString() {
		return "set [name=" + name + ", firstNames=" + firstNames + "]";
	}



//	@Override
//	public int hashCode() {
//		return Objects.hash(firstNames, name);
//	}



	@Override
	public int hashCode() {
		return Objects.hash(firstNames);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		set other = (set) obj;
		return Objects.equals(firstNames, other.firstNames);
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getFirstNames() {
		return firstNames;
	}



	public void setFirstNames(String firstNames) {
		this.firstNames = firstNames;
	}



	public static void main(String[] args)
	{
		Set<set>firstNameset=new HashSet<>();
		set one=new set("sundar","pichai");
		set two=new set("gopi","khareedu");
		set three=new set("apple","ïclod");
		set four=new set("tirumala","khareedu");
		
		firstNameset.add(one);
		firstNameset.add(two);
		firstNameset.add(three);
		firstNameset.add(four);
		
		
		
		System.out.println(firstNameset);
		
	}
	

}
