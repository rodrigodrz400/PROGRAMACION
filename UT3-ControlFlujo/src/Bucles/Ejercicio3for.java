package Bucles;

import java.util.Scanner;

public class Ejercicio3for {

	//Escribe un programa que calcule la suma de 6 números que inserte el usuario a través del teclado.
	public static void main(String[] args) {
		
		int numero = 0;
		int acumulador = 0;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Inserte 6 números para calcular su suma");
		
		for (int i = 1; i<7 ; i++){
			System.out.println(i + "º " + "número: ");
			numero = teclado.nextInt(); 
			acumulador += numero ;
		}
		
		System.out.println("La suma de todos los números introducidos es: "+ acumulador);
		
		
		
		teclado.close();
	}

}
