package ro.ase.csie.cts.g1087.dp.builder;

public class SuperErou {

	//definim atributele - contextul builder
	String nume;
	int puncteViata;
	
	boolean esteNegativ;
	boolean esteRanitGrav;
	
	InterfataArma armaStanga;
	InterfataArma armaDreapta;
	InterfataSuperPutere  superPutere;
	InterfataSuperPutere superSuperPutere;
	
	//constructor default
	public SuperErou() {
		
	}

	public SuperErou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaStanga,
			InterfataArma armaDreapta, InterfataSuperPutere superPutere, InterfataSuperPutere superSuperPutere) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.esteNegativ = esteNegativ;
		this.esteRanitGrav = esteRanitGrav;
		this.armaStanga = armaStanga;
		this.armaDreapta = armaDreapta;
		this.superPutere = superPutere;
		this.superSuperPutere = superSuperPutere;
	}
	
	
	
}
