package Bucles;

import java.util.Scanner;

public class TablasMultiplicar {
	
	//Imprimir la tablas de multiplicar que el usuario elija.

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int numero = teclado.nextInt();
		int linea;
		
		System.out.println("Tabla del: ");
		
		
		linea = 1;
		while (linea <= 10)  {
			System.out.println(numero + "x" + linea + "=" + (numero*linea));
			linea++;
		}
		
		teclado.close();

	}

}
