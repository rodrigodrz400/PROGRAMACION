package Metodos;

import java.util.Arrays;
import java.util.Scanner;

public class SumaAcumulativa {

	/*
	 * Escribe un método que tome un vector de números y devuelva la suma
	 * acumulativa; esto es, un nuevo vector en el que cada elemento contiene la
	 * suma de todos los elementos anteriores. Por ejemplo, la suma acumulativa
	 * de [1, 2, 3] es [1, 3, 6].
	 */

	private static int numeros_max = 3 ;
	private static int vector[] = new int[numeros_max];
	private static Scanner teclado = new Scanner(System.in);
	private static int numero;

	public static void main(String[] args) {
		introduzcaNumero();
		sumaAcumulativa();
		System.out.println(Arrays.toString(vector));
	}


	private static void sumaAcumulativa() {
		int suma = 0;
		for (int i=0; i<vector.length; i++){
			suma += vector[i];
			vector[i]=suma;	
		}
		
	}

	private static void introduzcaNumero() {
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduzca un número: ");
			numero = teclado.nextInt();
			vector[i] = numero;
		}
	}
}
