package main;

public class Main {

	public static void main(String[] args) {
		
		Encapsulation test = new Encapsulation();
		
		
		// Imposs�vel de ser feito, j� que s�o atributos privados
		// test.name = "Luiz Henrique";
		// test.age  = 20;
		
		test.setName("Luiz Henrique");
		test.setAge(20);
		
		// M�todo privado da classe Encapsulation
		// test.checkAge();
		
		test.isLegalAge();
		
		System.out.println(test.getName());
		System.out.println(test.getAge());
	}
	
}