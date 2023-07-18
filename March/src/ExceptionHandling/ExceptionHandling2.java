package ExceptionHandling;

public class ExceptionHandling2 {
	
	public static void main(String[]args) {
		
		System.out.println("Automation");
		
		int Number = 100;
		
		try {
			//System.out.println(Number/0);
		}catch (ArithmeticException e) {
			
			System.out.println("hello");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		finally {
			System.out.println("This is finally block");
			
			//finally block is used to execute the necessary code weather an exception is handle or not
		}
			
	}

}
