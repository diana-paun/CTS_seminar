package ro.ase.csie.cts.g1087.dp.chain;

public class ModulChatPrivat extends NodChainAbstract {
	//mesajele destinate unui anumit player vor fi private
	
	public static final String NUME_MODUL = "Modul Chat privat";

	public ModulChatPrivat() {
		super(NUME_MODUL);
	}

	@Override
	public void procesareMesajChat(MesajChat mesaj) {
		if(mesaj.getDestinatie().isEmpty() || mesaj.getDestinatie().equals("@Everyone")) {
			if(this.next != null) {
				this.next.procesareMesajChat(mesaj);
			} else {
				//procesare mesaj privat
				System.out.println(String.format("Mesaj privat pentru %s = %s", 
													mesaj.getDestinatie(), 
													mesaj.getContinut()));
			}
		}
	}

}
