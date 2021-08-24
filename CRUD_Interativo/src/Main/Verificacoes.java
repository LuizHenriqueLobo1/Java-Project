package Main;

import java.util.ArrayList;

public class Verificacoes {

	public static boolean listaVazia(ArrayList<Pessoa> arrayPessoas) {
		boolean verificacao;
		if(arrayPessoas.size() <= 0)
			verificacao = true;
		else
			verificacao = false;
		return verificacao;
	}
	
	public static boolean nomeValido(String nome) {
		boolean verificacao;
		if((nome.length() > 3) && (nome.length() <= 20))
			verificacao = true;
		else
			verificacao = false;
		return verificacao;
	}
	
	public static boolean idadeValida(int idade) {
		boolean verificacao;
		if((idade > 0) && (idade <= 100))
			verificacao = true;
		else
			verificacao = false;
		return verificacao;
	}
	
	public static boolean sexoValido(char sexo) {
		boolean verificacao;
		if((sexo == 'M') || (sexo == 'F') || (sexo == 'O'))
			verificacao = true;
		else
			verificacao = false;
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