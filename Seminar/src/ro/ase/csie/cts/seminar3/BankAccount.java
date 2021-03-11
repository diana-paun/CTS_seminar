package ro.ase.csie.cts.seminar3;

public class BankAccount implements Account {

	private String iban;
	private long balance;
	
	private Person accountHolder;
	
	public BankAccount(String iban, Person person) {
		this.iban=iban;
		this.accountHolder = person;
		balance = 0;
	}
	
	//retragere bani
	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		if(amount > balance)
			throw new InsuficientFundsException("Insuficient Funds " + balance);
		System.out.println("withdowing "+ amount + " from "+ iban);
		balance -= amount;
	}
	
	//depunere bani
	@Override
	public void deposit(long amount) {
		System.out.println("Adding "+ amount + " to "+ iban);
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
