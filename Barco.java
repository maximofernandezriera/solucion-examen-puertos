package autoridad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public abstract class Barco {
	//Atributos
	private String matricula;
	private String nombre;
	private float tamanyo;
	
	//Constructores
	public Barco (String matricula, String nombre, float tamanyo) {
		this.setMatricula(matricula);
		this.setNombre(nombre);
		this.setTamanyo(tamanyo);
	}
	
	
	//Metodos
	public static String mayorTamanyo(ArrayList<Barco> barcosEntrantes) {
		String matricula="No hay barcos en la lista";
		float maxTamanyo=0;
		
		for (int i=0;i<barcosEntrantes.size();i++) {
			if (barcosEntrantes.get(i).getTamanyo()>maxTamanyo) {
				maxTamanyo=barcosEntrantes.get(i).getTamanyo();
				matricula=barcosEntrantes.get(i).getMatricula();
			}
		}
		return matricula;
	}
	
	
	public boolean encajaTipo(Pantalan pantalan) {
		boolean encaja;
		
		if (this instanceof Comercial && pantalan.getTipo().equals("Comercial")) {
			encaja=true;
		}else if(this instanceof Recreo && pantalan.getTipo().equals("Recreo")) {
			encaja=true;
		}else {
			encaja=false;
		}
		
		return encaja;
	}
	
	
	public float encajaTamanyo(Amarre amarre) {
		return amarre.getTamanyo()-this.getTamanyo();
	}

	
	public static void cargarBarcosEntrantes(ArrayList<Barco> barcosEntrantes) {
		// Crear barcos de prueba
        Comercial barco1 = new Comercial("1234", "Poseidon", 80, "Zapatos");
        Comercial barco2 = new Comercial("2345", "Triton", 30, "Teléfonos");
        Recreo barco3 = new Recreo("3456", "Almeja", 2, "Permiso nacional");
        Comercial barco4 = new Comercial("4567", "Tsunami", 110, "Camisetas");
        Recreo barco5 = new Recreo("5678", "Berberecho", 4, "Permiso internacional");
        Recreo barco6 = new Recreo("6789", "Mejillon", 3, "Permiso local");
        Comercial barco7 = new Comercial("7890", "Ballenato", 50, "Trigo");

        // Añadir barcos a la lista de barcosEntrantes
        barcosEntrantes.add(barco1);
        barcosEntrantes.add(barco2);
        barcosEntrantes.add(barco3);
        barcosEntrantes.add(barco4);
        barcosEntrantes.add(barco5);
        barcosEntrantes.add(barco6);
        barcosEntrantes.add(barco7);
        
	}
	
	
	
	@Override
	public String toString() {
		return "Barco [matricula=" + matricula + ", nombre=" + nombre + ", tamanyo=" + tamanyo + "]";
	}


	//Getters y Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(float tamanyo) {
		this.tamanyo = tamanyo;
	}

}