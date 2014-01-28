package EjerciciosProfundizacion;

import java.util.InputMismatchException;
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
	public static int[] numeros = new int[50];
	static boolean siguienteLinea = false;

	private static int calcularMayor() {
		int resultado = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > resultado) {
				resultado = numeros[i];
			}
		}
		return resultado;
	}

	private static int leerNumero() {
		teclado = new Scanner(System.in);
		int numeroIntroducido = 0;

		try {
			if (siguienteLinea == true) {
				System.out.println("Inserte otro número: ");
			} else {
				System.out.println("Escriba números enteros para calcular el mayor:"
								+ " [la secuencia finaliza al pulsar \"*\"] ");
				siguienteLinea = true;
			}
			numeroIntroducido = teclado.nextInt();
		}catch (InputMismatchException ime) {
			throw ime;
		}catch (NoSuchElementException nsee) {
			throw nsee;
		}
		return numeroIntroducido;
	}

	public static void main(String[] args) {

		teclado = new Scanner(System.in);
		String numeroIntroducido = "";

		int[] decimales = new int[50];

		boolean continuarLeyendo = true;
		do {
			try {
				for (int i = 0; i < decimales.length; i++) {
					numeros[i] = leerNumero();
				}
			}catch (InputMismatchException ime) {
				numeroIntroducido = teclado.next();//Retorna el parámetro almacenado del Scanner
				if (numeroIntroducido.equals("*")) {
					System.out.println("\nError: " + ime.toString());
					continuarLeyendo = false;
				}else{
					System.out.println("ERROR: Debe introducir números enteros y no caracteres.");
				}
			}catch (NoSuchElementException nsee){
					System.out.println("\nError: " + nsee.toString());
					System.out.println("ERROR: No se ha introducido ningún número.");
			}

		} while (continuarLeyendo == true);

		System.out.println("El valor más alto introducido es el número: "
				+ calcularMayor() + ".");

	}

}
