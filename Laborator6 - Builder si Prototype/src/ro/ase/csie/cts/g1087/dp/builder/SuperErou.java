package ro.ase.csie.cts.g1087.dp.builder;

public class SuperErou {

	//definim atributele - contextul builder
	private String nume;
	private int puncteViata;
	
	private boolean esteNegativ;
	private boolean esteRanitGrav;
	
	private InterfataArma armaStanga;
	private InterfataArma armaDreapta;
	private InterfataSuperPutere  superPutere;
	private InterfataSuperPutere superSuperPutere;
	
	//constructor default
	private SuperErou() {
		
	}

	private SuperErou(String nume, int puncteViata, boolean esteNegativ, boolean esteRanitGrav, InterfataArma armaStanga,
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
	
	public static class SuperErouBuilder {
		SuperErou superErou; //referinta atribute
		
		public SuperErouBuilder(String nume, int puncteViata) {
			this.superErou = new SuperErou();
			this.superErou.nume = nume;
			this.superErou.puncteViata=puncteViata;
			
		}
		
		public SuperErouBuilder esteNegativ() {
			this.superErou.esteNegativ=true;
			return this; //this = SuperErouBuilder - IMPORTANT!!!
		}
		
		public SuperErouBuilder esteRanit() {
			this.superErou.esteRanitGrav=true;
			return this;
		}
		
		public SuperErouBuilder setArmaStanga(InterfataArma arma) {
			this.superErou.armaStanga = arma;
			return this;
		}
		
		public SuperErouBuilder setArmaDreapta(InterfataArma arma) {
			this.superErou.armaDreapta = arma;
			return this;
		}
		
		public SuperErouBuilder setSuperPutere(InterfataSuperPutere superPutere) {
			this.superErou.superPutere = superPutere;
			return this;
		}
		
		public SuperErouBuilder setSuperSuperPutere(InterfataSuperPutere superSuperPutere) {
			this.superErou.superSuperPutere = superSuperPutere;
			return this;
		}
		
		public SuperErou build() {
			return this.superErou;
		}
	}
	
	
	
}
