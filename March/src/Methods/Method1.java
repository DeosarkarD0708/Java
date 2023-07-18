package Methods;

public class Method1 {
	
	//Static regular method calling from same class
	
	public static void main(String[]args) {
		
		//starting point of the program
		
		System.out.println("Main method started");
		 
		//1. Direct calling by method name
		
		//Syntax --> Methodname();
		
		Demo1();
		Demo2();
		
		//2.Calling by class name
		
		//Syntax --> Classname.methodname();
		
		
		Method1.Demo1();
		Method1.Demo2();
		
		System.out.println("Main method Ended/completed");
		
	}
          public static void Demo1() {
        	
        	  System.out.println("Static regular method calling from same class --> Demo1");
        	  
          }
          
          public static void Demo2() {
        	  
        	  System.out.println("Static regular method calling from same class --> Demo2");
          }
}
