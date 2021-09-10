package ex4;

public class Principal {
	
	public static void main(String[] args) {
		
		Vetores vetor = new Vetores();
		int[] vAtribuidor = {5, 8, 32, 67, 99, 15, 12, 9, 1, 99};
		
		vetor.setVetor(vAtribuidor);
		vetor.ordena();
		vetor.printa();
	}
	
}