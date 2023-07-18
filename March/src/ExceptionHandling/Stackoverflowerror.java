package ExceptionHandling;

public class Stackoverflowerror {
	
	static int no=1;
	
	public static void Printnumber() {
		
		if(no<=100000) {
			
			System.out.println("Good morning");
			no++;
			Printnumber();
		}
	}
	
	public static void main(String[]args) {
		
		Printnumber();
	}

}
