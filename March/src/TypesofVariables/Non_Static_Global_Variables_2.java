package TypesofVariables;

public class Non_Static_Global_Variables_2 {
	
	String name = "Ojas";
	
	public static void main(String[]args) {
		
		System.out.println(DifferentClass.name);
		System.out.println(DifferentClass.age);
		
		DifferentClass DC = new DifferentClass();
		
		System.out.println(DC.Rollnumber);
		System.out.println(DC.name1);
		
		
		Non_Static_Global_Variables_2 NSGV = new Non_Static_Global_Variables_2();
		NSGV.Demo();
	}

	public void Demo() {
		
		int RR =55;
		System.out.println(RR);
		System.out.println(name);
	}

}
