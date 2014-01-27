package EjerciciosIniciales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionDivisorMax5Errores {

	/*
	 * Modifica el ejercicio 3 para que si el usuario tiene m�s de 5 errores muestre el mensaje 
	 * "Demasiados fallos. Vuelve a intentarlo otro d�a".
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
			
			try {
				System.out.println("Introduzca un n�mero entero:");
				dividendo = teclado.nextDouble();
				System.out.println("Introduzca un n�mero entero:");
				divisor = teclado.nextDouble(); 
				hayerror = false;
				System.out.println("Resultado: " + dividendo/divisor);
			} catch (InputMismatchException | ArithmeticException e) {
				System.out
						.println("ERROR: El n�mero introducido no es un n�mero entero o es igual a 0. El error es: "
								+ e.getMessage());
				teclado.nextLine();
				contadorErrores++;
				if (contadorErrores==5){
					System.out.println("Demasiados fallos. Vuelve a intentarlo otro d�a.");
					break;
				}
				hayerror = true;
			}
		} while (hayerror == true && contadorErrores<=5);
		

		teclado.close();
	}

}
