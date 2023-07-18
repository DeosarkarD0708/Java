package LogicalPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[]args) {
		
		int P, Sum, Rem;
		
		System.out.println("Enter a Number");
		
		Scanner SC = new Scanner(System.in);
		
		int num = SC.nextInt();
		P =num;
		
		for(Sum=0;num>0;num=num/10) {
			
			Rem = num % 10;
			Sum = Sum + Rem * Rem * Rem;
			}
		
		    if (Sum==P) {
		    	System.out.println("Armstrong Number");
		    }
		    else {
		    	System.out.println("Not Armstrong Number");
		    		
		    }
	}
}
