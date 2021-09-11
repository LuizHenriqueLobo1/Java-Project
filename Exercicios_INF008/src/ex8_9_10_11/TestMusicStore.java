package ex8_9_10_11;

public class TestMusicStore {

	public static void main(String[] args) {
	
		MusicStore test = new MusicStore();
		
		test.getOpenClosedMessage();
		
		test.displayHoursOfOperation();
	
		test.setOwner("Roberto");
		System.out.println(test.owner + ", Proprietário");
		
		test.setOwner("Carlos");
		test.myToString();
	}

}
