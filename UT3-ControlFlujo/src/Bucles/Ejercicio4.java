package Bucles;

import java.util.Scanner;

public class Ejercicio4 {

	//Escribir un programa que lea tantos n�meros como el usuario quiera 
	//(hasta que se inserte un n�mero negativo). El primer n�mero hay que visualizarlo en la pantalla.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int  numero = 0;
		
		/*
		do {
			System.out.println("Inserte un n�mero: ");
			numero = teclado.nextInt();
			System.out.println();
		}while (numero >= 0);
		*/
		
		
			System.out.println("Inserte un n�mero: ");
			numero = teclado.nextInt();
			System.out.println( "Ha introducido el n�mero: \n" + numero); 
			
		
		do {
			System.out.println("Por favor, introduzca otro n�mero: ");
			numero = teclado.nextInt(); 	
			}while (numero >= 0);				
		
		
		teclado.close();
	}

}
