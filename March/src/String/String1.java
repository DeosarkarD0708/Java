package String;

public class String1 {
	
	public static void main(String[]args) {
		
		//By using string literal
		//syntax - String SRVN = "Values";
		
		String str = "Automation";
		String str1 = "Automation";
		
		//by using new keyword
		//syntax
		// String str = new String("values");
		
		String S3 = new String("Java");
		String S4 = new String("Java");
		String S5 = new String("Automation");
		
		System.out.println(str==str1);
		System.out.println(str==S5);
		System.out.println(S3==S4);
	}

}
