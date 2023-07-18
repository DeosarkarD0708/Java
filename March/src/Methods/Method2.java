package Methods;

public class Method2 {

	public static void main(String[]args) {
		
		System.out.println("Main Method started");
		
		//1.Direct calling by method name
		
		staticmethod1();
		staticmethod2();
		
		//2.Calling by Class name
		
		Method2.staticmethod1();
		Method2.staticmethod2();
		
		System.out.println("Main Method ended");
		
	}
	
	public static void staticmethod1() {
		
		int i = 10;
		int j = 20;
		int k = i+j;
		
		System.out.println("Addition of two no-->"+k);
	}
	
	 public static void staticmethod2() {
		 
		 System.out.println("Static metod calling from same class");
	 }
}
