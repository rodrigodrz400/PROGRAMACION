package Bucles;

import java.util.Scanner;

public class Ejercicio4for {

	//Escribe un programa que pida tantos n�meros como el usuario del programa indique al principio. 
	//El programa mostrar� al final la media y si se ha insertado un n�mero par.
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		
		int numero = 0;
		int usuario = 0;
		double acumulador = 0;
		int pares = 0;
		
		System.out.println("Indique cuantos n�meros quiere utilizar para calcular su media");
		numero = teclado.nextInt();
		
		
		for (int i = 1; i < numero + 1 ; i++){
			System.out.println("Introduzca el " + i + "� n�mero: " );
			usuario = teclado.nextInt();
			acumulador += usuario;
			if (usuario %2 == 0){
				pares++;
				}
			}
		
		System.out.printf("El valor medio de los n�mero introducidos es: %.2f \n", (acumulador / numero));
		System.out.println("Los n�meros pares introducidos son: " + pares);
		
		
		teclado.close();
	}

}
