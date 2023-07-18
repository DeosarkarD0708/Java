package Array;

public class Array3 {

	public static void main(String[]args) {
		
		Object obj[] = new Object[5];
		
		obj[0] = 'A';
		obj[1] = 10;
		obj[2] = "Ojas";
		obj[3] = true;
		obj[4] = 12.33f;
		
		System.out.println(obj.length);
		
		for(int i = 0;i<obj.length;i++) {
			
			System.out.println(obj[i]);
		}
 	}
}
