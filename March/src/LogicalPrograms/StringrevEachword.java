package LogicalPrograms;

public class StringrevEachword {
	
	public static void main(String[]args) {
		
		String Str = "Hello good evening";
		
		String[] Word = Str.split(" ");
		
		String RevS = "";
		
		for(String W : Word) {
			
			String StringWord = "";
			
			for(int i = W.length()-1;i>=0;i--) {
				
				StringWord = StringWord+W.charAt(i);
			}
			
			RevS = RevS+StringWord+" ";
		}
		
		System.out.println(RevS);
	}

}
