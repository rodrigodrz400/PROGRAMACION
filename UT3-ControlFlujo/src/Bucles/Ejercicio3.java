package Bucles;

import java.util.Scanner;

public class Ejercicio3 {

	//Escribir un programa que pida varios números hasta que el usuario inserte un número par. 
	//Hay que ir mostrando cada uno de los números insertados (excepto el par).
	
	public static void main(String[] args) {

		
		Scanner teclado = new Scanner (System.in);
		
		int numero = 0;
		
		/*
		while (numero %2 != 0){
				System.out.println("Introduzca otro número: ");
				numero = teclado.nextInt();
				System.out.println("El número introducido es: " + numero);
				}
		*/
		
		do {
			System.out.println("Introduzca otro número: ");
			numero = teclado.nextInt();
			if (numero %2 == 0) break;
			System.out.println("El número introducido es: " + numero);
			System.out.println();
			}
		
		
			while (numero %2 != 0);
		
		System.out.println("Ha intruducido un número par: \"FIN DE LA SECUENCIA\"");
			
		
		
		teclado.close();
		
	}

}
