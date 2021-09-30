package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Excecoes {

	public static void main(String[] args) {
		input();
		fileManipulate();
		nullValue();
	}
	
	public static void input() {
		Scanner scanner = new Scanner(System.in);
		int idade;
		
		try {
			idade = scanner.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("Erro, idade inválida.");
			idade = 0;
		}
		
		System.out.println("Idade: " + idade);
	}
	
	public static void fileManipulate() {
		String conteudo = "Um conteudo qualquer...";
		String caminho  = "C:\\Users\\Usuario\\Documents\\teste.txt";
		
		try {
			File file = new File(caminho);
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(conteudo);
			fileWriter.close();
		} catch(IOException e) {
			e.getMessage();
		}
	}
	
	public static void nullValue() {
		String nome = null;
		String nomeMinusculo = null;
		
		try {
			nomeMinusculo = nome.toLowerCase();
		} catch(NullPointerException e) {
			nomeMinusculo = "nome qualquer";
		}
		
		System.out.println("Copia do nome: " + nomeMinusculo);
	}
	
}
