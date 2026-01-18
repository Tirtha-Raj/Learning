package study.LLD.udemy.oops;

public class Wallet implements IPaymentService{

	private String walletId;
	
	Wallet(String id){
		this.walletId = id; 
	}

	@Override
	public void pay() {
		System.out.println("Paying through wallet  :  "+ walletId);
		
	}
	
	
}
