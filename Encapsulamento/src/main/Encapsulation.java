package main;

public class Encapsulation {

	private String name;
	private int age;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void birthday() {
		this.age++;
	}
	
	public void isLegalAge() {
		if(this.checkAge() == true)
			System.out.println("É maior de idade.");
		else
			System.out.println("É menor de idade.");
	}
	
	private boolean checkAge() {
		boolean answer = false;
		if(this.getAge() >= 18)
			answer = true;
		return answer;
	}

}