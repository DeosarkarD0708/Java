package TypesofVariables;

public class Non_Static_Global_Variables_1 {
	
	int Age1 = 50;
	String name = "Ojas";
	
	public static void main(String[]args) {
		
		Non_Static_Global_Variables_1 NSG = new Non_Static_Global_Variables_1();
		
		//Syntax
		//System.out.println(refname.varname);
		
		System.out.println(NSG.Age1);
		System.out.println(NSG.name);
				
		
	}
	
	public void Test1() {
		
		int Demo = 40;
		name = "RRR";
		
		System.out.println(Demo);
		System.out.println(name);
	}

}
