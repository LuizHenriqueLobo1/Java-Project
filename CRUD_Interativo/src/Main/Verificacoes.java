package Main;

import java.util.ArrayList;

public class Verificacoes {

	public static boolean listaVazia(ArrayList<Pessoa> arrayPessoas) {
		boolean verificacao = (arrayPessoas.size() <= 0) ? true : false;
		return verificacao;
	}
	
	public static boolean nomeValido(String nome) {
		boolean verificacao = ((nome.length() > 3) && (nome.length() <= 20)) ? true : false;
		return verificacao;
	}
	
	public static boolean idadeValida(int idade) {
		boolean verificacao = ((idade > 0) && (idade <= 100)) ? true : false;
		return verificacao;
	}
	
	public static boolean sexoValido(char sexo) {
		boolean verificacao = ((sexo == 'M') || (sexo == 'F') || (sexo == 'O')) ? true : false;
		return verificacao;
	}
	
	public static boolean indexValido(int index, ArrayList<Pessoa> arrayPessoas) {
		boolean verificacao = false;
		for(int i = 0 ; i < arrayPessoas.size(); i++) {
			if(index == i)
				verificacao = true;
		}
		return verificacao;
	}
	
}