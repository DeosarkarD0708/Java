package Constructor;

public class UserdefineCons {

	//without parameter cons
	//1.var Dec
	
	int Num1;
	int Num2;
	
	public UserdefineCons() {
		
		//2.var initialization
		
		Num1 = 10;
		Num2 = 20;
		int add = Num1+Num2;
		
		//use
		
		System.out.println(add);
	}
	
	public UserdefineCons(int a,int b) {
		Num1 = a;
		Num2 = b;
		int add = Num1+Num2;
		System.out.println(add);
		
	}
	
	public void Addition() {
		
		int sum = Num1+Num2;
		System.out.println(sum);
	}
	
	public static void main(String[]args) {
		
		UserdefineCons UD = new UserdefineCons();
		UD.Addition();
	}

}
