package Main;

import Main.Cadastrar.Globals;

public class Menu {

public static int principal() {
		
		int opcao = 0;
		
		System.out.println("-----MENU-----");
		System.out.println("1. CADASTRAR");
		System.out.println("2. LISTAR");
		System.out.println("3. ALTERAR");
		System.out.println("4. DELETAR");
		System.out.println("5. SAIR");
		System.out.println("--------------");
		System.out.print("> ");
		opcao = Globals.input.nextInt();
		Globals.input.nextLine();
		
		return opcao;
	}
	
	public static int alterar() {
		
		int opcao = 0;
	
		System.out.println("---ALTERAR---");
		System.out.println("1. NOME");
		System.out.println("2. IDADE");
		System.out.println("3. SEXO");
		System.out.println("4. SAIR");
		System.out.println("-------------");
		System.out.print("> ");
		opcao = Globals.input.nextInt();
		Globals.input.nextLine();
		
		return opcao;
	}
	
}