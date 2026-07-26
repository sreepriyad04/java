package abstractandinterface.employeepayrollsystem;

public abstract class Employee {
	int empId;
	String empName;
	double basicSalary;
	
	 abstract void calculateSalary();
	 abstract void calculateBonous();
	 
	 void displayEmpDetails(){
		 System.out.println("Employee name is "+empName);
		 System.out.println("Employee Id is "+empId);
		 System.out.println("Employee basic salary is "+basicSalary);
	 }
	

}
