package Metodos;

import java.util.Scanner;

public class NumerosPerfectos {

	// Se dice que un n�mero entero es un n�mero perfecto si sus factores,
	// incluyendo 1 (pero no el n�mero entero),
	// al sumerse dan como resultado el n�mero entero. Por ejemplo, 6 es un
	// n�mero perfecto ya que 6=1+2+3.
	// Escriba un m�todo llamado esPerfecto que determine si el par�metro numero
	// es un n�mero perfecto.
	// Use una aplicaci�n que muestre todos los n�meros perfectos entre 1 y
	// 1000. Imprima los factores de cada
	// numero perfecto para confirmar que el n�mero sea realmente perfecto.

	public static int[] factorial = new int[25];

	public static void esPerfecto(int numero) {

		int suma = 0;
		int posicion = 0;

		for (int i = 1; i < numero - 1; i++) {
			if (numero % i == 0) {
				suma += i;
				factorial[posicion] = i;
				posicion++;
			}

			/*
			 * int sumas = 1, menor = 2, Mayor = numero; while (menor < Mayor) {
			 * Mayor = numero / menor; if (numero % menor == 0) sumas += menor;
			 * if (Mayor != menor && numero % Mayor == 0) sumas += Mayor;
			 * menor++;
			 */

		}
		if (suma == numero) {
			System.out.print("\nEl n�mero " + numero
					+ ", es un n�mero perfecto y sus factores son: ");
			for (int k = 0; k < posicion; k++) {
				System.out.print(factorial[k] + " + ");

			}
			System.out.print(" = " + numero + "\n\n");
		} else {
			System.out.println("\nEl n�mero " + numero
					+ ", no es un n�mero perfecto;\n");
		}

	}

	private static void imprimirPerfectos(int suma) {
		for (int i = 1; i <= 1000; i++) {
			suma = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					suma += j;
				}
			}
			if (i == suma) {
				System.out.printf("%d \t es perfecto\n", i);

				// else if (i !=suma){
				// System.out.printf("%d \t no es perfecto\n", i);
			}
		}

	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int suma = 1000;
		int numero = 1;
		while (numero >= 0) {

			for (int i = 0; i < 34; i++) {
				System.out.print(" *");
			}
			System.out.println();
			System.out
					.println("Introduzca un n�mero entero para saber si es o no, un n�mero perfecto: [para finalizar <=0]");
			numero = teclado.nextInt();
			if (numero <= 0) {
				break;
			}
			esPerfecto(numero);
			System.out
					.println("Los n�meros perfectos comprendidos entre en 1 y el "
							+ suma + " son:");
			imprimirPerfectos(suma);
		}
		;
		System.out.println("--FIN DEL PROGRAMA--");

		teclado.close();
	}

}
