package ro.ase.csie.cts.seminar3;

public class FeeBankAcocunt extends DebitBankAccount {

	private long fee = 2;
	
	public FeeBankAcocunt(NotificationService ns, String iban, Person person) {
		super(ns, iban, person);
	}

	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		System.out.println("Adding " + fee + " fee to withdrawal");
		super.withdraw(amount + 2);
	}
}
