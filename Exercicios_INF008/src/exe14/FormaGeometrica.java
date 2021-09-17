package exe14;

public class FormaGeometrica {

	private String cordaLinha;
	private String cordoFundo;
	
	public FormaGeometrica() {
		this.cordaLinha = "";
		this.cordoFundo = "";
	}
	
	public FormaGeometrica(String cl, String cf) {
		this.cordaLinha = cl;
		this.cordoFundo = cf;
	}
	
	public String getCordaLinha() {
		return this.cordaLinha;
	}
	
	public String getCordoFundo() {
		return this.cordoFundo;
	}
	
	public void setCordaLinha(String cl) {
		this.cordaLinha = cl;
	}
	
	public void setCordofundo(String cf) {
		this.cordoFundo = cf;
	}
	
}
