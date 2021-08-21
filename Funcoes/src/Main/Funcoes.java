package Main;

public class Funcoes {

	public static void main(String[] args) {
		hello();
		System.out.println(soma(3, 2));
		System.out.println(checa(7));
	}

	public static void hello() {
		System.out.println("Hello, world!");
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static boolean checa(int valor) {
		if(valor > 5)
			return true;
		else
			return false;
	}
}