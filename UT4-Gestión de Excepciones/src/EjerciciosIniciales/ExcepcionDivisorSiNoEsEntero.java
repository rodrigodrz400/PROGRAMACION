package EjerciciosIniciales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionDivisorSiNoEsEntero {

	/*
	 * Modifica el ejercicio 1 para que si el usuario introduce algo que no es
	 * un número, vuelva a repetirse el pedir el dividendo y divisor.
	 */
	public static void main(String[] args) {
		double dividendo = 0;
		double divisor = 0;
		Scanner teclado = new Scanner(System.in);
		boolean hayerror;

		hayerror = false;

		do {
			try {
				System.out
						.println("Introduzca un número entero:");
				dividendo = teclado.nextDouble();
				hayerror = false;
			} catch (InputMismatchException e) {
				System.err
						.println("ERROR: El número introducido no es un número entero. El error es: "
								+ e.getMessage());
				teclado.nextLine();
				hayerror = true;
			}finally{
				System.out.println("--FIN DEL PROGRAMA--");
			}
		} while (hayerror == true);
		

		teclado.close();
	}

}
