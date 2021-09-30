package Main;

public class Pessoa {
	// Atributos
	int id;
	String nome;
	int idade;
	float altura;
	
	// Constructor
	public Pessoa(int id, String nome, int idade, float altura) {
		this.setId(id);
		this.setNome(nome);
		this.setIdade(idade);
		this.setAltura(altura);
	}
	
	// Getters
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public float getAltura() {
		return altura;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	// Meus métodos
	void status() {
		System.out.println("ID     -> " + this.id);
		System.out.println("Nome   -> " + this.nome);
		System.out.println("Idade  -> " + this.idade);
		System.out.println("Altura -> " + this.altura);
	}
}