package study.LLD.udemy.oops.solid;

public class PaymentService {
	public static void main(String[] args) {
		PaymentClient paymentClient= new PaymentClient();
		CreditCard cc = new CreditCard();
		paymentClient.paymentLogic(cc, 10);
		Upi upi = new Upi();
		paymentClient.paymentLogic(upi, 12);
	}
}
