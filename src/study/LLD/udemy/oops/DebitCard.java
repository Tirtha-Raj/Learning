package study.LLD.udemy.oops;

public class DebitCard extends Card{

	public DebitCard(String cardNo, String userName) {
		super(cardNo, userName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay() {
		System.out.println("Paying via DebitCard");
		
	}

}
