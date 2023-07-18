package ControlStatements;

public class LeapYear1 {
	
	public static void main(String[]args) {
		
		int year = 2121;
		
		System.out.println("year--->"  +year);
		
		if(year%4==0) {
			System.out.println("Specified year is leap year");
		}
		else if(year%400==0) {
			System.out.println("Specified year is leap year");
		}
		else if(year%100!=0) {
			System.out.println("Specified year is  not a leap year");
		}
		else {
			System.out.println("Specified year is not a leap year");
					
				}
		
			}
				
			
	}


