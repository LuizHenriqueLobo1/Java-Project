package exe14;

public class Quadrado extends FormaGeometrica {

	private Ponto a;
	private Ponto b;
	
	public Quadrado(Ponto x, Ponto y) {
		this.a = x;
		this.b = y;
	}
	
	public double calculaArea() {
		double lado = this.distancia(a, b);
		return lado * lado;
	}
		
}
