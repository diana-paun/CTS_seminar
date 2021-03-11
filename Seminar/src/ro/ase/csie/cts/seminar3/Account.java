package ro.ase.csie.cts.seminar3;

public interface Account {

	//retragere bani
	void withdraw(long amount) throws InsuficientFundsException;

	//depunere bani
	void deposit(long amount);

}