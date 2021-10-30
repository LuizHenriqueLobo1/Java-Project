package main;

public class ZeroOne extends Game {

	private String removedPlayerName;
	
	public void addPlayer(Player player) {
		this.players.add(player);
	}
	
	public void setPlayersNumbers() {
		for(int i = 0; i < this.players.size(); i++)
			this.players.get(i).setNumber(this.random.nextInt(2));
	}
	
	public void comparePlayersNumbers() {
		int numberOfZeros = 0;
		for(int i = 0; i < this.players.size(); i++) {
			if(this.players.get(i).getNumber() == 0)
				numberOfZeros++;
		}
		if(numberOfZeros == this.players.size() - 1)
			this.removePlayer(1);
		else if(numberOfZeros == 1)
			this.removePlayer(0);
		else
			this.setRemovedPlayerName("Nenhum");
	}
	
	private void removePlayer(int value) {
		for(int i = 0; i < this.players.size(); i++) {
			if(players.get(i).getNumber() == value) {
				this.setRemovedPlayerName(this.players.get(i).getName());
				this.players.remove(players.get(i));
			}
		}
	}
	
	public String showPlayers() {
		String string = "";
		if(this.players.size() == 2)
			string = this.players.get(0).getName() + " e " + this.players.get(1).getName() + " sao os finalistas. (Resolvam isto no Par ou Impar)";
		else
			for(Player player: this.players)
				string += player.getName() + " = (" + player.getNumber() + ") ";
		return string;
	}
	
	private void setRemovedPlayerName(String removedPlayerName) {
		this.removedPlayerName = removedPlayerName;
	}
	
	public String getRemovedPlayerName() {
		return this.removedPlayerName;
	}
	
}
