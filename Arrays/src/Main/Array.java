package Main;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		
		// Declarando arrays de inteiros
		int[] numeros1 = new int[3];
		int[] numeros2 = new int[3];
	
		// Preenchendo e printando array (modos convencionais)
		numeros1[0] = 1;
		numeros1[1] = 2;
		numeros1[2] = 3;
		
		// ou
		
		for(int i = 0; i < numeros1.length; i++) {
			numeros1[i] = i+1;
			System.out.println(numeros1[i]);
		}
		
		// Preenchendo array de outra forma
		Arrays.fill(numeros2, 5);
		
		// Printando array em formato de string
		System.out.println(Arrays.toString(numeros2));
		
		// Usando busca binária para achar posição 
		// do valor 1 no array da posição 0 a 2
		System.out.println(Arrays.binarySearch(numeros1, 0, 2, 1));
		
		// Comparando dois arrays
		System.out.println(Arrays.equals(numeros1, numeros2));
		
		// Declarando array de string
		String[] nomes = {"Luiz", "Fabiana", "João", "Maria"};
		
		System.out.println("Array de Nomes");
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		// Ordenando array de nomes com método sort
		Arrays.sort(nomes);
		System.out.println(Arrays.toString(nomes));
	}
}