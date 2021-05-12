package ro.ase.csie.cts.g1087.dp.adapter.banca;

public class ContBancarDebit implements ContBancar {
	
	double balanta;
	String iban;
	
	public ContBancarDebit(double balanta, String iban) {
		super();
		this.balanta = balanta;
		this.iban = iban;
	}
	
	@Override
	public void transfer(ContBancar destinatie, double suma) {
		destinatie.depune(suma);
		this.balanta -= suma;
	}
	
	public void depune(double suma){
		this.balanta += suma;
	}

}
