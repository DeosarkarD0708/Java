package Constructor;

public class NeedofConstructor {
	
	public NeedofConstructor() {
		
		System.out.println("Default Constructor");
	}
	
	String name;
	int RollNo;
	
	public static void main(String[]args) {
		
		NeedofConstructor S1 = new NeedofConstructor();
	}
	
	public void M1() {
		System.out.println(name+""+RollNo);
	}
	
	public void M2() {
		System.out.println(name+""+RollNo);
	}

}
