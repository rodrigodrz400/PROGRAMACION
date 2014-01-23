package EjerciciosIniciales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaEnteros {

	/*
	 * Haciendo uso de un método que pida un número entero, hacer un programa
	 * que pida números enteros y visualice el resultado de sumar dichos número.
	 * Se pedirás números hasta que se inserte una letra o se inserten seis
	 * números.
	 */

	static int acumulador = 0;

	public static int suma(int n2) throws InputMismatchException {

		int resultado = n2 + acumulador;
		acumulador = resultado;
		
		return resultado;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1;
		int n2;
		System.out.println("Introduzca un número entero para sumarlo: ");
		n1 = teclado.nextInt();
		acumulador = n1;

		boolean continuarCiclo = true;
		int intentos = 0;
		do {
			
			try {
				System.out.println("Introduzca otro número entero: (números a introducir restantes = " + (6-intentos) + ")" );
				n2 = teclado.nextInt();
				System.out.println("El resultado de sumar " + acumulador + " + " + n2 + " es = " + suma(n2));
				intentos++;
				continuarCiclo=true;
			} catch (InputMismatchException e) {
				System.out.println("Error: Se ha insertado una letra en lugar de un número entero.");
				continuarCiclo=false;
			}

		} while (continuarCiclo == true && intentos != 6);
		
		System.out.println("--FIN DEL PROGRAMA--");

		teclado.close();
	}

}
