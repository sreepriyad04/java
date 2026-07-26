package abstractandinterface.employeepayrollsystem;

public class ContractEmployee extends Employee{

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Fill time emp salary is "+basicSalary*3);
		
	}

	@Override
	void calculateBonous() {
		// TODO Auto-generated method stub
		System.out.println("Fill time emp salary is "+basicSalary*2);
		
	}

}
