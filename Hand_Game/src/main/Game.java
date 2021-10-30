package main;

import java.util.ArrayList;
import java.util.Random;

public abstract class Game {

	protected ArrayList<Player> players;
	protected Random random = new Random();
	
	public Game() {
		this.players = new ArrayList<>();
	}
	
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	
	public ArrayList<Player> getPlayers() {
		return this.players;
	}
	
	public int getPlayerListSize() {
		return this.players.size();
	}
	
	public void resetPlayers() {
		this.players.clear();
	}
	
	public abstract void addPlayer(Player player);
	
	public abstract String showPlayers();
	
}
