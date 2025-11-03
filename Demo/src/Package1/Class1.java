package Package1;

import java.util.Scanner;

public class Class1 {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int[] array=new int[3];
		
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter the number");
			int x=sc.nextInt();
			array[i]=x;
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
