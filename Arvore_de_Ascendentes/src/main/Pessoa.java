package main;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private String sexo;
	private Pessoa pai;
	private ArrayList<Pessoa> ascendentes = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	private void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public Pessoa getPai() {
		return this.pai;
	}
	
	private void setPai(Pessoa pai) {
		this.pai = pai;
	}
	
	public ArrayList<Pessoa> getAscendentes() {
		return this.ascendentes;
	}
	
	public void cadastrarPessoa(String nome, String sexo, Pessoa pai) {
		this.setNome(nome);
		this.setSexo(sexo);
		this.setPai(pai);
		this.ascendentes.add(this);
		if(this.getPai() != null) {
			for(Pessoa ascendente: this.getPai().getAscendentes()) {
				this.ascendentes.add(ascendente);
			}
		}
	}
	
	public void status() {
		System.out.println("---");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Sexo: " + this.getSexo());
		System.out.println("Ascendentes: ");
		for(Pessoa ascendentes: this.getAscendentes()) {
			System.out.println(ascendentes);
		}
	}
	
	public String toString() {
		return this.getNome();
	}
	
}
