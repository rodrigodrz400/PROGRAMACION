package OrdenacionYbusqueda;

import java.util.Arrays;

public class E1numerosPrimitiva {
	/*
	 * Ejercicio 1. Escribe un programa que genere los seis n�meros aleatorios
	 * de la loter�a primitiva. No puede haber n�meros repetidos.
	 */

	public static void main(String[] args) {
		int primitiva[] = new int[6];
		int i = 0;
		int j = 0;
		
		primitiva[i] = (int) (Math.random() * (49 - 1)) + 1;
		for (i = 1; i < primitiva.length; i++) {
			primitiva[i] = (int) (Math.random() * (49 - 1)) + 1;
			for (j = 0; j < i; j++) {
				if (primitiva[i] == primitiva[j]) {
					i--;
				}
			}
		}
		System.out.println("El programa ha elegido los siguientes n�meros para la QUINIELA PRIMITIVA: \n");
		for (i = 0; i < primitiva.length; i++) {
			System.out.print(primitiva[i] + "\t");
		}
	}

}