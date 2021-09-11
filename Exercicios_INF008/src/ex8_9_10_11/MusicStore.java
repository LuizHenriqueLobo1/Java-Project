package ex8_9_10_11;

import java.util.Calendar;
import java.util.Scanner;

public class MusicStore {

	String owner = "sem dono";
	int openTime  =  9;
	int closeTime = 21;
	
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
	
}
