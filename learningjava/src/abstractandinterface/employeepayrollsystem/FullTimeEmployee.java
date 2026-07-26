package abstractandinterface.employeepayrollsystem;

public class FullTimeEmployee extends Employee {

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Full time emp salary is "+basicSalary*10);
		
		
	}

	@Override
	void calculateBonous() {
		// TODO Auto-generated method stub
		System.out.println("Full time emp bonous is "+basicSalary*3);
		
	}
	@Override
	void displayEmpDetails() {
		System.out.println("Fulltime Employee name is "+empName);
		 System.out.println("Fulltime Employee Id is "+empId);
		 System.out.println("Fulltime Employee basic salary is "+basicSalary);
	}

}
