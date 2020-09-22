package rulespackage;

public class paymentfactory {
	paymentfactory() {
	}

	public static payment getpayment(String type) {
		switch (type) {
		case "psycal product":
			return new physicalproduct();
		case "book":
			return new book();
		case "membership":
			return new membership();
		case "upgrade":
			return new upgrade();
		case "video":
			return new video();
		default:
			return null;
		}
	}

}