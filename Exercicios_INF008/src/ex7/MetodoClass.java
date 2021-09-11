package ex7;

public class MetodoClass {

	public static void main(String[] args) {
		
		MetodoClass teste = new MetodoClass();
		teste.welcome();
	
		int valor = 3;
		System.out.println(teste.addTwo(valor));
	
		valor = 19;
		System.out.println(teste.addTwo(valor));
	}
	
	public void welcome() {
		System.out.println("Seja bem-vindo.");
	}
	
	public int addTwo(int valor) {
		return valor + 2;
	}


}
