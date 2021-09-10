package ex2;

public class ForLoop {
	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("oi");
		}
	
		int soma = 0;
		
		for(int i = 0; i < 6; i++) {
			for(int y = 0; y < 3; y++) {
				soma++;
			}
		}
		
		System.out.println(soma);	
	}
}