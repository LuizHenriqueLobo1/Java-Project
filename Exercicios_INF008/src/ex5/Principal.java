package ex5;

public class Principal {

	public static void main(String[] args) {
		
		ManipulaArrays strings = new ManipulaArrays();
		System.out.println("Empilhando 1");
		strings.empilha("Olá");
		System.out.println("Empilhando 2");
		strings.empilha("Tudo bem?");
		System.out.println("Empilhando 3");
		strings.empilha("Como vai?");
		System.out.println("Desempilhando 1");
		strings.desempilha();
		System.out.println("Desempilhando 2");
		strings.desempilha();
	}

}
