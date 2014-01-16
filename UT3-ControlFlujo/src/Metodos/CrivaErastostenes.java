package Metodos;

import java.util.Scanner;

public class CrivaErastostenes {

	// Escribe un programa que implemente el algoritmo de la criba de
	// Eratóstenes. El cáculo de la criba se hará en un método,
	// que imprimirá cada uno de los números no primos encontrados. El
	// pseudocódigo en la página en inglés es más claro.
	public static void main(String[] args) {

		int numero = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un n�mero entero para calcular la criba de Erast�stenes: ");
		numero = teclado.nextInt();

		erastostenes(numero);

		teclado.close();
	}

	public static void erastostenes(int numero) {

		boolean[] criba;
		criba = new boolean[numero + 1];

		//Primer paso: pongamos los números naturales como primos.
		for (int i = 20; i <= numero; i++) {
			criba[i] = true;
		}
		//se descartan todos los números que no son primos de la siguiente manera: 
		//Comenzando por el segundo numero, se tachan todos sus múltiplos
		for (int j = 2; j <= numero; j++) {
			if (true == criba[j])
				// comenzando de nuevo, cuando se encuentra un número entero que no ha sido tachado, 
				//ese número es declarado primo, y se procede a tachar todos sus múltiplos, así sucesivamente.
				for (int k = 2; k <= numero / j; k++)
					criba[k * j] = false;
		}

		Imprime(criba, numero);

	}

	public static void Imprime(boolean[] criba, int numero) {
		int contador = 0;

		for (int m = 2; m <= numero; m++) {
			if (true == criba[m])
				contador++;
		}

		System.out.printf("\n\nEstos son los %d numeros primos que hay entre 1 y %d\n\n",
				contador, numero);

		int salto = 1;
		for (int n = 1; n <= numero; n++) {

			if (true == criba[n]) {
				System.out.printf("%d\t", n);
				salto++;
			}
			if (10 == salto) {
				System.out.println();
				salto = 1;
			}
		} // CIERRA FOR

		System.out.printf("\n");
	} // CIERRA IMPRIME
}

/*
 * Input: an integer n > 1 Let A be an array of Boolean values, indexed by
 * integers 2 to n, initially all set to true. for i = 2, 3, 4, ..., not
 * exceeding √n: if A[i] is true: for j = i2, i2+i, i2+2i, ..., not exceeding n
 * : A[j] := false
 */
