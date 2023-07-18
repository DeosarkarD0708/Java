package TypesofVariables;

public class Static_Global_Variables_1 {
	
	static int Number = 300;
	
	public static void main(String[]args) {
		
	Static_Global_Variables_1 SV = new Static_Global_Variables_1();
	   
	    SV.M1();
	    SV.M2();
	    SV.name();
	    SV.name1();
	   
		
	}
      public void M1() {
    	  System.out.println(Number);
    	  Number = 400;
    	  System.out.println(Number);
      }
     
      public void M2() {
    	  System.out.println(Number);
    	  Number = 500;
    	  System.out.println(Number);
      }
      
      public void name() {
    	  System.out.println(Number);
      }
      
      public void name1() {
    	  System.out.println(Number);
      }
}
