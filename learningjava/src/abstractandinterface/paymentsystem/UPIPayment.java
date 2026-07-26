package abstractandinterface.paymentsystem;

public class UPIPayment implements PaymentGateway {

	@Override
	public void pay(double Amount) {
		// TODO Auto-generated method stub
		System.out.println("UPI Payment  amount" +Amount);
	}

	@Override
	public void refund(double Amount) {
		// TODO Auto-generated method stub
		System.out.println("UPI Payment refund amount" +Amount);
		
	}

}
