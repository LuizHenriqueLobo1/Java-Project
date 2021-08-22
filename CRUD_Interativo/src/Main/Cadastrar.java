package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastrar {
		
	public static void main(String[] args) {
		
		ArrayList<Pessoa> arrayPessoas = new ArrayList<>();
		boolean loop = true;
		
		while(loop) {
			int opcao = menu();
		}
	}
	
	public class Globals {
		public static Scanner input = new Scanner(System.in);
	}
	
	public static int menu() {
		
		int opcao = 0;
		
		System.out.println("-----MENU-----");
		System.out.println("1. CADASTRAR");
		System.out.println("2. LISTAR");
		System.out.println("3. SAIR");
		System.out.println("--------------");
		System.out.print("> ");
		
		opcao = Globals.input.nextInt();
		Globals.input.nextLine();
		
		return opcao;
	}
	
}