package Bucles;

import java.util.Scanner;

public class Ejercicio5 {

	//Escribe un programa que lea una serie de n�meros, muestre el primero, 
	//no el segundo, si el tercero y as� sucesivamente. 
	//Termina cuando insertamos un n�mero negativo. El n�mero negativo no se imprimir�.
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		int numero;
		

		do {
			System.out.println("Introduzca un n�mero: ");
			numero  = teclado.nextInt(); 
			System.out.println("El n�mero introducido es: " + numero);
			System.out.println("Introduzca otro n�mero: ");
			numero  = teclado.nextInt(); 
			}while (numero >= 0);	
			
		
		
		teclado.close();
		
	}

}
