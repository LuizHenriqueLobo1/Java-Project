package exe14;

public class FormaGeometrica {

	private String corDaLinha;
	private String corDoFundo;
	
	public String getCordaLinha() {
		return this.corDaLinha;
	}
	
	public String getCordoFundo() {
		return this.corDoFundo;
	}
	
	public void setCorDaLinha(String cl) {
		this.corDaLinha = cl;
	}

	public void setCorDofundo(String cf) {
		this.corDoFundo = cf;
	}

	public double distancia(Ponto a, Ponto b) {
		return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
	}
	
	public double calculaArea() {
		return 0;
	}
	
	public void status() {
		System.out.println("Área: " + this.calculaArea());
	}
	
}
