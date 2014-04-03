package SimulacroPapas;

import java.util.Scanner;

/*
 4. (3 pts) Crea la clase Numero que permite llevar la cuenta de 
 los números dados en la cola de la charcutería. La clase 
 almacenará el número que se está atendiendo (sale en el 
 marcador) y el último número que se ha dado (el que se ha 
 impreso). La clase tendrá los métodos:
 darNumero(): da el siguiente número (lo imprime por 
 pantalla).
 atender(): muestra el número del cliente que tiene ir al 
 mostrador
 mostrarCola(): muestra el número de clientes haciendo cola
 e imprime la lista de sus números.
 Crea un menú para poder cogeer/dar números y ver la cola.

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
		System.out.println("*Nº " + (numAtendiendo+1)
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
			System.out.println("\n*  Charcutería:  *");
			for (int k = 0; k < 18; k++)
				System.out.print("*");
			System.out.println();
			do {
				System.out.println(" 1. Coger número.");
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
				System.out.println("Gracias por comprar en nuestra <<CHARCUTERÍA>>");
				break;
			}
		} while (opcion != 4);
		
		teclado.close();
	}

}
