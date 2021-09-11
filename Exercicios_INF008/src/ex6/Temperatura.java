package ex6;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int quente = 40;
		int frio   = 10;
		int atual  =  0;
		
		System.out.print("Digite uma temp: ");
		atual = input.nextInt();
		
		System.out.println("Temperatura atual: " + atual);
	
		if(atual == frio)
			System.out.println("FRIO");
		else if(atual == quente)
			System.out.println("QUENTE");
		else if(atual >= frio && atual <= quente)
			System.out.println("NORMAL");
		else
			System.out.println("TEMPERATURA EXTREMA");
		
	}

}