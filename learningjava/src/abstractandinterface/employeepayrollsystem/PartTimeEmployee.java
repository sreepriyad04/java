package abstractandinterface.employeepayrollsystem;

public class PartTimeEmployee extends Employee{

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("part time emp salary is "+basicSalary*5);
	}

	@Override
	void calculateBonous() {
		// TODO Auto-generated method stub
		System.out.println("part time emp bonous is "+basicSalary*2);
	}

}
