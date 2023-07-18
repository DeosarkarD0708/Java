package Collection_List;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {
	
	public static void main(String[]args) {
		
		String arr[] = {"Dog","Elephant","Cat"};
		
		for(String name:arr) {
			System.out.println(name);
		}
		
		ArrayList AL = new ArrayList(Arrays.asList(arr));
		
		System.out.println(AL);
	}
	

	
}
