package Methods;

public class Method12 {
	
	//Student Info - Name, Roll no, Grade, Percentage
	
	public static void main(String[]args) {
		
		Method12.StudentInfo("Ojas",55,'A',94.67f);
		Method12.StudentInfo("Siya",33,'B',77.67f);
		Method12.StudentInfo("Riya",22,'C',84.96f);
		Method12.StudentInfo("Ruhi",52,'D',65.33f); 
		Method12.StudentInfo("Shreya",35,'E',92.33f);
	}
	  public static void StudentInfo(String Studentname, int RollNo, char Grade, float Percentage) {
		  
		  System.out.println("Studentname-->"+Studentname+" "+"Student Rollno-->"+RollNo+""+"Student Grade-->"+Grade+""+"Student Percentage-->"+Percentage);
		  
	  }
	

}
