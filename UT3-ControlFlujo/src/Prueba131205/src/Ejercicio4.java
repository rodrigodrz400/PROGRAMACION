package Prueba131205.src;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		String[] menu = new String[40];
		int num_opciones = 0;
		String elegida;

		Scanner teclado = new Scanner(System.in);

		System.out.println("\nBienbenido a Menu Generator.\n");
		System.out
				.println("Comenzaremos recopilando opciones (escribe * para terminar)");

		boolean continuar = true;
		while (continuar && num_opciones < 39) {
			System.out.print("\nDame una opción: ");
			menu[num_opciones] = teclado.next();
			if (menu[num_opciones].equals("*")) {
				continuar = false;
			} else {
				num_opciones++;
			}
		}

		menu[num_opciones++] = "Salir";
		int encontrada;
		do {
			System.out.println("\n*  Menu  *");
			for (int k = 0; k < 10; k++)
				System.out.print("*");
			System.out.println();

			// Mostrar menú
			for (int i = 0; i < num_opciones; i++)
				System.out.println(i + 1 + ". " + menu[i]);
			System.out.print("Opción elegida: ");
			elegida = teclado.next().toLowerCase();

			encontrada = -1;
			for (int i = 0; i < num_opciones && encontrada < 0; i++) {
				if (elegida.equals(menu[i].toLowerCase())) {
					System.out.print("Ha elegido la opción: " + (i + 1));
					encontrada = i;
				}
			}
			if (encontrada < 0)
				System.out
						.print("Esa opción no existe, por favor, vuelva a intentarlo");
		} while (encontrada != num_opciones - 1);

	}
}
