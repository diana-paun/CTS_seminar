package ro.ase.csie.cts.g1087.dp.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		//varianta fara Facade
		ServerJoc server = new ServerJoc("10.0.0.1", 3306);
		if(server.conectare()) {
			Utilizator utilizator = new Utilizator();
			utilizator.login("Player1", "1234");
			ProfilJucator profil = utilizator.getProfil();
			String dateProfil = profil.getDateProfit();
		}
		
		//varianta cu Facade
		ProfilJucator profil2 = APIJocFacade.getProfil("10.0.0.1", 3306, "Player1", "1234");
		String dateProfil2 = profil2.getDateProfit();
		
		
		
	}
}
