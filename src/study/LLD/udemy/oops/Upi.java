package study.LLD.udemy.oops;

public class Upi implements IPaymentService{

	private String upiId;
	

	Upi(String id){
		this.upiId = id;
	}
	
	public String getUpiId() {
		return this.upiId;
	}
	
	@Override
	public void pay() {
		System.out.println("Paying via upiId  :  " + upiId);
	}

}
