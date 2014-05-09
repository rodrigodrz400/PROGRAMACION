package cadenas;

import java.util.Scanner;

public class EncontrasSubcadena {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("escribe una cadena: ");
		String cadena = teclado.nextLine();
		String[] subcadenas = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("inserte subcadena: ");
			subcadenas[i] = teclado.nextLine();
			if (cadena.contains(subcadenas[i])) {
				System.out.println("Se encontró primero en la posicion "
						+ cadena.indexOf(subcadenas[i])
						+ " y la ultima vez en la posicion "
						+ cadena.lastIndexOf(subcadenas[i]));
			} else
			{
				System.out.println("No es una subcadena de " + cadena);
			}
		}
	}

}
