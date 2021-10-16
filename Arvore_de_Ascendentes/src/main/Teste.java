package main;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.cadastrarPessoa("Lebi", "Masculino", null);
		p1.status();
		
		Pessoa p2 = new Pessoa();
		p2.cadastrarPessoa("Luciana", "Feminino", p1);
		p2.status();
		
		Pessoa p3 = new Pessoa();
		p3.cadastrarPessoa("Luizinho", "Masculino", p2);
		p3.status();
		
		Pessoa p4 = new Pessoa();
		p4.cadastrarPessoa("Lise", "Feminino", p2);
		p4.status();
		
		Pessoa p5 = new Pessoa();
		p5.cadastrarPessoa("Alice", "Feminino", p4);
		p5.status();
		
	}
	
}
