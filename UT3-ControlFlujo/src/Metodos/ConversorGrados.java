package Metodos;

import java.util.Scanner;

public class ConversorGrados {

	// Escriba un programa que lea temperaturas expresadas en grados Fahrenheit
	// y las convierta a grados Celsius mostrándola.
	// El programa finalizará cuando lea un valor de temperatura igual a 999. La
	// conversión de grados Farenheit (F) a Celsius (C)
	// la realizará un método llamado farenheitCelsius donde incluirás el código
	// que hace la conversión (C = 5/9(F − 32)).
	public static void main(String[] args) {
		double farenheit;

		Scanner teclado = new Scanner(System.in);
		
		do{
		System.out.println("Intoduzca un valor en grados Farenheit (F) para convertirlo a Celsius (C)");
		
			farenheit = teclado.nextDouble();

			System.out.printf(farenheit + "ºF equivalen a %.2f" + "ºC \n" ,farenheitCelsious(farenheit));
			for (int i=0; i<31; i++){
				System.out.print("*");
			}System.out.println("\n");
				
			
			
		}while(farenheit != 999);
		System.out.println("********FIN DE PROGRAMA********");
		teclado.close();
	}

	public static double farenheitCelsious(double farenheit) {

		double celsious = (farenheit - 32) * 5 / 9;

		return celsious;
	}
}