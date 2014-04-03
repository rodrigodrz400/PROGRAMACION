package SimulacroPapas;

import java.util.Scanner;

/*
 1. (2 pts) Crear un programa que lea 10 números enteros y
 finalmente visualice el número de positivos, negativos y cero.
 */
public class CuentaNum {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int resp;
		int negativos = 0;
		int ceros = 0;
		int positivos = 0;

		System.out.println("Escribe 10 números: ");
		for (int i = 0; i < 10; i++) {
			resp = teclado.nextInt();
			if (resp < 0) {
				negativos++;
			} else if (resp == 0) {
				ceros++;
			} else {
				positivos++;
			}
		}
		System.out.println("Positivos: " + positivos);
		System.out.println("Ceros: " + ceros);
		System.out.println("Negativos: " + negativos);

		teclado.close();
	}

}
