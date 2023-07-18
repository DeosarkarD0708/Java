package Collection_List;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
	
	public static void main(String[]args) {
		
		Vector VC = new Vector();
		
		VC.add("Ojas");
		VC.add(7);
		VC.add(true);
		VC.add(null);
		VC.add('D');
		VC.add(25);
		
		System.out.println(VC);
		
		System.out.println(VC.size());
		
		VC.remove(null);
		System.out.println(VC);
		//VC.remove('D');
		//System.out.println(VC);
		
		VC.set(3,"Tushar");
		System.out.println(VC);
		
		System.out.println("Reading the element using for loop");
		
		for(int i = 0;i<VC.size();i++) {
			
			System.out.println(VC.get(i));
		}
		
		System.out.println("Reading the element using for each loop");
		
		for(Object obj : VC) {
			
			System.out.println(obj);
		}
		
		System.out.println("Reading the element using Iterator");
		
		Iterator it = VC.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
