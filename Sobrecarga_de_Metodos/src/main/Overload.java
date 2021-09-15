package main;

public class Overload {

	public void printHello() {
		System.out.println("Hello, world.");
	}
	
	public void printHello(String word) {
		System.out.println("Hello, " + word + ".");
	}
	
	public void printaHello(String w1, String w2) {
		System.out.println(w1 + ", " + w2 + ".");
	}
	
}