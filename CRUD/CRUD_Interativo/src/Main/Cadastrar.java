package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastrar {
		
	public static void main(String[] args) {
		
		ArrayList<Pessoa> arrayPessoas = new ArrayList<>();
		boolean loop = true;
		int opcao = 0;
		
		while(loop) {
			opcao = Menu.principal();
			switch(opcao) {
				case 1: {
					cadastrar(arrayPessoas);
					break;
				}
				
				case 2: {
					if(Verificacoes.listaVazia(arrayPessoas))
						System.out.println("# LISTA VAZIA #");
					else
						listar(arrayPessoas);
					break;
				}
				
				case 3: {
					if(Verificacoes.listaVazia(arrayPessoas))
						System.out.println("# LISTA VAZIA #");
					else
						alterar(arrayPessoas);
					break;
				}
				
				case 4: {
					if(Verificacoes.listaVazia(arrayPessoas))
						System.out.println("# LISTA VAZIA #");
					else
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
	
	public static void cadastrar(ArrayList<Pessoa> arrayPessoas) {
		
		Pessoa novaPessoa = new Pessoa();
		int numPessoa = arrayPessoas.size() + 1;
		
		System.out.println("# CADASTRANDO PESSOA " + numPessoa + " #");
		
		do {
			System.out.print("Digite o nome  : ");
			novaPessoa.setNome(Globals.input.nextLine());
		} while(!Verificacoes.nomeValido(novaPessoa.nome));
		
		do {
			System.out.print("Digite a idade : ");
			novaPessoa.setIdade(Globals.input.nextInt());
		} while(!Verificacoes.idadeValida(novaPessoa.idade));
		
		do {
			System.out.print("Digite o sexo  : ");
			novaPessoa.setSexo(Character.toUpperCase(Globals.input.next().charAt(0)));
		} while(!Verificacoes.sexoValido(novaPessoa.sexo));
		
		arrayPessoas.add(novaPessoa);
		
		System.out.println("# PESSOA " + numPessoa + " CADASTRADA #");
	}
	
	public static void listar(ArrayList<Pessoa> arrayPessoas) {
		
		boolean loop = true;
		int opcao = 0;
		
		while(loop) {
			opcao = Menu.listar();
			switch(opcao) {
				case 1: {
					listarPadrao(arrayPessoas);
					break;
				}
				
				case 2: {
					listarPorSexo(arrayPessoas, 'M');
					break;
				}
				
				case 3: {
					listarPorSexo(arrayPessoas, 'F');
					break;
				}
				
				case 4: {
					listarPorIdade(arrayPessoas, '>');
					break;
				}
				
				case 5: {
					listarPorIdade(arrayPessoas, '<');
					break;
				}
				
				case 6: {
					System.out.println("# VOLTANDO AO MENU #");
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
	
	public static void listarPadrao(ArrayList<Pessoa> arrayPessoas) {
		for(int i = 0; i < arrayPessoas.size(); i++) {
			System.out.println("----- PESSOA " + (i + 1) + " -----");
			arrayPessoas.get(i).status();
			System.out.println("--------------------");
		}
	}
	
	public static void listarPorSexo(ArrayList<Pessoa> arrayPessoas, char sexo) { 
		for(int i = 0; i < arrayPessoas.size(); i++) {
			if(arrayPessoas.get(i).getSexo() == sexo) {
				System.out.println("----- PESSOA " + (i + 1) + " -----");
				arrayPessoas.get(i).status();
				System.out.println("--------------------");
			}
		}
	}
	
	public static void listarPorIdade(ArrayList<Pessoa> arrayPessoas, char param) {
		for(int i = 0; i < arrayPessoas.size(); i++) {
			if(param == '>') {
				if(arrayPessoas.get(i).getIdade() >= 18) {
					System.out.println("----- PESSOA " + (i + 1) + " -----");
					arrayPessoas.get(i).status();
					System.out.println("--------------------");	
				}
			} else {
				if(arrayPessoas.get(i).getIdade() < 18) {
					System.out.println("----- PESSOA " + (i + 1) + " -----");
					arrayPessoas.get(i).status();
					System.out.println("--------------------");	
				}
			}
		}
	}
	
	public static void alterar(ArrayList<Pessoa> arrayPessoas) {
		
		int numPessoa = 0;
		boolean loop = true;
		int opcao = 0;
		
		do {
			System.out.print("NUM PESSOA A SER ALTERADA : ");
			numPessoa = Globals.input.nextInt();
			Globals.input.nextLine();
		} while(!Verificacoes.indexValido((numPessoa - 1), arrayPessoas));
		
		while(loop) {
			opcao = Menu.alterar();
			switch(opcao) {
				case 1: {
					do {
						System.out.print("Digite o novo nome: ");
						arrayPessoas.get(numPessoa - 1).setNome(Globals.input.nextLine());
					} while(!Verificacoes.nomeValido(arrayPessoas.get(numPessoa - 1).nome));
					loop = false;
					break;
				}
				
				case 2: {
					do {
						System.out.print("Digite a nova idade: ");
						arrayPessoas.get(numPessoa - 1).setIdade(Globals.input.nextInt());
						Globals.input.nextLine();
					} while(!Verificacoes.idadeValida(arrayPessoas.get(numPessoa - 1).idade));
					loop = false;
					break;
				}
				
				case 3: {
					do {
						System.out.print("Digite a novo sexo: ");
						arrayPessoas.get(numPessoa - 1).setSexo(Character.toUpperCase(Globals.input.nextLine().charAt(0)));
					} while(!Verificacoes.sexoValido(arrayPessoas.get(numPessoa - 1).sexo));
					loop = false;
					break;
				}
				
				case 4: {
					System.out.println("# VOLTANDO AO MENU #");
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
		
		boolean loop = true;
		int opcao = 0;
		
		while(loop) {
			opcao = Menu.deletar();
			switch(opcao) {
				case 1: {
					deletarApenasUm(arrayPessoas);
					break;
				}
				
				case 2: {
					deletarTodos(arrayPessoas);
					loop = false;
					break;
				}
				
				case 3: {
					System.out.println("# VOLTANDO AO MENU #");
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
	
	public static void deletarApenasUm(ArrayList<Pessoa> arrayPessoas) {
		
		int numPessoa = 0;
		
		do {
			System.out.print("NUM PESSOA A SER DELETADA : ");
			numPessoa = Globals.input.nextInt();
			Globals.input.nextLine();
		} while(!Verificacoes.indexValido((numPessoa - 1), arrayPessoas));
		
		arrayPessoas.remove(numPessoa - 1);
		System.out.println("# PESSOA " + numPessoa + " DELETADA #");
	}
	
	public static void deletarTodos(ArrayList<Pessoa> arrayPessoas) {
		arrayPessoas.clear();
		System.out.println("# TODAS PESSOAS DELETADAS #");
	}
	
}