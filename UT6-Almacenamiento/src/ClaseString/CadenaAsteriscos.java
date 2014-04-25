package ClaseString;

import java.util.Scanner;

public class CadenaAsteriscos {

	// Escribe un programa que pida una cadena. Posteriormente, el programa
	// dejará
	// que el usuario inserte varios caracteres hasta que inserte un asterisco,
	// con
	// el fin de informar, para cada carácter, si la cadena lo contiene y en qué
	// posición está el primero.
	public static void main(String[] args) {

		String cadena;
		String[] subcadenas = new String[50];
		String caracter;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce una cadena");
		cadena = teclado.nextLine();

		int i = 0;
		int posicion;

		System.out.println("Escribe * para dejar de introducir caracteres");

		do {
			System.out.println("Dame un caracter: ");
			caracter = teclado.next();

			if (!caracter.equals("*")) {
				subcadenas[i] = caracter;
				posicion = cadena.indexOf(subcadenas[i]);

				if (posicion >= 0) {
					System.out.println("La cadena contiene " + subcadenas[i]
							+ " en la posicion " + posicion);
				} else
					System.out
							.println("La cadena no contiene " + subcadenas[i]);
			}

			i++;

		} while (!caracter.equals("*"));

		System.out.println("Fin");
	}

}
