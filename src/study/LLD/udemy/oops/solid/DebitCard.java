package study.LLD.udemy.oops.solid;

public class DebitCard implements IPaymentProcess{

	@Override
	public void pay(int amount) {
		System.out.println("Paying via DebitCard, amount : "+amount);
		
	}

}
