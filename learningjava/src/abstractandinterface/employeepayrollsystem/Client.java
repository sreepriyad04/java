package abstractandinterface.employeepayrollsystem;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee fullemp = new FullTimeEmployee();
		Employee partemp = new PartTimeEmployee();
		Employee contractemp= new ContractEmployee();
		
		fullemp.empName="Dustin";
		fullemp.empId= 101;
		fullemp.basicSalary=15000;
		fullemp.displayEmpDetails();
		fullemp.calculateSalary();
		fullemp.calculateBonous();
		
		partemp.empName="El";
		partemp.empId= 102;
		partemp.basicSalary=10000;
		partemp.displayEmpDetails();
		partemp.calculateSalary();
		partemp.calculateBonous();
		
		contractemp.empName="Will";
		contractemp.empId= 103;
		contractemp.basicSalary=5000;
		contractemp.displayEmpDetails();
		contractemp.calculateSalary();
		contractemp.calculateBonous();
		

	}

}
