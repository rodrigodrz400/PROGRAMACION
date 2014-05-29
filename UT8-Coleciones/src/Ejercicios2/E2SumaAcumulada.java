package Ejercicios2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class E2SumaAcumulada {
	/*
	 * Escribe una función que tome una lista de números y devuelva la suma
	 * acumulativa; esto es, una nueva lista donde cada elemento contiene la
	 * suma de todos los elementos anteriores en la lista original. Por ejemplo,
	 * la suma acumulativa de [1,2,3] es [1,3,6].
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);

		System.out.println(numeros);
		System.out.println(sumaAcumulativa(numeros));
	}

	private static ArrayList <Integer>sumaAcumulativa(ArrayList <Integer> numeros) {
		int sumaNumeros = 0;

		ArrayList<Integer> copyNumeros = new ArrayList<Integer>();

		for (Iterator it = numeros.iterator(); it.hasNext();) {

			sumaNumeros += it.next().hashCode();
			copyNumeros.add(sumaNumeros);
		}
		return copyNumeros;
	}
}