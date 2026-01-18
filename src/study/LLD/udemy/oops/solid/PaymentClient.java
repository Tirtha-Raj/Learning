package study.LLD.udemy.oops.solid;

public class PaymentClient {
	public void makePayment() {
		CreditCard cc= new CreditCard();
		paymentLogic(cc, 10);
		Upi upi= new Upi();
		paymentLogic(upi, 12);
	}
	public void paymentLogic(IPaymentProcess paymentMethod, int amount) {
		paymentMethod.pay(amount);
	}
}
