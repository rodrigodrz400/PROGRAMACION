package cadenas;

import java.util.Scanner;

public class Subcadenas {
	// Escribe un programa que pida una cadena. Posteriormente, el programa
	// dejará que el usuario inserte cinco subcadenas con el fin de informar
	// si la primera cadena empieza o termina por cada una de las cindo
	// subcadenas
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		String[] subCadena = new String[5];

		System.out.println("Introduzca una frase: ");
		frase = teclado.nextLine();

		for (int i = 0; i <= 4; i++) {
			System.out.println("\nIntroduzca 5 subcadenas:");
			subCadena[i] = teclado.next();
		}

		for (int i = 0; i < subCadena.length; i++) {
			boolean comienza,termina;
			
			comienza=frase.startsWith(subCadena[i]);
			termina=frase.endsWith(subCadena[i]);
			
			if (comienza && termina) {
				System.out.println("\nLa frase comienza y termina por " +
						subCadena[i]);
			} else if (comienza && !termina) {
				System.out.println("\nLa frase comienza por " +
						subCadena[i]);
			} else if (!comienza && termina) {
				System.out.println("La frase termina por " + 
						subCadena[i]);
			} else System.out.println("La frase no comienza ni termina por " + 
						subCadena[i]); 
		}

	}

}