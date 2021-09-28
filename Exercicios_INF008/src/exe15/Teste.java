package exe15;

public class Teste {
	
	public static void main(String[] args) {
		
		Usuario eu = new Usuario();
		
		eu.setTempInicial(50f);
		eu.setTempForno(45f);
		eu.emiteEstado();
		eu.comparaTemperaturas();
		eu.trocaEstadoForno();
		eu.emiteEstado();
		
		
		
	}
	
	
}
