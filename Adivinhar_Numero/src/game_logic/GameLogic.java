package game_logic;

import java.util.Random;

public class GameLogic {
	
	private int raffleNumber;
	private int playerNumber;
	private int count = 0;
	private boolean status;
	
	public void start() {
		this.setRaffleNumber();
	}
	
	public String compare(int number) {
		String message;
		this.status = true;
		if(this.getPlayerNumber() < this.getRaffleNumber()) {
			message = "O número sorteado é maior que " + number;
		} else if(this.getPlayerNumber() > this.getRaffleNumber()) {
			message = "O número sorteado é menor que " + number;
		} else {
			message = "Você acertou, o número sorteado é " + this.getRaffleNumber();
			this.status = false;
		}
		this.count++;
		return message;
	}
	
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	
	public int getPlayerNumber() {
		return this.playerNumber;
	}
	
	private void setRaffleNumber() {
		Random random = new Random();
		this.raffleNumber = random.nextInt(101);
	}
	
	public int getRaffleNumber() {
		return this.raffleNumber;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public boolean getStatus() {
		return this.status;
	}

}
