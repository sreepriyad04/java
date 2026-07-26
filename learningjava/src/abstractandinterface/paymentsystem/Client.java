package abstractandinterface.paymentsystem;

public class Client {
	public static void main(String[] args) {
		
		PaymentGateway credit = new CreditCardPayment();
		PaymentGateway upi = new UPIPayment();
		PaymentGateway net = new NetBankingPayment();
		credit.pay(100);
		credit.refund(1000);
		upi.pay(100.123);
	}

}
