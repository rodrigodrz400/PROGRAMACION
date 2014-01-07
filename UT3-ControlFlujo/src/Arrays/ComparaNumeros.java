package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ComparaNumeros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int[] numeros;
		int tamañoNumeros = 0;
		numeros = new int[10];
		int i = 0;
		boolean cero = false;

		while (i < 10 && !cero) {
			// leer
			int numero = teclado.nextInt();
			if (numero == 0) {
				cero = true;
			} else {
				// insertar si no esta
				boolean encontrado = false;
				for (int j = 0; j < tamañoNumeros; j++) {
					if (numero == numeros[j]) {
						encontrado = true;
					}

				}
				if (!encontrado) {
					numeros[tamañoNumeros] = numero;
					tamañoNumeros++;

				}
			}

			i++;
		}
		System.out.println("Número de distintos " + tamañoNumeros);
		System.out.println(Arrays.toString(numeros));
		teclado.close();
	}

}
