package abstractandinterface.paymentsystem;

public class NetBankingPayment implements PaymentGateway {

	@Override
	public void pay(double Amount) {
		// TODO Auto-generated method stub
		System.out.println("Net banking payment refund amount" +Amount);
		
	}

	@Override
	public void refund(double Amount) {
		// TODO Auto-generated method stub
		System.out.println("Net banking payment refund amount" +Amount);
		
	}

}
