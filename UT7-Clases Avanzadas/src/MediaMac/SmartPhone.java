package MediaMac;

import java.util.Arrays;
import java.util.Scanner;

public class SmartPhone extends Aparato {

	// Debe tener además como atributo la tecnología de transmisión soportada,
	// que será una
	// lista de cadenas, como por ejemplo [“GPRS”,”EDGE”,”HSDPA”].

	private String[] tecTransm;

	public SmartPhone(String numProducto, String numSerie, String nombre,
			String so) {
		super(numProducto, numSerie, nombre, so);
		this.tecTransm = tecTransm;
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
		Scanner teclado = new Scanner(System.in);
		int tec;
		String aux;
		System.out
				.println("Indique el valor numerico de las tecnologias inalámbricas "
						+ "soportadas por el dispositivo");
		tec = teclado.nextInt();

		System.out
				.println("Escriba las tecnologias que uliliza el dispositivo:");
		for (int i = 0; i < tec; i++) {
			System.out.println("Tecnología " + i + ": ");
			aux = teclado.nextLine();
			for (int j = 0; j < tecTransm.length; j++) {
				if (tecTransm[j].toLowerCase() == aux.toLowerCase()) {
					tecTransm[j] = aux;
				} else {
					System.out.println("El valor introducido ya se encuentra registrado");
					i--;
				}

			}

		}
	}
	
	
	
}
