package autoridad;

public class Recreo extends Barco{
	//Atributos
	private String permiso;
	
	//Constructores
	public Recreo (String matricula, String nombre, float tamanyo, String permiso) {
		super(matricula, nombre, tamanyo);
		this.permiso =permiso;
	}

	@Override
	public String toString() {
		return super.toString()+"Recreo [permiso=" + permiso + "]";
	}
	
	
}