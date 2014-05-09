package ClaseString;

import java.util.Scanner;

public class E3ContarPalabras {

	/*
	  Dada una frase, que puede contener caracteres, espacios en blanco, puntos y comas, contar las palabras
	   que contiene. Por ejemplo "El perro de San Roque. Fin." devuelve 6.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		int contador = 0;

		
		System.out.println("Introduce una cadena");
		frase = teclado.nextLine().replaceAll("[.|,]", " ");
		frase = frase.replaceAll("( )+", " ");
		
		String[] palabras = frase.split(" ");
		
		System.out.println("La frase contiene: " + palabras.length + " palabras.");
		

	}

}
