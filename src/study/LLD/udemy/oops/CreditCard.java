package study.LLD.udemy.oops;

public class CreditCard extends Card{

	public CreditCard(String cardNo, String userName) {
		super(cardNo, userName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay() {
		System.out.println("Paying via CreditCard");
		
	}

	
}
