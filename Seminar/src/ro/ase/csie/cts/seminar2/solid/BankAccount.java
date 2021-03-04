package ro.ase.csie.cts.seminar2.solid;

public class BankAccount {

	private String iban;
	private long balance;
	
	private Person accountHolder;
	
	public BankAccount(String iban, Person person) {
		this.iban=iban;
		this.accountHolder = person;
		balance = 0;
	}
	
	//retragere bani
	private void withdraw(long amount) {
		balance -= amount;
	}
	
	//depunere bani
	private void deposit(long amount) {
		balance += amount;
	}

	public String getIban() {
		return iban;
	}

	public long getBalance() {
		return balance;
	}

	public Person getAccountHolder() {
		return accountHolder;
	}


}
