package Constructor;

public class DefaultConstructor1 {
	
	public static void main(String[]args) {

		DefaultConstructor1 D1 = new DefaultConstructor1();

		DefaultConstructor1 D2 = new DefaultConstructor1();
		
		D1.M1();
		D1.addition();
		D2.M1();
		D2.addition();	
	}
	
	public void M1() {
	 System.out.println("Hello");
    }
	
	public void addition() {
		
		int a = 10;
		int b = 20;
		int add = a+b;
		
		System.out.println(add);
	}
}