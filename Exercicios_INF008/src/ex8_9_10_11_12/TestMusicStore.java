package ex8_9_10_11_12;

public class TestMusicStore {

	public static void main(String[] args) {
	
		MusicStore test = new MusicStore();
		
		test.getOpenClosedMessage();
		
		test.displayHoursOfOperation();
	
		test.setOwner("Roberto");
		System.out.println(test.owner + ", Proprietário");
		
		test.setOwner("Carlos");
		test.myToString();
		
		test.titles[0] = new MusicTitle();
		test.titles[0].setTitle("A Festa");
		test.titles[0].setArtist("Ivete Sangalo");
	
		test.titles[1] = new MusicTitle();
		test.titles[1].setTitle("Luna Nueva");
		test.titles[1].setArtist("Diego Torres");
		
		test.displayMusicTitles();
	}

}
