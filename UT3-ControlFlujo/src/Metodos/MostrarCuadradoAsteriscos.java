package Metodos;

import java.util.Scanner;

public class MostrarCuadradoAsteriscos {

	/*
	 Escriba un método llamado cuadradoDeAsteriscos que muestre un cuadrado relleno (el mismo número de filas y columnas)
	 de asteriscos cuyo lado se especifique en el parámetro entero lado.
	 Incorpore este método a una aplicación que lea un valor entero para el parámetro lado que introduzca el usuario,
	 y despliegue los asteriscos con el método cuadradoDeAsteriscos.
	 */
	public static void main(String[] args) {
		Scanner  teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el número de asteriscos que desea por fila: ");
		int lado = teclado.nextInt();
		cuadradoDeAsteriscos(lado);
		teclado.close();
	}

	public static void cuadradoDeAsteriscos (int lado){
		for (int i=0; i<lado; i++){
			for (int j=0; j<lado; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
