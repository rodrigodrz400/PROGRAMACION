package Examen5Diciembre;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Controlador de termostato");
		System.out.println("-------------------------");
		double temperatura;
		double histeresis = 0;
		
		

		// Pedir temperatura
		System.out.println("¿A qué temperatura quieres estar?:");
		temperatura = teclado.nextDouble();
		// Pedir histéresis
		System.out.println("¿Con qué histéresis trabajamos?:");
		histeresis = teclado.nextDouble();

		// Bucle infinito
		boolean encendido = false;
		
		do {
			System.out.println("¿Temperatura actual?:");
			double temperaturaActual = teclado.nextDouble();
			if ((temperatura - histeresis) >= temperaturaActual) {
				encendido= true;

			} else if ((temperatura + histeresis ) <= temperaturaActual) {
				encendido = false;
			}
			if (encendido==true){
				System.out.println("-----------------");
				System.out.println("--  ENCENDIDO  --");
			}else if (encendido==false){
				System.out.println("-----------------");
				System.out.println("--  APAGADO  --");
			}
		} while (true);

		

	}

}
