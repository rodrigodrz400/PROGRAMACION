package EjerciciosProfundizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroMasAltoE2 {

	/*
	 * Escribe un programa que pida un double y un float. Si al pedir un n�mero,
	 * el usuario inserta letras, se pedir� de nuevo ese dato. Una vez
	 * insertados, se visualizar� el n�mero m�s alto de los dos. Si son iguales
	 * se visualizar� cualquiera de ellos. Se usar� un m�todo que pida un dato
	 * de tipo float. Dicho m�todo controlar� el error que se podr�a producir si
	 * se insertan letras, visualizando en este caso un mensaje de error. El
	 * main ser� el que se encargue de llamar de neuvo a este m�todo si se
	 * insertan letras. De la misma forma se har� a la hora de pedir un dato de
	 * tipo double.
	 */
	static Scanner teclado;
	public static boolean leido;

	public static double numeroDouble() {
		double numeroD = 0;

		try {
			System.out
					.println("Inserte un n�mero real con un m�ximo de 8 bytes: (tipo double)");
			numeroD = teclado.nextDouble();
			leido = true;
		} catch (InputMismatchException e) {
			leido = false;
			teclado.nextLine();
			throw e;
			// System.out.println("Se ha producido un Error, introduzca de nuevo el n�mero (tipo double)");
		}

		return numeroD;
	}

	public static float numeroFloat() {
		float numeroF = 0;
		try {
			System.out
					.println("Inserte un n�mero real con un m�ximo de 4 bytes: (tipo float)");
			numeroF = teclado.nextFloat();
			leido = true;
		} catch (InputMismatchException e) {
			leido = false;
			teclado.nextLine();
			throw e;
			// System.out.println("Se ha producido un Error, introduzca de nuevo el n�mero (tipo float)");
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
				System.out.println("El n�mero mayor de los introducidos es: "
						+ numeroMayor);
				leido = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: No es posible introducir palabras en la entrada de n�meros");
			}
		} while (!leido);
	}

}
