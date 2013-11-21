package Bucles;

import java.util.Scanner;

public class Ejercicio5 {

	//Escribe un programa que lea una serie de números, muestre el primero, 
	//no el segundo, si el tercero y así sucesivamente. 
	//Termina cuando insertamos un número negativo. El número negativo no se imprimirá.
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		int numero;
		

		do {
			System.out.println("Introduzca un número: ");
			numero  = teclado.nextInt(); 
			System.out.println("El número introducido es: " + numero);
			System.out.println("Introduzca otro número: ");
			numero  = teclado.nextInt(); 
			}while (numero >= 0);	
			
		
		
		teclado.close();
		
	}

}
