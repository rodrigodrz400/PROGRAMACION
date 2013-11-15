package Bucles;

import java.util.Scanner;

public class Ejercicio2 {

	//Pedir números hasta que se inserte un 0. 
	//Mostrar la cantidad de números leídos y el resultado de multiplicar todos ellos.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int producto = 1;
		int contador = 0;
		
		
		System.out.print("Introduzca un número: ");
		int numero = teclado.nextInt();
		
		
			
			while( numero != 0 ){
	            producto *= numero;
	            ++contador;
	            System.out.print("Introduzca un número: ");
	            numero = teclado.nextInt();
				}
		
			if (numero == 0){
				System.out.println("La secuencia ha sido interrumpida");
				System.out.println("El resusltado de la multiplicación de todos los números introducidos es: "+ producto);
				System.out.println("La cantidad de números introducidos es: " + contador);
			}
		
			teclado.close();
		
	} 

}
