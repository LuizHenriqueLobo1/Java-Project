package Main;

public class Variaveis {
	
	public static void main(String[] args) {
		// Declarando um inteiro
		int inteiro = 1;
		System.out.println(inteiro);
		
		// Declarando um real
		float real = 1.2f;
		System.out.println(real);
		
		// Declarando um caractere
		char caractere = 'A';
		System.out.println(caractere);
		
		// Declarando uma string
		String palavra = "Luiz Henrique";
		System.out.println(palavra);
		
		// Declarando um booleano
		boolean verdade = true;
		System.out.println(verdade);
		
		// Declarando um vetor de inteiros
		int[] vetor = new int[3];
		vetor[0] = 1;
		vetor[1] = 2;
		vetor[2] = 3;
		for(int i = 0; i < 3; i++) {
			System.out.println(vetor[i]);
		}
	}
}