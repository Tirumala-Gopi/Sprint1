package Package1;

import java.util.Scanner;

public class Arrays {

//	public static void main(String[] args)
//		{
//		Scanner sc=new Scanner(System.in);
//		int size=sc.nextInt();
//		int[] numbers=new int[size];
//		System.out.println("size of the array is "+size);
//		int i =0;
//		
//		while (i<numbers.length) 
//			{
//			
//		
//			numbers[i]=sc.nextInt();
//			i++;
//			
//			}
//		
//	i=0;
//		while (i<numbers.length) 
//		{
//			System.out.println(numbers[i]);
//			i++;}
//
//	}

	
//	public static void main(String args[]) {
//		int[] price= {10,20,30};
//		int[] tax= {13,13,13};
//		int p=0;
//		int t=0;
//		while(p<price.length)
//		{
//			int sum=(price[p]+tax[t]);
//		
//			System.out.println(p+"th index of sum is "+sum);
//			p++;
//			t++;
//			
//		}
//		
//	}
	
	
//	public static void main(String args[]) {
//		String[] mobilePhones= {"apple","samsung","redmi","vivo","iqoo","realme","honor"};
//		int i =0;
//		while(i<mobilePhones.length)
//		{
//			String model=mobilePhones[i];
//			int phone=model.length();
//			
//			System.out.println(i+"th index of mobilephones  is "+model+" and its length is "+phone);
//			i++;
//		}
//		
//		
//		
//	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		String model=sc.next();
		System.out.println(model);
		int i=0;
		while(i<model.length()) {
			char ch=model.charAt(i);
//			System.out.println(ch);
//			System.out.println(i+ " is   "+ch +Character.isLetterOrDigit(ch)  );
			
			
			if(Character.isDigit(ch)) {
				System.out.println(ch);
			}
			i++;
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
