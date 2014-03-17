package EjerciciosArrays;

import java.util.Scanner;

public class E2MesAño {

	// Ejercicio 2 Crea un programa que almacene los meses del año (los nombres
	// de cada mes).
	// Se pedirá al usuario el número de mes y se visualizará su nombre.

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String[] mesesNombre = { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO",
				"JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE",
				"NOVIEMBRE", "DICIEMBRE" };
		int[] mesesNumero = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int respuesta = -1;

		do {
			try {
				System.out
						.println("Introduzca el número del mes que desea imprimir: \t(para salir pulse 0)");
				respuesta = teclado.nextInt();
				System.out.println(mesesNombre[respuesta - 1] + "\n");
			} catch (ArrayIndexOutOfBoundsException e) {
				if (!(respuesta == 0)) {
					System.out
							.println("Error introduzca un número comprendido entre el 1 y el 12.\n");
				}
			}
		} while (!(respuesta == 0));
		System.out.println("----------FIN DEL PROGRAMA----------");
	}

}
