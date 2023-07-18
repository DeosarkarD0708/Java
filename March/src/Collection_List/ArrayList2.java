package Collection_List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
	
	public static void main(String[]args) {
		
		ArrayList AL = new ArrayList();
		
		AL.add("Ojas");
		AL.add("123");
		AL.add("A");
		AL.add("Ria");
		AL.add("5");
		
		System.out.println(AL);
		
		ArrayList duplicate = new ArrayList();
		
		duplicate.addAll(AL);
		System.out.println(duplicate);
		
		duplicate.removeAll(AL);
		System.out.println(duplicate);
		
		System.out.println(AL);
		Collections.sort(AL);
		System.out.println(AL);
		
		Collections.sort(AL,Collections.reverseOrder());
		System.out.println(AL);
		
		Collections.shuffle(AL);
		System.out.println(AL);
		
	}

}
