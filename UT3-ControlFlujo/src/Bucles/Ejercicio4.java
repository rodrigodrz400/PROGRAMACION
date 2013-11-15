package Bucles;

import java.util.Scanner;

public class Ejercicio4 {

	//Escribir un programa que lea tantos números como el usuario quiera 
	//(hasta que se inserte un número negativo). El primer número hay que visualizarlo en la pantalla.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int  numero = 0;
		
		/*
		do {
			System.out.println("Inserte un número: ");
			numero = teclado.nextInt();
			System.out.println();
		}while (numero >= 0);
		*/
		
		
			System.out.println("Inserte un número: ");
			numero = teclado.nextInt();
			System.out.println( "Ha introducido el número: \n" + numero); 
			
		
		do {
			System.out.println("Por favor, introduzca otro número: ");
			numero = teclado.nextInt(); 	
			}while (numero >= 0);				
		
		
		teclado.close();
	}

}
