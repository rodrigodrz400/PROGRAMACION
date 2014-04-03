package SimulacroPapas;

import java.util.Scanner;

/*
 4. (3 pts) Crea la clase Numero que permite llevar la cuenta de 
 los n�meros dados en la cola de la charcuter�a. La clase 
 almacenar� el n�mero que se est� atendiendo (sale en el 
 marcador) y el �ltimo n�mero que se ha dado (el que se ha 
 impreso). La clase tendr� los m�todos:
 darNumero(): da el siguiente n�mero (lo imprime por 
 pantalla).
 atender(): muestra el n�mero del cliente que tiene ir al 
 mostrador
 mostrarCola(): muestra el n�mero de clientes haciendo cola
 e imprime la lista de sus n�meros.
 Crea un men� para poder cogeer/dar n�meros y ver la cola.

 */
public class Numero {

	private static int numAtendiendo = 0;
	private static int ultimoSinAtender = 0;

	public static void imprimePantalla() {
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("* " + ultimoSinAtender + " *");
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}
	}

	public static void darNumero() {
		ultimoSinAtender++;
		imprimePantalla();
	}

	public static void atender() {
		System.out.println("*N� " + (numAtendiendo+1)
				+ "* pasese por el mostrador");
		numAtendiendo++;
	}

	public static void mostarCola() {
		System.out.println("Clientes sin atender: " + ((ultimoSinAtender-numAtendiendo)));
		for (int i = 1; i <= (ultimoSinAtender-numAtendiendo); i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("\n*  Charcuter�a:  *");
			for (int k = 0; k < 18; k++)
				System.out.print("*");
			System.out.println();
			do {
				System.out.println(" 1. Coger n�mero.");
				System.out.println(" 2. Atender.");
				System.out.println(" 3. Ver cola. ");
				System.out.println(" 4. Salir. ");
				System.out.print(" \n Opcion --> ");
				opcion = teclado.nextInt();
			} while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4);

			switch (opcion) {
			case 1:
				darNumero();
				break;
			case 2:
				atender();
				break;
			case 3:
				mostarCola();
				break;
			case 4:
				System.out.println("Gracias por comprar en nuestra <<CHARCUTER�A>>");
				break;
			}
		} while (opcion != 4);
		
		teclado.close();
	}

}
