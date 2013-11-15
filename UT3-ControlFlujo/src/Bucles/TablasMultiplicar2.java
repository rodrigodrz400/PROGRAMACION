package Bucles;

import java.util.Scanner;

public class TablasMultiplicar2 {
	
	//Imprimir la tablas de multiplicar que el usuario elija.

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int numero = teclado.nextInt();
		int linea, multiplicacion;
		
		System.out.println("Tabla del: ");
		
		
		linea = 1;
		multiplicacion = numero;
		while (linea <= 10)  {
			System.out.println(numero + "x" + linea + "=" + (multiplicacion));
			linea++;
			multiplicacion += numero; //multiplicacion = multiplicacion + numero ;
		}
		
		teclado.close();

	}

}
