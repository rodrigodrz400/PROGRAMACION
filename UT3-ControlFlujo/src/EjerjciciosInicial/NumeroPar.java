package EjerjciciosInicial;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {

		//Leer N�mero y guardarlo en una variable "numero"
			Scanner teclado = new Scanner (System.in);
				
			System.out.print("Escribe un n�mero entero:");
			int numero = teclado.nextInt();
				
	
		//Si n�==par, imprimirlo
			if (numero%2 == 0){	
				//System.out.printf("El n�mero %d es par", numero);
				System.out.println("El n�mero " + numero + ", es un n�mero par.");
			}else{
				System.out.println("El n�mero " + numero + ", no es un un n�mero par");
			}
			
		teclado.close();
	}

}
