package Metodos;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenado {

	// Escribe un método llamado ordenado, que tome un vector de enteros como
	// parámetro y
	// devuelva true si el vector (todos sus elementos) está ordenado
	// ascendentemente,
	// o false en caso contrario.

	private static int numeros_max = 5;
	private static int[] enteros = new int[numeros_max];
	private static int ordenado_A;
	private static int ordenado_D;
	private static int numero = 0;
	private static Boolean ordenarNumeros;
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		introduzcaNumero();
		ordenado();
		comprobacionOrden();

		teclado.close();

	}

	private static void introduzcaNumero() {
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("Introduzca un número: ");
			numero = teclado.nextInt();
			enteros[i] = numero;
		}

	}

	public static boolean ordenado() {

		for (int i = 0; i < (enteros.length - 1); i++) {
			if (enteros[i] < enteros[(i + 1)]) {
				ordenado_A++;
			}
		}
		for (int j = 0; j < (enteros.length - 1); j++) {
			if (enteros[j] > enteros[(j + 1)]) {
				ordenado_D++;
			}
		}
		if (ordenado_A == numeros_max - 1) {
			ordenarNumeros = true;
		} else if (ordenado_D == numeros_max - 1) {
			ordenarNumeros = false;
		}

		return ordenarNumeros;
	}

	private static void comprobacionOrden() {
		for (int k = 0; k < 30; k++)
			System.out.print("* ");
		System.out.println();
		if (ordenarNumeros == true) {
			System.out.println("Los números introducidos están ordenados \"ASCENDENTEMENTE\"");
		} else if (ordenarNumeros == false) {
			System.out.println("Los números introducidos están ordenados \"DESCENDENTEMENTE\"");
		}
	}

}

/*
 * for (int i=0; i<enteros.length; i++){ if (enteros[i]<enteros[i+1]){
 * ordenado_A++; } } for (int j=0; j<enteros.length; j++){ if
 * (enteros[j]>enteros[j+1]){ ordenado_D++; } }
 */

