package Collection_Set;

import java.util.HashSet;

public class HashSet2 {
	
	public static void main(String[]args) {
		
		HashSet HS2 = new HashSet();
		
		HS2.add(23);
		HS2.add(56);
		HS2.add(25);
		HS2.add(30);
		HS2.add(15);
		HS2.add(21);
		
		HashSet HS3 = new HashSet();
		
		HS3.add(23);
		HS3.add(19);
		HS3.add(25);
		HS3.add(11);
		HS3.add(63);
		HS3.add(58);
		
		
		HS2.addAll(HS3);
		System.out.println(HS2);
		
		HS3.retainAll(HS2);
		System.out.println(HS3);
		
		System.out.println(HS2.containsAll(HS3));
		
		HS2.removeAll(HS3);
		System.out.println(HS2);
	
	}

}
