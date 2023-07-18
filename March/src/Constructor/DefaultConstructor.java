package Constructor;

public class DefaultConstructor {
	String Name;
	int RollNo;
	
public DefaultConstructor() {
	
	System.out.println("Default Constructor");
}
  public static void main(String[]args) {
	  
	  DefaultConstructor D1 = new DefaultConstructor();
  }
  
  public void Method1() {
	  System.out.println("Default Method");
  }

}
