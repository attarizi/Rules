package rulespackage;

public class main {

	public static void main(String[] args) {
		payment pay = paymentfactory.getpayment(args[0]);
		System.out.println(pay.toString());
	}
}
