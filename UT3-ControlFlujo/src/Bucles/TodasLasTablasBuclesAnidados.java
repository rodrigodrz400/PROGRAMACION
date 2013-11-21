package Bucles;

import java.util.Scanner;

public class TodasLasTablasBuclesAnidados {

	//Modifica el ejercicio de la tabla de multiplicar de forma que el usuario vaya introduciendo números y 
	//se vayan imprimiendo las tablas correspondientes. El programa termina cuando se introduce un número no 
	//esté entre 1 y 10.
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		int linea, multiplicacion, numero;

		
		for(numero=1; numero<=10; numero++){
			multiplicacion = numero;
			linea = 1;
			System.out.println("\nTabla del " + numero);
			while (linea <= 10)  {
						System.out.println(numero + "x" + linea + "=" + (multiplicacion));
						linea++;
						multiplicacion += numero; //multiplicacion = multiplicacion + numero ;
						}
		
		}
		teclado.close();
	}

}
