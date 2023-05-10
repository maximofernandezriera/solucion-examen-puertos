package autoridad;
import java.util.ArrayList;

public class Principal {
	
	 public static void main(String[] args) {
	        // Crear las listas de barcos entrantes y pantalanes
	        ArrayList<Barco> barcosEntrantes = new ArrayList<>();
	        ArrayList<Pantalan> listPantalan = new ArrayList<>();

	        // Llamar a los métodos estáticos según las instrucciones
	        Barco.cargarBarcosEntrantes(barcosEntrantes);
	        Puerto.simular(listPantalan);
	        Puerto.buscarAmarre(barcosEntrantes, listPantalan);
	        Puerto.verAmarre(listPantalan);
	    }

}