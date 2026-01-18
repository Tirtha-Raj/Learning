package study.LLD.udemy.oops;

public class Card implements IPaymentService{

	private String cardNo;
	private String userName;
	
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Card(String cardNo, String userName) {
		this.cardNo = cardNo;
		this.userName = userName;
	}
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}
}
