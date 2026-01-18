package study.LLD.udemy.oops.solid;

public class CreditCard implements IPaymentProcess{

	@Override
	public void pay(int amount) {
		System.out.println("Paying via CreditCard, amount : "+amount);
		
	}

}
