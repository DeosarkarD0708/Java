package ExceptionHandling;

import java.util.ArrayList;

public class OutOfMemoryError {
	
	public static void main(String[]args) {
		
		String str = "Rahul";
		
		ArrayList AL = new ArrayList();
		
		while(true) {
			
			str = str +"Test";
			AL.add(str);
			
			//System.out.println(AL);
			}
	}

}
