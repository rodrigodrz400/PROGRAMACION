package Ejercicios1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class E3ColeccionFibonacci {
	/*
	 * 3. Crea una colección con los primeros X números de la serie de
	 * Fibonacci, donde X es un número que pedirás al usuario. Después pregunta
	 * números y di si está o no en la colección. El programa terminará cuando
	 * el usuario introduzca un 0.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x;
		int numRep = 1;

		System.out
				.println("Introduzca un número entero para generear X números de la serie de Fibonacci: ");
		x = teclado.nextInt();

		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		fibonacci.add(1);
		fibonacci.add(1);
		for (int i = 0; i < x - 2; i++) {
			fibonacci.add(fibonacci.get(i) + fibonacci.get(i + 1));
			
		}
		System.out.println("SERIE FIBONACCI: (ordenada): "+fibonacci.toString());
		
		/*
		HashSet<Integer> repetidos = new HashSet<Integer>();
		for (int i = 0; i < x; i++) {
			repetidos.add(fibonacci.get(i));
		}
		System.out.println("SERIE FIBONACCI: (conjunto): "+ repetidos.toString());
		 */
		
		while (numRep != 0) {
			System.out
					.println("Introduce un número para saber si esta dentro de la serie Fionacci: (0 para salir)");
			numRep = teclado.nextInt();

			if (fibonacci.contains(numRep))
				System.out.println("El número: " + numRep
						+ " se encuentra dentro de la serie.");

			else if (numRep!=0)
				System.out.println("El número: " + numRep
						+ " NO se encuentra dentro de la serie.");
		}
		System.out.println("---FIN DE PROGRAMA---");
	}

}
