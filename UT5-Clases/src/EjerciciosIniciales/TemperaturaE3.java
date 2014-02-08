package EjerciciosIniciales;

import java.util.Scanner;

public class TemperaturaE3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		TemperaturaMetodosE3 cpu1;
		
		cpu1= new TemperaturaMetodosE3();
		
		cpu1.celsiusToFarenheit(25);
		System.out.println("La temperatrua de la cpu1 es: " + cpu1.farenheit +" ºF");
		
		cpu1.farenheitToCelsius(175);
		System.out.printf("La temperatrua de la cpu1 es: " + "%.2f" +" ºC\n", cpu1.celsius );
		
		cpu1.farenheitToCelsius(225);
		System.out.printf("La temperatrua de la cpu1 es: " + "%.2f" +" ºC\n", cpu1.celsius );

		cpu1.celsiusToFarenheit(40);
		System.out.println("La temperatrua de la cpu1 es: " + cpu1.farenheit +" ºF");
		
		
		teclado.close();
		
		
	}

}
