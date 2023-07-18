package ExceptionHandling;

public class ExceptionHandling3 {
	
	public static void main(String[]args) {
		
		System.out.println("Program started");
		
		String Name = null;
		
		try {
			System.out.println(Name.length());
			} catch (ArithmeticException r) {
				System.out.println(r.getMessage());
				r.printStackTrace();
			}
		    catch(NullPointerException rr) {
		    	System.out.println(rr.getMessage());
		    	rr.printStackTrace();
		    }
		
		     int arr[] = new int [3];
		     try {
		    	 arr[4] = 4; 	 
		     }
		     catch(ArrayIndexOutOfBoundsException e) {
		    	 
		    	 e.getMessage();
		    	 e.printStackTrace();
		    	 
		     }
		     
		     System.out.println("Program completed");
		
		
	}

}
