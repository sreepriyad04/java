package abstractandinterface.paymentsystem;

public interface PaymentGateway {
	
	void pay(double Amount);
	void refund(double Amount);

}
