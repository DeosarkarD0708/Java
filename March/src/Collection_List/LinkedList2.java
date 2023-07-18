package Collection_List;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {
	
	public static void main(String[]args) {
		
		LinkedList<String> LL = new LinkedList<String>();
		
		LL.add("S");
		LL.add("D");
		LL.add("G");
		LL.add("F");
		LL.add("H");
		
		System.out.println(LL);
		
		LinkedList<String> LL1 = new LinkedList<String>();
		
		LL1.addAll(LL);
		System.out.println(LL1);
		
		//LL1.removeAll(LL);
		//System.out.println(LL1);
		
		System.out.println("before sort");
		
		Collections.sort(LL);
		System.out.println(LL);
		
		Collections.sort(LL,Collections.reverseOrder());
	     System.out.println(LL);
	
	}

}
