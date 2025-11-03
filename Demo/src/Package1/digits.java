package Package1;

import java.util.Scanner;

/*public class SumOfNum {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int input_number=sc.nextInt();
		int sum=0;
		int digits=0;
		while (input_number>0)
		{
			//System.out.println("ip loop"+input_number);
		sum=sum+(input_number%10);
		int coefficient=input_number/10;
		input_number=coefficient;
		digits++;
		}
		System.out.println(sum);
		System.out.println(digits);
		//BODMASS
	}*/
public class digits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter rtge");
int firstnumber=sc.nextInt();
System.out.println(firstnumber);

SumofDigits(123);


}


	static int SumofDigits (int firstnumber) {
		int digits=0;
		while(firstnumber>0) {
			int SumofDigits = (firstnumber%10);
			int coefficient=firstnumber/10;
			firstnumber=coefficient;
			digits++;
		}
		System.out.println("THE SUM OF DIGITS OF"+firstnumber +digits);
		return digits;
	}
	


}	
	
	


//write a method named SumOfDigits which accepts an number as input and return sum of digits and 
// eg: Input=123
//op The sum of digits f 123 is 6