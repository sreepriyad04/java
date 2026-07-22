package bankaccountusingconstructors;

public class MainUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b= new BankAccount("abc12345", 25000, 6.5);
		System.out.println("simple intrest is = "+b.simpleIntrest(5));
		System.out.println("BalanceWithIntrest is = "+b.getBalanceWithIntrest(5));
		
	}

}
