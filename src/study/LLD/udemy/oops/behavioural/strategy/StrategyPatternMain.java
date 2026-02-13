package study.LLD.udemy.oops.behavioural.strategy;

public class StrategyPatternMain {
	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService();
		paymentService.setPaymentStrategy(new UpiPayment());
		paymentService.pay();
		
		
		paymentService.setPaymentStrategy(new DebitCard());
		paymentService.pay();
	}

}
