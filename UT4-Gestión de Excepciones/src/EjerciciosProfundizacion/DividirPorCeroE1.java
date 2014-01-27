package EjerciciosProfundizacion;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirPorCeroE1 {

	/*
	 * 1).Cambia el ejercicio 3 de iniciación de forma que si se intenta dividir
	 * por cero, la división se de por realizada. Utiliza los métodos
	 * getMessage(), toString() y printStackTrace() para comprobar qué
	 * información se visualiza.
	 */
	public static void main(String[] args) {
		int dividendo = 0, divisor = 0;
		boolean leido, es_cero;
		double resultado;
		Scanner teclado = new Scanner(System.in);

		leido = false;
		es_cero = false;
		
		do {
			for(int i=0; i<25; i++){
				System.out.print(" *");
			}System.out.println();
			System.out.println("Escriba dos números para calcular su división:");
			try {
				System.out.print("Introduzca el DIVIDENDO: ");
				dividendo = teclado.nextInt();
				System.out.print("Introduzca el DIVISOR: ");
				divisor = teclado.nextInt();
				leido = true;
				
				if (divisor == 0) throw new ArithmeticException();
				resultado= dividendo/divisor;
				System.out.println("Resultado es: " + resultado);
				es_cero = false;	
				
				
			} catch (ArithmeticException ae) {
				es_cero = true;
				System.out.println("\nERROR aritmético: " + ae.toString());
				teclado.nextLine();
			} catch (NumberFormatException nfe) {
				leido = false;
				System.out.println("\nERROR de formato numérico: "+ nfe.toString());
				teclado.nextLine();
			} catch (Exception e) {
				leido = false;
				// Captura cualquier otra excepción
				System.out.println("\nERROR: "+ e.toString());
				System.out.println("La variable de error es: " + e.getMessage());
				teclado.nextLine();
			}

		} while (!leido || es_cero);

		teclado.close();

	}

}
