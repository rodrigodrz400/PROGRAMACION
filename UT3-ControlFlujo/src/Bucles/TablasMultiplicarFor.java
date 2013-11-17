package Bucles;

import java.util.Scanner;

public class TablasMultiplicarFor {

	public static void main(String[] args) {
		//Imprimir la tablas de multiplicar que el usuario elija.


			Scanner teclado = new Scanner (System.in);
			int numero = teclado.nextInt();
			int linea;
			
			System.out.println("Tabla del: ");
			
			
			for (linea=0; linea<=10;linea++){
				System.out.println( numero +
						" x " + linea + " = " + (numero*linea));
			}
			
			teclado.close();

	}

}
