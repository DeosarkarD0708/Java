package Collection_Set;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	
	public static void main(String[]args) {
		
		LinkedHashSet LHS = new LinkedHashSet();
		
		LinkedHashSet<Integer> LHS1 = new LinkedHashSet<Integer>();
		
		
		LHS.add(200);
		LHS.add(25);
		LHS.add("ojas");
		LHS.add(null);
		LHS.add(null);
		LHS.add(true);
		
		System.out.println(LHS);
		
		System.out.println(LHS.add(200));
		System.out.println(LHS.add(400));
		
		LHS1.add(23);
		LHS1.add(7);
		System.out.println(LHS1);
	}

}
