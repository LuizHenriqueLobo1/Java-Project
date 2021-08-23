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
	
}