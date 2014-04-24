package ClaseString;

import java.util.Scanner;

public class CadenaAsteriscos {

	// Escribe un programa que pida una cadena. Posteriormente, el programa dejará
	// que el usuario inserte varios caracteres hasta que inserte un asterisco, con
	// el fin de informar, para cada carácter, si la cadena lo contiene y en qué
	// posición está el primero.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		int contador = 0;
		String caracter;
		String caracteres = "";
		

		System.out.println("Introduzca una frase: ");
		frase = teclado.nextLine();

		
		do{
			System.out.println("Inserte caracteres para completar la frase anterior: (para salir pulse *)");
			caracter=teclado.next();
			caracteres += caracter;	
			contador++;
		}while(!(caracter.equals("*")));
		
		frase += caracteres;
		
		char [] ArrayCaracteres = new char [frase.length()];
		
		for (int i = 0; i < frase.length()-1; i++) {
			ArrayCaracteres[i] = (char) frase.charAt(i);
		}
		
		
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j < ArrayCaracteres.length; j++) {
				if (frase.charAt(i)==(ArrayCaracteres[j]))
				System.out.println("\nEl caracter-" + ArrayCaracteres[j] + "- se encuentra en la " 
				+ (i+1) + "ª de la frase:\n" + "-->\t" + frase);
			}
		}
		
		
	}

}
