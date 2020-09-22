package rulespackage;

public abstract class paymentandemail extends payment {
	paymentandemail() {
		action();
		sendemail();
	}

	public abstract void sendemail();

}