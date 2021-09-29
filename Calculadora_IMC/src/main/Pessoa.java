package main;

import java.text.DecimalFormat;

public class Pessoa {

	private double peso;
	private double altura;
	
	public Pessoa(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	private double calculaIMC() {
		double imc = (this.getPeso() / Math.pow(this.getAltura(), 2));
		return imc;
	}
	
	public String getIMC() {
		DecimalFormat df = new DecimalFormat("#.##");
		double imc = this.calculaIMC();
		return df.format(imc);
	}
	
	public String getResultado() {
		double imc = this.calculaIMC();
		String resultado;
		if(imc <= 25) {
			resultado = "Normal";
		} else if(imc >= 30) {
			resultado = "Obeso";
		} else {
			resultado = "Sobrepeso";
		}
		return resultado;
	}
}
