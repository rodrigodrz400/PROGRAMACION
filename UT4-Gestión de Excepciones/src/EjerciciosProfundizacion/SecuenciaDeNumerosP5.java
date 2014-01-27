package EjerciciosProfundizacion;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class SecuenciaDeNumerosP5 {

	/*
	 * Escribe un programa que lea una secuencia de números hasta que el usuario
	 * inserte un '*'. Al final del programa, se debe visualizar el número más
	 * alto entre todos los leídos. Puede suceder que el usuario no haya llegado
	 * a insertar ningún número, y habrá que visualizar el mensaje que
	 * corresponda. Hay que usar un método que pida un número y que controle el
	 * posible error que pudiera producirse si el usuario inserta letras. El
	 * método visualizará un mensaje informando del error.
	 */

	static Scanner teclado;
	public static int[] decimales = new int[50];

	private static int calcularMayor() {
		int resultado = decimales[0];
		for (int i = 0; i < decimales.length; i++) {
			if (decimales[i] > resultado) {
				resultado = decimales[i];
			}
		}
		return resultado;
	}

	public static void main(String[] args) {

		teclado = new Scanner(System.in);

		int resultado = 0;
		int numeroIntroducido = 0;
		boolean siguienteLinea = false;
		int[] decimales = new int[50];
		
		boolean finPrograma = true;
		
		do {
			for (int i = 0; i < decimales.length; i++) {
				try {
					if (siguienteLinea == true) {
						System.out.println("Inserte otro número: ");
					} else {
						System.out.println("Escriba números enteros para calcular el mayor:"
								+ " [la secuencia finaliza al pulsar \"*\"] ");
					}
					numeroIntroducido = teclado.nextInt();
					String enteroString = Integer.toString(numeroIntroducido);
					if (enteroString != "*") {
						decimales[i] = numeroIntroducido;
						siguienteLinea = true;
					} else if (enteroString == "*") {
						finPrograma  = true;
					}

				} catch (NoSuchElementException nsee) {
					System.out.println("\nError: " + nsee.toString());
					teclado.nextLine();
				}
			}
		} while (finPrograma == false);
		
		System.out.println("El valor más alto introducido es el número: " + calcularMayor() + ".");

	}

}
