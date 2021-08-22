package Main;

public class Pessoa {
	// Atributos
	String nome;
	int idade;
	char sexo;

	// Getters
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	// Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	// Meus métodos
	public void status() {
		System.out.println("NOME  : " + getNome());
		System.out.println("IDADE : " + getIdade());
		System.out.println("SEXO  : " + getSexo());
	}
}