package ex8_9_10;

public class TestMusicStore {

	public static void main(String[] args) {
	
		MusicStore teste = new MusicStore();
		
		teste.getOpenClosedMessage();
		
		teste.displayHoursOfOperation();
	
		teste.setOwner("Roberto");
		System.out.println(teste.owner + ", Proprietário");
	}

}
