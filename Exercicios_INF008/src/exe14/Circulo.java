package exe14;

public class Circulo extends FormaGeometrica {

	private Ponto centro;
	private float raio;
	
	public Circulo() {
		this.centro = new Ponto();
		this.raio   = 0;
	}
	
	public Circulo(Ponto c, float r) {
		this.centro = c;
		this.raio   = r;
	}
	
	public Ponto getCentro() {
		return this.centro;
	}
	
	public float getRaio() {
		return this.raio;
	}
	
	public void setCentro(Ponto centro) {
		this.centro = centro;
	}
	
	public void setRaio(float raio) {
		this.raio = raio;
	}
	
}
