package main;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		PerfectMatrix perfectMatrix = new PerfectMatrix();
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		
		perfectMatrix.makeMatrix();
		
		while(option != 2) {
			
			menu();
			option = scanner.nextInt();
			
			switch(option) {
				
				case 1: {
					perfectMatrix.printMatrix();
					
					int row = 0, column = 0, value = 0;
					System.out.print("LINHA: ");
					row = scanner.nextInt();
					System.out.print("COLUNA: ");
					column = scanner.nextInt();
					System.out.print("VALOR: ");
					value = scanner.nextInt();
					
					boolean makedPlay = perfectMatrix.makePlay(row - 1, column - 1, value);
					if(makedPlay)
						System.out.println("<JOGADA FEITA>");
					else
						System.out.println("<JOGADA INVALIDA>");
			
					perfectMatrix.printMatrix();
					break;
				}
				
				case 2: {
					System.out.println("<PROGRAMA ENCERRADO>");
					break;
				}
				
				default: {
					System.out.println("<OPCAO INVALIDA>");
					break;
				}
				
			}
		}
		
	}

	public static void menu() {
		System.out.println("--- MENU ---");
		System.out.println("1. JOGAR");
		System.out.println("2. SAIR");
		System.out.println("------------");
		System.out.print("> ");
	}
	
}
