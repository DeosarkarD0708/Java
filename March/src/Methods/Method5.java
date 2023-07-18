package Methods;

public class Method5 {
   
	//Non static regular method calling from same class
	
	public static void main(String[]args) {
		
		System.out.println("Main method started");
		
		//1.Direct calling
		
		//Demo1();
		//Demo2();
		
		
		//2.calling by class name
		
		//Method5.Demo1();
		//Method5.Demo2();
		
		//Object Creation
		
		//Syntax - classname referencevariablename = new classname();
		
		Method5 obj = new Method5();
		
		//obj refvarname.methodname():
		
		obj.Demo1();
		obj.Demo2();
		obj.m1();
	
	System.out.println("Main method ended");		
	}
	
	public void Demo1() {
		
		System.out.println("Non static regular method calling from same class--> Demo1");
	}
	
	public void Demo2() {
		
		System.out.println("Non static regular method calling from same class--> Demo2");
	}
	
	public void m1() {
		
		System.out.println("Hello");
	}
}
