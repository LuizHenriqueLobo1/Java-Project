package exe15;

public class Termostato extends Forno {
	
	private float tempInicial;

	public float getTempInicial() {
		return tempInicial;
	}

	public void setTempInicial(float tempInicial) {
		this.tempInicial = tempInicial;
	}
	
	public void comparaTemperaturas() {
		if(this.getTempForno() < this.getTempInicial())
			System.out.println("O forno deve ser ligado.");
	}
	
}
