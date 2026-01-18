package study.LLD.udemy.oops;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {

	Map<String, IPaymentService> map;
	
	public PaymentService() {
		map = new HashMap<String, IPaymentService>();
	}
	
	public void addPayment(String name, IPaymentService ps) {
		map.put(name, ps);
	}
	
	void makePayment(String name) {
		IPaymentService ips= map.get(name);
		ips.pay();
	}
	
}
