package Methods;

public class Method11 {
	
	public static void main(String[]args) {
		Method11.studentname("Ojas");
		Method11.studentname("Ram");
		Method11.studeninfo("Shreyas",22);
		Method11.studeninfo("Siya",51);
		Method11.studeninfo("Shreya",15);
		
		
	}
	
	public static void studentname(String Name) {
		
		System.out.println(Name);
	}

	public static void studeninfo(String Name, int No) {
		
		System.out.println("studentinfo-->"+Name+" "+ No);
		
	}
}
