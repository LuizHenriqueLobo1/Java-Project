package ex4;

public class Vetores {
	
	int[] vetor;
	
	public void setVetor(int[] v) {
		this.vetor = v;
	}
	
	public void printa() {
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
	
	public void ordena() {
		for(int i = 0; i < vetor.length - 1; i++) {
			for(int y = i + 1; y < vetor.length; y++) {
				if(vetor[i] > vetor[y]) {
					int aux = vetor[i];
					vetor[i] = vetor[y];
					vetor[y] = aux;
				}
			}
		}
	}

}