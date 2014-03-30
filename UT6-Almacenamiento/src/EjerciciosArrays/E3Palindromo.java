package EjerciciosArrays;

import java.util.Scanner;

public class E3Palindromo {

	// Ejercicio 3 Mediante el uso de arrays pide al usuario un número y muestra
	// por pantalla si este es
	// palíndromo o no. Debes pedir el número completo, no digito a digito.

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String numero;

		do {
			String palabra = "";
			System.out
					.println("Introduzca un número para comprobar si es o no palíndromo:"
							+ "\t(para salir pulse 0)");
			numero = teclado.next();

			char[] caracteres = new char[numero.length()];

			for (int i = 0; i < numero.length(); i++) {
				caracteres[i] = (char) numero.charAt(i);
			}

			for (int i = 0; i < caracteres.length; i++) {
				palabra += caracteres[i];
			}
			if (numero.equals("0")) {

			} else {
				if (comprobar(palabra) == true) {
					System.out.println("El numero es palindromo \n");
				} else {
					System.out.println("El numero no es palindromo \n");
				}
			}

		} while (!(numero.equals("0")));
		System.out.println("----------FIN DEL PROGRAMA----------");
	}

	private static boolean comprobar(String palabra) {
		if (palabra.length() == 1 || palabra.length() == 0)
			return true;
		else {
			if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1))
				return comprobar(palabra.substring(1, palabra.length() - 1));
			return false;
		}
	}
}
