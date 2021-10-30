package main;

public class EvenOdd extends Game {
	
	private String winnerPlayerName;
	
	public void addPlayer(Player player) {
		if(this.players.size() < 2)
			this.players.add(player);
	}
	
	public void setPlayersOptions() {
		String[] options = {"Par", "Impar"};
		this.players.get(0).setOption(options[this.random.nextInt(2)]);
		if(this.players.get(0).getOption().equals("Par"))
			this.players.get(1).setOption("Impar");
		else
			this.players.get(1).setOption("Par");
	}
	
	public void setPlayersNumbers() {
		for(int i = 0; i < this.getPlayerListSize(); i++)
			this.players.get(i).setNumber(this.random.nextInt(11));
	}
	
	private int getSumOfNumbers() {
		return this.players.get(0).getNumber() + this.players.get(1).getNumber();
	}
	
	private String getSumOfNumbersType() {
		String string = "";
		if(this.getSumOfNumbers() % 2 == 0)
			string = "Par";
		else
			string = "Impar";
		return string;
	}
	
	public void defineWinner() {
		if(this.getSumOfNumbers() % 2 == 0)
			this.getWinner("Par");
		else
			this.getWinner("Impar");
	}
	
	private void getWinner(String option) {
		for(int i = 0; i < this.getPlayerListSize(); i++) {
			if(this.players.get(i).getOption().equals(option))
				this.setWinnerPlayerName(this.players.get(i).getName());
		}
	}

	public String showPlayers() {
		String string = "";
		for(Player player: this.players)
			string += player.getName() + " pediu (" + player.getOption() + ") e colocou (" + player.getNumber() + ") ";
		return string;
	}
	
	public String showResult() {
		return "Soma: " + this.getSumOfNumbers() + " (" + this.getSumOfNumbersType() + ") | " + this.getWinnerPlayerName() + " venceu!!!";
	}
	
	private String getWinnerPlayerName() {
		return this.winnerPlayerName;
	}

	private void setWinnerPlayerName(String winnerPlayerName) {
		this.winnerPlayerName = winnerPlayerName;
	}
	
}
