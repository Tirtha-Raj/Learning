package study.LLD.udemy.oops.solid;

public class Upi implements IPaymentProcess{

	@Override
	public void pay(int amount) {
		System.out.println("Paying via Upi, amount : "+amount);
		
	}

}
