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
	public void withdraw(long amount) {
		System.out.println("withdowing "+ amount + " from "+ iban);
		balance -= amount;
	}
	
	//depunere bani
	public void deposit(long amount) {
		System.out.println("depositing "+ amount + " to "+ iban);
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
