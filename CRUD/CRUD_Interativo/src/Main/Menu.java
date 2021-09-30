package Main;

import Main.Lista.Globals;

public class Menu {

	public static int principal() {
		
		int opcao = 0;
		
		System.out.println("-----MENU-----");
		System.out.println("1. CADASTRAR");
		System.out.println("2. LISTAR");
		System.out.println("3. ALTERAR");
		System.out.println("4. DELETAR");
		System.out.println("5. OUTROS");
		System.out.println("6. SAIR");
		System.out.println("--------------");
		System.out.print("> ");
		opcao = Globals.input.nextInt();
		Globals.input.nextLine();
		
		return opcao;
	}
	
	public static int listar() {
		
		int opcao = 0;
		
		System.out.println("----LISTAR----");
		System.out.println("1. PADRAO");
		System.out.println("2. MASCULINO");
		System.out.println("3. FEMININO");
		System.out.println("4. MAIOR IDADE");
		System.out.println("5. MENOR IDADE");
		System.out.println("6. SAIR");
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
	
	public static int deletar() {
		
		int opcao = 0;
		
		System.out.println("---DELETAR---");
		System.out.println("1. APENAS UM");
		System.out.println("2. TODOS");
		System.out.println("3. SAIR");
		System.out.println("-------------");
		System.out.print("> ");
		opcao = Globals.input.nextInt();
		Globals.input.nextLine();
		
		return opcao;
	}
	
	public static int outros() {
		
		int opcao = 0;
		
		System.out.println("------OUTROS------");
		System.out.println("1. MEDIA IDADES");
		System.out.println("2. SAIR");
		System.out.println("------------------");
		System.out.print("> ");
		opcao = Globals.input.nextInt();
		Globals.input.nextLine();
		
		return opcao;
	}
	
}