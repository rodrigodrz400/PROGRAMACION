package MediaMac;

import java.util.Arrays;
import java.util.Scanner;

public class SmartPhone extends Aparato {

	// Debe tener además como atributo la tecnología de transmisión soportada,
	// que será una
	// lista de cadenas, como por ejemplo [“GPRS”,”EDGE”,”HSDPA”].

	private String[] tecTransm;

	public SmartPhone(String numProducto, String numSerie, String nombre,
			String so, double precioBase, int numTecnologias) {
		super(numProducto, numSerie, nombre, so, precioBase);
		this.tecTransm = new String [numTecnologias];
	}
	public String[] getTecTransm() {
		return tecTransm;
	}


	public void setTecTransm(String[] tecTransm) {
		this.tecTransm = tecTransm;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSmartPhone [tecTransm="
				+ Arrays.toString(tecTransm) + "]";
	}

	// Añadir el método addTecnología en la clase SmartPhone que tome como
	// parámetro una cadena
	// con el nombre de una tecnología inalámbrica y lo incluya en la lista de
	// tecnologías soportada.
	// Debe ser independiente de mayúscular/minúsculas y controlar que la misma
	// tecnología no se repita.
	public void addTecnologia(String tecnologia) {

			for (int i = 0; i < tecTransm.length; i++) {
				if (tecTransm[i].toLowerCase() == tecnologia.toLowerCase()) {
					System.out.println("El valor introducido ya se encuentra registrado");
					i--;
				} else {
					tecTransm[i] = tecnologia;
				}
			}
		}

	
	
}
