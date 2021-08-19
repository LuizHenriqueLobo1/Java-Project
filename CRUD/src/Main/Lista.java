package Main;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		// Declarando array list
		ArrayList<Pessoa> arrayPessoas = new ArrayList<>();
		
		// Criando objetos do tipo Pessoa
		Pessoa p1 = new Pessoa(1, "Luiz Henrique", 20, 1.74f);
		Pessoa p2 = new Pessoa(2, "Gertrudes", 21, 1.63f);
		Pessoa p3 = new Pessoa(3, "Vicente", 35, 1.88f);
		
		// Adicionando objetos ao array list
		arrayPessoas.add(p1);
		arrayPessoas.add(p2);
		arrayPessoas.add(p3);

		// Alterando informações do objeto do array list
		arrayPessoas.get(0).setNome("Nabucodonosor");
		arrayPessoas.get(0).setIdade(25);
		arrayPessoas.get(0).setAltura(1.75f);
		
		// Removendo objeto do array list
		arrayPessoas.remove(2);
		
		// Listando objetos do array list
		for(int i = 0; i < arrayPessoas.size(); i++) {
			arrayPessoas.get(i).status();
			System.out.println();
		}
	}
}