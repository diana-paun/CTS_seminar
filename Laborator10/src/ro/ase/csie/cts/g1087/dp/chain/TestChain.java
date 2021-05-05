package ro.ase.csie.cts.g1087.dp.chain;

public class TestChain {

	public static void main(String[] args) {

		//nodurile
		NodChainAbstract chatGlobal = new ModulChatGlobal();
		NodChainAbstract chatPrivat = new ModulChatPrivat();
		NodChainAbstract filtruChat = new ModulFitru("reguli limba romana");
		
		//inlantuire
		filtruChat.setNext(chatPrivat);
		chatPrivat.setNext(chatGlobal);
		
		NodChainAbstract serverChat = filtruChat;
		
		serverChat.procesareMesajChat(new MesajChat("@Everyoane", "Esti rau", 1));
		serverChat.procesareMesajChat(new MesajChat("@Everyoane", "Esti ok. Multimesc", 1));
		serverChat.procesareMesajChat(new MesajChat("@Gigel", "Hai sa incercam nivelul 5", 1));

	}

}
