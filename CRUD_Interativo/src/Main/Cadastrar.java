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
					alterar(arrayPessoas);
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
	
	public static int menuAlterar() {
		
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
	
	public static void alterar(ArrayList<Pessoa> arrayPessoas) {
		
		int numPessoa = 0;
		boolean loop = true;
		int opcao = 0;
		
		System.out.print("NUM PESSOA A SER ALTERADA : ");
		numPessoa = Globals.input.nextInt();
		Globals.input.nextLine();
	
		while(loop) {
			opcao = menuAlterar();
			switch(opcao) {
				case 1: {
					System.out.print("Digite o novo nome: ");
					arrayPessoas.get(numPessoa - 1).setNome(Globals.input.nextLine());
					loop = false;
					break;
				}
				
				case 2: {
					System.out.print("Digite a nova idade: ");
					arrayPessoas.get(numPessoa - 1).setIdade(Globals.input.nextInt());
					Globals.input.nextLine();
					loop = false;
					break;
				}
				
				case 3: {
					System.out.print("Digite a novo sexo: ");
					arrayPessoas.get(numPessoa - 1).setSexo(Globals.input.nextLine().charAt(0));
					loop = false;
					break;
				}
				
				case 4: {
					System.out.print("# VOLTANDO AO MENU #");
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
	
	public static void deletar(ArrayList<Pessoa> arrayPessoas) {
		
		int numPessoa = 0;
		
		System.out.print("NUM PESSOA A SER DELETADA : ");
		numPessoa = Globals.input.nextInt();
		Globals.input.nextLine();
		
		arrayPessoas.remove(numPessoa - 1);
		System.out.println("PESSOA " + numPessoa + " DELETADA");
	}
	
}