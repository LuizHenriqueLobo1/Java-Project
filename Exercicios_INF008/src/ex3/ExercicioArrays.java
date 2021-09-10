package ex3;

public class ExercicioArrays {
	public static void main(String[] args) {
		
		int[] vetor = new int[5];
		int i = 0;
		
		while(i < vetor.length) {
			vetor[i] = 10 + i + 1;
			i++;
		}
		
		for(int y = 0; y < vetor.length; y++) {
			System.out.println(vetor[y]);
		}
		
		String[] vetorStrings = {"Zé", "João", "Tonho"};
		
		for(int y = 0; y < vetorStrings.length; y++) {
			System.out.println(vetorStrings[y]);
		}
		
		vetorStrings[0] = "Maria";
		
		for(int y = 0; y < vetorStrings.length; y++) {
			System.out.println(vetorStrings[y]);
		}
	}
}