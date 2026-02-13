package study.LLD.udemy.oops.behavioural.strategy;

public class PaymentService {

	private PaymentStrategy paymentStrategy;

//	public PaymentService(PaymentStrategy method) {
//		this.paymentMethod = method;
//	}
	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public void pay() {
		paymentStrategy.pay();
	}
}
