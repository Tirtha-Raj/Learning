package study.LLD.udemy.oops;

public class PaymentClient {
	public static void main(String[] args) {
		PaymentService ps = new PaymentService();
		ps.addPayment("TirthDebitCard", new DebitCard("1234567", "Tirtharaj"));
		ps.addPayment("TirthUPI", new Upi("tirth@okaxis"));
		ps.addPayment("TirthWallet", new Wallet("Wlt12345"));
		
		ps.makePayment("TirthUPI");
		ps.makePayment("TirthWallet");
	}
}
