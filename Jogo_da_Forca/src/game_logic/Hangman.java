package game_logic;

public class Hangman extends Theme {
	
	private String underlineWord = "";
	private String raffledWord;
	private int countSteps = 0;
	
	public String getRaffledWord() {
		return this.raffledWord;
	}

	public void setRaffledWord() {
		this.raffledWord = this.getWord();
	}
	
	public String getUnderlineWord() {
		return this.underlineWord;
	}
	
	public void setUnderlineWord() {
		for(int i = 0; i < this.getRaffledWord().length(); i++) {
			this.underlineWord += "-";
		}
	}
	
	public void updateUnderlineWord(String letter) {
		StringBuilder sb = new StringBuilder(this.getUnderlineWord());
		for(int i = 0; i < this.getRaffledWord().length(); i++) {
			if(this.getRaffledWord().charAt(i) == letter.toUpperCase().charAt(0)) {
				sb.setCharAt(i, letter.charAt(0));
			}
		}
		this.underlineWord = sb.toString().toUpperCase();
		this.countSteps++;
	}
	
	public int getCountSteps() {
		return this.countSteps;
	}
	
}
