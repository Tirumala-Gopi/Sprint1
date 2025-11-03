package Package1;

import java.util.Scanner;

//Main method is the starting point for any execution
//Only the statements in the main method gets executed
//A class can contain variables(instance variables) and methods
//A method should be written only inside a class
//A method should not contain other methods
//A method can be called from another method

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
		String str=sc.next();
		System.out.println(str);
		//int output=factorial(input_number);
		//System.out.println(output);
		//fact(input_number);
		//int output=power(a,b);
		//printAlternate(str);
		reverseString(str);
	}
			
		//abcdef
		//ace


		public static void printAlternate(String str) {
			int l=str.length();
			int i=0;
			while(i<l) {
				
				System.out.println(str.charAt(i));
				
			
				
				i=i+2;
			}
		
			
			
	}

		public static void reverseString(String str) {
			int l=str.length();
			int i=l-1;
			while(i>=0) {
				
				System.out.println(str.charAt(i));
				
			
				
				
				i--;
			}
		
			
			
	}



		private static int power(int a, int b) {
		int result=1;
		int p=0;
		for ( p=b;b>0;b--)
			result=result*(a);
		
			System.out.println(result);
		return result;
		}
			











		public 	static int factorial(int input_number) {
				int f=input_number;
				int c=1;
				while(input_number>0) 
				{
					System.out.println("while loop number "+c);
					System.out.println("input number "+input_number);
					int p =input_number-1;
					
					if(p>0)
					{
					
					f=f*p;
					
					}
					else {
						System.out.println("factorial is zero");
					}
					input_number--;
					System.out.println("P and F"+p+" "+f);
					c++;
}
				return f;
				
			}
			
			public static void fact(int x) {
				int fact=1;
				int output=1;
				while(x>0) {
					output=output*fact;
					fact++;
					x--;
				}
				System.out.println(output);
			}
		
}
