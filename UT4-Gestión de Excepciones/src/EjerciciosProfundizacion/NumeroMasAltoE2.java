package EjerciciosProfundizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroMasAltoE2 {

	/*
	 * Escribe un programa que pida un double y un float. Si al pedir un número,
	 * el usuario inserta letras, se pedirá de nuevo ese dato. Una vez
	 * insertados, se visualizará el número más alto de los dos. Si son iguales
	 * se visualizará cualquiera de ellos. Se usará un método que pida un dato
	 * de tipo float. Dicho método controlará el error que se podría producir si
	 * se insertan letras, visualizando en este caso un mensaje de error. El
	 * main será el que se encargue de llamar de neuvo a este método si se
	 * insertan letras. De la misma forma se hará a la hora de pedir un dato de
	 * tipo double.
	 */
	static Scanner teclado;
	public static boolean leido;

	public static double numeroDouble() {
		double numeroD = 0;

		try {
			System.out
					.println("Inserte un número real con un máximo de 8 bytes: (tipo double)");
			numeroD = teclado.nextDouble();
			leido = true;
		} catch (InputMismatchException e) {
			leido = false;
			teclado.nextLine();
			throw e;
			// System.out.println("Se ha producido un Error, introduzca de nuevo el número (tipo double)");
		}

		return numeroD;
	}

	public static float numeroFloat() {
		float numeroF = 0;
		try {
			System.out
					.println("Inserte un número real con un máximo de 4 bytes: (tipo float)");
			numeroF = teclado.nextFloat();
			leido = true;
		} catch (InputMismatchException e) {
			leido = false;
			teclado.nextLine();
			throw e;
			// System.out.println("Se ha producido un Error, introduzca de nuevo el número (tipo float)");
		}

		return numeroF;
	}

	public static void main(String[] args) {

		teclado = new Scanner(System.in);

		double nD;
		float nF;
		double numeroMayor;

		do {
			try {

				nD = numeroDouble();
				nF = numeroFloat();
				numeroMayor = Math.max(nD, nF);
				System.out.println("El número mayor de los introducidos es: "
						+ numeroMayor);
				leido = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: No es posible introducir palabras en la entrada de números");
			}
		} while (!leido);
	}

}
