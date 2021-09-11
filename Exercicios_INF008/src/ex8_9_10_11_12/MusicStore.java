package ex8_9_10_11_12;

import java.util.Calendar;
import java.util.Scanner;

public class MusicStore {

	String owner = "sem dono";
	int openTime  =  9;
	int closeTime = 21;
	
	MusicTitle[] titles = new MusicTitle[5];
	
	public void displayHoursOfOperation() {
		Scanner input = new Scanner(System.in);
		
		setOpenTime(input.nextInt());
		setCloseTime(input.nextInt());
		
		System.out.println("Diariamente das " + getOpenTime() + " - " + getCloseTime());
	}
	
	public void setOwner(String o) {
		this.owner = o;
	}
	
	public void setOpenTime(int ot) {
		this.openTime = ot;
	}
	
	public int getOpenTime() {
		return this.openTime;
	}
	
	public void setCloseTime(int ct) {
		this.closeTime = ct;
	}
	
	public int getCloseTime() {
		return this.closeTime;
	}	
	
	public boolean isOpen() {
		boolean answer = false;
		if((getHourInt() > getOpenTime()) && (getHourInt() < getCloseTime()))
			answer = true;
		return answer;
	}
	
	public int getHourInt() {
		Calendar c = Calendar.getInstance();
		return c.get(Calendar.HOUR_OF_DAY);
	}
	
	public void getOpenClosedMessage() {
		if(isOpen() == true)
			System.out.println("Estamos abertos!");
		else
			System.out.println("Estamos fechados!");
	}
	
	public void myToString() {
		System.out.println("[Dono = " + this.owner + ", Abre = " + getOpenTime() + ", Fecha = " + getCloseTime() + "]");
	}
	
	public void displayMusicTitles() {
		for(int i = 0; i < this.titles.length; i++) {
			if(this.titles[i] != null) {
				System.out.println("Título " + (i + 1) + ":");
				System.out.println("Título : " + this.titles[i].getTitle());
				System.out.println("Artista: " + this.titles[i].getArtist());
			}
		}
	}
	
}
