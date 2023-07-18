package Collection_Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	
	public static void main(String[]args) {
		
		HashSet HS = new HashSet();
		
		HashSet HS1 = new HashSet(200,(float)0.50);
		
		HashSet<String> HS2 = new HashSet<String>();
		
		HS.add(23);
		HS.add(true);
		HS.add(null);
		HS.add(12.5);
		HS.add('D');
		HS.add("OJas");
		HS.add(null);
		
		System.out.println(HS);
		
		System.out.println(HS.add('T'));//true
		
		System.out.println(HS.add('D'));//False
		
		HS.remove(null);
		System.out.println(HS);
		
		System.out.println(HS.isEmpty());
		System.out.println(HS1.isEmpty());
		
		System.out.println("*****************************");
		
		System.out.println(HS.contains('D'));
		System.out.println(HS.contains('P'));
		
		for(Object obj : HS) {
			System.out.println(obj);
		}
		
		System.out.println("****************************");
		
		Iterator it = HS.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
			
	
		}
		
		
		
		
		}

}
