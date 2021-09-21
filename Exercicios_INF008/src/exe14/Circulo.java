package exe14;

public class Circulo extends FormaGeometrica {
	
	private Ponto a;
	private Ponto b;
	
	public Circulo(Ponto x, Ponto y) {
		this.a = x;
		this.b = y;
	}
	
	public double calculaArea() {
		double raio = this.distancia(a, b);
		return (Math.PI * Math.pow(raio, 2));
	}

}
