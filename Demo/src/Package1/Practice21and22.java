package Package1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class Practice21and22 {

	public static void main(String[] args) {
		//2.1
		ArrayList<String> shoppingbasket = new ArrayList<String> ();
		shoppingbasket.add("milk");
		shoppingbasket.add("cereals");
		shoppingbasket.add("apples");
		shoppingbasket.add("oranges");
		shoppingbasket.add("bread");
		System.out.println(shoppingbasket.size());
		System.out.println(shoppingbasket.get(0));
		System.out.println(shoppingbasket.get(4));
		shoppingbasket.remove(4);
		System.out.println(shoppingbasket.size());
		shoppingbasket.remove(2);
		System.out.println(shoppingbasket);
		shoppingbasket.add("potatoes");
		shoppingbasket.add("olive oil");
		shoppingbasket.add("chicken");
		//shoppingbasket.addAll(Arrays.asList())
		Collections.sort(shoppingbasket);
		System.out.println(shoppingbasket);
		System.out.println(shoppingbasket.get(0));
		System.out.println(shoppingbasket.get(5));
		
		//2.2
		ArrayList<Integer> salaries = new ArrayList<Integer> ();
		salaries.add(75000);
		salaries.add(25000);
		salaries.add(42000);
		salaries.add(30000);
		salaries.add(55000);
		salaries.add(42000);
		salaries.add(39000);
		System.out.println(salaries);
		System.out.println(Collections.max(salaries));
		System.out.println(Collections.min(salaries));
		System.out.println("number of people earning 42000 "+Collections.frequency(salaries, 42000));
		Collections.sort(salaries);
		System.out.println(salaries.get(3));
		Collections.reverse(salaries);
		System.out.println(salaries.get(0) +" " +salaries.get(6) );
		
		
	}

}