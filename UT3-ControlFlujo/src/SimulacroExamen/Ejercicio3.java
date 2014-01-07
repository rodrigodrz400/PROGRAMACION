package SimulacroExamen;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String frases[], frases2[], usuario = "";
		frases = new String[1];
		int i = 0, posicion = 0, uno = -1, dos = -1, tres = -1;

		while (true) {

			System.out.print("Escribe una frase: ");
			usuario = teclado.next();

			if (usuario.equalsIgnoreCase("*")) {
				break;
			} else if (i > frases.length - 1) {

				frases2 = new String[frases.length];

				for (int x = 0; x < frases.length; x++) {
					frases2[x] = frases[x];
				}

				frases = new String[i + 1];

				for (int x = 0; x < frases2.length; x++) {
					frases[x] = frases2[x];
				}// for
			}// if

			frases[i] = usuario;
			i++;
		}// while

		while (true) {

			for (int x = 0; x <= 2; x++) {

				while (true) {

					posicion = ((int) (Math.random() * frases.length));

					if ((posicion == uno) || (posicion == dos)
							|| (posicion == tres)) {

						posicion = ((int) (Math.random() * frases.length));

					} else {
						break;
					}

				}

				System.out
						.print("\nFrase " + (x + 1) + ": " + frases[posicion]);

				if (uno == -1) {
					uno = posicion;
				}

				if (dos == -1) {
					tres = posicion;
				}
				if (tres == -1) {
					tres = posicion;
				}
			}
			System.out.print("\n¿Quieres obtener otros 3 versos?s/n: ");

			if (teclado.next().equalsIgnoreCase("n")) {
				System.out.print("\n\nFIN");
				break;
			}

			uno = -1;
			dos = -1;
			tres = -1;
		}

	}
}
