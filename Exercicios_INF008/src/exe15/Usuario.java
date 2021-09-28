package exe15;

public class Usuario extends Termostato {
	
	public void trocaEstadoForno() {
		this.setEstado(!getEstado());
	}

}
