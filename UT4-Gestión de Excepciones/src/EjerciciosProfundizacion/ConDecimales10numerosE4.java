package EjerciciosProfundizacion;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 Escribe un programa que pida diez números con decimales. Si insertan letras, 
 se pedirá de nuevo dicho número. El programa debe visualizar el número más alto 
 de todos los insertados. Si se produce alguna excepción se mostrará el mensaje 
 correspondiente. Además, al final del programa se visualizará un mensaje que indica 
 cuántas veces se ha producido dicho error.
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
					System.out.println("Inserte otro número: ");
				} else {
					System.out.println("Escriba 10 números decimales: ");
				}
				numeroIntroducido= teclado.nextDouble();
				decimales[correctos] = numeroIntroducido;
				correctos++;
			} catch (InputMismatchException ime) {
				System.out.println("\nError: " + ime.toString());
				System.out.println("Tipo de error: " + ime.getMessage()
						+ "\nSe han introducido caracteres "
						+ "para un valor de tipo numérico.\n");
				teclado.nextLine();
				errores++;
			}

		}

		System.out.println("El valor más alto introducido es el número: " + calcularMayor(decimales) + ".");
		System.out.println("Se han producido un total de: " + errores 
				+ " errores, durante la ejecución del programa.");

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
