package main;

public class Aluno extends Pessoa {

	private int matricula;
	private boolean semestralizado;
	private float cre;
	
	public Aluno(String nome, int idade, int matricula, boolean semestralizado, float cre) {
		super(nome, idade);
		this.matricula = matricula;
		this.semestralizado = semestralizado;
		this.cre = cre;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public boolean getSemestralizado() {
		return semestralizado;
	}

	public void setSemestralizado(boolean semestralizado) {
		this.semestralizado = semestralizado;
	}

	public float getCre() {
		return cre;
	}

	public void setCre(float cre) {
		this.cre = cre;
	}
	
}