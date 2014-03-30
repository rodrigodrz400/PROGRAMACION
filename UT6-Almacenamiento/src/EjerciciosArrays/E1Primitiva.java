package EjerciciosArrays;

import java.util.Random;

public class E1Primitiva {

	// Ejercicio 1 Realiza un programa que calcule los 6 números para rellenar
	// una quiniela
	// primitiva controlando que no se repita ninguno de ellos.



	public static void main(String[] args) {
		int primitiva[] = new int[6];
		int i = 0;
		int j = 0;
		
		primitiva[i] = (int) (Math.random() * (49 - 1)) + 1;
		for (i = 1; i < primitiva.length; i++) {
			primitiva[i] = (int) (Math.random() * (49 - 1)) + 1;
			for (j = 0; j < i; j++) {
				if (primitiva[i] == primitiva[j]) {
					i--;
				}
			}
		}
		System.out.println("El programa ha elegido los siguientes números para la QUINIELA PRIMITIVA: \n");
		for (i = 0; i < primitiva.length; i++) {
			System.out.print(primitiva[i] + "\t");
		}
	}

}
