package Metodos;

import java.util.Scanner;

public class AdivinarNumero {

	/*
	 * Escriba un programa que simule el juego de adivinar un n�mero. El
	 * ordenador debe generar un n�mero entre 1 y 100 y el usuario tiene que
	 * intentar el adivinarlo. Para ello, cada vez que el usuario introduce un
	 * valor el ordenador debe decirle al usuario si el n�mero a adivinar es
	 * mayor o menor que el introducido. Cuando consiga adivinarlo debe
	 * indic�rselo e imprimir en pantalla el n�mero de veces que el usuario ha
	 * intentado adivinar dicho n�mero. Estructura el programa con los m�todos
	 * que estimes necesarios, teniendo en cuenta que debe ser lo m�s legible
	 * posible.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numeroOculto = 0;
		int numeroIntroducido = 0;
		int numeroIntentos = 0;

		numeroOculto = (int) (Math.random() * 100 + 1);
		//System.out.println(numeroOculto);
        
		
		for (int i = 1; i <= 100 && numeroOculto != numeroIntroducido; i++) {
		System.out.println("Dime un n�mero del 1 al 100, a ver si aciertas el n�mero oculto: ");
		numeroIntroducido = teclado.nextInt();
		numeroIntentos++;
		
		numerosMayorMenor( numeroOculto, numeroIntroducido, numeroIntentos);
		compararNumeros (numeroOculto, numeroIntroducido, numeroIntentos);
		
		for (int j=0; j<28; j++){
			System.out.print("*");
		}System.out.println();
		
		}
		teclado.close();
	}

	public static void numerosMayorMenor(int numeroOculto, int numeroIntroducido, int numeroIntentos) {

			if (numeroOculto != numeroIntroducido) {
				if (numeroOculto > numeroIntroducido) {
					System.out.println("El n�mero oculto es m�s grande que el que has introducido");
				} else {
					System.out.println("El n�mero oculto es m�s peque�o que el que has introducido");
				}
			}
		}
	
	public static void compararNumeros (int numeroOculto, int numeroIntroducido, int numeroIntentos){
		if (numeroOculto == numeroIntroducido) {
			System.out.println("ENHORABUENA!!!, has acertado");
		} else {
			System.out.println("Llevas utilizados "+ numeroIntentos + " intentos");
		}
	}
	
	
}