package MediaMac;

import java.util.Arrays;
import java.util.Scanner;

public class SmartPhone extends Aparato {

	// Debe tener adem�s como atributo la tecnolog�a de transmisi�n soportada,
	// que ser� una
	// lista de cadenas, como por ejemplo [�GPRS�,�EDGE�,�HSDPA�].

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

	// A�adir el m�todo addTecnolog�a en la clase SmartPhone que tome como
	// par�metro una cadena
	// con el nombre de una tecnolog�a inal�mbrica y lo incluya en la lista de
	// tecnolog�as soportada.
	// Debe ser independiente de may�scular/min�sculas y controlar que la misma
	// tecnolog�a no se repita.
	public void addTecnologia(String tecnologia) {
		Scanner teclado = new Scanner(System.in);
		int tec;
		String aux;
		System.out
				.println("Indique el valor numerico de las tecnologias inal�mbricas "
						+ "soportadas por el dispositivo");
		tec = teclado.nextInt();

		System.out
				.println("Escriba las tecnologias que uliliza el dispositivo:");
		for (int i = 0; i < tec; i++) {
			System.out.println("Tecnolog�a " + i + ": ");
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
