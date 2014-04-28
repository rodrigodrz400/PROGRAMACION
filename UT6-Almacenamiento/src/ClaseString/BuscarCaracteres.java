package ClaseString;

import java.util.Arrays;
import java.util.Scanner;

public class BuscarCaracteres {

	public static String pedirCadena(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una cadena: ");
		return teclado.nextLine();
	}



	private static char[] pedirCaracteres() {
		char[] caracteres=new char[100];
		int numCaracteres=0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe caracteres: ");
		char caracter;

		caracter=teclado.next().charAt(0);
		while (caracter!='*') {
			caracteres[numCaracteres++]=caracter;
			caracter=teclado.next().charAt(0);
		}

		return Arrays.copyOf(caracteres, numCaracteres);
	}


	private static void contiene(String cadena, char[] caracteres) {

		for(int i=0;i<caracteres.length;i++) {
			int pos=cadena.indexOf(caracteres[i], 0);

			if (pos>=0) {
				System.out.println("El caracter " + caracteres[i] + " se ha " +
							"encontrado en la posici�n " + pos);
			}
		}
	}

	public static void main(String[] args) {
		// Escribe un programa que pida una cadena. Posteriormente, el programa dejar�
		// que el usuario inserte varios caracteres hasta que inserte un asterisco, con
		// el fin de informar, para cada car�cter, si la cadena lo contiene y en qu�
		// posici�n est� el primero.

		String cadena=pedirCadena();

		char[] caracteres=pedirCaracteres();

		contiene(cadena,caracteres);

	}



}