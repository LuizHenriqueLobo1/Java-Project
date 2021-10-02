package ex3;

import java.util.Random;

public class RandomNumber {

	private String randomNumber;
	
	public String getRandomNumber() {
		Random random = new Random();
		this.randomNumber = String.valueOf(random.nextInt(101));
		return this.randomNumber;
	}
	
}
