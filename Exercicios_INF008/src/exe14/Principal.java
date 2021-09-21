package exe14;

public class Principal {

	public static void main(String[] args) {
	
		FormaGeometrica quadrado = new Quadrado(new Ponto(2, 4), new Ponto(3, 6));
		System.out.println("Quadrado");
		quadrado.status();
		
		FormaGeometrica circulo = new Circulo(new Ponto(2, 4), new Ponto(3,6));
		System.out.println("Círculo");
		circulo.status();
		
	}

}
