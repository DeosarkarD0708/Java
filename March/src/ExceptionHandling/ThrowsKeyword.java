package ExceptionHandling;

public class ThrowsKeyword {
	
	public static void main(String[]args) {
		
		ThrowsKeyword TK = new ThrowsKeyword();
		TK.sum();
		System.out.println("Hello");
	}
	
	public void sum() {
		try {
			div();
			}
		catch(ArithmeticException e) {
	}
	}
	private void div() {
		
		int i = 10/0;
		int j = 100/0;
	}

}
