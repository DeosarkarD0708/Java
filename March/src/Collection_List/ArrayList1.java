package Collection_List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	
	public static void main(String[]args) {
		
		ArrayList AL = new ArrayList();
		
		ArrayList<String> AL1 = new ArrayList<String>();
		
		AL.add("Ojas");
		AL.add(500);
		AL.add(50.25);
		AL.add('d');
		AL.add(true);
		System.out.println(AL);
		
		System.out.println("Number of element in given array-->"+AL.size());
		
		AL.remove(true);
		System.out.println(AL);
		
		AL.add(30);
		System.out.println(AL);
		AL.add(3,"Ria");
		System.out.println(AL);
		
		
		System.out.println(AL.get(2));
		
		
		AL.set(2,"siya");
		System.out.println(AL);
		
		System.out.println(AL.isEmpty());
		
		System.out.println("********************");
		
		System.out.println("Reding element using forloop");
		
		for(int i = 0;i<AL.size();i++) {
			
			System.out.println(AL.get(i));
			}
		System.out.println("Reading element using for each loop");
		
		for(Object obj : AL) {
			System.out.println(obj);
		}
		
		System.out.println("Reading element using iterator");
		
		Iterator AL2 = AL.iterator();
		
		while(AL2.hasNext()) {
			
			System.out.println(AL2.next());
			
		
		}
		
		
		
		
		
		
		
	}

}
