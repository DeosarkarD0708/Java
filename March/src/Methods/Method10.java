package Methods;

public class Method10{
	
	//static regular with parameter
	
	public static void main(String[]args) {
		
		addition(33,44);
		Method10.addition(10, 30);
		Method10.addition(30, 50);
		
		substraction(44,22);
		Method10.substraction(30, 10);
		
		substraction(50,10);
		addition1(33,11,1);
		
		Method10.addition1(44, 22,10);
		Method10.addition1(33, 1, 4);
		
	}
	
	public static void addition(int a,int b) {
		
		int c = a+b;
	System.out.println("Addition of two no.-->"+c);
	}
	
	public static void substraction(int a, int b) {
		
		int c = a-b;
	System.out.println("Substraction of two no.-->"+c);
	}
	
	public static void addition1(int a, int b, int c) {
		
		int sum = a+b-c;
	System.out.println("Add/sub of three no-->"+sum);
	}
}
