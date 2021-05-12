package ro.ase.csie.cts.g1087.dp.observer;

public class TestObserver {

	public static void main(String[] args) {

		ModulConexiuneInternet modulConexiune = new ModulConexiuneInternet();
		
		ModulAutosalvare modulSalvare = new ModulAutosalvare();
		ModulNotificareJucator modulNotificari = new ModulNotificareJucator();
		
		//abonare la eveniment
		modulConexiune.registerModul(modulNotificari);
		modulConexiune.registerModul(modulSalvare);
		
		modulConexiune.pierdereConexiune();
		
		//dezabonare de la eveniment
		modulConexiune.unregisterModul(modulSalvare);
		
		modulConexiune.pierdereConexiune();

	}

}
