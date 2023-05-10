package autoridad;

public class Comercial extends Barco {

	private String carga;
	
	public Comercial (String matricula, String nombre, float tamanyo, String carga) {
		super(matricula, nombre, tamanyo);
		this.carga=carga;
	}

	@Override
	public String toString() {
		return super.toString()+"Comercial [carga=" + carga + "]";
	}
	
	
}



