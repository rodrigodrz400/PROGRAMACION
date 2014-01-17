package Metodos;

import java.util.Scanner;

public class MostrarCuadradosCaracteres {

	public static void main(String[] args) {
		Scanner  teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el número de asteriscos que desea por fila: ");
		int lado = teclado.nextInt();
		System.out.println("Introduzca el caracter que desea imprimir: ");
		char relleno= teclado.next().charAt(0);
		cuadradoDeCaracters(lado, relleno);
		teclado.close();

	}
	public static void cuadradoDeCaracters (int lado, char relleno){
		for (int i=0; i<lado; i++){
			for (int j=0; j<lado; j++){
				System.out.print(relleno);
			}
			System.out.println();
		}
}
}
