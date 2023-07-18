package ControlStatements;

public class Leapyear {
	
	public static void main(String[]args) {
		
		//year should be divisible by 400 and 4 but not by 100
		
		int year = 2000;
		
		if(((year%4==0)&&(year%100!=0))||(year%400==0)){
		
			System.out.println("Specified year is a leap year");
		}
		else {
			System.out.println("Specified year is not a leap year");
		}
	}
	

}
