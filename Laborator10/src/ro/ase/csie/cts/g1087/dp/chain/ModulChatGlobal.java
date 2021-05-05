package ro.ase.csie.cts.g1087.dp.chain;

public class ModulChatGlobal extends NodChainAbstract {
	
	//difuzare mesaje destinate tuturor
	
	public ModulChatGlobal() {
		super("Modul chat global");
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		if(mesaj.getDestinatie().isEmpty() || mesaj.getDestinatie().equals("@Everyone")) {
			System.out.println("Mesaj catre toti jucatorii: " + mesaj.getContinut());
		}
		
		if(this.next != null) {
			this.next.procesareMesajChat(mesaj);
		}
		
	}

}
