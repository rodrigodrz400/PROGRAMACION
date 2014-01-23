package EjerciciosIniciales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionDivisorMax5Errores {

	/*
	 * Modifica el ejercicio 3 para que si el usuario tiene más de 5 errores muestre el mensaje 
	 * "Demasiados fallos. Vuelve a intentarlo otro día".
	 */
	public static void main(String[] args) {
		double dividendo = 0;
		double divisor = 0;
		Scanner teclado = new Scanner(System.in);
		boolean hayerror;
		int contadorErrores;

		hayerror = false;
		contadorErrores= 0;
		do {
			if (contadorErrores==5){
				System.out.println("Demasiados fallos. Vuelve a intentarlo otro día.");
				break;
			}
			try {
				System.out.println("Introduzca un número entero:");
				dividendo = teclado.nextDouble();
				hayerror = false;
			} catch (InputMismatchException e) {
				System.err
						.println("ERROR: El número introducido no es un número entero. El error es: "
								+ e.getMessage());
				teclado.nextLine();
				contadorErrores++;
				hayerror = true;
			}
		} while (hayerror == true);
		

		teclado.close();
	}

}
