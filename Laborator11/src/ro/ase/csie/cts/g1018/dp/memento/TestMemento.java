package ro.ase.csie.cts.g1018.dp.memento;

public class TestMemento {

	public static void main(String[] args) {
		
		CaracterJoc superman = new CaracterJoc("Superman", 100, "Zboara");

		MementoCaracterJoc salvareInceputJoc = superman.salvare();
		
		superman.ataca();
		superman.seVindeca(20);
		System.out.println("puncte viata " + superman.puncteViata);
	
		superman.incarcaSalvare(salvareInceputJoc);
		
		System.out.println("puncte viata " + superman.puncteViata);

	}

}
