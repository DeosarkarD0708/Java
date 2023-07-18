package String;

public class StringRev {
	
	public static void main(String[]args) {
		
		String Str = "Welcome to java and automation";
		//emoclew
		//
		String Rev = "";
		
		System.out.println(Str.length());
		
		for(int i =0;i< Str.length();i++) {
			
			Rev = Str.charAt(i)+Rev;
			
			
		}
		
		System.out.println("Revrsed string:"+Rev);
		
	}

}
