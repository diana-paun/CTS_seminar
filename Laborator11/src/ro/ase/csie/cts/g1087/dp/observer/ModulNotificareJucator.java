package ro.ase.csie.cts.g1087.dp.observer;

public class ModulNotificareJucator implements InterfataStatusConexiune {

	@Override
	public void notificarePierdereConexiune() {
		System.out.println("Pop up! Conexiune internet pierduta!");
	}

}
