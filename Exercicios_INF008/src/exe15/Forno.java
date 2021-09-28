package exe15;

public class Forno {

	private float tempForno;
	private boolean estado;
	
	public float getTempForno() {
		return this.tempForno;
	}
	
	public void setTempForno(float tempForno) {
		this.tempForno = tempForno;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void emiteEstado() {
		if(this.getEstado() == true) {
			System.out.println("O forno está ligado.");
		} else {
			System.out.println("O forno está desligado.");
		}
	}
	
}
