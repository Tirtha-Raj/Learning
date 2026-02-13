package study.LLD.udemy.oops.behavioural.strategy;

public class DebitCard implements PaymentStrategy{

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Paying via Debit card");
	}

}
