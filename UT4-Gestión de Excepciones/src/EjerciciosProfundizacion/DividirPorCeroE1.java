package EjerciciosProfundizacion;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirPorCeroE1 {

	/*
	 * 1).Cambia el ejercicio 3 de iniciaci�n de forma que si se intenta dividir
	 * por cero, la divisi�n se de por realizada. Utiliza los m�todos
	 * getMessage(), toString() y printStackTrace() para comprobar qu�
	 * informaci�n se visualiza.
	 */
	public static void main(String[] args) {
		int dividendo = 0, divisor = 0;
		boolean leido, es_cero;
		double resultado;
		Scanner teclado = new Scanner(System.in);

		leido = false;
		
		
		do {
			for(int i=0; i<25; i++){
				System.out.print(" *");
			}System.out.println();
			System.out.println("Escriba dos n�meros para calcular su divisi�n:");
			try {
				System.out.print("Introduzca el DIVIDENDO: ");
				dividendo = teclado.nextInt();
				System.out.print("Introduzca el DIVISOR: ");
				divisor = teclado.nextInt();
				leido = true;
				
				
				resultado= dividendo/divisor;
				System.out.println("Resultado es: " + resultado);
					
				
				
			} catch (ArithmeticException ae) {
				
				System.out.println("Resultado es: Infinito ");
				System.err.println(ae.getMessage());
				ae.printStackTrace(System.err);
				
			} catch (NumberFormatException nfe) {
				leido = false;
				System.out.println("\nERROR de formato num�rico: "+ nfe.toString());
				teclado.nextLine();
			} catch (Exception e) {
				leido = false;
				// Captura cualquier otra excepci�n
				System.out.println("\nERROR: "+ e.toString());
				System.out.println("La variable de error es: " + e.getMessage());
				teclado.nextLine();
			}

		} while (!leido);

		teclado.close();

	}

}
