package Collection_Set;

import java.util.HashSet;

public class HashSet3 {
	
	public static void main(String[]args) {
		
		HashSet<String> HS2 = new HashSet<String>();
		
		HS2.add("Ojas");
		HS2.add("Shreya");
		HS2.add("kavya");
		HS2.add("Ram");
		HS2.add("kavish");
		
		System.out.println(HS2);
		
		HashSet<String> HS3 = new HashSet<String>();
		
	     HS3.addAll(HS2);
	     System.out.println(HS3);
	     
	     HS3.removeAll(HS2);
	     System.out.println(HS3);
	}

}
