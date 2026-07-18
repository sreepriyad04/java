package bankaccountclass;

class User{
	
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
	public static void main(String args[]) {
		User u = new User();
		u.accountnumber="ICIC11023401";
		u.balance=25000;
		u.rateOfIntrest=6.5;
		//u.simpleIntrest(5);
		System.out.println("simple Intrest of account no "+u.accountnumber+" is "+u.simpleIntrest(5));
		System.out.println("intrest with balance is "+u.getBalanceWithIntrest(5));
	}
	
}