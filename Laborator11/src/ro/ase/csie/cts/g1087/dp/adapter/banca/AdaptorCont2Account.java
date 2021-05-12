package ro.ase.csie.cts.g1087.dp.adapter.banca;

public class AdaptorCont2Account implements BankAccount{

	ContBancar cont;
	
	public AdaptorCont2Account(ContBancar cont) {
		super();
		this.cont = cont;
	}

	@Override
	public void accountTansfer(BankAccount account, double amount) {
		ContBancarDebit contDebit = (ContBancarDebit) conversie(account);
		cont.transfer(contDebit, amount);
	}
	
	private ContBancar conversie(BankAccount account) {
		DebitAccount debit = (DebitAccount) account;
		ContBancarDebit cont = new ContBancarDebit(debit.value, debit.id+"");
		return cont;
	}
}
