package EjerjciciosInicial;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {

		//Leer Número y guardarlo en una variable "numero"
			Scanner teclado = new Scanner (System.in);
				
			System.out.print("Escribe un número entero:");
			int numero = teclado.nextInt();
				
	
		//Si nº==par, imprimirlo
			if (numero%2 == 0){	
				//System.out.printf("El número %d es par", numero);
				System.out.println("El número " + numero + ", es un número par.");
			}else{
				System.out.println("El número " + numero + ", no es un un número par");
			}
			
		teclado.close();
	}

}
