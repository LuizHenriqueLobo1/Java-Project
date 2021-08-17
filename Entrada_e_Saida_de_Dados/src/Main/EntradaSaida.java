package Main;
//Importando classe para leitura de dados
import java.util.Scanner;

public class EntradaSaida {
	
	public static void main(String[] args) {
		// Objeto com métodos para leitura de dados
		Scanner sc = new Scanner(System.in);
		
		// Ler string
		System.out.println("Digite um nome");
		String nome = sc.nextLine();
		
		// Ler inteiro
		System.out.println("Digite uma idade");
		int idade = sc.nextInt();
		
		// Ler caractere
		System.out.println("Digite um sexo");
		char sexo = sc.next().charAt(0);
		
		// Ler real
		System.out.println("Digite uma altura");
		float altura = sc.nextFloat();
	
		System.out.println("Nome -> " + nome);
		System.out.println("Idade -> " + idade);
		System.out.println("Sexo -> " + sexo);
		System.out.println("Altura -> " + altura);
	}
}