package Methods;

public class Method4 {

	public static void main(String[]args) {
		System.out.println("Main method started");
		
		//Static regular method calling from different class
		
		//1.Direct calling by method name
		     //Test1();
		     //Test2();
		
		//2.Calling by class name
		
		     Method3.Test1();
		     Method3.Test2();
		     Method4.Demo4();
		     
       System.out.println("Main method ended");
       
	}
	
	public static void Demo4() {
		
		System.out.println("Demo4 Method");
	}
}
