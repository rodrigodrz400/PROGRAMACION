package EjerciciosIniciales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionDivisionFinally {

	/*
	 Añade un bloque finally al ejercicio 1 y haz que se muestre un mensaje final independientemente
	de lo que ocurra en el programa.
	 */
	public static void main(String[] args) {
		int dividendo = 0;
		int divisor = 0;
		Scanner teclado = new Scanner(System.in);
		
		try {
				System.out
						.println("Introduzca un número entero para calcular su división:");
				dividendo = teclado.nextInt();
				System.out.println("Introduzca el valor del divisor");
				divisor = teclado.nextInt();
				System.out.println("El resultado es: " + (dividendo / divisor));
				
			} catch (InputMismatchException | ArithmeticException e) {
				System.err
						.println("Error, al ejecutar el programa. El error es: "
								+ e.getMessage());
			}finally{
				System.out.println("--FIN DEL PROGRAMA--");
			}
		teclado.close();
	}

}
