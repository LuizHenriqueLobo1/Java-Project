package exe14;

public class Quadrado extends FormaGeometrica {

	private Ponto vertice1;
	private Ponto vertice2;
	
	public Quadrado() {
		this.vertice1 = new Ponto();
		this.vertice2 = new Ponto();
	}
	
	public Quadrado(Ponto v1, Ponto v2) {
		this.vertice1 = v1;
		this.vertice2 = v2;
	}
	
	public Ponto getVertice1() {
		return this.vertice1;
	}
	
	public Ponto getVertice2() {
		return this.vertice2;
	}
	
	public void setVertice1(Ponto v1) {
		this.vertice1 = v1;
	}
	
	public void setVertice2(Ponto v2) {
		this.vertice2 = v2;
	}
	
}
