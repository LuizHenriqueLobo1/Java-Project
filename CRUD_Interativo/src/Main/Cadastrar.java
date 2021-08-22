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
					System.out.println(arrayPessoas);
					System.out.println(arrayPessoas.size());
					break;
				}
				
				case 3: {
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
		System.out.println("3. SAIR");
		System.out.println("--------------");
		System.out.print("> ");
		
		opcao = Globals.input.nextInt();
		Globals.input.nextLine();
		
		return opcao;
	}
	
	public static void cadastrar(ArrayList<Pessoa> arrayPessoas) {
		
		Pessoa novaPessoa = new Pessoa();
		
		System.out.println("CADASTRANDO PESSOA " + (arrayPessoas.size() + 1));
		
		System.out.print("Digite o nome -> ");
		novaPessoa.setNome(Globals.input.nextLine());
		
		System.out.print("Digite a idade -> ");
		novaPessoa.setIdade(Globals.input.nextInt());
		
		System.out.print("Digite o sexo -> ");
		novaPessoa.setSexo(Globals.input.next().charAt(0));
		
		arrayPessoas.add(novaPessoa);
	}
	
}