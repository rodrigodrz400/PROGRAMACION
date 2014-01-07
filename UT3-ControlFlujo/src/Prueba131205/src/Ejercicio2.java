package Prueba131205.src;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double temp_objetivo, histeresis, tem_actual;
		boolean encendido;

		System.out.println("Controlador de termostato");
		System.out.println("-------------------------");
		System.out.print(" ¿A qué temperatura quieres estar?: ");
		temp_objetivo = input.nextDouble();
		System.out.print(" ¿Con qué histéresis trabajamos?: ");
		histeresis = input.nextDouble();

		encendido = false;
		while (true) {
			System.out.print(" ¿temperatura actual?: ");
			double temp_actual = input.nextDouble();

			if (encendido) {
				if (temp_actual >= (temp_objetivo + histeresis))
					encendido = false;
			} else {
				if (temp_actual <= (temp_objetivo - histeresis))
					encendido = true;
			}

			System.out.println("-------------------");
			if (encendido)
				System.out.println("--   ENCENDIDO   --");
			else
				System.out.println("--    APAGADO    --");
			System.out.println("-------------------");
		}

	}

}
