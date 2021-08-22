package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastrar {
		
	public static void main(String[] args) {
		
		ArrayList<Pessoa> arrayPessoas = new ArrayList<>();
		boolean loop = true;
		int opcao = 0;
		
		while(loop) {
			opcao = menu();
			switch(opcao) {
				case 1: {
					cadastrar(arrayPessoas);
					break;
				}
				
				case 2: {
					listar(arrayPessoas);
					break;
				}
				
				case 3: {
					System.out.println("# AINDA NAO IMPLEMENTADO #");
					break;
				}
				
				case 4: {
					deletar(arrayPessoas);
					break;
				}
				
				case 5: {
					System.out.println("# PROGRAMA ENCERRADO #");
					loop = false;
					break;
				}
				
				default: {
					System.out.println("# OPCAO INVALIDA #");
					break;
				}
			}
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
		System.out.println("3. ALTERAR");
		System.out.println("4. DELETAR");
		System.out.println("5. SAIR");
		System.out.println("--------------");
		System.out.print("> ");
		
		opcao = Globals.input.nextInt();
		Globals.input.nextLine();
		
		return opcao;
	}
	
	public static void cadastrar(ArrayList<Pessoa> arrayPessoas) {
		
		Pessoa novaPessoa = new Pessoa();
		int numPessoa = arrayPessoas.size() + 1;
		
		System.out.println("CADASTRANDO PESSOA " + numPessoa);
		
		System.out.print("Digite o nome  : ");
		novaPessoa.setNome(Globals.input.nextLine());
		
		System.out.print("Digite a idade : ");
		novaPessoa.setIdade(Globals.input.nextInt());
		
		System.out.print("Digite o sexo  : ");
		novaPessoa.setSexo(Globals.input.next().charAt(0));
		
		arrayPessoas.add(novaPessoa);
		
		System.out.println("PESSOA " + numPessoa + " CADASTRADA");
	}
	
	public static void listar(ArrayList<Pessoa> arrayPessoas) {
		for(int i = 0; i < arrayPessoas.size(); i++) {
			System.out.println("----- PESSOA " + (i + 1) + " -----");
			arrayPessoas.get(i).status();
			System.out.println("--------------------");
		}
	}
	
	public static void deletar(ArrayList<Pessoa> arrayPessoas) {
		
		int numPessoa = 0;
		
		System.out.print("NUM PESSOA A SER DELETADA : ");
		numPessoa = Globals.input.nextInt();
		Globals.input.nextLine();
		
		arrayPessoas.remove(numPessoa - 1);
		System.out.println("PESSOA " + numPessoa + " DELETADA");
	}
	
}