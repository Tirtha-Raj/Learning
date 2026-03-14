package study.LLD.udemy.oops.structural.facade;

public class WithFacadePattern {
	public static void main(String[] args) {
		// Here if the service changes we don't need to change this client code as this is already handled by Gateway
		GateWay gateway = new GateWay();
		System.out.println(gateway.getUserOrderPaymentDetails(1, 3, 5));

	}
}

class GateWay {
	UserService userService;
	PaymentService paymentService;
	OrderService orderService;

	public GateWay() {
		userService = new UserService();
		paymentService = new PaymentService();
		orderService = new OrderService();
	}

	public String getUserOrderPaymentDetails(int userId, int paymentId, int orderId) {
		return userService.getuserDetails(userId) + "\n" + paymentService.getPaymentDetails(paymentId) + "\n"
				+ orderService.getOrderDetails(orderId);
	}
}