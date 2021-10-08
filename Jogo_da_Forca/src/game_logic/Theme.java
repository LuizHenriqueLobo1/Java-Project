package game_logic;

import java.util.Random;

public class Theme {
	
	private String word;
	private int selectedTheme;
	private String[] movies = {"TITANIC", "SHREK", "AVATAR", "SINAIS", "VINGADORES"};
	private String[] animals = {"MACACO", "CACHORRO", "BALEIA", "JACARE", "GIRAFA"};
	private String[] fruits = {"MORANGO", "ABACAXI", "ACEROLA", "BANANA", "MELANCIA"};
	
	public String getWord() {
		Random random = new Random();
		int number = random.nextInt(5);
		if(this.getSelectedTheme() == 1) {
			this.word = this.movies[number];
		} else if(this.getSelectedTheme() == 2) {
			this.word = this.animals[number];
		} else {
			this.word = this.fruits[number];
		}
		return this.word;
	}
	
	public void setSelectedTheme(int selectedTheme) {
		this.selectedTheme = selectedTheme;
	}
	
	public int getSelectedTheme() {
		return this.selectedTheme;
	}
	
}
