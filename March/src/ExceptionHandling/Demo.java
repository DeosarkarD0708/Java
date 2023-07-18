package ExceptionHandling;

public class Demo {
	
	public static void m1() {
		m2();
	}
	
	public static void m2() {
		m3();
	}
	
	public static void m3() {
		
		int Number = 100;
		System.out.println(Number);
	}
	
	public static void main(String[]args) {
		
		m1();
	}

}
