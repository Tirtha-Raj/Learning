package study.LLD.udemy.oops.structural.facade;

//Problem: We need to call different microservices from client to get the data but we need to make it loose coupling, and make the call faster using gateway
public class WithoutFacadePattern {
	public static void main(String[] args) {

		UserService userService = new UserService();
		PaymentService paymentService = new PaymentService();
		OrderService orderService = new OrderService();

		System.out.println(userService.getuserDetails(123) + "\n" + paymentService.getPaymentDetails(123) + "\n"
				+ orderService.getOrderDetails(123));

	}
}

// 3 seperate microservice
class UserService {
	public String getuserDetails(int userId) {
		return ("User details for : " + userId);
	}
}

class PaymentService {
	public String getPaymentDetails(int paymentId) {
		return ("Payment details for : " + paymentId);
	}
}

class OrderService {
	public String getOrderDetails(int orderId) {
		return ("Order details for : " + orderId);
	}
}