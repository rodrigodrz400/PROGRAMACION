package Examen5Diciembre;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] menu;
		menu = new String[10];
		int num_palabras = 0;
		

		boolean continuar = true;

		while (continuar==true && num_palabras <10) {
			
				System.out.println("introduzca una palabra: ");
				String palabra = teclado.next();
				palabra= palabra.toLowerCase();
				menu[num_palabras] = palabra;

				if (menu[num_palabras].equals("*")) {
					continuar = false;
				} else {
					num_palabras++;

				}
			}


		System.out.println("* Menú *");
		System.out.println("*********");
		for (int i = 0; i < num_palabras; i++) {
			System.out.println((i+1)+ ". "  + menu[i]);
		}
		System.out.println("3. Salir");
		teclado.close();
}
}
