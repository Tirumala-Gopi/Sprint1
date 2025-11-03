package Package1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class charfinding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		char letter=sc.next().charAt(0);
		charCounting(word,letter);
				

	}
	public static void charFinding(String word,char letter) {
		int w = 0;
		
		//System.out.println("i"+i);
		int l = word.length();
		int flag = 0;
		for(w=0;w<l;w++) 
		{
			char i = word.charAt(w);
			if(letter==i) 
			{
			
			flag=1;
			System.out.println(w + "is index of "+letter);
			}
		
		}
		if(flag==0)
		{
			System.out.println("not present");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void charCounting(String word,char letter) {
		int w = 0;
		
		
		int l = word.length();
		int flag = 0;
		int count=0;
		for(w=0;w<l;w++) 
		{
			char i = word.charAt(w);
			if(letter==i) 
			{
			count++;
			flag=1;
			
			}
		
		}
		 if(flag!=0) {
		System.out.println(count);}
		 else
		{
			System.out.println("not present");
	
		}
		
	}
	 
}

 

