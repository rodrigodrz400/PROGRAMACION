package Bucles;

import java.util.Scanner;

public class EjercicioFor {
	
	//Pedir 3 n�meros y sacar la media
	public static void main(String[] args) {
		
		int numero = 0;
		int suma = 0;
		int media = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		for (int i = 1; i<=3; i++ ){
			System.out.println("Introduzca un n�mero: ");
			numero = teclado.nextInt();
			suma = suma + numero;
		}
		media = suma / 3;
		System.out.println("La media de los tres n�meros es: " + media);
		
		
		teclado.close();
	}

}
