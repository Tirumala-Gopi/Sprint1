package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class reverse {
	
	
	
	public static LinkedList<Integer> Reverse(LinkedList<Integer> original)
	{
		
		 
		LinkedList<Integer>REVERSE=new LinkedList<>();
		Integer INT=0;
		
		
		
		
		for(int i=original.size()-1;i>=0;i--)
		{
			
			INT=original.get(i);
			REVERSE.add(INT);
		}
		
return REVERSE;
		
	}
	
	public static void main (String[] args)
	{
		LinkedList<Integer> ORIGINAL=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			ORIGINAL.add(sc.nextInt());
		}
		
		
		System.out.println(Reverse(ORIGINAL));
		
		
		
		
		
	}
	
	

}
