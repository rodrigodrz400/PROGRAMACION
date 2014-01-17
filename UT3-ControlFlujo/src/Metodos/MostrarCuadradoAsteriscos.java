package Metodos;

import java.util.Scanner;

public class MostrarCuadradoAsteriscos {

	/*
	 Escriba un m�todo llamado cuadradoDeAsteriscos que muestre un cuadrado relleno (el mismo n�mero de filas y columnas)
	 de asteriscos cuyo lado se especifique en el par�metro entero lado.
	 Incorpore este m�todo a una aplicaci�n que lea un valor entero para el par�metro lado que introduzca el usuario,
	 y despliegue los asteriscos con el m�todo cuadradoDeAsteriscos.
	 */
	public static void main(String[] args) {
		Scanner  teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el n�mero de asteriscos que desea por fila: ");
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
