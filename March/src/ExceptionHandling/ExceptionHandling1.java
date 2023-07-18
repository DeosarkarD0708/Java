package ExceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[]args) {
		
		System.out.println("Hi good evening");
		
		int Number =100;
		//System.out.println(Number/0);//java.lang.arithmeticException
		
		System.out.println("Hi good evening");
		
		String str ="Rohit";
		
		//Integer.parseInt(str); //java.lang.NumberFormatException
		
		String Test = null;
		//System.out.println(Test.length());  //java.lang.NullPointerException;
		
		int arr[] = new int[-5]; //java.lang.NegativeArraySizeException
		arr[0]= 33;
		arr[5]= 44; //java.lang.ArrayIndexOutOfBoundException;
		
		//Exception handling is a mechanism to handle runtime exception
	}
}
