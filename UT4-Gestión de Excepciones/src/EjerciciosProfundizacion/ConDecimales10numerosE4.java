package EjerciciosProfundizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 Escribe un programa que pida diez n�meros con decimales. Si insertan letras, 
 se pedir� de nuevo dicho n�mero. El programa debe visualizar el n�mero m�s alto 
 de todos los insertados. Si se produce alguna excepci�n se mostrar� el mensaje 
 correspondiente. Adem�s, al final del programa se visualizar� un mensaje que indica 
 cu�ntas veces se ha producido dicho error.
 */
public class ConDecimales10numerosE4 {

	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] decimales = new double[10];
		
		int errores = 0;
		double numeroIntroducido;

		for (int correctos = 0; correctos < decimales.length;) {
			try {
				if (correctos != 0) {
					System.out.println("Inserte otro n�mero: ");
				} else {
					System.out.println("Escriba 10 n�meros decimales: ");
				}
				numeroIntroducido= teclado.nextDouble();
				decimales[correctos] = numeroIntroducido;
				correctos++;
			} catch (InputMismatchException ime) {
				System.out.println("\nError: " + ime.toString());
				System.out.println("Tipo de error: " + ime.getMessage()
						+ "\nSe han introducido caracteres "
						+ "para un valor de tipo num�rico.\n");
				teclado.nextLine();
				errores++;
			}

		}

		System.out.println("El valor m�s alto introducido es el n�mero: " + calcularMayor(decimales) + ".");
		System.out.println("Se han producido un total de: " + errores 
				+ " errores, durante la ejecuci�n del programa.");

		teclado.close();
	}

	private static double calcularMayor(double[] decimales) {
		double resultado = decimales[0];
		for (int i = 0; i < decimales.length; i++) {
			if (decimales[i] > resultado) {
				resultado = decimales[i];
			}
		}
		return resultado;
	}

}
