package Bucles;

import java.util.Scanner;

public class Ejercicio3 {

	//Escribir un programa que pida varios n�meros hasta que el usuario inserte un n�mero par. 
	//Hay que ir mostrando cada uno de los n�meros insertados (excepto el par).
	
	public static void main(String[] args) {

		
		Scanner teclado = new Scanner (System.in);
		
		int numero = 0;
		
		/*
		while (numero %2 != 0){
				System.out.println("Introduzca otro n�mero: ");
				numero = teclado.nextInt();
				System.out.println("El n�mero introducido es: " + numero);
				}
		*/
		
		do {
			System.out.println("Introduzca otro n�mero: ");
			numero = teclado.nextInt();
			if (numero %2 == 0) break;
			System.out.println("El n�mero introducido es: " + numero);
			System.out.println();
			}
		
		
			while (numero %2 != 0);
		
		System.out.println("Ha intruducido un n�mero par: \"FIN DE LA SECUENCIA\"");
			
		
		
		teclado.close();
		
	}

}
