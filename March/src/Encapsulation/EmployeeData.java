package Encapsulation;

public class EmployeeData {
	
	private int IDNumber;
	private String EmpName;
	private int EmpAge;
	
	public static void main(String[]args) {
		
		EmployeeData ED = new EmployeeData();
		
		ED.setIDNumber(23252);
		ED.setEmpName("Ojas");
		ED.setEmpAge(20);
		
		System.out.println("Employee ID is :" + ED.getIDNumber());
		System.out.println("Employee name is :" + ED.getEmpName());
		System.out.println("Employee age is :" + ED.getEmpAge());
		
	}



	public int getIDNumber() {
		return IDNumber;
		
	}
	public void setIDNumber(int IDNumber) {
		this.IDNumber = IDNumber;
		
	}
    public String getEmpName() {
		return EmpName;
	}
	
	public void setEmpName(String EmpName) {
	this.EmpName = EmpName;
	}
	
	public int getEmpAge() {
		
		return EmpAge;
	}
	
    public void setEmpAge(int EmpAge) {
    	this.EmpAge = EmpAge;


		
	}

	
	
	
	

}
