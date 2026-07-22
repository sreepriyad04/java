package bankaccountusingconstructors;

public class BankAccount {
	
	String accountnumber;
	int balance;
	double rateOfIntrest;
	
	
	public double simpleIntrest(int time){
		//int time1=time;
		//double simpleintrest=(time1*balance*rateOfIntrest)/100;
		
		return (time*balance*rateOfIntrest)/100;
		
	}
	public double getBalanceWithIntrest(int time) {
		
		double intrest = (balance*time*rateOfIntrest)/12;
		
		return intrest+balance;
		
	}
	public BankAccount(String accountnumber, int balance, double rateOfIntrest) {
		super();
		this.accountnumber = accountnumber;
		this.balance = balance;
		this.rateOfIntrest = rateOfIntrest;
	}
	

}
