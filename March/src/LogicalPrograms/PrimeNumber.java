package LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[]args) {
		
		//prime number is number that greater than 1 and divided by 1 or itself only
		//ex - 2,3,5,7,11,13,17
		
		System.out.println("Enter a number");
		
		Scanner SC = new Scanner(System.in);
		
		int num = SC.nextInt();
		int i;
		for(i=2;i<num;i++)
			
			if(num%i==0)
				break;
		if(i==num)
			System.out.println("Prime number");
		else
			System.out.println("Not prime number");
		
	}

}
