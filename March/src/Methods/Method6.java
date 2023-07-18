package Methods;

public class Method6 {

	//Non static method calling from same class
	
	public static void main(String[]args) {
		
		System.out.println("Main method started");
		
		Method6 Test = new Method6();
		
		
		Test.m1();
		Test.m2();
		Test.m3();
		
		System.out.println("Main method ended");
	}
	
	public void m1() {
	 System.out.println("Non static regular method calling from same class -> m1");
}
    public void m2() {
     System.out.println("Non static regular method calling from same class -> m2");
}
    public static void m3() {
      System.out.println("Static method");
    }
    
}
    
    
    
    