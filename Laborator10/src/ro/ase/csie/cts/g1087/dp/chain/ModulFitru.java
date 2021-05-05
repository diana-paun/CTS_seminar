package ro.ase.csie.cts.g1087.dp.chain;

public class ModulFitru extends NodChainAbstract {

	//vrem sa filtram comentariile / mesajele care nu sunt potrivite
	
	public ModulFitru(String numeModul) {
		super(numeModul);
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		String[] dictionar = new String[] {"rau", "obraznic", "violent"};
		boolean esteValid = true;
		
		//verificam daca mesajul contine cuvintele respective
		for(String cuvant : dictionar) {
			if(mesaj.getContinut().contains(cuvant)) {
				esteValid = false;
				break;
			}
		}
		
		//daca mesajul e valid, evenimentul se transmite mai departe
		if(esteValid && this.next != null) {
			this.next.procesareMesajChat(mesaj);
		}
	}

}
