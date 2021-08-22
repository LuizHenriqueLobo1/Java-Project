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
		nome = this.nome;
	}
	
	public void setIdade(int idade) {
		idade = this.idade;
	}
	
	public void setSexo(char sexo) {
		sexo = this.sexo;
	}
	
	// Meus métodos
	public void status() {
		System.out.println("Nome  : " + getNome());
		System.out.println("Idade : " + getIdade());
		System.out.println("Sexo  : " + getSexo());
	}
}