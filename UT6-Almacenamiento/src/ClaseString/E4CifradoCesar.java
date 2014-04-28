package ClaseString;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E4CifradoCesar {

	/*
	 * Escribe un programa que codifique usando cifrado César. Haz una primera
	 * versión en que cada letra se sustituya por el caracter siguiente. Por
	 * ejemplo “Hola" pasa a ser "Ipmb". Haz una segunda versión en que se pida
	 * un número por teclado y la codificación se haga incrementando cada
	 * carácter por esa cantidad, por ejemplo si introducimos 3, "Hola" pasa a
	 * ser "Krñd".
	 */
	private static Scanner teclado;
	private static String abecedario = "abcdefghijklmnñopqrstuvwxyz";
	private static String palabra = "";
	private static int mostrarMenu() {

		System.out.println("1. Caracter siguiente");
		System.out.println("2. Introducir incremento personalizado");
		System.out.println("3. Codificar otra palabra");
		System.out.println("4. Salir");

		teclado = new Scanner(System.in);
		int respuesta = 0;
		boolean continuarCiclo = false;
		do {
			try {
				System.out.println("-->Elija una Opción: ");
				respuesta = teclado.nextInt();
				continuarCiclo = false;
			} catch (InputMismatchException e) {
				System.err
						.println("Error: Debe introducir un valor númerico comprendido"
								+ " entre las opciones disponibles.");
				teclado.nextLine();
				continuarCiclo = true;
			}
		} while (continuarCiclo == true);
		return respuesta;
	}

	private static void  cifCesarSig(String entrada) {
		String salida = "";
		boolean mostar=true;
		for (int i = 0; i < entrada.length(); i++) {
			if (abecedario.indexOf(entrada.charAt(i)) != -1) {

				salida += abecedario.charAt(((abecedario.indexOf(entrada
						.charAt(i))) + 1));
			}else{
				System.out.println("Los caracteres introducidos no son válidos, introduzca otra palabra.");
				mostar=false;
				break;
			}
		}
		if(mostar==true)
		System.out.println("Texto cifrado: " + salida);
	}

	private static void cifCesarPos(String entrada, int desplazamiento) {
		String salida = "";
		boolean mostar=true;
		for (int i = 0; i < entrada.length(); i++) {
			if (abecedario.indexOf(entrada.charAt(i)) != -1) {

				salida += abecedario.charAt(((abecedario.indexOf(entrada
						.charAt(i))) + desplazamiento));
			}else{
				System.out.println("Los caracteres introducidos no son válidos, introduzca otra palabra.");
				mostar=false;
				break;
			}
		}
		if(mostar==true)
			System.out.println("Texto cifrado: " + salida);
	}
	private static void introducirFrase() {
		
		System.out.println("\n*  Cifrado César:  *");
		for (int k = 0; k < 20; k++)
			System.out.print("*");
		System.out.println();
		System.out.println("Inserte el texto a cifrar:");
		palabra = teclado.nextLine().toLowerCase();
		System.out.println("\nAhora indique el tipo de cifrado que desea realizar: ");
			
		}
	public static void main(String[] args) {
		teclado = new Scanner(System.in);

		int respuesta;

		
		int pos = 0;
		
		introducirFrase();

		do {
			do {
				respuesta = mostrarMenu();
			} while (respuesta != 1 && respuesta != 2 && respuesta != 3 && respuesta != 4);
			switch (respuesta) {
			case 1:
					cifCesarSig(palabra);
				break;

			case 2:
				
					System.out.println("Introduzca un valor numérico para el desplazamiento del difrado: ");
					pos = teclado.nextInt();

					cifCesarPos(palabra, pos);
				break;
				
			case 3:
				teclado.nextLine();
				introducirFrase();
				break;
				
			case 4:
				System.out.println("---FIN DEL PROGRAMA---");
				
			}
		} while (respuesta != 4);

	}

	
}
