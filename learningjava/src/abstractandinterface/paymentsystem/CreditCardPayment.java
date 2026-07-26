package abstractandinterface.paymentsystem;

public class CreditCardPayment implements PaymentGateway {

	@Override
	public void pay(double Amount) {
		// TODO Auto-generated method stub
		System.out.println("Credit card Payment " +Amount);
	}

	@Override
	public void refund(double Amount) {
		// TODO Auto-generated method stub
		System.out.println("Credit card Payment refund amount" +Amount);
		
	}

}
