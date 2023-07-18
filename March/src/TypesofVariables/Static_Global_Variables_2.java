package TypesofVariables;

public class Static_Global_Variables_2 {
	
	static int Number = 200;
	static String name = "Rohit";

	public static void main(String[]args) {
		
		//Static global variables calling from the same class
		
		System.out.println(Number);
		System.out.println(name);
		
		Static_Global_Variables_2.Demo1();
		Static_Global_Variables_2.Demo2();
		
		Static_Global_Variables_2 SGV = new Static_Global_Variables_2();
		
		SGV.Demo3();
		
	}
	
	public static void Demo1() {
		
		System.out.println(Number);
		System.out.println(name);
		System.out.println();
		
		Number = 400;
		name = "Rahul";
		
	}
	
	public static void Demo2() {
		
		System.out.println(Number);
		System.out.println(name);
	}
	
	public void Demo3() {
		
		System.out.println(Number);
		System.out.println(name);
	}
}
