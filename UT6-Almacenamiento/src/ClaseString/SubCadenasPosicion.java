package ClaseString;

import java.util.Scanner;

public class SubCadenasPosicion {
	// Escribe un programa que pida una cadena. Posteriormente, el programa
	// dejará que el usuario inserte cinco subcadenas con el fin de informar si
	// la primera tiene las subcadenas indicadas. Se debe indicar en que
	// posición se encontró y la última.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		String[] subCadena = new String[5];
		

		System.out.println("Introduzca una frase: ");
		frase = teclado.nextLine();
		
		String[] palabras = frase.split(" ");
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("\nIntroduzca 5 subcadenas:");
			subCadena[i] = teclado.next();
		}

		for (int i = 0; i < palabras.length; i++) {
			for (int j = 0; j < subCadena.length; j++) {
				if (palabras[i].equals(subCadena[j]))
				System.out.println("\nLa subcadena -" + subCadena[j] + "- se encuentra en la " 
				+ (i+1) + "ª palabra de la frase:\n" + "-->\t" + frase);
			}
		}

	}

}
