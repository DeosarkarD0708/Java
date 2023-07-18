package Collection_List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	
	public static void main(String[]args) {
		
		LinkedList LL = new LinkedList();//hetrogenious
		
		LinkedList<String> LL1 = new LinkedList<String>();//HOmogenious
		
		LL.add("Ojas");
		LL.add("25.07");
		LL.add(true);
		LL.add('A');
		LL.add("25");
		LL.add(null);
		
		System.out.println(LL);
		
		System.out.println(LL.size());
		
		LL.remove("25");
		
		System.out.println(LL);
		
		LL.add(500);
		LL.add(2,"Ram");
		System.out.println(LL);
		
		System.out.println(LL.get(2));
		
		System.out.println(LL.getFirst());
		System.out.println(LL.getLast());
		
		System.out.println(LL.isEmpty());
		
		System.out.println(LL.contains("Ojas"));
		
		System.out.println("Reading element using for loop");
		
		for(int i=1;i<LL.size();i++) {
			
			System.out.println(LL.get(i));
			
		}
		
		System.out.println("Reading element using for each loop");
		
		for(Object obj: LL) {
			
			System.out.println(obj);
		}
		
		System.out.println("Reading element using Iterator");
		
		Iterator it = LL.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	
		
	}
		
	}


