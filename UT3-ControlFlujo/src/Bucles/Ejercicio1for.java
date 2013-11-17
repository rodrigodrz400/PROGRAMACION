package Bucles;

import java.util.Scanner;

public class Ejercicio1for {

	//Escribe un programa que pida cinco frases y las visualice.
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
	
		System.out.println("Escriba 5 frases: ");
		
		for (int i = 1; i < 6 ; i++){		
			String frase=teclado.nextLine();
			System.out.println("Frase " + i + ": " + frase + " ");
		}
		
		
	teclado.close();	
	}

}
