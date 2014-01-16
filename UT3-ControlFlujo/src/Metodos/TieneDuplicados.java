package Metodos;

import java.util.Scanner;

public class TieneDuplicados {

	/*
	 * Escribe una función tiene_duplicados(vector) que tome un vector de
	 * cadenas y devuelva verdadero si algún elemento aparece más de una vez. La
	 * función no modificará el vector.
	 */

	private static final int palabras_max = 5;
	public static String[] palabra_introducida = new String[palabras_max];
	public static Scanner teclado = new Scanner(System.in);
	public static String palabra;
	private static boolean tiene_duplicados;

	public static void main(String[] args) {

		introducirPalabra();
		tiene_duplicados();
		comprobacion();

	}

	public static void introducirPalabra() {

		System.out.println("Ingrese 5 palabras para comprobar en número de "
				+ "veces que se repiten: ");
		
		for (int i = 0; i < palabra_introducida.length; i++) {
			System.out.println((i+1) + "º palabra: ");
			palabra = teclado.next().toLowerCase();
			palabra_introducida[i] = palabra;
		}
	}

	private static void tiene_duplicados() {
		int palabraDuplicada = 0;
		for (int i = 0; i < palabra_introducida.length; i++) {
			for (int j = i+1; j < palabra_introducida.length; j++) {
				if (palabra_introducida[i].equals(palabra_introducida[j])) {
					palabraDuplicada++;
				}
			}
		}

		if (palabraDuplicada >= 1)
			tiene_duplicados = true;
	}

	private static void comprobacion() {
		if (tiene_duplicados == false) {
			System.out.println("Ninguna de las palabras introducidas aparece repetida");

		}else if (tiene_duplicados==true){
			System.out.println("Existen palabras duplicadas dentro del vector");
		}
		
	}
}
