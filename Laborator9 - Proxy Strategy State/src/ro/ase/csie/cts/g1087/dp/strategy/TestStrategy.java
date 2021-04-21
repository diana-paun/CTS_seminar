package ro.ase.csie.cts.g1087.dp.strategy;

public class TestStrategy {

	public static void main(String[] args) {

		ProfilPlayer player = new ProfilPlayer("Superman", 60, 5);
		
		//strategia de Paste
		player.setStrategieBonus(new StrategiePaste());
		player.getBonus();
		
		//strategia de Craciun
		player.setStrategieBonus(new StrategieCraciun());
		player.getBonus();
		
		//alta strategie
		player.setStrategieBonus(new InterfataBonus() {

			@Override
			public int getPuncteBonus(ProfilPlayer player) {
				if(player.nrNiveluri > 3) {
					return 30;
				}
				else {
					return 0;
				}
			}
			
		});
		player.getBonus();
		
	}

}
