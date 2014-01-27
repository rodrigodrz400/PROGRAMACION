package EjerciciosProfundizacion;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class SecuenciaDeNumerosP5 {

	/*
	 * Escribe un programa que lea una secuencia de n�meros hasta que el usuario
	 * inserte un '*'. Al final del programa, se debe visualizar el n�mero m�s
	 * alto entre todos los le�dos. Puede suceder que el usuario no haya llegado
	 * a insertar ning�n n�mero, y habr� que visualizar el mensaje que
	 * corresponda. Hay que usar un m�todo que pida un n�mero y que controle el
	 * posible error que pudiera producirse si el usuario inserta letras. El
	 * m�todo visualizar� un mensaje informando del error.
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
						System.out.println("Inserte otro n�mero: ");
					} else {
						System.out.println("Escriba n�meros enteros para calcular el mayor:"
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
		
		System.out.println("El valor m�s alto introducido es el n�mero: " + calcularMayor() + ".");

	}

}
