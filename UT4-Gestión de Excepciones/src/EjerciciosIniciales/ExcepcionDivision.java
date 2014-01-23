package EjerciciosIniciales;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExcepcionDivision {

	/*
	 *Crea un programa que pida dos n�meros enteros y muestre el resultado de su divisi�n. 
	 *Captura la excepci�n InputMismatchException y ArimeticException y muestra un mensaje
	 * para el caso de que no se introduzca un n�mero o se intente dividir entre cero respectivamente.
	 */
	public static void main(String[] args) {
		int dividendo = 0;
		int divisor = 0;
		Scanner teclado = new Scanner(System.in);
		
		try {
				System.out
						.println("Introduzca un n�mero entero para calcular su divisi�n:");
				dividendo = teclado.nextInt();
				System.out.println("Introduzca el valor del divisor");
				divisor = teclado.nextInt();
				System.out.println("El resultado es: " + (dividendo / divisor));
				
			} catch (InputMismatchException | ArithmeticException e) {
				System.err
						.println("Error, al ejecutar el programa. El error es: "
								+ e.getMessage());
			}
		teclado.close();
	}

}
