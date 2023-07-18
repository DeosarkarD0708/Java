package DataType;

public class NumericandNondecimal {

	public static void main(String[]args) {
		
		//Primitive data type
		
		//byte data type  -- Byte  -128 to 127
	
		//Syntax = DataType VariableName = Value;
		
		byte b = 50;
		
		byte b1 = 127;
		
		//byte b2 = 128; // not allowed - Max value
		
		System.out.println("Byte Data Type -->" + b);
		System.out.println("Byte Data Type max limit -->" + b1);
		 
		byte b2 = -46;
		byte b3 = -128;
		
		//byte b4 = -129; Not allowed
		
		System.out.println("Byte Data Type -->" + b2);
		System.out.println("Byte Data Type min limit -->" +b3);
		
		System.out.println();
		System.out.println("************************************");
		
		//2.Short Data Type - 2 Byte - 16 Bit (-32768 to 32767)
		
		// Syntax - DataType VariableName = value;
		
		short S1 = 150;
		short S2 = 2000;
		short S3 = 32767;
		short S4 = -2000;
		short S5 = -32768;
		
		System.out.println("Short Data Type --" + S1);
		System.out.println("Short Data Tyoe --" + S2);
		System.out.println("Short Data Type max limit --" + S3);
		System.out.println("Short Data Type --" + S4);
		System.out.println("Short Data Type min limit -->" + S5);
		
		System.out.println();
		System.out.println("**********************************");
		
		//3. int data type -- 4 Byte -- 32 Bit --> -2147483648 to 2147483647
		
		//Syntax - Data Type VariableName = value;
		
		int i1 = 120;
		int i2 = 32768;
		int i3 = 2147483647;
		int i4 = -2848444;
		int i5 = -2147483648;
		
		System.out.println("int data type --" + i1);
		System.out.println("int data type --" + i2);
		System.out.println("int data type max limit --" + i3);
		System.out.println("int data type --" + i4);
		System.out.println("int data type min limit -- " + i5);
		
		System.out.println();
		System.out.println("*********************");
		
		//4.Long data type - 8 Byte - 64 bit
		
		//Syntax - Datatype variableName = value;
		
		long L1 = 214748364655l;
		long L2 = 9223372036854775807l;
		
		//long L3 = 9223372036854775808l;
		
		long L4 = -23456789;
		long L5 = -9223372036854775808l;
		
		System.out.println("Long data type-->"+L1);
		System.out.println("Long data tye max limit-->"+L2);
		System.out.println("Long data type---->"+L4);
		System.out.println("Long data type min limit--->"+L5);
		
}
}
