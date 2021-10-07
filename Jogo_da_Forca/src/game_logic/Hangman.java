package game_logic;

public class Hangman extends Theme {
	
	private String raffledWord;
	private String underlineWord = "";
	private int countSteps;
	private int countLife;
	private boolean hit;

	private void setRaffledWord() {
		this.raffledWord = this.getWord();
	}
	
	public String getRaffledWord() {
		return this.raffledWord;
	}

	private void setUnderlineWord() {
		for(int i = 0; i < this.getRaffledWord().length(); i++) {
			this.underlineWord += "-";
		}
	}
	
	public String getUnderlineWord() {
		return this.underlineWord;
	}
	
	public void updateUnderlineWord(String letter) {
		StringBuilder sb = new StringBuilder(this.getUnderlineWord());
		this.hit = false;
		for(int i = 0; i < this.getRaffledWord().length(); i++) {
			if(this.getRaffledWord().charAt(i) == letter.toUpperCase().charAt(0)) {
				sb.setCharAt(i, letter.charAt(0));
				this.hit = true;
			}
		}
		this.underlineWord = sb.toString().toUpperCase();
		this.updateCountSteps();
		this.updateCountLife();
	}
	
	private void setCountSteps() {
		this.countSteps = 0;
	}
	
	public int getCountSteps() {
		return this.countSteps;
	}
	
	private void updateCountSteps() {
		this.countSteps++;
	}
	
	private void setCountLife() {
		this.countLife = 6;
	}
	
	private void updateCountLife() {
		if(!this.hit) {
			this.countLife--;
		}
	}
	
	public int getCountLife() {
		return this.countLife;
	}
	
	public boolean checkWin() {
		boolean win = false;
		int count = 0;
		for(int i = 0; i < this.getRaffledWord().length(); i++) {
			if(this.getUnderlineWord().charAt(i) != '-') {
				count++;
			}
		}
		if(this.getRaffledWord().length() == count) {
			this.resetAttributes();
			win = true;
		}
		return win;
	}
	
	public boolean checkLose() {
		boolean lose = false;
		if(this.getCountLife() == 0) {
			this.resetAttributes();
			lose = true;
		}
		return lose;
	}
	
	private void resetAttributes() {
		this.underlineWord = "";
		this.raffledWord = "";
		this.countSteps = 0;
		this.countLife = 6;
	}
	
	public void start() {
		this.setRaffledWord();
		this.setUnderlineWord();
		this.setCountSteps();
		this.setCountLife();
	}

}
