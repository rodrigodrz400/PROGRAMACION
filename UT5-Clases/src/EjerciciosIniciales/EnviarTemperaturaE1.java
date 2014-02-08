package EjerciciosIniciales;

import java.util.Scanner;

public class EnviarTemperaturaE1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		TemperaturaE1 cpu1;
		
		cpu1= new TemperaturaE1();
		
		cpu1.setFahrenheit(250);
		System.out.println("La temperatrua de la cpu1 es: " + cpu1.getTemperatura()+" ºC");
		
		cpu1.setCelsius(25);
		System.out.println("La temperatrua de la cpu1 es: " + cpu1.getTemperatura()+" ºC");

		cpu1.setFahrenheit(0);
		System.out.println("La temperatrua de la cpu1 es: " + cpu1.getTemperatura()+" ºC");
		
		teclado.close();
		
		
	}

}
